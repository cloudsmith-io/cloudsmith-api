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
 * FormatsDistributions
 */

public class FormatsDistributions implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("name")
  private String name = null;

  @SerializedName("self_url")
  private String selfUrl = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("variants")
  private String variants = null;

  public FormatsDistributions name(String name) {
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

  public FormatsDistributions selfUrl(String selfUrl) {
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

  public FormatsDistributions slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * The slug identifier for this distribution
   * @return slug
  **/
  @ApiModelProperty(value = "The slug identifier for this distribution")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public FormatsDistributions variants(String variants) {
    this.variants = variants;
    return this;
  }

   /**
   * 
   * @return variants
  **/
  @ApiModelProperty(value = "")
  public String getVariants() {
    return variants;
  }

  public void setVariants(String variants) {
    this.variants = variants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormatsDistributions formatsDistributions = (FormatsDistributions) o;
    return Objects.equals(this.name, formatsDistributions.name) &&
        Objects.equals(this.selfUrl, formatsDistributions.selfUrl) &&
        Objects.equals(this.slug, formatsDistributions.slug) &&
        Objects.equals(this.variants, formatsDistributions.variants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, selfUrl, slug, variants);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormatsDistributions {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selfUrl: ").append(toIndentedString(selfUrl)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
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

