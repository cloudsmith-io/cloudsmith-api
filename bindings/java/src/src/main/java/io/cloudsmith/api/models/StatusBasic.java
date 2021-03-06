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
 * StatusBasic
 */

public class StatusBasic implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("detail")
  private String detail = null;

  @SerializedName("version")
  private String version = null;

  public StatusBasic detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * The message describing the state of the API.
   * @return detail
  **/
  @ApiModelProperty(example = "Cloudsmith API is operational.", value = "The message describing the state of the API.")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public StatusBasic version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The current version for the Cloudsmith service.
   * @return version
  **/
  @ApiModelProperty(example = "0.57.1", value = "The current version for the Cloudsmith service.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusBasic statusBasic = (StatusBasic) o;
    return Objects.equals(this.detail, statusBasic.detail) &&
        Objects.equals(this.version, statusBasic.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusBasic {\n");
    
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

