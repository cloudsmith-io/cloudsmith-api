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
 * EntitlementsCreate
 */

public class EntitlementsCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("limit_bandwidth")
  private Integer limitBandwidth = null;

  @SerializedName("limit_bandwidth_unit")
  private String limitBandwidthUnit = null;

  @SerializedName("limit_date_range_from")
  private String limitDateRangeFrom = null;

  @SerializedName("limit_date_range_to")
  private String limitDateRangeTo = null;

  @SerializedName("limit_num_clients")
  private Integer limitNumClients = null;

  @SerializedName("limit_num_downloads")
  private Integer limitNumDownloads = null;

  @SerializedName("limit_package_query")
  private String limitPackageQuery = null;

  @SerializedName("limit_path_query")
  private String limitPathQuery = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("scheduled_reset_at")
  private String scheduledResetAt = null;

  @SerializedName("scheduled_reset_period")
  private String scheduledResetPeriod = null;

  @SerializedName("token")
  private String token = null;

  public EntitlementsCreate isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * If enabled, the token will allow downloads based on configured restrictions (if any).
   * @return isActive
  **/
  @ApiModelProperty(value = "If enabled, the token will allow downloads based on configured restrictions (if any).")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public EntitlementsCreate limitBandwidth(Integer limitBandwidth) {
    this.limitBandwidth = limitBandwidth;
    return this;
  }

   /**
   * The maximum download bandwidth allowed for the token. Values are expressed as the selected unit of bandwidth. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. 
   * @return limitBandwidth
  **/
  @ApiModelProperty(value = "The maximum download bandwidth allowed for the token. Values are expressed as the selected unit of bandwidth. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. ")
  public Integer getLimitBandwidth() {
    return limitBandwidth;
  }

  public void setLimitBandwidth(Integer limitBandwidth) {
    this.limitBandwidth = limitBandwidth;
  }

  public EntitlementsCreate limitBandwidthUnit(String limitBandwidthUnit) {
    this.limitBandwidthUnit = limitBandwidthUnit;
    return this;
  }

   /**
   * None
   * @return limitBandwidthUnit
  **/
  @ApiModelProperty(value = "None")
  public String getLimitBandwidthUnit() {
    return limitBandwidthUnit;
  }

  public void setLimitBandwidthUnit(String limitBandwidthUnit) {
    this.limitBandwidthUnit = limitBandwidthUnit;
  }

  public EntitlementsCreate limitDateRangeFrom(String limitDateRangeFrom) {
    this.limitDateRangeFrom = limitDateRangeFrom;
    return this;
  }

   /**
   * The starting date/time the token is allowed to be used from.
   * @return limitDateRangeFrom
  **/
  @ApiModelProperty(value = "The starting date/time the token is allowed to be used from.")
  public String getLimitDateRangeFrom() {
    return limitDateRangeFrom;
  }

  public void setLimitDateRangeFrom(String limitDateRangeFrom) {
    this.limitDateRangeFrom = limitDateRangeFrom;
  }

  public EntitlementsCreate limitDateRangeTo(String limitDateRangeTo) {
    this.limitDateRangeTo = limitDateRangeTo;
    return this;
  }

   /**
   * The ending date/time the token is allowed to be used until.
   * @return limitDateRangeTo
  **/
  @ApiModelProperty(value = "The ending date/time the token is allowed to be used until.")
  public String getLimitDateRangeTo() {
    return limitDateRangeTo;
  }

  public void setLimitDateRangeTo(String limitDateRangeTo) {
    this.limitDateRangeTo = limitDateRangeTo;
  }

  public EntitlementsCreate limitNumClients(Integer limitNumClients) {
    this.limitNumClients = limitNumClients;
    return this;
  }

   /**
   * The maximum number of unique clients allowed for the token. Please note that since clients are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.
   * @return limitNumClients
  **/
  @ApiModelProperty(value = "The maximum number of unique clients allowed for the token. Please note that since clients are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.")
  public Integer getLimitNumClients() {
    return limitNumClients;
  }

  public void setLimitNumClients(Integer limitNumClients) {
    this.limitNumClients = limitNumClients;
  }

  public EntitlementsCreate limitNumDownloads(Integer limitNumDownloads) {
    this.limitNumDownloads = limitNumDownloads;
    return this;
  }

   /**
   * The maximum number of downloads allowed for the token. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.
   * @return limitNumDownloads
  **/
  @ApiModelProperty(value = "The maximum number of downloads allowed for the token. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.")
  public Integer getLimitNumDownloads() {
    return limitNumDownloads;
  }

  public void setLimitNumDownloads(Integer limitNumDownloads) {
    this.limitNumDownloads = limitNumDownloads;
  }

  public EntitlementsCreate limitPackageQuery(String limitPackageQuery) {
    this.limitPackageQuery = limitPackageQuery;
    return this;
  }

   /**
   * The package-based search query to apply to restrict downloads to. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. This will still allow access to non-package files, such as metadata.
   * @return limitPackageQuery
  **/
  @ApiModelProperty(value = "The package-based search query to apply to restrict downloads to. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. This will still allow access to non-package files, such as metadata.")
  public String getLimitPackageQuery() {
    return limitPackageQuery;
  }

  public void setLimitPackageQuery(String limitPackageQuery) {
    this.limitPackageQuery = limitPackageQuery;
  }

  public EntitlementsCreate limitPathQuery(String limitPathQuery) {
    this.limitPathQuery = limitPathQuery;
    return this;
  }

   /**
   * The path-based search query to apply to restrict downloads to. This supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. The path evaluated does not include the domain name, the namespace, the entitlement code used, the package format, etc. and it always starts with a forward slash.
   * @return limitPathQuery
  **/
  @ApiModelProperty(value = "The path-based search query to apply to restrict downloads to. This supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. The path evaluated does not include the domain name, the namespace, the entitlement code used, the package format, etc. and it always starts with a forward slash.")
  public String getLimitPathQuery() {
    return limitPathQuery;
  }

  public void setLimitPathQuery(String limitPathQuery) {
    this.limitPathQuery = limitPathQuery;
  }

  public EntitlementsCreate metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * None
   * @return metadata
  **/
  @ApiModelProperty(value = "None")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public EntitlementsCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * None
   * @return name
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "None")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EntitlementsCreate scheduledResetAt(String scheduledResetAt) {
    this.scheduledResetAt = scheduledResetAt;
    return this;
  }

   /**
   * The time at which the scheduled reset period has elapsed and the token limits were automatically reset to zero.
   * @return scheduledResetAt
  **/
  @ApiModelProperty(value = "The time at which the scheduled reset period has elapsed and the token limits were automatically reset to zero.")
  public String getScheduledResetAt() {
    return scheduledResetAt;
  }

  public void setScheduledResetAt(String scheduledResetAt) {
    this.scheduledResetAt = scheduledResetAt;
  }

  public EntitlementsCreate scheduledResetPeriod(String scheduledResetPeriod) {
    this.scheduledResetPeriod = scheduledResetPeriod;
    return this;
  }

   /**
   * None
   * @return scheduledResetPeriod
  **/
  @ApiModelProperty(value = "None")
  public String getScheduledResetPeriod() {
    return scheduledResetPeriod;
  }

  public void setScheduledResetPeriod(String scheduledResetPeriod) {
    this.scheduledResetPeriod = scheduledResetPeriod;
  }

  public EntitlementsCreate token(String token) {
    this.token = token;
    return this;
  }

   /**
   * None
   * @return token
  **/
  @ApiModelProperty(value = "None")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitlementsCreate entitlementsCreate = (EntitlementsCreate) o;
    return Objects.equals(this.isActive, entitlementsCreate.isActive) &&
        Objects.equals(this.limitBandwidth, entitlementsCreate.limitBandwidth) &&
        Objects.equals(this.limitBandwidthUnit, entitlementsCreate.limitBandwidthUnit) &&
        Objects.equals(this.limitDateRangeFrom, entitlementsCreate.limitDateRangeFrom) &&
        Objects.equals(this.limitDateRangeTo, entitlementsCreate.limitDateRangeTo) &&
        Objects.equals(this.limitNumClients, entitlementsCreate.limitNumClients) &&
        Objects.equals(this.limitNumDownloads, entitlementsCreate.limitNumDownloads) &&
        Objects.equals(this.limitPackageQuery, entitlementsCreate.limitPackageQuery) &&
        Objects.equals(this.limitPathQuery, entitlementsCreate.limitPathQuery) &&
        Objects.equals(this.metadata, entitlementsCreate.metadata) &&
        Objects.equals(this.name, entitlementsCreate.name) &&
        Objects.equals(this.scheduledResetAt, entitlementsCreate.scheduledResetAt) &&
        Objects.equals(this.scheduledResetPeriod, entitlementsCreate.scheduledResetPeriod) &&
        Objects.equals(this.token, entitlementsCreate.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive, limitBandwidth, limitBandwidthUnit, limitDateRangeFrom, limitDateRangeTo, limitNumClients, limitNumDownloads, limitPackageQuery, limitPathQuery, metadata, name, scheduledResetAt, scheduledResetPeriod, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitlementsCreate {\n");
    
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    limitBandwidth: ").append(toIndentedString(limitBandwidth)).append("\n");
    sb.append("    limitBandwidthUnit: ").append(toIndentedString(limitBandwidthUnit)).append("\n");
    sb.append("    limitDateRangeFrom: ").append(toIndentedString(limitDateRangeFrom)).append("\n");
    sb.append("    limitDateRangeTo: ").append(toIndentedString(limitDateRangeTo)).append("\n");
    sb.append("    limitNumClients: ").append(toIndentedString(limitNumClients)).append("\n");
    sb.append("    limitNumDownloads: ").append(toIndentedString(limitNumDownloads)).append("\n");
    sb.append("    limitPackageQuery: ").append(toIndentedString(limitPackageQuery)).append("\n");
    sb.append("    limitPathQuery: ").append(toIndentedString(limitPathQuery)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scheduledResetAt: ").append(toIndentedString(scheduledResetAt)).append("\n");
    sb.append("    scheduledResetPeriod: ").append(toIndentedString(scheduledResetPeriod)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

