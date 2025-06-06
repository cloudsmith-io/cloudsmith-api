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
 * RepositoryRetentionRules
 */

public class RepositoryRetentionRules implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("retention_count_limit")
  private java.math.BigInteger retentionCountLimit = null;

  @SerializedName("retention_days_limit")
  private java.math.BigInteger retentionDaysLimit = null;

  @SerializedName("retention_enabled")
  private Boolean retentionEnabled = null;

  @SerializedName("retention_group_by_format")
  private Boolean retentionGroupByFormat = null;

  @SerializedName("retention_group_by_name")
  private Boolean retentionGroupByName = null;

  @SerializedName("retention_group_by_package_type")
  private Boolean retentionGroupByPackageType = null;

  @SerializedName("retention_package_query_string")
  private String retentionPackageQueryString = null;

  @SerializedName("retention_size_limit")
  private java.math.BigInteger retentionSizeLimit = null;

  public RepositoryRetentionRules retentionCountLimit(java.math.BigInteger retentionCountLimit) {
    this.retentionCountLimit = retentionCountLimit;
    return this;
  }

   /**
   * The maximum X number of packages to retain.
   * minimum: 0
   * maximum: 10000
   * @return retentionCountLimit
  **/
 @Min(0L) @Max(10000L)  @ApiModelProperty(value = "The maximum X number of packages to retain.")
  public java.math.BigInteger getRetentionCountLimit() {
    return retentionCountLimit;
  }

  public void setRetentionCountLimit(java.math.BigInteger retentionCountLimit) {
    this.retentionCountLimit = retentionCountLimit;
  }

  public RepositoryRetentionRules retentionDaysLimit(java.math.BigInteger retentionDaysLimit) {
    this.retentionDaysLimit = retentionDaysLimit;
    return this;
  }

   /**
   * The X number of days of packages to retain.
   * minimum: 0
   * maximum: 180
   * @return retentionDaysLimit
  **/
 @Min(0L) @Max(180L)  @ApiModelProperty(value = "The X number of days of packages to retain.")
  public java.math.BigInteger getRetentionDaysLimit() {
    return retentionDaysLimit;
  }

  public void setRetentionDaysLimit(java.math.BigInteger retentionDaysLimit) {
    this.retentionDaysLimit = retentionDaysLimit;
  }

  public RepositoryRetentionRules retentionEnabled(Boolean retentionEnabled) {
    this.retentionEnabled = retentionEnabled;
    return this;
  }

   /**
   * If checked, the retention lifecycle rules will be activated for the repository. Any packages that don&#39;t match will be deleted automatically, and the rest are retained.
   * @return retentionEnabled
  **/
  @ApiModelProperty(value = "If checked, the retention lifecycle rules will be activated for the repository. Any packages that don't match will be deleted automatically, and the rest are retained.")
  public Boolean isRetentionEnabled() {
    return retentionEnabled;
  }

  public void setRetentionEnabled(Boolean retentionEnabled) {
    this.retentionEnabled = retentionEnabled;
  }

  public RepositoryRetentionRules retentionGroupByFormat(Boolean retentionGroupByFormat) {
    this.retentionGroupByFormat = retentionGroupByFormat;
    return this;
  }

   /**
   * If checked, retention will apply to packages by package formats rather than across all package formats.For example, when retaining by a limit of 1 and you upload PythonPkg 1.0 and RubyPkg 1.0, no packages are deleted because they are different formats.
   * @return retentionGroupByFormat
  **/
  @ApiModelProperty(value = "If checked, retention will apply to packages by package formats rather than across all package formats.For example, when retaining by a limit of 1 and you upload PythonPkg 1.0 and RubyPkg 1.0, no packages are deleted because they are different formats.")
  public Boolean isRetentionGroupByFormat() {
    return retentionGroupByFormat;
  }

  public void setRetentionGroupByFormat(Boolean retentionGroupByFormat) {
    this.retentionGroupByFormat = retentionGroupByFormat;
  }

  public RepositoryRetentionRules retentionGroupByName(Boolean retentionGroupByName) {
    this.retentionGroupByName = retentionGroupByName;
    return this;
  }

   /**
   * If checked, retention will apply to groups of packages by name rather than all packages.&lt;br&gt;For example, when retaining by a limit of 1 and you upload PkgA 1.0, PkgB 1.0 and PkgB 1.1; only PkgB 1.0 is deleted because there are two (2) PkgBs and one (1) PkgA.
   * @return retentionGroupByName
  **/
  @ApiModelProperty(value = "If checked, retention will apply to groups of packages by name rather than all packages.<br>For example, when retaining by a limit of 1 and you upload PkgA 1.0, PkgB 1.0 and PkgB 1.1; only PkgB 1.0 is deleted because there are two (2) PkgBs and one (1) PkgA.")
  public Boolean isRetentionGroupByName() {
    return retentionGroupByName;
  }

  public void setRetentionGroupByName(Boolean retentionGroupByName) {
    this.retentionGroupByName = retentionGroupByName;
  }

  public RepositoryRetentionRules retentionGroupByPackageType(Boolean retentionGroupByPackageType) {
    this.retentionGroupByPackageType = retentionGroupByPackageType;
    return this;
  }

   /**
   * If checked, retention will apply to packages by package type (e.g. by binary, by source, etc.), rather than across all package types for one or more formats. &lt;br&gt;For example, when retaining by a limit of 1 and you upload DebPackage 1.0 and DebSourcePackage 1.0, no packages are deleted because they are different package types, binary and source respectively.
   * @return retentionGroupByPackageType
  **/
  @ApiModelProperty(value = "If checked, retention will apply to packages by package type (e.g. by binary, by source, etc.), rather than across all package types for one or more formats. <br>For example, when retaining by a limit of 1 and you upload DebPackage 1.0 and DebSourcePackage 1.0, no packages are deleted because they are different package types, binary and source respectively.")
  public Boolean isRetentionGroupByPackageType() {
    return retentionGroupByPackageType;
  }

  public void setRetentionGroupByPackageType(Boolean retentionGroupByPackageType) {
    this.retentionGroupByPackageType = retentionGroupByPackageType;
  }

  public RepositoryRetentionRules retentionPackageQueryString(String retentionPackageQueryString) {
    this.retentionPackageQueryString = retentionPackageQueryString;
    return this;
  }

   /**
   * A package search expression which, if provided, filters the packages to be deleted.&lt;br&gt;For example, a search expression of &#x60;name:foo&#x60; will result in only packages called &#39;foo&#39; being deleted, or a search expression of &#x60;tag:~latest&#x60; will prevent any packages tagged &#39;latest&#39; from being deleted.&lt;br&gt;Refer to the Cloudsmith documentation for package query syntax.
   * @return retentionPackageQueryString
  **/
  @ApiModelProperty(value = "A package search expression which, if provided, filters the packages to be deleted.<br>For example, a search expression of `name:foo` will result in only packages called 'foo' being deleted, or a search expression of `tag:~latest` will prevent any packages tagged 'latest' from being deleted.<br>Refer to the Cloudsmith documentation for package query syntax.")
  public String getRetentionPackageQueryString() {
    return retentionPackageQueryString;
  }

  public void setRetentionPackageQueryString(String retentionPackageQueryString) {
    this.retentionPackageQueryString = retentionPackageQueryString;
  }

  public RepositoryRetentionRules retentionSizeLimit(java.math.BigInteger retentionSizeLimit) {
    this.retentionSizeLimit = retentionSizeLimit;
    return this;
  }

   /**
   * The maximum X total size (in bytes) of packages to retain.
   * minimum: 0
   * maximum: 21474836480
   * @return retentionSizeLimit
  **/
 @Min(0L) @Max(21474836480L)  @ApiModelProperty(value = "The maximum X total size (in bytes) of packages to retain.")
  public java.math.BigInteger getRetentionSizeLimit() {
    return retentionSizeLimit;
  }

  public void setRetentionSizeLimit(java.math.BigInteger retentionSizeLimit) {
    this.retentionSizeLimit = retentionSizeLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryRetentionRules repositoryRetentionRules = (RepositoryRetentionRules) o;
    return Objects.equals(this.retentionCountLimit, repositoryRetentionRules.retentionCountLimit) &&
        Objects.equals(this.retentionDaysLimit, repositoryRetentionRules.retentionDaysLimit) &&
        Objects.equals(this.retentionEnabled, repositoryRetentionRules.retentionEnabled) &&
        Objects.equals(this.retentionGroupByFormat, repositoryRetentionRules.retentionGroupByFormat) &&
        Objects.equals(this.retentionGroupByName, repositoryRetentionRules.retentionGroupByName) &&
        Objects.equals(this.retentionGroupByPackageType, repositoryRetentionRules.retentionGroupByPackageType) &&
        Objects.equals(this.retentionPackageQueryString, repositoryRetentionRules.retentionPackageQueryString) &&
        Objects.equals(this.retentionSizeLimit, repositoryRetentionRules.retentionSizeLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retentionCountLimit, retentionDaysLimit, retentionEnabled, retentionGroupByFormat, retentionGroupByName, retentionGroupByPackageType, retentionPackageQueryString, retentionSizeLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryRetentionRules {\n");
    
    sb.append("    retentionCountLimit: ").append(toIndentedString(retentionCountLimit)).append("\n");
    sb.append("    retentionDaysLimit: ").append(toIndentedString(retentionDaysLimit)).append("\n");
    sb.append("    retentionEnabled: ").append(toIndentedString(retentionEnabled)).append("\n");
    sb.append("    retentionGroupByFormat: ").append(toIndentedString(retentionGroupByFormat)).append("\n");
    sb.append("    retentionGroupByName: ").append(toIndentedString(retentionGroupByName)).append("\n");
    sb.append("    retentionGroupByPackageType: ").append(toIndentedString(retentionGroupByPackageType)).append("\n");
    sb.append("    retentionPackageQueryString: ").append(toIndentedString(retentionPackageQueryString)).append("\n");
    sb.append("    retentionSizeLimit: ").append(toIndentedString(retentionSizeLimit)).append("\n");
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

