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
 * OrganizationMembership
 */

public class OrganizationMembership implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("email")
  private String email = null;

  @SerializedName("has_two_factor")
  private Boolean hasTwoFactor = null;

  @SerializedName("joined_at")
  private String joinedAt = null;

  @SerializedName("last_login_at")
  private String lastLoginAt = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("user")
  private String user = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("user_name")
  private String userName = null;

  @SerializedName("user_url")
  private String userUrl = null;

  @SerializedName("visibility")
  private String visibility = null;

  public OrganizationMembership email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public OrganizationMembership hasTwoFactor(Boolean hasTwoFactor) {
    this.hasTwoFactor = hasTwoFactor;
    return this;
  }

   /**
   * 
   * @return hasTwoFactor
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasTwoFactor() {
    return hasTwoFactor;
  }

  public void setHasTwoFactor(Boolean hasTwoFactor) {
    this.hasTwoFactor = hasTwoFactor;
  }

  public OrganizationMembership joinedAt(String joinedAt) {
    this.joinedAt = joinedAt;
    return this;
  }

   /**
   * 
   * @return joinedAt
  **/
  @ApiModelProperty(value = "")
  public String getJoinedAt() {
    return joinedAt;
  }

  public void setJoinedAt(String joinedAt) {
    this.joinedAt = joinedAt;
  }

  public OrganizationMembership lastLoginAt(String lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
    return this;
  }

   /**
   * 
   * @return lastLoginAt
  **/
  @ApiModelProperty(value = "")
  public String getLastLoginAt() {
    return lastLoginAt;
  }

  public void setLastLoginAt(String lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
  }

  public OrganizationMembership role(String role) {
    this.role = role;
    return this;
  }

   /**
   * 
   * @return role
  **/
  @ApiModelProperty(value = "")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public OrganizationMembership user(String user) {
    this.user = user;
    return this;
  }

   /**
   * 
   * @return user
  **/
  @ApiModelProperty(value = "")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public OrganizationMembership userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public OrganizationMembership userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * 
   * @return userName
  **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public OrganizationMembership userUrl(String userUrl) {
    this.userUrl = userUrl;
    return this;
  }

   /**
   * 
   * @return userUrl
  **/
  @ApiModelProperty(value = "")
  public String getUserUrl() {
    return userUrl;
  }

  public void setUserUrl(String userUrl) {
    this.userUrl = userUrl;
  }

  public OrganizationMembership visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * 
   * @return visibility
  **/
  @ApiModelProperty(value = "")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationMembership organizationMembership = (OrganizationMembership) o;
    return Objects.equals(this.email, organizationMembership.email) &&
        Objects.equals(this.hasTwoFactor, organizationMembership.hasTwoFactor) &&
        Objects.equals(this.joinedAt, organizationMembership.joinedAt) &&
        Objects.equals(this.lastLoginAt, organizationMembership.lastLoginAt) &&
        Objects.equals(this.role, organizationMembership.role) &&
        Objects.equals(this.user, organizationMembership.user) &&
        Objects.equals(this.userId, organizationMembership.userId) &&
        Objects.equals(this.userName, organizationMembership.userName) &&
        Objects.equals(this.userUrl, organizationMembership.userUrl) &&
        Objects.equals(this.visibility, organizationMembership.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, hasTwoFactor, joinedAt, lastLoginAt, role, user, userId, userName, userUrl, visibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationMembership {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    hasTwoFactor: ").append(toIndentedString(hasTwoFactor)).append("\n");
    sb.append("    joinedAt: ").append(toIndentedString(joinedAt)).append("\n");
    sb.append("    lastLoginAt: ").append(toIndentedString(lastLoginAt)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userUrl: ").append(toIndentedString(userUrl)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
