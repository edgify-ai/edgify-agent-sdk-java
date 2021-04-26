package edgify;

import edgify.EdgifyServiceGrpc;
import edgify.PredictionOuterClass;
import edgify.Samples;
import edgify.SamplesServiceGrpc;
import edgify.Analytics;
import edgify.AnalyticsServiceGrpc;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;

public class EdgifySdk {
   
    Channel channel;    // GRPC Channel
    private EdgifyServiceGrpc.EdgifyServiceBlockingStub client; 
    private SamplesServiceGrpc.SamplesServiceBlockingStub samples_client; 
    private AnalyticsServiceGrpc.AnalyticsServiceBlockingStub analytics_client;
    String host;
    int port;

    public EdgifySdk(String host, int port){
        this.host = host;
        this.port = port;
    }

    public void Connect(){
        
        this.channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        this.client = EdgifyServiceGrpc.newBlockingStub(channel);
        this.analytics_client = AnalyticsServiceGrpc.newBlockingStub(channel);
        this.samples_client = SamplesServiceGrpc.newBlockingStub(channel);
        
    }

    public PredictionOuterClass.Prediction GetPrediction(String source){
        
        PredictionOuterClass.PredictionRequest request
                = PredictionOuterClass.PredictionRequest.newBuilder()
                    .setSource(source)
                .build();
        
        PredictionOuterClass.PredictionResponse response = this.client.getPrediction(request);
        
        return response.getPrediction();
    }

    public void CreateGroundTruth(PredictionOuterClass.Prediction prediction, String label, String source){
        
        // Create GroundTruth object and set label & previous prediction object (image ID)
        PredictionOuterClass.GroundTruth groundTruth
                    = PredictionOuterClass.GroundTruth.newBuilder()
                            .setLabel(label)
                            .setPrediction(prediction)
                            .setSource(source)
                            .build();
                
        // Create GT Request and set the Ground Truth object
        PredictionOuterClass.GroundTruthRequest request
                    = PredictionOuterClass.GroundTruthRequest.newBuilder()
                            .setGroundTruth(groundTruth)
                            .build();
 
        this.client.createGroundTruth(request);
    }
        
    public void DeleteSample(String uuid){
        if (uuid != null){
            Samples.DeleteSampleRequest request = Samples.DeleteSampleRequest
                .newBuilder()
                .setUuid(uuid)
                .build();
            
            try {
                this.samples_client.deleteSample(request);
            }catch (Exception ex) {
                //log.error("Error to delete item", ex);
            }
        }
        
    }

    public void StartCustomerTransaction(){

        Analytics.CreateAnalyticsEventRequest request = Analytics.CreateAnalyticsEventRequest
                   .newBuilder()
                    .setName("TransactionCustomerStart")
                    .build();

        this.analytics_client.createEvent(request);
    }

    public void EndCustomerTransaction(){

        Analytics.CreateAnalyticsEventRequest request = Analytics.CreateAnalyticsEventRequest
                   .newBuilder()
                    .setName("TransactionCustomerEnd")
                    .build();

        this.analytics_client.createEvent(request);
    }
 
}
