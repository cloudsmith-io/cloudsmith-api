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
import java.time.OffsetDateTime;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * RepositoryTokenRefreshRequest
 */

public class RepositoryTokenRefreshRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("eula_required")
  private Boolean eulaRequired = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("limit_bandwidth")
  private Integer limitBandwidth = null;

  @SerializedName("limit_bandwidth_unit")
  private String limitBandwidthUnit = "Byte";

  @SerializedName("limit_date_range_from")
  private OffsetDateTime limitDateRangeFrom = null;

  @SerializedName("limit_date_range_to")
  private OffsetDateTime limitDateRangeTo = null;

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

  @SerializedName("scheduled_reset_at")
  private OffsetDateTime scheduledResetAt = null;

  @SerializedName("scheduled_reset_period")
  private String scheduledResetPeriod = "Never Reset";

  @SerializedName("token")
  private String token = null;

  public RepositoryTokenRefreshRequest eulaRequired(Boolean eulaRequired) {
    this.eulaRequired = eulaRequired;
    return this;
  }

   /**
   * If checked, a EULA acceptance is required for this token.
   * @return eulaRequired
  **/
  @ApiModelProperty(value = "If checked, a EULA acceptance is required for this token.")
  public Boolean isEulaRequired() {
    return eulaRequired;
  }

  public void setEulaRequired(Boolean eulaRequired) {
    this.eulaRequired = eulaRequired;
  }

  public RepositoryTokenRefreshRequest isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * If enabled, the token will allow downloads based on configured restrictions (if any).
   * @return isActive
  **/
  @ApiModelProperty(value = "If enabled, the token will allow downloads based on configured restrictions (if any).")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public RepositoryTokenRefreshRequest limitBandwidth(Integer limitBandwidth) {
    this.limitBandwidth = limitBandwidth;
    return this;
  }

   /**
   * The maximum download bandwidth allowed for the token. Values are expressed as the selected unit of bandwidth. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. 
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return limitBandwidth
  **/
 @Min(-9223372036854775808) @Max(9223372036854775807)  @ApiModelProperty(value = "The maximum download bandwidth allowed for the token. Values are expressed as the selected unit of bandwidth. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. ")
  public Integer getLimitBandwidth() {
    return limitBandwidth;
  }

  public void setLimitBandwidth(Integer limitBandwidth) {
    this.limitBandwidth = limitBandwidth;
  }

  public RepositoryTokenRefreshRequest limitBandwidthUnit(String limitBandwidthUnit) {
    this.limitBandwidthUnit = limitBandwidthUnit;
    return this;
  }

   /**
   * Get limitBandwidthUnit
   * @return limitBandwidthUnit
  **/
  @ApiModelProperty(value = "")
  public String getLimitBandwidthUnit() {
    return limitBandwidthUnit;
  }

  public void setLimitBandwidthUnit(String limitBandwidthUnit) {
    this.limitBandwidthUnit = limitBandwidthUnit;
  }

  public RepositoryTokenRefreshRequest limitDateRangeFrom(OffsetDateTime limitDateRangeFrom) {
    this.limitDateRangeFrom = limitDateRangeFrom;
    return this;
  }

   /**
   * The starting date/time the token is allowed to be used from.
   * @return limitDateRangeFrom
  **/
  @Valid
  @ApiModelProperty(value = "The starting date/time the token is allowed to be used from.")
  public OffsetDateTime getLimitDateRangeFrom() {
    return limitDateRangeFrom;
  }

  public void setLimitDateRangeFrom(OffsetDateTime limitDateRangeFrom) {
    this.limitDateRangeFrom = limitDateRangeFrom;
  }

  public RepositoryTokenRefreshRequest limitDateRangeTo(OffsetDateTime limitDateRangeTo) {
    this.limitDateRangeTo = limitDateRangeTo;
    return this;
  }

   /**
   * The ending date/time the token is allowed to be used until.
   * @return limitDateRangeTo
  **/
  @Valid
  @ApiModelProperty(value = "The ending date/time the token is allowed to be used until.")
  public OffsetDateTime getLimitDateRangeTo() {
    return limitDateRangeTo;
  }

  public void setLimitDateRangeTo(OffsetDateTime limitDateRangeTo) {
    this.limitDateRangeTo = limitDateRangeTo;
  }

  public RepositoryTokenRefreshRequest limitNumClients(Integer limitNumClients) {
    this.limitNumClients = limitNumClients;
    return this;
  }

   /**
   * The maximum number of unique clients allowed for the token. Please note that since clients are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return limitNumClients
  **/
 @Min(-9223372036854775808) @Max(9223372036854775807)  @ApiModelProperty(value = "The maximum number of unique clients allowed for the token. Please note that since clients are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.")
  public Integer getLimitNumClients() {
    return limitNumClients;
  }

  public void setLimitNumClients(Integer limitNumClients) {
    this.limitNumClients = limitNumClients;
  }

  public RepositoryTokenRefreshRequest limitNumDownloads(Integer limitNumDownloads) {
    this.limitNumDownloads = limitNumDownloads;
    return this;
  }

   /**
   * The maximum number of downloads allowed for the token. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return limitNumDownloads
  **/
 @Min(-9223372036854775808) @Max(9223372036854775807)  @ApiModelProperty(value = "The maximum number of downloads allowed for the token. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.")
  public Integer getLimitNumDownloads() {
    return limitNumDownloads;
  }

  public void setLimitNumDownloads(Integer limitNumDownloads) {
    this.limitNumDownloads = limitNumDownloads;
  }

  public RepositoryTokenRefreshRequest limitPackageQuery(String limitPackageQuery) {
    this.limitPackageQuery = limitPackageQuery;
    return this;
  }

   /**
   * The package-based search query to apply to restrict downloads to. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. This will still allow access to non-package files, such as metadata.
   * @return limitPackageQuery
  **/
 @Size(max=1024)  @ApiModelProperty(value = "The package-based search query to apply to restrict downloads to. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. This will still allow access to non-package files, such as metadata.")
  public String getLimitPackageQuery() {
    return limitPackageQuery;
  }

  public void setLimitPackageQuery(String limitPackageQuery) {
    this.limitPackageQuery = limitPackageQuery;
  }

  public RepositoryTokenRefreshRequest limitPathQuery(String limitPathQuery) {
    this.limitPathQuery = limitPathQuery;
    return this;
  }

   /**
   * The path-based search query to apply to restrict downloads to. This supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. The path evaluated does not include the domain name, the namespace, the entitlement code used, the package format, etc. and it always starts with a forward slash.
   * @return limitPathQuery
  **/
 @Size(max=1024)  @ApiModelProperty(value = "The path-based search query to apply to restrict downloads to. This supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. The path evaluated does not include the domain name, the namespace, the entitlement code used, the package format, etc. and it always starts with a forward slash.")
  public String getLimitPathQuery() {
    return limitPathQuery;
  }

  public void setLimitPathQuery(String limitPathQuery) {
    this.limitPathQuery = limitPathQuery;
  }

  public RepositoryTokenRefreshRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public RepositoryTokenRefreshRequest scheduledResetAt(OffsetDateTime scheduledResetAt) {
    this.scheduledResetAt = scheduledResetAt;
    return this;
  }

   /**
   * The time at which the scheduled reset period has elapsed and the token limits were automatically reset to zero.
   * @return scheduledResetAt
  **/
  @Valid
  @ApiModelProperty(value = "The time at which the scheduled reset period has elapsed and the token limits were automatically reset to zero.")
  public OffsetDateTime getScheduledResetAt() {
    return scheduledResetAt;
  }

  public void setScheduledResetAt(OffsetDateTime scheduledResetAt) {
    this.scheduledResetAt = scheduledResetAt;
  }

  public RepositoryTokenRefreshRequest scheduledResetPeriod(String scheduledResetPeriod) {
    this.scheduledResetPeriod = scheduledResetPeriod;
    return this;
  }

   /**
   * Get scheduledResetPeriod
   * @return scheduledResetPeriod
  **/
  @ApiModelProperty(value = "")
  public String getScheduledResetPeriod() {
    return scheduledResetPeriod;
  }

  public void setScheduledResetPeriod(String scheduledResetPeriod) {
    this.scheduledResetPeriod = scheduledResetPeriod;
  }

  public RepositoryTokenRefreshRequest token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
 @Size(min=1)  @ApiModelProperty(value = "")
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
    RepositoryTokenRefreshRequest repositoryTokenRefreshRequest = (RepositoryTokenRefreshRequest) o;
    return Objects.equals(this.eulaRequired, repositoryTokenRefreshRequest.eulaRequired) &&
        Objects.equals(this.isActive, repositoryTokenRefreshRequest.isActive) &&
        Objects.equals(this.limitBandwidth, repositoryTokenRefreshRequest.limitBandwidth) &&
        Objects.equals(this.limitBandwidthUnit, repositoryTokenRefreshRequest.limitBandwidthUnit) &&
        Objects.equals(this.limitDateRangeFrom, repositoryTokenRefreshRequest.limitDateRangeFrom) &&
        Objects.equals(this.limitDateRangeTo, repositoryTokenRefreshRequest.limitDateRangeTo) &&
        Objects.equals(this.limitNumClients, repositoryTokenRefreshRequest.limitNumClients) &&
        Objects.equals(this.limitNumDownloads, repositoryTokenRefreshRequest.limitNumDownloads) &&
        Objects.equals(this.limitPackageQuery, repositoryTokenRefreshRequest.limitPackageQuery) &&
        Objects.equals(this.limitPathQuery, repositoryTokenRefreshRequest.limitPathQuery) &&
        Objects.equals(this.metadata, repositoryTokenRefreshRequest.metadata) &&
        Objects.equals(this.scheduledResetAt, repositoryTokenRefreshRequest.scheduledResetAt) &&
        Objects.equals(this.scheduledResetPeriod, repositoryTokenRefreshRequest.scheduledResetPeriod) &&
        Objects.equals(this.token, repositoryTokenRefreshRequest.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eulaRequired, isActive, limitBandwidth, limitBandwidthUnit, limitDateRangeFrom, limitDateRangeTo, limitNumClients, limitNumDownloads, limitPackageQuery, limitPathQuery, metadata, scheduledResetAt, scheduledResetPeriod, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryTokenRefreshRequest {\n");
    
    sb.append("    eulaRequired: ").append(toIndentedString(eulaRequired)).append("\n");
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
