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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * RepositoryTransferRegionRequest
 */

public class RepositoryTransferRegionRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("storage_region")
  private String storageRegion = "default";

  public RepositoryTransferRegionRequest storageRegion(String storageRegion) {
    this.storageRegion = storageRegion;
    return this;
  }

   /**
   * The Cloudsmith region in which package files are stored.
   * @return storageRegion
  **/
  @ApiModelProperty(value = "The Cloudsmith region in which package files are stored.")
  public String getStorageRegion() {
    return storageRegion;
  }

  public void setStorageRegion(String storageRegion) {
    this.storageRegion = storageRegion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryTransferRegionRequest repositoryTransferRegionRequest = (RepositoryTransferRegionRequest) o;
    return Objects.equals(this.storageRegion, repositoryTransferRegionRequest.storageRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageRegion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryTransferRegionRequest {\n");
    
    sb.append("    storageRegion: ").append(toIndentedString(storageRegion)).append("\n");
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

