package edgify;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: prediction.proto")
public final class EdgifyServiceGrpc {

  private EdgifyServiceGrpc() {}

  public static final String SERVICE_NAME = "edgify.EdgifyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<edgify.PredictionOuterClass.PredictionRequest,
      edgify.PredictionOuterClass.PredictionResponse> getGetPredictionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrediction",
      requestType = edgify.PredictionOuterClass.PredictionRequest.class,
      responseType = edgify.PredictionOuterClass.PredictionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edgify.PredictionOuterClass.PredictionRequest,
      edgify.PredictionOuterClass.PredictionResponse> getGetPredictionMethod() {
    io.grpc.MethodDescriptor<edgify.PredictionOuterClass.PredictionRequest, edgify.PredictionOuterClass.PredictionResponse> getGetPredictionMethod;
    if ((getGetPredictionMethod = EdgifyServiceGrpc.getGetPredictionMethod) == null) {
      synchronized (EdgifyServiceGrpc.class) {
        if ((getGetPredictionMethod = EdgifyServiceGrpc.getGetPredictionMethod) == null) {
          EdgifyServiceGrpc.getGetPredictionMethod = getGetPredictionMethod =
              io.grpc.MethodDescriptor.<edgify.PredictionOuterClass.PredictionRequest, edgify.PredictionOuterClass.PredictionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPrediction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.PredictionOuterClass.PredictionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.PredictionOuterClass.PredictionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgifyServiceMethodDescriptorSupplier("GetPrediction"))
              .build();
        }
      }
    }
    return getGetPredictionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edgify.PredictionOuterClass.GroundTruthRequest,
      edgify.PredictionOuterClass.GroundTruthResponse> getCreateGroundTruthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGroundTruth",
      requestType = edgify.PredictionOuterClass.GroundTruthRequest.class,
      responseType = edgify.PredictionOuterClass.GroundTruthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edgify.PredictionOuterClass.GroundTruthRequest,
      edgify.PredictionOuterClass.GroundTruthResponse> getCreateGroundTruthMethod() {
    io.grpc.MethodDescriptor<edgify.PredictionOuterClass.GroundTruthRequest, edgify.PredictionOuterClass.GroundTruthResponse> getCreateGroundTruthMethod;
    if ((getCreateGroundTruthMethod = EdgifyServiceGrpc.getCreateGroundTruthMethod) == null) {
      synchronized (EdgifyServiceGrpc.class) {
        if ((getCreateGroundTruthMethod = EdgifyServiceGrpc.getCreateGroundTruthMethod) == null) {
          EdgifyServiceGrpc.getCreateGroundTruthMethod = getCreateGroundTruthMethod =
              io.grpc.MethodDescriptor.<edgify.PredictionOuterClass.GroundTruthRequest, edgify.PredictionOuterClass.GroundTruthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGroundTruth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.PredictionOuterClass.GroundTruthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.PredictionOuterClass.GroundTruthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgifyServiceMethodDescriptorSupplier("CreateGroundTruth"))
              .build();
        }
      }
    }
    return getCreateGroundTruthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edgify.PredictionOuterClass.GetCurrentModelDeploymentRequest,
      edgify.PredictionOuterClass.GetCurrentModelDeploymentResponse> getGetCurrentModelDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentModelDeployment",
      requestType = edgify.PredictionOuterClass.GetCurrentModelDeploymentRequest.class,
      responseType = edgify.PredictionOuterClass.GetCurrentModelDeploymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edgify.PredictionOuterClass.GetCurrentModelDeploymentRequest,
      edgify.PredictionOuterClass.GetCurrentModelDeploymentResponse> getGetCurrentModelDeploymentMethod() {
    io.grpc.MethodDescriptor<edgify.PredictionOuterClass.GetCurrentModelDeploymentRequest, edgify.PredictionOuterClass.GetCurrentModelDeploymentResponse> getGetCurrentModelDeploymentMethod;
    if ((getGetCurrentModelDeploymentMethod = EdgifyServiceGrpc.getGetCurrentModelDeploymentMethod) == null) {
      synchronized (EdgifyServiceGrpc.class) {
        if ((getGetCurrentModelDeploymentMethod = EdgifyServiceGrpc.getGetCurrentModelDeploymentMethod) == null) {
          EdgifyServiceGrpc.getGetCurrentModelDeploymentMethod = getGetCurrentModelDeploymentMethod =
              io.grpc.MethodDescriptor.<edgify.PredictionOuterClass.GetCurrentModelDeploymentRequest, edgify.PredictionOuterClass.GetCurrentModelDeploymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentModelDeployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.PredictionOuterClass.GetCurrentModelDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.PredictionOuterClass.GetCurrentModelDeploymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgifyServiceMethodDescriptorSupplier("GetCurrentModelDeployment"))
              .build();
        }
      }
    }
    return getGetCurrentModelDeploymentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EdgifyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EdgifyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EdgifyServiceStub>() {
        @java.lang.Override
        public EdgifyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EdgifyServiceStub(channel, callOptions);
        }
      };
    return EdgifyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EdgifyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EdgifyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EdgifyServiceBlockingStub>() {
        @java.lang.Override
        public EdgifyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EdgifyServiceBlockingStub(channel, callOptions);
        }
      };
    return EdgifyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EdgifyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EdgifyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EdgifyServiceFutureStub>() {
        @java.lang.Override
        public EdgifyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EdgifyServiceFutureStub(channel, callOptions);
        }
      };
    return EdgifyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EdgifyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPrediction(edgify.PredictionOuterClass.PredictionRequest request,
        io.grpc.stub.StreamObserver<edgify.PredictionOuterClass.PredictionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPredictionMethod(), responseObserver);
    }

    /**
     */
    public void createGroundTruth(edgify.PredictionOuterClass.GroundTruthRequest request,
        io.grpc.stub.StreamObserver<edgify.PredictionOuterClass.GroundTruthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGroundTruthMethod(), responseObserver);
    }

    /**
     */
    public void getCurrentModelDeployment(edgify.PredictionOuterClass.GetCurrentModelDeploymentRequest request,
        io.grpc.stub.StreamObserver<edgify.PredictionOuterClass.GetCurrentModelDeploymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentModelDeploymentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPredictionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                edgify.PredictionOuterClass.PredictionRequest,
                edgify.PredictionOuterClass.PredictionResponse>(
                  this, METHODID_GET_PREDICTION)))
          .addMethod(
            getCreateGroundTruthMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                edgify.PredictionOuterClass.GroundTruthRequest,
                edgify.PredictionOuterClass.GroundTruthResponse>(
                  this, METHODID_CREATE_GROUND_TRUTH)))
          .addMethod(
            getGetCurrentModelDeploymentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                edgify.PredictionOuterClass.GetCurrentModelDeploymentRequest,
                edgify.PredictionOuterClass.GetCurrentModelDeploymentResponse>(
                  this, METHODID_GET_CURRENT_MODEL_DEPLOYMENT)))
          .build();
    }
  }

  /**
   */
  public static final class EdgifyServiceStub extends io.grpc.stub.AbstractAsyncStub<EdgifyServiceStub> {
    private EdgifyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EdgifyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EdgifyServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPrediction(edgify.PredictionOuterClass.PredictionRequest request,
        io.grpc.stub.StreamObserver<edgify.PredictionOuterClass.PredictionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPredictionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createGroundTruth(edgify.PredictionOuterClass.GroundTruthRequest request,
        io.grpc.stub.StreamObserver<edgify.PredictionOuterClass.GroundTruthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGroundTruthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrentModelDeployment(edgify.PredictionOuterClass.GetCurrentModelDeploymentRequest request,
        io.grpc.stub.StreamObserver<edgify.PredictionOuterClass.GetCurrentModelDeploymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentModelDeploymentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EdgifyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EdgifyServiceBlockingStub> {
    private EdgifyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EdgifyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EdgifyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public edgify.PredictionOuterClass.PredictionResponse getPrediction(edgify.PredictionOuterClass.PredictionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPredictionMethod(), getCallOptions(), request);
    }

    /**
     */
    public edgify.PredictionOuterClass.GroundTruthResponse createGroundTruth(edgify.PredictionOuterClass.GroundTruthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGroundTruthMethod(), getCallOptions(), request);
    }

    /**
     */
    public edgify.PredictionOuterClass.GetCurrentModelDeploymentResponse getCurrentModelDeployment(edgify.PredictionOuterClass.GetCurrentModelDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentModelDeploymentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EdgifyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EdgifyServiceFutureStub> {
    private EdgifyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EdgifyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EdgifyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edgify.PredictionOuterClass.PredictionResponse> getPrediction(
        edgify.PredictionOuterClass.PredictionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPredictionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edgify.PredictionOuterClass.GroundTruthResponse> createGroundTruth(
        edgify.PredictionOuterClass.GroundTruthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGroundTruthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edgify.PredictionOuterClass.GetCurrentModelDeploymentResponse> getCurrentModelDeployment(
        edgify.PredictionOuterClass.GetCurrentModelDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentModelDeploymentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PREDICTION = 0;
  private static final int METHODID_CREATE_GROUND_TRUTH = 1;
  private static final int METHODID_GET_CURRENT_MODEL_DEPLOYMENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EdgifyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EdgifyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PREDICTION:
          serviceImpl.getPrediction((edgify.PredictionOuterClass.PredictionRequest) request,
              (io.grpc.stub.StreamObserver<edgify.PredictionOuterClass.PredictionResponse>) responseObserver);
          break;
        case METHODID_CREATE_GROUND_TRUTH:
          serviceImpl.createGroundTruth((edgify.PredictionOuterClass.GroundTruthRequest) request,
              (io.grpc.stub.StreamObserver<edgify.PredictionOuterClass.GroundTruthResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENT_MODEL_DEPLOYMENT:
          serviceImpl.getCurrentModelDeployment((edgify.PredictionOuterClass.GetCurrentModelDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<edgify.PredictionOuterClass.GetCurrentModelDeploymentResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EdgifyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EdgifyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return edgify.PredictionOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EdgifyService");
    }
  }

  private static final class EdgifyServiceFileDescriptorSupplier
      extends EdgifyServiceBaseDescriptorSupplier {
    EdgifyServiceFileDescriptorSupplier() {}
  }

  private static final class EdgifyServiceMethodDescriptorSupplier
      extends EdgifyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EdgifyServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EdgifyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EdgifyServiceFileDescriptorSupplier())
              .addMethod(getGetPredictionMethod())
              .addMethod(getCreateGroundTruthMethod())
              .addMethod(getGetCurrentModelDeploymentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
