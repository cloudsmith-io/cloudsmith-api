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
 * ResourcesRateCheck
 */

public class ResourcesRateCheck implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("resources")
  private Object resources = null;

  public ResourcesRateCheck resources(Object resources) {
    this.resources = resources;
    return this;
  }

   /**
   * Rate limit values per resource
   * @return resources
  **/
  @ApiModelProperty(example = "{\"core\":{\"reset\":1521971852,\"reset_iso_8601\":\"2018-03-25T09:57:32.724325+00:00\",\"throttled\":false,\"interval\":5.123456789,\"limit\":3600,\"remaining\":3595}}", value = "Rate limit values per resource")
  public Object getResources() {
    return resources;
  }

  public void setResources(Object resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourcesRateCheck resourcesRateCheck = (ResourcesRateCheck) o;
    return Objects.equals(this.resources, resourcesRateCheck.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourcesRateCheck {\n");
    
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
