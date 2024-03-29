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
 * The distributions supported by this package format
 */
@ApiModel(description = "The distributions supported by this package format")

public class Distribution implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("name")
  private String name = null;

  @SerializedName("self_url")
  private String selfUrl = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("variants")
  private String variants = null;

  public Distribution name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
 @Size(min=1,max=32)  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
   * The slug identifier for this distribution
   * @return slug
  **/
 @Size(min=1)  @ApiModelProperty(value = "The slug identifier for this distribution")
  public String getSlug() {
    return slug;
  }

  public Distribution variants(String variants) {
    this.variants = variants;
    return this;
  }

   /**
   * Get variants
   * @return variants
  **/
 @Size(max=128)  @ApiModelProperty(value = "")
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
    Distribution distribution = (Distribution) o;
    return Objects.equals(this.name, distribution.name) &&
        Objects.equals(this.selfUrl, distribution.selfUrl) &&
        Objects.equals(this.slug, distribution.slug) &&
        Objects.equals(this.variants, distribution.variants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, selfUrl, slug, variants);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Distribution {\n");
    
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

