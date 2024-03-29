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
import io.cloudsmith.api.models.CommonBandwidthMetricsValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * CommonBandwidthMetrics
 */

public class CommonBandwidthMetrics implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("average")
  private CommonBandwidthMetricsValue average = null;

  @SerializedName("highest")
  private CommonBandwidthMetricsValue highest = null;

  @SerializedName("lowest")
  private CommonBandwidthMetricsValue lowest = null;

  @SerializedName("total")
  private CommonBandwidthMetricsValue total = null;

  public CommonBandwidthMetrics average(CommonBandwidthMetricsValue average) {
    this.average = average;
    return this;
  }

   /**
   * Get average
   * @return average
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public CommonBandwidthMetricsValue getAverage() {
    return average;
  }

  public void setAverage(CommonBandwidthMetricsValue average) {
    this.average = average;
  }

  public CommonBandwidthMetrics highest(CommonBandwidthMetricsValue highest) {
    this.highest = highest;
    return this;
  }

   /**
   * Get highest
   * @return highest
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public CommonBandwidthMetricsValue getHighest() {
    return highest;
  }

  public void setHighest(CommonBandwidthMetricsValue highest) {
    this.highest = highest;
  }

  public CommonBandwidthMetrics lowest(CommonBandwidthMetricsValue lowest) {
    this.lowest = lowest;
    return this;
  }

   /**
   * Get lowest
   * @return lowest
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public CommonBandwidthMetricsValue getLowest() {
    return lowest;
  }

  public void setLowest(CommonBandwidthMetricsValue lowest) {
    this.lowest = lowest;
  }

  public CommonBandwidthMetrics total(CommonBandwidthMetricsValue total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public CommonBandwidthMetricsValue getTotal() {
    return total;
  }

  public void setTotal(CommonBandwidthMetricsValue total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonBandwidthMetrics commonBandwidthMetrics = (CommonBandwidthMetrics) o;
    return Objects.equals(this.average, commonBandwidthMetrics.average) &&
        Objects.equals(this.highest, commonBandwidthMetrics.highest) &&
        Objects.equals(this.lowest, commonBandwidthMetrics.lowest) &&
        Objects.equals(this.total, commonBandwidthMetrics.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(average, highest, lowest, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonBandwidthMetrics {\n");
    
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    highest: ").append(toIndentedString(highest)).append("\n");
    sb.append("    lowest: ").append(toIndentedString(lowest)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

