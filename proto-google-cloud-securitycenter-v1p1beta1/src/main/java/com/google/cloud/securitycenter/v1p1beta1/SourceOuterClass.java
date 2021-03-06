/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1p1beta1/source.proto

package com.google.cloud.securitycenter.v1p1beta1;

public final class SourceOuterClass {
  private SourceOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1p1beta1_Source_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1p1beta1_Source_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/securitycenter/v1p1beta1/"
          + "source.proto\022%google.cloud.securitycente"
          + "r.v1p1beta1\032\031google/api/resource.proto\032\034"
          + "google/api/annotations.proto\"\375\001\n\006Source\022"
          + "\014\n\004name\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022\023\n\013d"
          + "escription\030\003 \001(\t\022\026\n\016canonical_name\030\016 \001(\t"
          + ":\241\001\352A\235\001\n$securitycenter.googleapis.com/S"
          + "ource\022-organizations/{organization}/sour"
          + "ces/{source}\022!folders/{folder}/sources/{"
          + "source}\022#projects/{project}/sources/{sou"
          + "rce}B\375\001\n)com.google.cloud.securitycenter"
          + ".v1p1beta1P\001ZSgoogle.golang.org/genproto"
          + "/googleapis/cloud/securitycenter/v1p1bet"
          + "a1;securitycenter\252\002%Google.Cloud.Securit"
          + "yCenter.V1P1Beta1\312\002%Google\\Cloud\\Securit"
          + "yCenter\\V1p1beta1\352\002(Google::Cloud::Secur"
          + "ityCenter::V1p1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1p1beta1_Source_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1p1beta1_Source_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1p1beta1_Source_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Description", "CanonicalName",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
