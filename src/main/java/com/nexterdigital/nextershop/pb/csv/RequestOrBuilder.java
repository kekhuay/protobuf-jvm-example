// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: csv.proto

package com.nexterdigital.nextershop.pb.csv;

public interface RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:csv.v1.Request)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated .csv.v1.Payload payload = 2;</code>
   */
  java.util.List<com.nexterdigital.nextershop.pb.csv.Payload> 
      getPayloadList();
  /**
   * <code>repeated .csv.v1.Payload payload = 2;</code>
   */
  com.nexterdigital.nextershop.pb.csv.Payload getPayload(int index);
  /**
   * <code>repeated .csv.v1.Payload payload = 2;</code>
   */
  int getPayloadCount();
  /**
   * <code>repeated .csv.v1.Payload payload = 2;</code>
   */
  java.util.List<? extends com.nexterdigital.nextershop.pb.csv.PayloadOrBuilder> 
      getPayloadOrBuilderList();
  /**
   * <code>repeated .csv.v1.Payload payload = 2;</code>
   */
  com.nexterdigital.nextershop.pb.csv.PayloadOrBuilder getPayloadOrBuilder(
      int index);

  /**
   * <code>string id = 3;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 3;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();
}
