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
import io.cloudsmith.api.models.Eula;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * RepositoryToken
 */

public class RepositoryToken implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("clients")
  private java.math.BigInteger clients = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("created_by")
  private String createdBy = null;

  @SerializedName("created_by_url")
  private String createdByUrl = null;

  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("disable_url")
  private String disableUrl = null;

  @SerializedName("downloads")
  private java.math.BigInteger downloads = null;

  @SerializedName("enable_url")
  private String enableUrl = null;

  @SerializedName("eula_accepted")
  private Eula eulaAccepted = null;

  @SerializedName("eula_accepted_at")
  private OffsetDateTime eulaAcceptedAt = null;

  @SerializedName("eula_accepted_from")
  private String eulaAcceptedFrom = null;

  @SerializedName("eula_required")
  private Boolean eulaRequired = null;

  @SerializedName("has_limits")
  private Boolean hasLimits = null;

  @SerializedName("identifier")
  private java.math.BigInteger identifier = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("is_limited")
  private Boolean isLimited = null;

  @SerializedName("limit_bandwidth")
  private java.math.BigInteger limitBandwidth = null;

  /**
   * Gets or Sets limitBandwidthUnit
   */
  @JsonAdapter(LimitBandwidthUnitEnum.Adapter.class)
  public enum LimitBandwidthUnitEnum {
    BYTE("Byte"),
    
    KILOBYTE("Kilobyte"),
    
    MEGABYTE("Megabyte"),
    
    GIGABYTE("Gigabyte"),
    
    TERABYTE("Terabyte"),
    
    PETABYTE("Petabyte"),
    
    EXABYTE("Exabyte"),
    
    ZETTABYTE("Zettabyte"),
    
    YOTTABYTE("Yottabyte");

    private String value;

    LimitBandwidthUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LimitBandwidthUnitEnum fromValue(String text) {
      for (LimitBandwidthUnitEnum b : LimitBandwidthUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LimitBandwidthUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LimitBandwidthUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LimitBandwidthUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LimitBandwidthUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("limit_bandwidth_unit")
  private LimitBandwidthUnitEnum limitBandwidthUnit = LimitBandwidthUnitEnum.BYTE;

  @SerializedName("limit_date_range_from")
  private OffsetDateTime limitDateRangeFrom = null;

  @SerializedName("limit_date_range_to")
  private OffsetDateTime limitDateRangeTo = null;

  @SerializedName("limit_num_clients")
  private java.math.BigInteger limitNumClients = null;

  @SerializedName("limit_num_downloads")
  private java.math.BigInteger limitNumDownloads = null;

  @SerializedName("limit_package_query")
  private String limitPackageQuery = null;

  @SerializedName("limit_path_query")
  private String limitPathQuery = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("refresh_url")
  private String refreshUrl = null;

  @SerializedName("reset_url")
  private String resetUrl = null;

  @SerializedName("scheduled_reset_at")
  private OffsetDateTime scheduledResetAt = null;

  /**
   * Gets or Sets scheduledResetPeriod
   */
  @JsonAdapter(ScheduledResetPeriodEnum.Adapter.class)
  public enum ScheduledResetPeriodEnum {
    NEVER_RESET("Never Reset"),
    
    DAILY("Daily"),
    
    WEEKLY("Weekly"),
    
    FORTNIGHTLY("Fortnightly"),
    
    MONTHLY("Monthly"),
    
    BI_MONTHLY("Bi-Monthly"),
    
    QUARTERLY("Quarterly"),
    
    EVERY_6_MONTHS("Every 6 months"),
    
    ANNUAL("Annual");

    private String value;

    ScheduledResetPeriodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScheduledResetPeriodEnum fromValue(String text) {
      for (ScheduledResetPeriodEnum b : ScheduledResetPeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ScheduledResetPeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScheduledResetPeriodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScheduledResetPeriodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScheduledResetPeriodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("scheduled_reset_period")
  private ScheduledResetPeriodEnum scheduledResetPeriod = ScheduledResetPeriodEnum.NEVER_RESET;

  @SerializedName("self_url")
  private String selfUrl = null;

  @SerializedName("slug_perm")
  private String slugPerm = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("updated_by")
  private String updatedBy = null;

  @SerializedName("updated_by_url")
  private String updatedByUrl = null;

  @SerializedName("usage")
  private String usage = null;

  @SerializedName("user")
  private String user = null;

  @SerializedName("user_url")
  private String userUrl = null;

   /**
   * Get clients
   * @return clients
  **/
  @ApiModelProperty(value = "")
  public java.math.BigInteger getClients() {
    return clients;
  }

   /**
   * The datetime the token was updated at.
   * @return createdAt
  **/
  @Valid
  @ApiModelProperty(value = "The datetime the token was updated at.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
 @Size(min=1)  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

   /**
   * Get createdByUrl
   * @return createdByUrl
  **/
  @ApiModelProperty(value = "")
  public String getCreatedByUrl() {
    return createdByUrl;
  }

   /**
   * If selected this is the default token for this repository.
   * @return _default
  **/
  @ApiModelProperty(value = "If selected this is the default token for this repository.")
  public Boolean isDefault() {
    return _default;
  }

   /**
   * Get disableUrl
   * @return disableUrl
  **/
  @ApiModelProperty(value = "")
  public String getDisableUrl() {
    return disableUrl;
  }

   /**
   * Get downloads
   * @return downloads
  **/
  @ApiModelProperty(value = "")
  public java.math.BigInteger getDownloads() {
    return downloads;
  }

   /**
   * Get enableUrl
   * @return enableUrl
  **/
  @ApiModelProperty(value = "")
  public String getEnableUrl() {
    return enableUrl;
  }

  public RepositoryToken eulaAccepted(Eula eulaAccepted) {
    this.eulaAccepted = eulaAccepted;
    return this;
  }

   /**
   * Get eulaAccepted
   * @return eulaAccepted
  **/
  @Valid
  @ApiModelProperty(value = "")
  public Eula getEulaAccepted() {
    return eulaAccepted;
  }

  public void setEulaAccepted(Eula eulaAccepted) {
    this.eulaAccepted = eulaAccepted;
  }

   /**
   * The datetime the EULA was accepted at.
   * @return eulaAcceptedAt
  **/
  @Valid
  @ApiModelProperty(value = "The datetime the EULA was accepted at.")
  public OffsetDateTime getEulaAcceptedAt() {
    return eulaAcceptedAt;
  }

   /**
   * Get eulaAcceptedFrom
   * @return eulaAcceptedFrom
  **/
 @Size(min=1)  @ApiModelProperty(value = "")
  public String getEulaAcceptedFrom() {
    return eulaAcceptedFrom;
  }

  public RepositoryToken eulaRequired(Boolean eulaRequired) {
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

   /**
   * Get hasLimits
   * @return hasLimits
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasLimits() {
    return hasLimits;
  }

   /**
   * Deprecated (23-05-15): Please use &#39;slug_perm&#39; instead. Previously: A monotonically increasing number that identified an entitlement within a repository.
   * @return identifier
  **/
  @ApiModelProperty(value = "Deprecated (23-05-15): Please use 'slug_perm' instead. Previously: A monotonically increasing number that identified an entitlement within a repository.")
  public java.math.BigInteger getIdentifier() {
    return identifier;
  }

  public RepositoryToken isActive(Boolean isActive) {
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

   /**
   * Get isLimited
   * @return isLimited
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsLimited() {
    return isLimited;
  }

  public RepositoryToken limitBandwidth(java.math.BigInteger limitBandwidth) {
    this.limitBandwidth = limitBandwidth;
    return this;
  }

   /**
   * The maximum download bandwidth allowed for the token. Values are expressed as the selected unit of bandwidth. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. 
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return limitBandwidth
  **/
 @Min(-9223372036854775808L) @Max(9223372036854775807L)  @ApiModelProperty(value = "The maximum download bandwidth allowed for the token. Values are expressed as the selected unit of bandwidth. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. ")
  public java.math.BigInteger getLimitBandwidth() {
    return limitBandwidth;
  }

  public void setLimitBandwidth(java.math.BigInteger limitBandwidth) {
    this.limitBandwidth = limitBandwidth;
  }

  public RepositoryToken limitBandwidthUnit(LimitBandwidthUnitEnum limitBandwidthUnit) {
    this.limitBandwidthUnit = limitBandwidthUnit;
    return this;
  }

   /**
   * Get limitBandwidthUnit
   * @return limitBandwidthUnit
  **/
  @ApiModelProperty(value = "")
  public LimitBandwidthUnitEnum getLimitBandwidthUnit() {
    return limitBandwidthUnit;
  }

  public void setLimitBandwidthUnit(LimitBandwidthUnitEnum limitBandwidthUnit) {
    this.limitBandwidthUnit = limitBandwidthUnit;
  }

  public RepositoryToken limitDateRangeFrom(OffsetDateTime limitDateRangeFrom) {
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

  public RepositoryToken limitDateRangeTo(OffsetDateTime limitDateRangeTo) {
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

  public RepositoryToken limitNumClients(java.math.BigInteger limitNumClients) {
    this.limitNumClients = limitNumClients;
    return this;
  }

   /**
   * The maximum number of unique clients allowed for the token. Please note that since clients are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return limitNumClients
  **/
 @Min(-9223372036854775808L) @Max(9223372036854775807L)  @ApiModelProperty(value = "The maximum number of unique clients allowed for the token. Please note that since clients are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.")
  public java.math.BigInteger getLimitNumClients() {
    return limitNumClients;
  }

  public void setLimitNumClients(java.math.BigInteger limitNumClients) {
    this.limitNumClients = limitNumClients;
  }

  public RepositoryToken limitNumDownloads(java.math.BigInteger limitNumDownloads) {
    this.limitNumDownloads = limitNumDownloads;
    return this;
  }

   /**
   * The maximum number of downloads allowed for the token. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return limitNumDownloads
  **/
 @Min(-9223372036854775808L) @Max(9223372036854775807L)  @ApiModelProperty(value = "The maximum number of downloads allowed for the token. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.")
  public java.math.BigInteger getLimitNumDownloads() {
    return limitNumDownloads;
  }

  public void setLimitNumDownloads(java.math.BigInteger limitNumDownloads) {
    this.limitNumDownloads = limitNumDownloads;
  }

  public RepositoryToken limitPackageQuery(String limitPackageQuery) {
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

  public RepositoryToken limitPathQuery(String limitPathQuery) {
    this.limitPathQuery = limitPathQuery;
    return this;
  }

   /**
   * THIS WILL SOON BE DEPRECATED, please use limit_package_query instead. The path-based search query to apply to restrict downloads to. This supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. The path evaluated does not include the domain name, the namespace, the entitlement code used, the package format, etc. and it always starts with a forward slash.
   * @return limitPathQuery
  **/
 @Size(max=1024)  @ApiModelProperty(value = "THIS WILL SOON BE DEPRECATED, please use limit_package_query instead. The path-based search query to apply to restrict downloads to. This supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. The path evaluated does not include the domain name, the namespace, the entitlement code used, the package format, etc. and it always starts with a forward slash.")
  public String getLimitPathQuery() {
    return limitPathQuery;
  }

  public void setLimitPathQuery(String limitPathQuery) {
    this.limitPathQuery = limitPathQuery;
  }

  public RepositoryToken metadata(Object metadata) {
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

  public RepositoryToken name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
 @Size(min=1)  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * Get refreshUrl
   * @return refreshUrl
  **/
  @ApiModelProperty(value = "")
  public String getRefreshUrl() {
    return refreshUrl;
  }

   /**
   * Get resetUrl
   * @return resetUrl
  **/
  @ApiModelProperty(value = "")
  public String getResetUrl() {
    return resetUrl;
  }

  public RepositoryToken scheduledResetAt(OffsetDateTime scheduledResetAt) {
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

  public RepositoryToken scheduledResetPeriod(ScheduledResetPeriodEnum scheduledResetPeriod) {
    this.scheduledResetPeriod = scheduledResetPeriod;
    return this;
  }

   /**
   * Get scheduledResetPeriod
   * @return scheduledResetPeriod
  **/
  @ApiModelProperty(value = "")
  public ScheduledResetPeriodEnum getScheduledResetPeriod() {
    return scheduledResetPeriod;
  }

  public void setScheduledResetPeriod(ScheduledResetPeriodEnum scheduledResetPeriod) {
    this.scheduledResetPeriod = scheduledResetPeriod;
  }

   /**
   * Get selfUrl
   * @return selfUrl
  **/
  @ApiModelProperty(value = "")
  public String getSelfUrl() {
    return selfUrl;
  }

   /**
   * Get slugPerm
   * @return slugPerm
  **/
 @Pattern(regexp="^[-a-zA-Z0-9_]+$") @Size(min=1)  @ApiModelProperty(value = "")
  public String getSlugPerm() {
    return slugPerm;
  }

  public RepositoryToken token(String token) {
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

   /**
   * The datetime the token was updated at.
   * @return updatedAt
  **/
  @Valid
  @ApiModelProperty(value = "The datetime the token was updated at.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

   /**
   * Get updatedBy
   * @return updatedBy
  **/
 @Size(min=1)  @ApiModelProperty(value = "")
  public String getUpdatedBy() {
    return updatedBy;
  }

   /**
   * Get updatedByUrl
   * @return updatedByUrl
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedByUrl() {
    return updatedByUrl;
  }

   /**
   * Get usage
   * @return usage
  **/
 @Size(min=1)  @ApiModelProperty(value = "")
  public String getUsage() {
    return usage;
  }

   /**
   * Get user
   * @return user
  **/
 @Size(min=1)  @ApiModelProperty(value = "")
  public String getUser() {
    return user;
  }

   /**
   * Get userUrl
   * @return userUrl
  **/
  @ApiModelProperty(value = "")
  public String getUserUrl() {
    return userUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryToken repositoryToken = (RepositoryToken) o;
    return Objects.equals(this.clients, repositoryToken.clients) &&
        Objects.equals(this.createdAt, repositoryToken.createdAt) &&
        Objects.equals(this.createdBy, repositoryToken.createdBy) &&
        Objects.equals(this.createdByUrl, repositoryToken.createdByUrl) &&
        Objects.equals(this._default, repositoryToken._default) &&
        Objects.equals(this.disableUrl, repositoryToken.disableUrl) &&
        Objects.equals(this.downloads, repositoryToken.downloads) &&
        Objects.equals(this.enableUrl, repositoryToken.enableUrl) &&
        Objects.equals(this.eulaAccepted, repositoryToken.eulaAccepted) &&
        Objects.equals(this.eulaAcceptedAt, repositoryToken.eulaAcceptedAt) &&
        Objects.equals(this.eulaAcceptedFrom, repositoryToken.eulaAcceptedFrom) &&
        Objects.equals(this.eulaRequired, repositoryToken.eulaRequired) &&
        Objects.equals(this.hasLimits, repositoryToken.hasLimits) &&
        Objects.equals(this.identifier, repositoryToken.identifier) &&
        Objects.equals(this.isActive, repositoryToken.isActive) &&
        Objects.equals(this.isLimited, repositoryToken.isLimited) &&
        Objects.equals(this.limitBandwidth, repositoryToken.limitBandwidth) &&
        Objects.equals(this.limitBandwidthUnit, repositoryToken.limitBandwidthUnit) &&
        Objects.equals(this.limitDateRangeFrom, repositoryToken.limitDateRangeFrom) &&
        Objects.equals(this.limitDateRangeTo, repositoryToken.limitDateRangeTo) &&
        Objects.equals(this.limitNumClients, repositoryToken.limitNumClients) &&
        Objects.equals(this.limitNumDownloads, repositoryToken.limitNumDownloads) &&
        Objects.equals(this.limitPackageQuery, repositoryToken.limitPackageQuery) &&
        Objects.equals(this.limitPathQuery, repositoryToken.limitPathQuery) &&
        Objects.equals(this.metadata, repositoryToken.metadata) &&
        Objects.equals(this.name, repositoryToken.name) &&
        Objects.equals(this.refreshUrl, repositoryToken.refreshUrl) &&
        Objects.equals(this.resetUrl, repositoryToken.resetUrl) &&
        Objects.equals(this.scheduledResetAt, repositoryToken.scheduledResetAt) &&
        Objects.equals(this.scheduledResetPeriod, repositoryToken.scheduledResetPeriod) &&
        Objects.equals(this.selfUrl, repositoryToken.selfUrl) &&
        Objects.equals(this.slugPerm, repositoryToken.slugPerm) &&
        Objects.equals(this.token, repositoryToken.token) &&
        Objects.equals(this.updatedAt, repositoryToken.updatedAt) &&
        Objects.equals(this.updatedBy, repositoryToken.updatedBy) &&
        Objects.equals(this.updatedByUrl, repositoryToken.updatedByUrl) &&
        Objects.equals(this.usage, repositoryToken.usage) &&
        Objects.equals(this.user, repositoryToken.user) &&
        Objects.equals(this.userUrl, repositoryToken.userUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clients, createdAt, createdBy, createdByUrl, _default, disableUrl, downloads, enableUrl, eulaAccepted, eulaAcceptedAt, eulaAcceptedFrom, eulaRequired, hasLimits, identifier, isActive, isLimited, limitBandwidth, limitBandwidthUnit, limitDateRangeFrom, limitDateRangeTo, limitNumClients, limitNumDownloads, limitPackageQuery, limitPathQuery, metadata, name, refreshUrl, resetUrl, scheduledResetAt, scheduledResetPeriod, selfUrl, slugPerm, token, updatedAt, updatedBy, updatedByUrl, usage, user, userUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryToken {\n");
    
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdByUrl: ").append(toIndentedString(createdByUrl)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    disableUrl: ").append(toIndentedString(disableUrl)).append("\n");
    sb.append("    downloads: ").append(toIndentedString(downloads)).append("\n");
    sb.append("    enableUrl: ").append(toIndentedString(enableUrl)).append("\n");
    sb.append("    eulaAccepted: ").append(toIndentedString(eulaAccepted)).append("\n");
    sb.append("    eulaAcceptedAt: ").append(toIndentedString(eulaAcceptedAt)).append("\n");
    sb.append("    eulaAcceptedFrom: ").append(toIndentedString(eulaAcceptedFrom)).append("\n");
    sb.append("    eulaRequired: ").append(toIndentedString(eulaRequired)).append("\n");
    sb.append("    hasLimits: ").append(toIndentedString(hasLimits)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isLimited: ").append(toIndentedString(isLimited)).append("\n");
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
    sb.append("    refreshUrl: ").append(toIndentedString(refreshUrl)).append("\n");
    sb.append("    resetUrl: ").append(toIndentedString(resetUrl)).append("\n");
    sb.append("    scheduledResetAt: ").append(toIndentedString(scheduledResetAt)).append("\n");
    sb.append("    scheduledResetPeriod: ").append(toIndentedString(scheduledResetPeriod)).append("\n");
    sb.append("    selfUrl: ").append(toIndentedString(selfUrl)).append("\n");
    sb.append("    slugPerm: ").append(toIndentedString(slugPerm)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedByUrl: ").append(toIndentedString(updatedByUrl)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userUrl: ").append(toIndentedString(userUrl)).append("\n");
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

