package protobuff;
import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: comunicator.proto")
public final class ComunicatorGrpc {

  private ComunicatorGrpc() {}

  public static final String SERVICE_NAME = "Comunicator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ComunicatorOuterClass.protoAnimal,
      ComunicatorOuterClass.stringResponse> getSaveAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveAnimal",
      requestType = ComunicatorOuterClass.protoAnimal.class,
      responseType = ComunicatorOuterClass.stringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ComunicatorOuterClass.protoAnimal,
      ComunicatorOuterClass.stringResponse> getSaveAnimalMethod() {
    io.grpc.MethodDescriptor<ComunicatorOuterClass.protoAnimal, ComunicatorOuterClass.stringResponse> getSaveAnimalMethod;
    if ((getSaveAnimalMethod = ComunicatorGrpc.getSaveAnimalMethod) == null) {
      synchronized (ComunicatorGrpc.class) {
        if ((getSaveAnimalMethod = ComunicatorGrpc.getSaveAnimalMethod) == null) {
          ComunicatorGrpc.getSaveAnimalMethod = getSaveAnimalMethod =
              io.grpc.MethodDescriptor.<ComunicatorOuterClass.protoAnimal, ComunicatorOuterClass.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComunicatorOuterClass.protoAnimal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComunicatorOuterClass.stringResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComunicatorMethodDescriptorSupplier("saveAnimal"))
              .build();
        }
      }
    }
    return getSaveAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ComunicatorOuterClass.longRequest,
      ComunicatorOuterClass.protoAnimal> getFindByRegNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByRegNumber",
      requestType = ComunicatorOuterClass.longRequest.class,
      responseType = ComunicatorOuterClass.protoAnimal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ComunicatorOuterClass.longRequest,
      ComunicatorOuterClass.protoAnimal> getFindByRegNumberMethod() {
    io.grpc.MethodDescriptor<ComunicatorOuterClass.longRequest, ComunicatorOuterClass.protoAnimal> getFindByRegNumberMethod;
    if ((getFindByRegNumberMethod = ComunicatorGrpc.getFindByRegNumberMethod) == null) {
      synchronized (ComunicatorGrpc.class) {
        if ((getFindByRegNumberMethod = ComunicatorGrpc.getFindByRegNumberMethod) == null) {
          ComunicatorGrpc.getFindByRegNumberMethod = getFindByRegNumberMethod =
              io.grpc.MethodDescriptor.<ComunicatorOuterClass.longRequest, ComunicatorOuterClass.protoAnimal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByRegNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComunicatorOuterClass.longRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComunicatorOuterClass.protoAnimal.getDefaultInstance()))
              .setSchemaDescriptor(new ComunicatorMethodDescriptorSupplier("findByRegNumber"))
              .build();
        }
      }
    }
    return getFindByRegNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ComunicatorOuterClass.protoAnimal,
      ComunicatorOuterClass.stringResponse> getUpdateAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateAnimal",
      requestType = ComunicatorOuterClass.protoAnimal.class,
      responseType = ComunicatorOuterClass.stringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ComunicatorOuterClass.protoAnimal,
      ComunicatorOuterClass.stringResponse> getUpdateAnimalMethod() {
    io.grpc.MethodDescriptor<ComunicatorOuterClass.protoAnimal, ComunicatorOuterClass.stringResponse> getUpdateAnimalMethod;
    if ((getUpdateAnimalMethod = ComunicatorGrpc.getUpdateAnimalMethod) == null) {
      synchronized (ComunicatorGrpc.class) {
        if ((getUpdateAnimalMethod = ComunicatorGrpc.getUpdateAnimalMethod) == null) {
          ComunicatorGrpc.getUpdateAnimalMethod = getUpdateAnimalMethod =
              io.grpc.MethodDescriptor.<ComunicatorOuterClass.protoAnimal, ComunicatorOuterClass.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComunicatorOuterClass.protoAnimal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComunicatorOuterClass.stringResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComunicatorMethodDescriptorSupplier("updateAnimal"))
              .build();
        }
      }
    }
    return getUpdateAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ComunicatorOuterClass.longRequest,
      ComunicatorOuterClass.stringResponse> getDeleteAnimalByRegNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteAnimalByRegNumber",
      requestType = ComunicatorOuterClass.longRequest.class,
      responseType = ComunicatorOuterClass.stringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ComunicatorOuterClass.longRequest,
      ComunicatorOuterClass.stringResponse> getDeleteAnimalByRegNumberMethod() {
    io.grpc.MethodDescriptor<ComunicatorOuterClass.longRequest, ComunicatorOuterClass.stringResponse> getDeleteAnimalByRegNumberMethod;
    if ((getDeleteAnimalByRegNumberMethod = ComunicatorGrpc.getDeleteAnimalByRegNumberMethod) == null) {
      synchronized (ComunicatorGrpc.class) {
        if ((getDeleteAnimalByRegNumberMethod = ComunicatorGrpc.getDeleteAnimalByRegNumberMethod) == null) {
          ComunicatorGrpc.getDeleteAnimalByRegNumberMethod = getDeleteAnimalByRegNumberMethod =
              io.grpc.MethodDescriptor.<ComunicatorOuterClass.longRequest, ComunicatorOuterClass.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteAnimalByRegNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComunicatorOuterClass.longRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComunicatorOuterClass.stringResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComunicatorMethodDescriptorSupplier("deleteAnimalByRegNumber"))
              .build();
        }
      }
    }
    return getDeleteAnimalByRegNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ComunicatorOuterClass.empty,
      ComunicatorOuterClass.protoAnimal> getFindAllAnimalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllAnimals",
      requestType = ComunicatorOuterClass.empty.class,
      responseType = ComunicatorOuterClass.protoAnimal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ComunicatorOuterClass.empty,
      ComunicatorOuterClass.protoAnimal> getFindAllAnimalsMethod() {
    io.grpc.MethodDescriptor<ComunicatorOuterClass.empty, ComunicatorOuterClass.protoAnimal> getFindAllAnimalsMethod;
    if ((getFindAllAnimalsMethod = ComunicatorGrpc.getFindAllAnimalsMethod) == null) {
      synchronized (ComunicatorGrpc.class) {
        if ((getFindAllAnimalsMethod = ComunicatorGrpc.getFindAllAnimalsMethod) == null) {
          ComunicatorGrpc.getFindAllAnimalsMethod = getFindAllAnimalsMethod =
              io.grpc.MethodDescriptor.<ComunicatorOuterClass.empty, ComunicatorOuterClass.protoAnimal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAllAnimals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComunicatorOuterClass.empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComunicatorOuterClass.protoAnimal.getDefaultInstance()))
              .setSchemaDescriptor(new ComunicatorMethodDescriptorSupplier("findAllAnimals"))
              .build();
        }
      }
    }
    return getFindAllAnimalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ComunicatorOuterClass.protoDate,
      ComunicatorOuterClass.protoAnimal> getFindByDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByDate",
      requestType = ComunicatorOuterClass.protoDate.class,
      responseType = ComunicatorOuterClass.protoAnimal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ComunicatorOuterClass.protoDate,
      ComunicatorOuterClass.protoAnimal> getFindByDateMethod() {
    io.grpc.MethodDescriptor<ComunicatorOuterClass.protoDate, ComunicatorOuterClass.protoAnimal> getFindByDateMethod;
    if ((getFindByDateMethod = ComunicatorGrpc.getFindByDateMethod) == null) {
      synchronized (ComunicatorGrpc.class) {
        if ((getFindByDateMethod = ComunicatorGrpc.getFindByDateMethod) == null) {
          ComunicatorGrpc.getFindByDateMethod = getFindByDateMethod =
              io.grpc.MethodDescriptor.<ComunicatorOuterClass.protoDate, ComunicatorOuterClass.protoAnimal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComunicatorOuterClass.protoDate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComunicatorOuterClass.protoAnimal.getDefaultInstance()))
              .setSchemaDescriptor(new ComunicatorMethodDescriptorSupplier("findByDate"))
              .build();
        }
      }
    }
    return getFindByDateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ComunicatorOuterClass.stringRequest,
      ComunicatorOuterClass.protoAnimal> getFindByOriginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByOrigin",
      requestType = ComunicatorOuterClass.stringRequest.class,
      responseType = ComunicatorOuterClass.protoAnimal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ComunicatorOuterClass.stringRequest,
      ComunicatorOuterClass.protoAnimal> getFindByOriginMethod() {
    io.grpc.MethodDescriptor<ComunicatorOuterClass.stringRequest, ComunicatorOuterClass.protoAnimal> getFindByOriginMethod;
    if ((getFindByOriginMethod = ComunicatorGrpc.getFindByOriginMethod) == null) {
      synchronized (ComunicatorGrpc.class) {
        if ((getFindByOriginMethod = ComunicatorGrpc.getFindByOriginMethod) == null) {
          ComunicatorGrpc.getFindByOriginMethod = getFindByOriginMethod =
              io.grpc.MethodDescriptor.<ComunicatorOuterClass.stringRequest, ComunicatorOuterClass.protoAnimal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByOrigin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComunicatorOuterClass.stringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComunicatorOuterClass.protoAnimal.getDefaultInstance()))
              .setSchemaDescriptor(new ComunicatorMethodDescriptorSupplier("findByOrigin"))
              .build();
        }
      }
    }
    return getFindByOriginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ComunicatorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComunicatorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComunicatorStub>() {
        @java.lang.Override
        public ComunicatorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComunicatorStub(channel, callOptions);
        }
      };
    return ComunicatorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ComunicatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComunicatorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComunicatorBlockingStub>() {
        @java.lang.Override
        public ComunicatorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComunicatorBlockingStub(channel, callOptions);
        }
      };
    return ComunicatorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ComunicatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComunicatorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComunicatorFutureStub>() {
        @java.lang.Override
        public ComunicatorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComunicatorFutureStub(channel, callOptions);
        }
      };
    return ComunicatorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ComunicatorImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveAnimal(ComunicatorOuterClass.protoAnimal request,
        io.grpc.stub.StreamObserver<ComunicatorOuterClass.stringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveAnimalMethod(), responseObserver);
    }

    /**
     */
    public void findByRegNumber(ComunicatorOuterClass.longRequest request,
        io.grpc.stub.StreamObserver<ComunicatorOuterClass.protoAnimal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByRegNumberMethod(), responseObserver);
    }

    /**
     */
    public void updateAnimal(ComunicatorOuterClass.protoAnimal request,
        io.grpc.stub.StreamObserver<ComunicatorOuterClass.stringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAnimalMethod(), responseObserver);
    }

    /**
     */
    public void deleteAnimalByRegNumber(ComunicatorOuterClass.longRequest request,
        io.grpc.stub.StreamObserver<ComunicatorOuterClass.stringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAnimalByRegNumberMethod(), responseObserver);
    }

    /**
     */
    public void findAllAnimals(ComunicatorOuterClass.empty request,
        io.grpc.stub.StreamObserver<ComunicatorOuterClass.protoAnimal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllAnimalsMethod(), responseObserver);
    }

    /**
     */
    public void findByDate(ComunicatorOuterClass.protoDate request,
        io.grpc.stub.StreamObserver<ComunicatorOuterClass.protoAnimal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByDateMethod(), responseObserver);
    }

    /**
     */
    public void findByOrigin(ComunicatorOuterClass.stringRequest request,
        io.grpc.stub.StreamObserver<ComunicatorOuterClass.protoAnimal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByOriginMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ComunicatorOuterClass.protoAnimal,
                ComunicatorOuterClass.stringResponse>(
                  this, METHODID_SAVE_ANIMAL)))
          .addMethod(
            getFindByRegNumberMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ComunicatorOuterClass.longRequest,
                ComunicatorOuterClass.protoAnimal>(
                  this, METHODID_FIND_BY_REG_NUMBER)))
          .addMethod(
            getUpdateAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ComunicatorOuterClass.protoAnimal,
                ComunicatorOuterClass.stringResponse>(
                  this, METHODID_UPDATE_ANIMAL)))
          .addMethod(
            getDeleteAnimalByRegNumberMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ComunicatorOuterClass.longRequest,
                ComunicatorOuterClass.stringResponse>(
                  this, METHODID_DELETE_ANIMAL_BY_REG_NUMBER)))
          .addMethod(
            getFindAllAnimalsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                ComunicatorOuterClass.empty,
                ComunicatorOuterClass.protoAnimal>(
                  this, METHODID_FIND_ALL_ANIMALS)))
          .addMethod(
            getFindByDateMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                ComunicatorOuterClass.protoDate,
                ComunicatorOuterClass.protoAnimal>(
                  this, METHODID_FIND_BY_DATE)))
          .addMethod(
            getFindByOriginMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                ComunicatorOuterClass.stringRequest,
                ComunicatorOuterClass.protoAnimal>(
                  this, METHODID_FIND_BY_ORIGIN)))
          .build();
    }
  }

  /**
   */
  public static final class ComunicatorStub extends io.grpc.stub.AbstractAsyncStub<ComunicatorStub> {
    private ComunicatorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComunicatorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComunicatorStub(channel, callOptions);
    }

    /**
     */
    public void saveAnimal(ComunicatorOuterClass.protoAnimal request,
        io.grpc.stub.StreamObserver<ComunicatorOuterClass.stringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByRegNumber(ComunicatorOuterClass.longRequest request,
        io.grpc.stub.StreamObserver<ComunicatorOuterClass.protoAnimal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByRegNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAnimal(ComunicatorOuterClass.protoAnimal request,
        io.grpc.stub.StreamObserver<ComunicatorOuterClass.stringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAnimalByRegNumber(ComunicatorOuterClass.longRequest request,
        io.grpc.stub.StreamObserver<ComunicatorOuterClass.stringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAnimalByRegNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllAnimals(ComunicatorOuterClass.empty request,
        io.grpc.stub.StreamObserver<ComunicatorOuterClass.protoAnimal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindAllAnimalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByDate(ComunicatorOuterClass.protoDate request,
        io.grpc.stub.StreamObserver<ComunicatorOuterClass.protoAnimal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindByDateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByOrigin(ComunicatorOuterClass.stringRequest request,
        io.grpc.stub.StreamObserver<ComunicatorOuterClass.protoAnimal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindByOriginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ComunicatorBlockingStub extends io.grpc.stub.AbstractBlockingStub<ComunicatorBlockingStub> {
    private ComunicatorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComunicatorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComunicatorBlockingStub(channel, callOptions);
    }

    /**
     */
    public ComunicatorOuterClass.stringResponse saveAnimal(ComunicatorOuterClass.protoAnimal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public ComunicatorOuterClass.protoAnimal findByRegNumber(ComunicatorOuterClass.longRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByRegNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public ComunicatorOuterClass.stringResponse updateAnimal(ComunicatorOuterClass.protoAnimal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public ComunicatorOuterClass.stringResponse deleteAnimalByRegNumber(ComunicatorOuterClass.longRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAnimalByRegNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ComunicatorOuterClass.protoAnimal> findAllAnimals(
        ComunicatorOuterClass.empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindAllAnimalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ComunicatorOuterClass.protoAnimal> findByDate(
        ComunicatorOuterClass.protoDate request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindByDateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ComunicatorOuterClass.protoAnimal> findByOrigin(
        ComunicatorOuterClass.stringRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindByOriginMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ComunicatorFutureStub extends io.grpc.stub.AbstractFutureStub<ComunicatorFutureStub> {
    private ComunicatorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComunicatorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComunicatorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ComunicatorOuterClass.stringResponse> saveAnimal(
        ComunicatorOuterClass.protoAnimal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ComunicatorOuterClass.protoAnimal> findByRegNumber(
        ComunicatorOuterClass.longRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByRegNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ComunicatorOuterClass.stringResponse> updateAnimal(
        ComunicatorOuterClass.protoAnimal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ComunicatorOuterClass.stringResponse> deleteAnimalByRegNumber(
        ComunicatorOuterClass.longRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAnimalByRegNumberMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_ANIMAL = 0;
  private static final int METHODID_FIND_BY_REG_NUMBER = 1;
  private static final int METHODID_UPDATE_ANIMAL = 2;
  private static final int METHODID_DELETE_ANIMAL_BY_REG_NUMBER = 3;
  private static final int METHODID_FIND_ALL_ANIMALS = 4;
  private static final int METHODID_FIND_BY_DATE = 5;
  private static final int METHODID_FIND_BY_ORIGIN = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ComunicatorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ComunicatorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_ANIMAL:
          serviceImpl.saveAnimal((ComunicatorOuterClass.protoAnimal) request,
              (io.grpc.stub.StreamObserver<ComunicatorOuterClass.stringResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_REG_NUMBER:
          serviceImpl.findByRegNumber((ComunicatorOuterClass.longRequest) request,
              (io.grpc.stub.StreamObserver<ComunicatorOuterClass.protoAnimal>) responseObserver);
          break;
        case METHODID_UPDATE_ANIMAL:
          serviceImpl.updateAnimal((ComunicatorOuterClass.protoAnimal) request,
              (io.grpc.stub.StreamObserver<ComunicatorOuterClass.stringResponse>) responseObserver);
          break;
        case METHODID_DELETE_ANIMAL_BY_REG_NUMBER:
          serviceImpl.deleteAnimalByRegNumber((ComunicatorOuterClass.longRequest) request,
              (io.grpc.stub.StreamObserver<ComunicatorOuterClass.stringResponse>) responseObserver);
          break;
        case METHODID_FIND_ALL_ANIMALS:
          serviceImpl.findAllAnimals((ComunicatorOuterClass.empty) request,
              (io.grpc.stub.StreamObserver<ComunicatorOuterClass.protoAnimal>) responseObserver);
          break;
        case METHODID_FIND_BY_DATE:
          serviceImpl.findByDate((ComunicatorOuterClass.protoDate) request,
              (io.grpc.stub.StreamObserver<ComunicatorOuterClass.protoAnimal>) responseObserver);
          break;
        case METHODID_FIND_BY_ORIGIN:
          serviceImpl.findByOrigin((ComunicatorOuterClass.stringRequest) request,
              (io.grpc.stub.StreamObserver<ComunicatorOuterClass.protoAnimal>) responseObserver);
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

  private static abstract class ComunicatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ComunicatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ComunicatorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Comunicator");
    }
  }

  private static final class ComunicatorFileDescriptorSupplier
      extends ComunicatorBaseDescriptorSupplier {
    ComunicatorFileDescriptorSupplier() {}
  }

  private static final class ComunicatorMethodDescriptorSupplier
      extends ComunicatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ComunicatorMethodDescriptorSupplier(String methodName) {
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
      synchronized (ComunicatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ComunicatorFileDescriptorSupplier())
              .addMethod(getSaveAnimalMethod())
              .addMethod(getFindByRegNumberMethod())
              .addMethod(getUpdateAnimalMethod())
              .addMethod(getDeleteAnimalByRegNumberMethod())
              .addMethod(getFindAllAnimalsMethod())
              .addMethod(getFindByDateMethod())
              .addMethod(getFindByOriginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
