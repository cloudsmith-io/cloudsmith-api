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
 * OrganizationGroupSync
 */

public class OrganizationGroupSync implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("idp_key")
  private String idpKey = null;

  @SerializedName("idp_value")
  private String idpValue = null;

  @SerializedName("role")
  private String role = "Member";

  @SerializedName("slug_perm")
  private String slugPerm = null;

  @SerializedName("team")
  private String team = null;

  public OrganizationGroupSync idpKey(String idpKey) {
    this.idpKey = idpKey;
    return this;
  }

   /**
   * Get idpKey
   * @return idpKey
  **/
  @NotNull
 @Size(min=1,max=100)  @ApiModelProperty(required = true, value = "")
  public String getIdpKey() {
    return idpKey;
  }

  public void setIdpKey(String idpKey) {
    this.idpKey = idpKey;
  }

  public OrganizationGroupSync idpValue(String idpValue) {
    this.idpValue = idpValue;
    return this;
  }

   /**
   * Get idpValue
   * @return idpValue
  **/
  @NotNull
 @Size(min=1,max=100)  @ApiModelProperty(required = true, value = "")
  public String getIdpValue() {
    return idpValue;
  }

  public void setIdpValue(String idpValue) {
    this.idpValue = idpValue;
  }

  public OrganizationGroupSync role(String role) {
    this.role = role;
    return this;
  }

   /**
   *  User role within the team.   A &#x60;manager&#x60; is capable of adding/removing others to/from the team, and  can set the role of other users and other settings pertaining to the  team.   A &#39;member&#39; is a normal user that inherits the settings and privileges  assigned to the team. 
   * @return role
  **/
  @ApiModelProperty(value = " User role within the team.   A `manager` is capable of adding/removing others to/from the team, and  can set the role of other users and other settings pertaining to the  team.   A 'member' is a normal user that inherits the settings and privileges  assigned to the team. ")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

   /**
   * Get slugPerm
   * @return slugPerm
  **/
 @Pattern(regexp="^[-a-zA-Z0-9_]+$") @Size(min=1)  @ApiModelProperty(value = "")
  public String getSlugPerm() {
    return slugPerm;
  }

  public OrganizationGroupSync team(String team) {
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @NotNull
 @Pattern(regexp="^[-a-zA-Z0-9_]+$")  @ApiModelProperty(required = true, value = "")
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationGroupSync organizationGroupSync = (OrganizationGroupSync) o;
    return Objects.equals(this.idpKey, organizationGroupSync.idpKey) &&
        Objects.equals(this.idpValue, organizationGroupSync.idpValue) &&
        Objects.equals(this.role, organizationGroupSync.role) &&
        Objects.equals(this.slugPerm, organizationGroupSync.slugPerm) &&
        Objects.equals(this.team, organizationGroupSync.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idpKey, idpValue, role, slugPerm, team);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationGroupSync {\n");
    
    sb.append("    idpKey: ").append(toIndentedString(idpKey)).append("\n");
    sb.append("    idpValue: ").append(toIndentedString(idpValue)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    slugPerm: ").append(toIndentedString(slugPerm)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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
