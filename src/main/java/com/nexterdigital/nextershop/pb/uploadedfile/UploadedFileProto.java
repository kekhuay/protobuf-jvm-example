// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: uploaded_file.proto

package com.nexterdigital.nextershop.pb.uploadedfile;

public final class UploadedFileProto {
  private UploadedFileProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_uploadedfile_v1_UploadedFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_uploadedfile_v1_UploadedFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_uploadedfile_v1_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_uploadedfile_v1_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023uploaded_file.proto\022\017uploadedfile.v1\032\033" +
      "google/protobuf/empty.proto\032\037google/prot" +
      "obuf/timestamp.proto\"\212\001\n\014UploadedFile\022\n\n" +
      "\002id\030\001 \001(\t\022\016\n\006source\030\002 \001(\t\022.\n\ncreated_at\030" +
      "\003 \001(\0132\032.google.protobuf.Timestamp\022.\n\nupd" +
      "ated_at\030\004 \001(\0132\032.google.protobuf.Timestam" +
      "p\"A\n\010Response\0225\n\016uploaded_files\030\001 \003(\0132\035." +
      "uploadedfile.v1.UploadedFile2R\n\023Uploaded" +
      "FileService\022;\n\004init\022\026.google.protobuf.Em" +
      "pty\032\031.uploadedfile.v1.Response\"\000BC\n,com." +
      "nexterdigital.nextershop.pb.uploadedfile" +
      "B\021UploadedFileProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_uploadedfile_v1_UploadedFile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_uploadedfile_v1_UploadedFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_uploadedfile_v1_UploadedFile_descriptor,
        new java.lang.String[] { "Id", "Source", "CreatedAt", "UpdatedAt", });
    internal_static_uploadedfile_v1_Response_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_uploadedfile_v1_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_uploadedfile_v1_Response_descriptor,
        new java.lang.String[] { "UploadedFiles", });
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
