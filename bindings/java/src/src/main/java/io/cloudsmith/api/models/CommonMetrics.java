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
import io.cloudsmith.api.models.CommonBandwidthMetrics;
import io.cloudsmith.api.models.CommonDownloadsMetrics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * CommonMetrics
 */

public class CommonMetrics implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("active")
  private Integer active = null;

  @SerializedName("bandwidth")
  private CommonBandwidthMetrics bandwidth = null;

  @SerializedName("downloads")
  private CommonDownloadsMetrics downloads = null;

  @SerializedName("inactive")
  private Integer inactive = null;

  @SerializedName("total")
  private Integer total = null;

  public CommonMetrics active(Integer active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Integer getActive() {
    return active;
  }

  public void setActive(Integer active) {
    this.active = active;
  }

  public CommonMetrics bandwidth(CommonBandwidthMetrics bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public CommonBandwidthMetrics getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(CommonBandwidthMetrics bandwidth) {
    this.bandwidth = bandwidth;
  }

  public CommonMetrics downloads(CommonDownloadsMetrics downloads) {
    this.downloads = downloads;
    return this;
  }

   /**
   * Get downloads
   * @return downloads
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public CommonDownloadsMetrics getDownloads() {
    return downloads;
  }

  public void setDownloads(CommonDownloadsMetrics downloads) {
    this.downloads = downloads;
  }

  public CommonMetrics inactive(Integer inactive) {
    this.inactive = inactive;
    return this;
  }

   /**
   * Get inactive
   * @return inactive
  **/
  @ApiModelProperty(value = "")
  public Integer getInactive() {
    return inactive;
  }

  public void setInactive(Integer inactive) {
    this.inactive = inactive;
  }

  public CommonMetrics total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
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
    CommonMetrics commonMetrics = (CommonMetrics) o;
    return Objects.equals(this.active, commonMetrics.active) &&
        Objects.equals(this.bandwidth, commonMetrics.bandwidth) &&
        Objects.equals(this.downloads, commonMetrics.downloads) &&
        Objects.equals(this.inactive, commonMetrics.inactive) &&
        Objects.equals(this.total, commonMetrics.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, bandwidth, downloads, inactive, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonMetrics {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    downloads: ").append(toIndentedString(downloads)).append("\n");
    sb.append("    inactive: ").append(toIndentedString(inactive)).append("\n");
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
