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
import java.math.BigDecimal;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * RateCheck
 */

public class RateCheck implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("interval")
  private BigDecimal interval = null;

  @SerializedName("limit")
  private java.math.BigInteger limit = null;

  @SerializedName("remaining")
  private java.math.BigInteger remaining = null;

  @SerializedName("reset")
  private java.math.BigInteger reset = null;

  @SerializedName("reset_iso_8601")
  private String resetIso8601 = null;

  @SerializedName("throttled")
  private Boolean throttled = null;

   /**
   * The time in seconds that you are suggested to wait until the next request in order to avoid consuming too much within the rate limit window.
   * @return interval
  **/
  @Valid
  @ApiModelProperty(value = "The time in seconds that you are suggested to wait until the next request in order to avoid consuming too much within the rate limit window.")
  public BigDecimal getInterval() {
    return interval;
  }

   /**
   * The maximum number of requests that you are permitted to send per hour
   * @return limit
  **/
  @ApiModelProperty(value = "The maximum number of requests that you are permitted to send per hour")
  public java.math.BigInteger getLimit() {
    return limit;
  }

   /**
   * The number of requests that are remaining in the current rate limit window
   * @return remaining
  **/
  @ApiModelProperty(value = "The number of requests that are remaining in the current rate limit window")
  public java.math.BigInteger getRemaining() {
    return remaining;
  }

   /**
   * The UTC epoch timestamp at which the current rate limit window will reset
   * @return reset
  **/
  @ApiModelProperty(value = "The UTC epoch timestamp at which the current rate limit window will reset")
  public java.math.BigInteger getReset() {
    return reset;
  }

   /**
   * The ISO 8601 datetime at which the current rate limit window will reset
   * @return resetIso8601
  **/
 @Size(min=1)  @ApiModelProperty(value = "The ISO 8601 datetime at which the current rate limit window will reset")
  public String getResetIso8601() {
    return resetIso8601;
  }

   /**
   * If true, throttling is currently being enforced.
   * @return throttled
  **/
  @ApiModelProperty(value = "If true, throttling is currently being enforced.")
  public Boolean isThrottled() {
    return throttled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateCheck rateCheck = (RateCheck) o;
    return Objects.equals(this.interval, rateCheck.interval) &&
        Objects.equals(this.limit, rateCheck.limit) &&
        Objects.equals(this.remaining, rateCheck.remaining) &&
        Objects.equals(this.reset, rateCheck.reset) &&
        Objects.equals(this.resetIso8601, rateCheck.resetIso8601) &&
        Objects.equals(this.throttled, rateCheck.throttled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, limit, remaining, reset, resetIso8601, throttled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateCheck {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
    sb.append("    reset: ").append(toIndentedString(reset)).append("\n");
    sb.append("    resetIso8601: ").append(toIndentedString(resetIso8601)).append("\n");
    sb.append("    throttled: ").append(toIndentedString(throttled)).append("\n");
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

