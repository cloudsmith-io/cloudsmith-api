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
import io.cloudsmith.api.models.UsageLimits;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * UsageFieldset
 */

public class UsageFieldset implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("display")
  private UsageLimits display = null;

  @SerializedName("raw")
  private UsageLimits raw = null;

  public UsageFieldset display(UsageLimits display) {
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public UsageLimits getDisplay() {
    return display;
  }

  public void setDisplay(UsageLimits display) {
    this.display = display;
  }

  public UsageFieldset raw(UsageLimits raw) {
    this.raw = raw;
    return this;
  }

   /**
   * Get raw
   * @return raw
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public UsageLimits getRaw() {
    return raw;
  }

  public void setRaw(UsageLimits raw) {
    this.raw = raw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageFieldset usageFieldset = (UsageFieldset) o;
    return Objects.equals(this.display, usageFieldset.display) &&
        Objects.equals(this.raw, usageFieldset.raw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, raw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageFieldset {\n");
    
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
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
