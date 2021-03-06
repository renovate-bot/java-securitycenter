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
// source: google/cloud/securitycenter/v1p1beta1/folder.proto

package com.google.cloud.securitycenter.v1p1beta1;

public final class FolderProto {
  private FolderProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1p1beta1_Folder_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1p1beta1_Folder_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/securitycenter/v1p1beta1/"
          + "folder.proto\022%google.cloud.securitycente"
          + "r.v1p1beta1\032\034google/api/annotations.prot"
          + "o\"G\n\006Folder\022\027\n\017resource_folder\030\001 \001(\t\022$\n\034"
          + "resource_folder_display_name\030\002 \001(\tB\212\002\n)c"
          + "om.google.cloud.securitycenter.v1p1beta1"
          + "B\013FolderProtoP\001ZSgoogle.golang.org/genpr"
          + "oto/googleapis/cloud/securitycenter/v1p1"
          + "beta1;securitycenter\252\002%Google.Cloud.Secu"
          + "rityCenter.V1P1Beta1\312\002%Google\\Cloud\\Secu"
          + "rityCenter\\V1p1beta1\352\002(Google::Cloud::Se"
          + "curityCenter::V1p1Beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1p1beta1_Folder_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1p1beta1_Folder_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1p1beta1_Folder_descriptor,
            new java.lang.String[] {
              "ResourceFolder", "ResourceFolderDisplayName",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
