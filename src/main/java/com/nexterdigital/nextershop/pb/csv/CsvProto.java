// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: csv.proto

package com.nexterdigital.nextershop.pb.csv;

public final class CsvProto {
  private CsvProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_csv_v1_Payload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_csv_v1_Payload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_csv_v1_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_csv_v1_Request_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tcsv.proto\022\006csv.v1\032 google/protobuf/des" +
      "criptor.proto\032\rproduct.proto\032\023uploaded_f" +
      "ile.proto\"9\n\007Payload\022&\n\007product\030\001 \001(\0132\023." +
      "product.v1.ProductH\000B\006\n\004data\"E\n\007Request\022" +
      "\014\n\004name\030\001 \001(\t\022 \n\007payload\030\002 \003(\0132\017.csv.v1." +
      "Payload\022\n\n\002id\030\003 \001(\t2J\n\nCsvService\022<\n\010gen" +
      "erate\022\017.csv.v1.Request\032\035.uploadedfile.v1" +
      ".UploadedFile\"\000B1\n#com.nexterdigital.nex" +
      "tershop.pb.csvB\010CsvProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
          com.nexterdigital.nextershop.pb.product.ProductProto.getDescriptor(),
          com.nexterdigital.nextershop.pb.uploadedfile.UploadedFileProto.getDescriptor(),
        });
    internal_static_csv_v1_Payload_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_csv_v1_Payload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_csv_v1_Payload_descriptor,
        new java.lang.String[] { "Product", "Data", });
    internal_static_csv_v1_Request_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_csv_v1_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_csv_v1_Request_descriptor,
        new java.lang.String[] { "Name", "Payload", "Id", });
    com.google.protobuf.DescriptorProtos.getDescriptor();
    com.nexterdigital.nextershop.pb.product.ProductProto.getDescriptor();
    com.nexterdigital.nextershop.pb.uploadedfile.UploadedFileProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
