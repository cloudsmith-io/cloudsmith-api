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
 * Namespace
 */

public class Namespace implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("name")
  private String name = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("slug_perm")
  private String slugPerm = null;

  @SerializedName("type_name")
  private String typeName = null;

  public Namespace name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Namespace slug(String slug) {
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

  public Namespace slugPerm(String slugPerm) {
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

  public Namespace typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

   /**
   * 
   * @return typeName
  **/
  @ApiModelProperty(value = "")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Namespace namespace = (Namespace) o;
    return Objects.equals(this.name, namespace.name) &&
        Objects.equals(this.slug, namespace.slug) &&
        Objects.equals(this.slugPerm, namespace.slugPerm) &&
        Objects.equals(this.typeName, namespace.typeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, slug, slugPerm, typeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Namespace {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    slugPerm: ").append(toIndentedString(slugPerm)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
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

