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
 * AllocatedLimit
 */

public class AllocatedLimit implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("configured")
  private String configured = null;

  @SerializedName("percentage_used")
  private String percentageUsed = null;

  @SerializedName("plan_limit")
  private String planLimit = null;

  @SerializedName("used")
  private String used = null;

  public AllocatedLimit configured(String configured) {
    this.configured = configured;
    return this;
  }

   /**
   * Get configured
   * @return configured
  **/
 @Size(min=1,max=32)  @ApiModelProperty(value = "")
  public String getConfigured() {
    return configured;
  }

  public void setConfigured(String configured) {
    this.configured = configured;
  }

  public AllocatedLimit percentageUsed(String percentageUsed) {
    this.percentageUsed = percentageUsed;
    return this;
  }

   /**
   * Get percentageUsed
   * @return percentageUsed
  **/
 @Size(min=1,max=10)  @ApiModelProperty(value = "")
  public String getPercentageUsed() {
    return percentageUsed;
  }

  public void setPercentageUsed(String percentageUsed) {
    this.percentageUsed = percentageUsed;
  }

  public AllocatedLimit planLimit(String planLimit) {
    this.planLimit = planLimit;
    return this;
  }

   /**
   * Get planLimit
   * @return planLimit
  **/
 @Size(min=1,max=32)  @ApiModelProperty(value = "")
  public String getPlanLimit() {
    return planLimit;
  }

  public void setPlanLimit(String planLimit) {
    this.planLimit = planLimit;
  }

  public AllocatedLimit used(String used) {
    this.used = used;
    return this;
  }

   /**
   * Get used
   * @return used
  **/
 @Size(min=1,max=32)  @ApiModelProperty(value = "")
  public String getUsed() {
    return used;
  }

  public void setUsed(String used) {
    this.used = used;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocatedLimit allocatedLimit = (AllocatedLimit) o;
    return Objects.equals(this.configured, allocatedLimit.configured) &&
        Objects.equals(this.percentageUsed, allocatedLimit.percentageUsed) &&
        Objects.equals(this.planLimit, allocatedLimit.planLimit) &&
        Objects.equals(this.used, allocatedLimit.used);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configured, percentageUsed, planLimit, used);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocatedLimit {\n");
    
    sb.append("    configured: ").append(toIndentedString(configured)).append("\n");
    sb.append("    percentageUsed: ").append(toIndentedString(percentageUsed)).append("\n");
    sb.append("    planLimit: ").append(toIndentedString(planLimit)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
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

