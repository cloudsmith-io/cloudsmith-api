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
 * UserBrief
 */

public class UserBrief implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("self_url")
  private String selfUrl = null;

  @SerializedName("authenticated")
  private Boolean authenticated = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("slug_perm")
  private String slugPerm = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("profile_url")
  private String profileUrl = null;

  public UserBrief selfUrl(String selfUrl) {
    this.selfUrl = selfUrl;
    return this;
  }

   /**
   * 
   * @return selfUrl
  **/
  @ApiModelProperty(value = "")
  public String getSelfUrl() {
    return selfUrl;
  }

  public void setSelfUrl(String selfUrl) {
    this.selfUrl = selfUrl;
  }

  public UserBrief authenticated(Boolean authenticated) {
    this.authenticated = authenticated;
    return this;
  }

   /**
   * If true then you&#39;re logged in as a user.
   * @return authenticated
  **/
  @ApiModelProperty(value = "If true then you're logged in as a user.")
  public Boolean getAuthenticated() {
    return authenticated;
  }

  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }

  public UserBrief name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The full name of the user (if any).
   * @return name
  **/
  @ApiModelProperty(value = "The full name of the user (if any).")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserBrief email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Your email address that we use to contact you. This is only visible to you.
   * @return email
  **/
  @ApiModelProperty(value = "Your email address that we use to contact you. This is only visible to you.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserBrief slugPerm(String slugPerm) {
    this.slugPerm = slugPerm;
    return this;
  }

   /**
   * 
   * @return slugPerm
  **/
  @ApiModelProperty(value = "")
  public String getSlugPerm() {
    return slugPerm;
  }

  public void setSlugPerm(String slugPerm) {
    this.slugPerm = slugPerm;
  }

  public UserBrief slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * 
   * @return slug
  **/
  @ApiModelProperty(value = "")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public UserBrief profileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
    return this;
  }

   /**
   * The URL for the full profile of the user.
   * @return profileUrl
  **/
  @ApiModelProperty(value = "The URL for the full profile of the user.")
  public String getProfileUrl() {
    return profileUrl;
  }

  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBrief userBrief = (UserBrief) o;
    return Objects.equals(this.selfUrl, userBrief.selfUrl) &&
        Objects.equals(this.authenticated, userBrief.authenticated) &&
        Objects.equals(this.name, userBrief.name) &&
        Objects.equals(this.email, userBrief.email) &&
        Objects.equals(this.slugPerm, userBrief.slugPerm) &&
        Objects.equals(this.slug, userBrief.slug) &&
        Objects.equals(this.profileUrl, userBrief.profileUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selfUrl, authenticated, name, email, slugPerm, slug, profileUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBrief {\n");
    
    sb.append("    selfUrl: ").append(toIndentedString(selfUrl)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    slugPerm: ").append(toIndentedString(slugPerm)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
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
