// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: csv.proto

package com.nexterdigital.nextershop.pb.csv;

public interface PayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:csv.v1.Payload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.product.v1.Product product = 1;</code>
   * @return Whether the product field is set.
   */
  boolean hasProduct();
  /**
   * <code>.product.v1.Product product = 1;</code>
   * @return The product.
   */
  com.nexterdigital.nextershop.pb.product.Product getProduct();
  /**
   * <code>.product.v1.Product product = 1;</code>
   */
  com.nexterdigital.nextershop.pb.product.ProductOrBuilder getProductOrBuilder();

  public com.nexterdigital.nextershop.pb.csv.Payload.DataCase getDataCase();
}
