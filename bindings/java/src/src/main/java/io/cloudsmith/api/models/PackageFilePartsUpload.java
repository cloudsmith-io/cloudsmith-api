/*
 * Cloudsmith API
 * The API to the Cloudsmith Service
 *
 * OpenAPI spec version: v1
 * Contact: support@cloudsmith.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.cloudsmith.api.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * PackageFilePartsUpload
 */

public class PackageFilePartsUpload implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("upload_querystring")
  private String uploadQuerystring = null;

  @SerializedName("upload_url")
  private String uploadUrl = null;

  public PackageFilePartsUpload identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The identifier for the file to use uploading parts.
   * @return identifier
  **/
  @ApiModelProperty(value = "The identifier for the file to use uploading parts.")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public PackageFilePartsUpload uploadQuerystring(String uploadQuerystring) {
    this.uploadQuerystring = uploadQuerystring;
    return this;
  }

   /**
   * The querystring to use for the next-step PUT upload.
   * @return uploadQuerystring
  **/
  @ApiModelProperty(value = "The querystring to use for the next-step PUT upload.")
  public String getUploadQuerystring() {
    return uploadQuerystring;
  }

  public void setUploadQuerystring(String uploadQuerystring) {
    this.uploadQuerystring = uploadQuerystring;
  }

  public PackageFilePartsUpload uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }

   /**
   * The URL to use for the next-step PUT upload
   * @return uploadUrl
  **/
  @ApiModelProperty(value = "The URL to use for the next-step PUT upload")
  public String getUploadUrl() {
    return uploadUrl;
  }

  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageFilePartsUpload packageFilePartsUpload = (PackageFilePartsUpload) o;
    return Objects.equals(this.identifier, packageFilePartsUpload.identifier) &&
        Objects.equals(this.uploadQuerystring, packageFilePartsUpload.uploadQuerystring) &&
        Objects.equals(this.uploadUrl, packageFilePartsUpload.uploadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, uploadQuerystring, uploadUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageFilePartsUpload {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    uploadQuerystring: ").append(toIndentedString(uploadQuerystring)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
