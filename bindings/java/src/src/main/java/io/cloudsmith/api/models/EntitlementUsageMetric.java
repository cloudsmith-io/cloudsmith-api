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
 * EntitlementUsageMetric
 */

public class EntitlementUsageMetric implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("usage")
  private Object usage = null;

  public EntitlementUsageMetric usage(Object usage) {
    this.usage = usage;
    return this;
  }

   /**
   * 
   * @return usage
  **/
  @NotNull
  @ApiModelProperty(example = "{\"display\":{\"bandwidth_per_token\":{\"average\":\"11 B\",\"highest\":\"11 B\",\"lowest\":\"11 B\"},\"totals\":{\"active_tokens\":1,\"bandwidth_used\":\"11 B\",\"inactive_tokens\":0,\"tokens\":1}},\"raw\":{\"bandwidth_per_token\":{\"average\":11,\"highest\":11,\"lowest\":11},\"totals\":{\"active_tokens\":1,\"bandwidth_used\":11,\"inactive_tokens\":0,\"tokens\":1}}}", required = true, value = "")
  public Object getUsage() {
    return usage;
  }

  public void setUsage(Object usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitlementUsageMetric entitlementUsageMetric = (EntitlementUsageMetric) o;
    return Objects.equals(this.usage, entitlementUsageMetric.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitlementUsageMetric {\n");
    
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
