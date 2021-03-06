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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * PackagesTag
 */

public class PackagesTag implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("action")
  private String action = null;

  @SerializedName("is_immutable")
  private Boolean isImmutable = null;

  @SerializedName("tags")
  private List<String> tags = null;

  public PackagesTag action(String action) {
    this.action = action;
    return this;
  }

   /**
   * None
   * @return action
  **/
  @ApiModelProperty(value = "None")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public PackagesTag isImmutable(Boolean isImmutable) {
    this.isImmutable = isImmutable;
    return this;
  }

   /**
   * If true, created tags will be immutable. An immutable flag is a tag that cannot be removed from a package.
   * @return isImmutable
  **/
  @ApiModelProperty(value = "If true, created tags will be immutable. An immutable flag is a tag that cannot be removed from a package.")
  public Boolean getIsImmutable() {
    return isImmutable;
  }

  public void setIsImmutable(Boolean isImmutable) {
    this.isImmutable = isImmutable;
  }

  public PackagesTag tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public PackagesTag addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of tags to apply the action to. Not required for clears.
   * @return tags
  **/
  @ApiModelProperty(value = "A list of tags to apply the action to. Not required for clears.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackagesTag packagesTag = (PackagesTag) o;
    return Objects.equals(this.action, packagesTag.action) &&
        Objects.equals(this.isImmutable, packagesTag.isImmutable) &&
        Objects.equals(this.tags, packagesTag.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, isImmutable, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackagesTag {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    isImmutable: ").append(toIndentedString(isImmutable)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

