package com.edgify.edgifyexample;

import edgify.PredictionOuterClass;
import edgify.EdgifySdk;

public class Example {
     public static void main(final String args[]) {
        // connection phase
        EdgifySdk sdk = new EdgifySdk("127.0.0.1", 50051);
        sdk.Connect();
        System.out.println("Succesfully connected to Edgify Agent via GRPC");

        // take a prediction
        PredictionOuterClass.Prediction prediction = sdk.GetPrediction("Main");

        // Autobuy flag
        if (prediction.getCertain() == true){
            System.out.println("using Autobuy");
        }

        System.out.println("Succesfully got a prediction from the Edgify Agent");
        System.out.println("Uuid: " + prediction.getUuid());
        System.out.println("Predictions: " + prediction.toString());

        // after the transaction create the ground truth
        String label = "banana";
        String source = "RegularMenuSelection";

        sdk.CreateGroundTruth(prediction, label, source);
        System.out.println("Succesfully set ground truth to the Edgify Agent");

        // if you need to delete a sample
        sdk.DeleteSample(prediction.getUuid());
        System.out.println("Succesfully deleted the image sample from the Edgify Agent");

        // inform edgify on transaction start
        sdk.StartCustomerTransaction();

        // inform edgify on transaction end
        sdk.EndCustomerTransaction();

    }
}
