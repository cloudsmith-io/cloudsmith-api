/*
 * Cloudsmith API (v1)
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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.cloudsmith.api.models.StorageUsageRaw;
import io.cloudsmith.api.models.UsageRaw;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * HistoryFieldsetRaw
 */

public class HistoryFieldsetRaw implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("downloaded")
  private UsageRaw downloaded = null;

  @SerializedName("storage_used")
  private StorageUsageRaw storageUsed = null;

  @SerializedName("uploaded")
  private UsageRaw uploaded = null;

  public HistoryFieldsetRaw downloaded(UsageRaw downloaded) {
    this.downloaded = downloaded;
    return this;
  }

   /**
   * Get downloaded
   * @return downloaded
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public UsageRaw getDownloaded() {
    return downloaded;
  }

  public void setDownloaded(UsageRaw downloaded) {
    this.downloaded = downloaded;
  }

  public HistoryFieldsetRaw storageUsed(StorageUsageRaw storageUsed) {
    this.storageUsed = storageUsed;
    return this;
  }

   /**
   * Get storageUsed
   * @return storageUsed
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public StorageUsageRaw getStorageUsed() {
    return storageUsed;
  }

  public void setStorageUsed(StorageUsageRaw storageUsed) {
    this.storageUsed = storageUsed;
  }

  public HistoryFieldsetRaw uploaded(UsageRaw uploaded) {
    this.uploaded = uploaded;
    return this;
  }

   /**
   * Get uploaded
   * @return uploaded
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public UsageRaw getUploaded() {
    return uploaded;
  }

  public void setUploaded(UsageRaw uploaded) {
    this.uploaded = uploaded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryFieldsetRaw historyFieldsetRaw = (HistoryFieldsetRaw) o;
    return Objects.equals(this.downloaded, historyFieldsetRaw.downloaded) &&
        Objects.equals(this.storageUsed, historyFieldsetRaw.storageUsed) &&
        Objects.equals(this.uploaded, historyFieldsetRaw.uploaded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloaded, storageUsed, uploaded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryFieldsetRaw {\n");
    
    sb.append("    downloaded: ").append(toIndentedString(downloaded)).append("\n");
    sb.append("    storageUsed: ").append(toIndentedString(storageUsed)).append("\n");
    sb.append("    uploaded: ").append(toIndentedString(uploaded)).append("\n");
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

