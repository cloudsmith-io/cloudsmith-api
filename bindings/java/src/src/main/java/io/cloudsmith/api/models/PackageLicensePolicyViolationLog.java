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
import io.cloudsmith.api.models.NestedLicensePolicy;
import io.cloudsmith.api.models.PackageVulnerability;
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
 * PackageLicensePolicyViolationLog
 */

public class PackageLicensePolicyViolationLog implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("event_at")
  private OffsetDateTime eventAt = null;

  @SerializedName("package")
  private PackageVulnerability _package = null;

  @SerializedName("policy")
  private NestedLicensePolicy policy = null;

  @SerializedName("reasons")
  private List<String> reasons = new ArrayList<>();

   /**
   * Get eventAt
   * @return eventAt
  **/
  @Valid
  @ApiModelProperty(value = "")
  public OffsetDateTime getEventAt() {
    return eventAt;
  }

  public PackageLicensePolicyViolationLog _package(PackageVulnerability _package) {
    this._package = _package;
    return this;
  }

   /**
   * Get _package
   * @return _package
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public PackageVulnerability getPackage() {
    return _package;
  }

  public void setPackage(PackageVulnerability _package) {
    this._package = _package;
  }

  public PackageLicensePolicyViolationLog policy(NestedLicensePolicy policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public NestedLicensePolicy getPolicy() {
    return policy;
  }

  public void setPolicy(NestedLicensePolicy policy) {
    this.policy = policy;
  }

  public PackageLicensePolicyViolationLog reasons(List<String> reasons) {
    this.reasons = reasons;
    return this;
  }

  public PackageLicensePolicyViolationLog addReasonsItem(String reasonsItem) {
    this.reasons.add(reasonsItem);
    return this;
  }

   /**
   * Get reasons
   * @return reasons
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "")
  public List<String> getReasons() {
    return reasons;
  }

  public void setReasons(List<String> reasons) {
    this.reasons = reasons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageLicensePolicyViolationLog packageLicensePolicyViolationLog = (PackageLicensePolicyViolationLog) o;
    return Objects.equals(this.eventAt, packageLicensePolicyViolationLog.eventAt) &&
        Objects.equals(this._package, packageLicensePolicyViolationLog._package) &&
        Objects.equals(this.policy, packageLicensePolicyViolationLog.policy) &&
        Objects.equals(this.reasons, packageLicensePolicyViolationLog.reasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventAt, _package, policy, reasons);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageLicensePolicyViolationLog {\n");
    
    sb.append("    eventAt: ").append(toIndentedString(eventAt)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
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
