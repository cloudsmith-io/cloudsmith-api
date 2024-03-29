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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * OrganizationPackageLicensePolicy
 */

public class OrganizationPackageLicensePolicy implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("allow_unknown_licenses")
  private Boolean allowUnknownLicenses = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("on_violation_quarantine")
  private Boolean onViolationQuarantine = null;

  @SerializedName("package_query_string")
  private String packageQueryString = null;

  @SerializedName("slug_perm")
  private String slugPerm = null;

  @SerializedName("spdx_identifiers")
  private List<String> spdxIdentifiers = new ArrayList<>();

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public OrganizationPackageLicensePolicy allowUnknownLicenses(Boolean allowUnknownLicenses) {
    this.allowUnknownLicenses = allowUnknownLicenses;
    return this;
  }

   /**
   * Get allowUnknownLicenses
   * @return allowUnknownLicenses
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowUnknownLicenses() {
    return allowUnknownLicenses;
  }

  public void setAllowUnknownLicenses(Boolean allowUnknownLicenses) {
    this.allowUnknownLicenses = allowUnknownLicenses;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Valid
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public OrganizationPackageLicensePolicy description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 @Size(min=1,max=250)  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrganizationPackageLicensePolicy name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
 @Size(min=1,max=100)  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrganizationPackageLicensePolicy onViolationQuarantine(Boolean onViolationQuarantine) {
    this.onViolationQuarantine = onViolationQuarantine;
    return this;
  }

   /**
   * Get onViolationQuarantine
   * @return onViolationQuarantine
  **/
  @ApiModelProperty(value = "")
  public Boolean isOnViolationQuarantine() {
    return onViolationQuarantine;
  }

  public void setOnViolationQuarantine(Boolean onViolationQuarantine) {
    this.onViolationQuarantine = onViolationQuarantine;
  }

  public OrganizationPackageLicensePolicy packageQueryString(String packageQueryString) {
    this.packageQueryString = packageQueryString;
    return this;
  }

   /**
   * Get packageQueryString
   * @return packageQueryString
  **/
 @Size(min=1)  @ApiModelProperty(value = "")
  public String getPackageQueryString() {
    return packageQueryString;
  }

  public void setPackageQueryString(String packageQueryString) {
    this.packageQueryString = packageQueryString;
  }

   /**
   * Get slugPerm
   * @return slugPerm
  **/
 @Pattern(regexp="^[-a-zA-Z0-9_]+$") @Size(min=1)  @ApiModelProperty(value = "")
  public String getSlugPerm() {
    return slugPerm;
  }

  public OrganizationPackageLicensePolicy spdxIdentifiers(List<String> spdxIdentifiers) {
    this.spdxIdentifiers = spdxIdentifiers;
    return this;
  }

  public OrganizationPackageLicensePolicy addSpdxIdentifiersItem(String spdxIdentifiersItem) {
    this.spdxIdentifiers.add(spdxIdentifiersItem);
    return this;
  }

   /**
   * Get spdxIdentifiers
   * @return spdxIdentifiers
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "")
  public List<String> getSpdxIdentifiers() {
    return spdxIdentifiers;
  }

  public void setSpdxIdentifiers(List<String> spdxIdentifiers) {
    this.spdxIdentifiers = spdxIdentifiers;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Valid
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationPackageLicensePolicy organizationPackageLicensePolicy = (OrganizationPackageLicensePolicy) o;
    return Objects.equals(this.allowUnknownLicenses, organizationPackageLicensePolicy.allowUnknownLicenses) &&
        Objects.equals(this.createdAt, organizationPackageLicensePolicy.createdAt) &&
        Objects.equals(this.description, organizationPackageLicensePolicy.description) &&
        Objects.equals(this.name, organizationPackageLicensePolicy.name) &&
        Objects.equals(this.onViolationQuarantine, organizationPackageLicensePolicy.onViolationQuarantine) &&
        Objects.equals(this.packageQueryString, organizationPackageLicensePolicy.packageQueryString) &&
        Objects.equals(this.slugPerm, organizationPackageLicensePolicy.slugPerm) &&
        Objects.equals(this.spdxIdentifiers, organizationPackageLicensePolicy.spdxIdentifiers) &&
        Objects.equals(this.updatedAt, organizationPackageLicensePolicy.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowUnknownLicenses, createdAt, description, name, onViolationQuarantine, packageQueryString, slugPerm, spdxIdentifiers, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationPackageLicensePolicy {\n");
    
    sb.append("    allowUnknownLicenses: ").append(toIndentedString(allowUnknownLicenses)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onViolationQuarantine: ").append(toIndentedString(onViolationQuarantine)).append("\n");
    sb.append("    packageQueryString: ").append(toIndentedString(packageQueryString)).append("\n");
    sb.append("    slugPerm: ").append(toIndentedString(slugPerm)).append("\n");
    sb.append("    spdxIdentifiers: ").append(toIndentedString(spdxIdentifiers)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

