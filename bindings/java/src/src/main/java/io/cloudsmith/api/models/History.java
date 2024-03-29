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
import io.cloudsmith.api.models.HistoryFieldset;
import io.cloudsmith.api.models.HistoryFieldsetRaw;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * History
 */

public class History implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("days")
  private java.math.BigInteger days = null;

  @SerializedName("display")
  private HistoryFieldset display = null;

  @SerializedName("end")
  private OffsetDateTime end = null;

  @SerializedName("plan")
  private String plan = null;

  @SerializedName("raw")
  private HistoryFieldsetRaw raw = null;

  @SerializedName("start")
  private OffsetDateTime start = null;

  public History days(java.math.BigInteger days) {
    this.days = days;
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @ApiModelProperty(value = "")
  public java.math.BigInteger getDays() {
    return days;
  }

  public void setDays(java.math.BigInteger days) {
    this.days = days;
  }

  public History display(HistoryFieldset display) {
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
  public HistoryFieldset getDisplay() {
    return display;
  }

  public void setDisplay(HistoryFieldset display) {
    this.display = display;
  }

  public History end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public History plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @NotNull
 @Size(min=1,max=64)  @ApiModelProperty(required = true, value = "")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public History raw(HistoryFieldsetRaw raw) {
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
  public HistoryFieldsetRaw getRaw() {
    return raw;
  }

  public void setRaw(HistoryFieldsetRaw raw) {
    this.raw = raw;
  }

  public History start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    History history = (History) o;
    return Objects.equals(this.days, history.days) &&
        Objects.equals(this.display, history.display) &&
        Objects.equals(this.end, history.end) &&
        Objects.equals(this.plan, history.plan) &&
        Objects.equals(this.raw, history.raw) &&
        Objects.equals(this.start, history.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, display, end, plan, raw, start);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class History {\n");
    
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

