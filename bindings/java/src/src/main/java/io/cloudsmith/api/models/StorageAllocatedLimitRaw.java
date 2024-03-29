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
 * StorageAllocatedLimitRaw
 */

public class StorageAllocatedLimitRaw implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("configured")
  private java.math.BigInteger configured = null;

  @SerializedName("peak")
  private java.math.BigInteger peak = null;

  @SerializedName("percentage_used")
  private String percentageUsed = null;

  @SerializedName("plan_limit")
  private java.math.BigInteger planLimit = null;

  @SerializedName("used")
  private java.math.BigInteger used = null;

  public StorageAllocatedLimitRaw configured(java.math.BigInteger configured) {
    this.configured = configured;
    return this;
  }

   /**
   * Get configured
   * @return configured
  **/
  @ApiModelProperty(value = "")
  public java.math.BigInteger getConfigured() {
    return configured;
  }

  public void setConfigured(java.math.BigInteger configured) {
    this.configured = configured;
  }

  public StorageAllocatedLimitRaw peak(java.math.BigInteger peak) {
    this.peak = peak;
    return this;
  }

   /**
   * Get peak
   * @return peak
  **/
  @ApiModelProperty(value = "")
  public java.math.BigInteger getPeak() {
    return peak;
  }

  public void setPeak(java.math.BigInteger peak) {
    this.peak = peak;
  }

  public StorageAllocatedLimitRaw percentageUsed(String percentageUsed) {
    this.percentageUsed = percentageUsed;
    return this;
  }

   /**
   * Get percentageUsed
   * @return percentageUsed
  **/
  @ApiModelProperty(value = "")
  public String getPercentageUsed() {
    return percentageUsed;
  }

  public void setPercentageUsed(String percentageUsed) {
    this.percentageUsed = percentageUsed;
  }

  public StorageAllocatedLimitRaw planLimit(java.math.BigInteger planLimit) {
    this.planLimit = planLimit;
    return this;
  }

   /**
   * Get planLimit
   * @return planLimit
  **/
  @ApiModelProperty(value = "")
  public java.math.BigInteger getPlanLimit() {
    return planLimit;
  }

  public void setPlanLimit(java.math.BigInteger planLimit) {
    this.planLimit = planLimit;
  }

  public StorageAllocatedLimitRaw used(java.math.BigInteger used) {
    this.used = used;
    return this;
  }

   /**
   * Get used
   * @return used
  **/
  @ApiModelProperty(value = "")
  public java.math.BigInteger getUsed() {
    return used;
  }

  public void setUsed(java.math.BigInteger used) {
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
    StorageAllocatedLimitRaw storageAllocatedLimitRaw = (StorageAllocatedLimitRaw) o;
    return Objects.equals(this.configured, storageAllocatedLimitRaw.configured) &&
        Objects.equals(this.peak, storageAllocatedLimitRaw.peak) &&
        Objects.equals(this.percentageUsed, storageAllocatedLimitRaw.percentageUsed) &&
        Objects.equals(this.planLimit, storageAllocatedLimitRaw.planLimit) &&
        Objects.equals(this.used, storageAllocatedLimitRaw.used);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configured, peak, percentageUsed, planLimit, used);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageAllocatedLimitRaw {\n");
    
    sb.append("    configured: ").append(toIndentedString(configured)).append("\n");
    sb.append("    peak: ").append(toIndentedString(peak)).append("\n");
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

