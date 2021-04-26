package edgify;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: samples.proto")
public final class SamplesServiceGrpc {

  private SamplesServiceGrpc() {}

  public static final String SERVICE_NAME = "edgify.SamplesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<edgify.Samples.GetSamplesRequest,
      edgify.Samples.GetSamplesResponse> getGetSamplesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSamples",
      requestType = edgify.Samples.GetSamplesRequest.class,
      responseType = edgify.Samples.GetSamplesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edgify.Samples.GetSamplesRequest,
      edgify.Samples.GetSamplesResponse> getGetSamplesMethod() {
    io.grpc.MethodDescriptor<edgify.Samples.GetSamplesRequest, edgify.Samples.GetSamplesResponse> getGetSamplesMethod;
    if ((getGetSamplesMethod = SamplesServiceGrpc.getGetSamplesMethod) == null) {
      synchronized (SamplesServiceGrpc.class) {
        if ((getGetSamplesMethod = SamplesServiceGrpc.getGetSamplesMethod) == null) {
          SamplesServiceGrpc.getGetSamplesMethod = getGetSamplesMethod =
              io.grpc.MethodDescriptor.<edgify.Samples.GetSamplesRequest, edgify.Samples.GetSamplesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSamples"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.Samples.GetSamplesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.Samples.GetSamplesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SamplesServiceMethodDescriptorSupplier("GetSamples"))
              .build();
        }
      }
    }
    return getGetSamplesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edgify.Samples.AddSampleRequest,
      edgify.Samples.AddSampleResponse> getAddSampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSample",
      requestType = edgify.Samples.AddSampleRequest.class,
      responseType = edgify.Samples.AddSampleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edgify.Samples.AddSampleRequest,
      edgify.Samples.AddSampleResponse> getAddSampleMethod() {
    io.grpc.MethodDescriptor<edgify.Samples.AddSampleRequest, edgify.Samples.AddSampleResponse> getAddSampleMethod;
    if ((getAddSampleMethod = SamplesServiceGrpc.getAddSampleMethod) == null) {
      synchronized (SamplesServiceGrpc.class) {
        if ((getAddSampleMethod = SamplesServiceGrpc.getAddSampleMethod) == null) {
          SamplesServiceGrpc.getAddSampleMethod = getAddSampleMethod =
              io.grpc.MethodDescriptor.<edgify.Samples.AddSampleRequest, edgify.Samples.AddSampleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.Samples.AddSampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.Samples.AddSampleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SamplesServiceMethodDescriptorSupplier("AddSample"))
              .build();
        }
      }
    }
    return getAddSampleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edgify.Samples.UpdateSampleRequest,
      edgify.Samples.UpdateSampleResponse> getUpdateSampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSample",
      requestType = edgify.Samples.UpdateSampleRequest.class,
      responseType = edgify.Samples.UpdateSampleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edgify.Samples.UpdateSampleRequest,
      edgify.Samples.UpdateSampleResponse> getUpdateSampleMethod() {
    io.grpc.MethodDescriptor<edgify.Samples.UpdateSampleRequest, edgify.Samples.UpdateSampleResponse> getUpdateSampleMethod;
    if ((getUpdateSampleMethod = SamplesServiceGrpc.getUpdateSampleMethod) == null) {
      synchronized (SamplesServiceGrpc.class) {
        if ((getUpdateSampleMethod = SamplesServiceGrpc.getUpdateSampleMethod) == null) {
          SamplesServiceGrpc.getUpdateSampleMethod = getUpdateSampleMethod =
              io.grpc.MethodDescriptor.<edgify.Samples.UpdateSampleRequest, edgify.Samples.UpdateSampleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.Samples.UpdateSampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.Samples.UpdateSampleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SamplesServiceMethodDescriptorSupplier("UpdateSample"))
              .build();
        }
      }
    }
    return getUpdateSampleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edgify.Samples.SyncRequest,
      edgify.Samples.SyncResponse> getSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sync",
      requestType = edgify.Samples.SyncRequest.class,
      responseType = edgify.Samples.SyncResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edgify.Samples.SyncRequest,
      edgify.Samples.SyncResponse> getSyncMethod() {
    io.grpc.MethodDescriptor<edgify.Samples.SyncRequest, edgify.Samples.SyncResponse> getSyncMethod;
    if ((getSyncMethod = SamplesServiceGrpc.getSyncMethod) == null) {
      synchronized (SamplesServiceGrpc.class) {
        if ((getSyncMethod = SamplesServiceGrpc.getSyncMethod) == null) {
          SamplesServiceGrpc.getSyncMethod = getSyncMethod =
              io.grpc.MethodDescriptor.<edgify.Samples.SyncRequest, edgify.Samples.SyncResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.Samples.SyncRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.Samples.SyncResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SamplesServiceMethodDescriptorSupplier("Sync"))
              .build();
        }
      }
    }
    return getSyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edgify.Samples.DeleteAllSamplesRequest,
      edgify.Samples.DeleteAllSamplesResponse> getDeleteAllSamplesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAllSamples",
      requestType = edgify.Samples.DeleteAllSamplesRequest.class,
      responseType = edgify.Samples.DeleteAllSamplesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edgify.Samples.DeleteAllSamplesRequest,
      edgify.Samples.DeleteAllSamplesResponse> getDeleteAllSamplesMethod() {
    io.grpc.MethodDescriptor<edgify.Samples.DeleteAllSamplesRequest, edgify.Samples.DeleteAllSamplesResponse> getDeleteAllSamplesMethod;
    if ((getDeleteAllSamplesMethod = SamplesServiceGrpc.getDeleteAllSamplesMethod) == null) {
      synchronized (SamplesServiceGrpc.class) {
        if ((getDeleteAllSamplesMethod = SamplesServiceGrpc.getDeleteAllSamplesMethod) == null) {
          SamplesServiceGrpc.getDeleteAllSamplesMethod = getDeleteAllSamplesMethod =
              io.grpc.MethodDescriptor.<edgify.Samples.DeleteAllSamplesRequest, edgify.Samples.DeleteAllSamplesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAllSamples"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.Samples.DeleteAllSamplesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.Samples.DeleteAllSamplesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SamplesServiceMethodDescriptorSupplier("DeleteAllSamples"))
              .build();
        }
      }
    }
    return getDeleteAllSamplesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edgify.Samples.DeleteSamplesRequest,
      edgify.Samples.DeleteSamplesResponse> getDeleteSamplesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSamples",
      requestType = edgify.Samples.DeleteSamplesRequest.class,
      responseType = edgify.Samples.DeleteSamplesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edgify.Samples.DeleteSamplesRequest,
      edgify.Samples.DeleteSamplesResponse> getDeleteSamplesMethod() {
    io.grpc.MethodDescriptor<edgify.Samples.DeleteSamplesRequest, edgify.Samples.DeleteSamplesResponse> getDeleteSamplesMethod;
    if ((getDeleteSamplesMethod = SamplesServiceGrpc.getDeleteSamplesMethod) == null) {
      synchronized (SamplesServiceGrpc.class) {
        if ((getDeleteSamplesMethod = SamplesServiceGrpc.getDeleteSamplesMethod) == null) {
          SamplesServiceGrpc.getDeleteSamplesMethod = getDeleteSamplesMethod =
              io.grpc.MethodDescriptor.<edgify.Samples.DeleteSamplesRequest, edgify.Samples.DeleteSamplesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSamples"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.Samples.DeleteSamplesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.Samples.DeleteSamplesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SamplesServiceMethodDescriptorSupplier("DeleteSamples"))
              .build();
        }
      }
    }
    return getDeleteSamplesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edgify.Samples.DeleteSampleRequest,
      edgify.Samples.DeleteSampleResponse> getDeleteSampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSample",
      requestType = edgify.Samples.DeleteSampleRequest.class,
      responseType = edgify.Samples.DeleteSampleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edgify.Samples.DeleteSampleRequest,
      edgify.Samples.DeleteSampleResponse> getDeleteSampleMethod() {
    io.grpc.MethodDescriptor<edgify.Samples.DeleteSampleRequest, edgify.Samples.DeleteSampleResponse> getDeleteSampleMethod;
    if ((getDeleteSampleMethod = SamplesServiceGrpc.getDeleteSampleMethod) == null) {
      synchronized (SamplesServiceGrpc.class) {
        if ((getDeleteSampleMethod = SamplesServiceGrpc.getDeleteSampleMethod) == null) {
          SamplesServiceGrpc.getDeleteSampleMethod = getDeleteSampleMethod =
              io.grpc.MethodDescriptor.<edgify.Samples.DeleteSampleRequest, edgify.Samples.DeleteSampleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.Samples.DeleteSampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgify.Samples.DeleteSampleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SamplesServiceMethodDescriptorSupplier("DeleteSample"))
              .build();
        }
      }
    }
    return getDeleteSampleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SamplesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SamplesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SamplesServiceStub>() {
        @java.lang.Override
        public SamplesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SamplesServiceStub(channel, callOptions);
        }
      };
    return SamplesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SamplesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SamplesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SamplesServiceBlockingStub>() {
        @java.lang.Override
        public SamplesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SamplesServiceBlockingStub(channel, callOptions);
        }
      };
    return SamplesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SamplesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SamplesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SamplesServiceFutureStub>() {
        @java.lang.Override
        public SamplesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SamplesServiceFutureStub(channel, callOptions);
        }
      };
    return SamplesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SamplesServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSamples(edgify.Samples.GetSamplesRequest request,
        io.grpc.stub.StreamObserver<edgify.Samples.GetSamplesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSamplesMethod(), responseObserver);
    }

    /**
     */
    public void addSample(edgify.Samples.AddSampleRequest request,
        io.grpc.stub.StreamObserver<edgify.Samples.AddSampleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSampleMethod(), responseObserver);
    }

    /**
     */
    public void updateSample(edgify.Samples.UpdateSampleRequest request,
        io.grpc.stub.StreamObserver<edgify.Samples.UpdateSampleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSampleMethod(), responseObserver);
    }

    /**
     */
    public void sync(edgify.Samples.SyncRequest request,
        io.grpc.stub.StreamObserver<edgify.Samples.SyncResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyncMethod(), responseObserver);
    }

    /**
     */
    public void deleteAllSamples(edgify.Samples.DeleteAllSamplesRequest request,
        io.grpc.stub.StreamObserver<edgify.Samples.DeleteAllSamplesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAllSamplesMethod(), responseObserver);
    }

    /**
     */
    public void deleteSamples(edgify.Samples.DeleteSamplesRequest request,
        io.grpc.stub.StreamObserver<edgify.Samples.DeleteSamplesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSamplesMethod(), responseObserver);
    }

    /**
     */
    public void deleteSample(edgify.Samples.DeleteSampleRequest request,
        io.grpc.stub.StreamObserver<edgify.Samples.DeleteSampleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSampleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSamplesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                edgify.Samples.GetSamplesRequest,
                edgify.Samples.GetSamplesResponse>(
                  this, METHODID_GET_SAMPLES)))
          .addMethod(
            getAddSampleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                edgify.Samples.AddSampleRequest,
                edgify.Samples.AddSampleResponse>(
                  this, METHODID_ADD_SAMPLE)))
          .addMethod(
            getUpdateSampleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                edgify.Samples.UpdateSampleRequest,
                edgify.Samples.UpdateSampleResponse>(
                  this, METHODID_UPDATE_SAMPLE)))
          .addMethod(
            getSyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                edgify.Samples.SyncRequest,
                edgify.Samples.SyncResponse>(
                  this, METHODID_SYNC)))
          .addMethod(
            getDeleteAllSamplesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                edgify.Samples.DeleteAllSamplesRequest,
                edgify.Samples.DeleteAllSamplesResponse>(
                  this, METHODID_DELETE_ALL_SAMPLES)))
          .addMethod(
            getDeleteSamplesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                edgify.Samples.DeleteSamplesRequest,
                edgify.Samples.DeleteSamplesResponse>(
                  this, METHODID_DELETE_SAMPLES)))
          .addMethod(
            getDeleteSampleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                edgify.Samples.DeleteSampleRequest,
                edgify.Samples.DeleteSampleResponse>(
                  this, METHODID_DELETE_SAMPLE)))
          .build();
    }
  }

  /**
   */
  public static final class SamplesServiceStub extends io.grpc.stub.AbstractAsyncStub<SamplesServiceStub> {
    private SamplesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SamplesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SamplesServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSamples(edgify.Samples.GetSamplesRequest request,
        io.grpc.stub.StreamObserver<edgify.Samples.GetSamplesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSamplesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSample(edgify.Samples.AddSampleRequest request,
        io.grpc.stub.StreamObserver<edgify.Samples.AddSampleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSampleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSample(edgify.Samples.UpdateSampleRequest request,
        io.grpc.stub.StreamObserver<edgify.Samples.UpdateSampleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSampleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sync(edgify.Samples.SyncRequest request,
        io.grpc.stub.StreamObserver<edgify.Samples.SyncResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAllSamples(edgify.Samples.DeleteAllSamplesRequest request,
        io.grpc.stub.StreamObserver<edgify.Samples.DeleteAllSamplesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAllSamplesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSamples(edgify.Samples.DeleteSamplesRequest request,
        io.grpc.stub.StreamObserver<edgify.Samples.DeleteSamplesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSamplesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSample(edgify.Samples.DeleteSampleRequest request,
        io.grpc.stub.StreamObserver<edgify.Samples.DeleteSampleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSampleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SamplesServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SamplesServiceBlockingStub> {
    private SamplesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SamplesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SamplesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public edgify.Samples.GetSamplesResponse getSamples(edgify.Samples.GetSamplesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSamplesMethod(), getCallOptions(), request);
    }

    /**
     */
    public edgify.Samples.AddSampleResponse addSample(edgify.Samples.AddSampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSampleMethod(), getCallOptions(), request);
    }

    /**
     */
    public edgify.Samples.UpdateSampleResponse updateSample(edgify.Samples.UpdateSampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSampleMethod(), getCallOptions(), request);
    }

    /**
     */
    public edgify.Samples.SyncResponse sync(edgify.Samples.SyncRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public edgify.Samples.DeleteAllSamplesResponse deleteAllSamples(edgify.Samples.DeleteAllSamplesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAllSamplesMethod(), getCallOptions(), request);
    }

    /**
     */
    public edgify.Samples.DeleteSamplesResponse deleteSamples(edgify.Samples.DeleteSamplesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSamplesMethod(), getCallOptions(), request);
    }

    /**
     */
    public edgify.Samples.DeleteSampleResponse deleteSample(edgify.Samples.DeleteSampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSampleMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SamplesServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SamplesServiceFutureStub> {
    private SamplesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SamplesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SamplesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edgify.Samples.GetSamplesResponse> getSamples(
        edgify.Samples.GetSamplesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSamplesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edgify.Samples.AddSampleResponse> addSample(
        edgify.Samples.AddSampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSampleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edgify.Samples.UpdateSampleResponse> updateSample(
        edgify.Samples.UpdateSampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSampleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edgify.Samples.SyncResponse> sync(
        edgify.Samples.SyncRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edgify.Samples.DeleteAllSamplesResponse> deleteAllSamples(
        edgify.Samples.DeleteAllSamplesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAllSamplesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edgify.Samples.DeleteSamplesResponse> deleteSamples(
        edgify.Samples.DeleteSamplesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSamplesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edgify.Samples.DeleteSampleResponse> deleteSample(
        edgify.Samples.DeleteSampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSampleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SAMPLES = 0;
  private static final int METHODID_ADD_SAMPLE = 1;
  private static final int METHODID_UPDATE_SAMPLE = 2;
  private static final int METHODID_SYNC = 3;
  private static final int METHODID_DELETE_ALL_SAMPLES = 4;
  private static final int METHODID_DELETE_SAMPLES = 5;
  private static final int METHODID_DELETE_SAMPLE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SamplesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SamplesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SAMPLES:
          serviceImpl.getSamples((edgify.Samples.GetSamplesRequest) request,
              (io.grpc.stub.StreamObserver<edgify.Samples.GetSamplesResponse>) responseObserver);
          break;
        case METHODID_ADD_SAMPLE:
          serviceImpl.addSample((edgify.Samples.AddSampleRequest) request,
              (io.grpc.stub.StreamObserver<edgify.Samples.AddSampleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SAMPLE:
          serviceImpl.updateSample((edgify.Samples.UpdateSampleRequest) request,
              (io.grpc.stub.StreamObserver<edgify.Samples.UpdateSampleResponse>) responseObserver);
          break;
        case METHODID_SYNC:
          serviceImpl.sync((edgify.Samples.SyncRequest) request,
              (io.grpc.stub.StreamObserver<edgify.Samples.SyncResponse>) responseObserver);
          break;
        case METHODID_DELETE_ALL_SAMPLES:
          serviceImpl.deleteAllSamples((edgify.Samples.DeleteAllSamplesRequest) request,
              (io.grpc.stub.StreamObserver<edgify.Samples.DeleteAllSamplesResponse>) responseObserver);
          break;
        case METHODID_DELETE_SAMPLES:
          serviceImpl.deleteSamples((edgify.Samples.DeleteSamplesRequest) request,
              (io.grpc.stub.StreamObserver<edgify.Samples.DeleteSamplesResponse>) responseObserver);
          break;
        case METHODID_DELETE_SAMPLE:
          serviceImpl.deleteSample((edgify.Samples.DeleteSampleRequest) request,
              (io.grpc.stub.StreamObserver<edgify.Samples.DeleteSampleResponse>) responseObserver);
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

  private static abstract class SamplesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SamplesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return edgify.Samples.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SamplesService");
    }
  }

  private static final class SamplesServiceFileDescriptorSupplier
      extends SamplesServiceBaseDescriptorSupplier {
    SamplesServiceFileDescriptorSupplier() {}
  }

  private static final class SamplesServiceMethodDescriptorSupplier
      extends SamplesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SamplesServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SamplesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SamplesServiceFileDescriptorSupplier())
              .addMethod(getGetSamplesMethod())
              .addMethod(getAddSampleMethod())
              .addMethod(getUpdateSampleMethod())
              .addMethod(getSyncMethod())
              .addMethod(getDeleteAllSamplesMethod())
              .addMethod(getDeleteSamplesMethod())
              .addMethod(getDeleteSampleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
