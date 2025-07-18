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
 * GoUpstreamRequest
 */

public class GoUpstreamRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The authentication mode to use when accessing this upstream. 
   */
  @JsonAdapter(AuthModeEnum.Adapter.class)
  public enum AuthModeEnum {
    NONE("None"),
    
    USERNAME_AND_PASSWORD("Username and Password");

    private String value;

    AuthModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthModeEnum fromValue(String text) {
      for (AuthModeEnum b : AuthModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AuthModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("auth_mode")
  private AuthModeEnum authMode = AuthModeEnum.NONE;

  @SerializedName("auth_secret")
  private String authSecret = null;

  @SerializedName("auth_username")
  private String authUsername = null;

  @SerializedName("extra_header_1")
  private String extraHeader1 = null;

  @SerializedName("extra_header_2")
  private String extraHeader2 = null;

  @SerializedName("extra_value_1")
  private String extraValue1 = null;

  @SerializedName("extra_value_2")
  private String extraValue2 = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  /**
   * The mode that this upstream should operate in. Upstream sources can be used to proxy resolved packages, as well as operate in a proxy/cache or cache only mode.
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    PROXY_ONLY("Proxy Only"),
    
    CACHE_AND_PROXY("Cache and Proxy");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("mode")
  private ModeEnum mode = ModeEnum.PROXY_ONLY;

  @SerializedName("name")
  private String name = null;

  @SerializedName("priority")
  private java.math.BigInteger priority = null;

  @SerializedName("upstream_url")
  private String upstreamUrl = null;

  @SerializedName("verify_ssl")
  private Boolean verifySsl = null;

  public GoUpstreamRequest authMode(AuthModeEnum authMode) {
    this.authMode = authMode;
    return this;
  }

   /**
   * The authentication mode to use when accessing this upstream. 
   * @return authMode
  **/
  @ApiModelProperty(value = "The authentication mode to use when accessing this upstream. ")
  public AuthModeEnum getAuthMode() {
    return authMode;
  }

  public void setAuthMode(AuthModeEnum authMode) {
    this.authMode = authMode;
  }

  public GoUpstreamRequest authSecret(String authSecret) {
    this.authSecret = authSecret;
    return this;
  }

   /**
   * Secret to provide with requests to upstream.
   * @return authSecret
  **/
 @Size(max=4096)  @ApiModelProperty(value = "Secret to provide with requests to upstream.")
  public String getAuthSecret() {
    return authSecret;
  }

  public void setAuthSecret(String authSecret) {
    this.authSecret = authSecret;
  }

  public GoUpstreamRequest authUsername(String authUsername) {
    this.authUsername = authUsername;
    return this;
  }

   /**
   * Username to provide with requests to upstream.
   * @return authUsername
  **/
 @Size(max=64)  @ApiModelProperty(value = "Username to provide with requests to upstream.")
  public String getAuthUsername() {
    return authUsername;
  }

  public void setAuthUsername(String authUsername) {
    this.authUsername = authUsername;
  }

  public GoUpstreamRequest extraHeader1(String extraHeader1) {
    this.extraHeader1 = extraHeader1;
    return this;
  }

   /**
   * The key for extra header #1 to send to upstream.
   * @return extraHeader1
  **/
 @Pattern(regexp="^[-\\w]+$") @Size(max=64)  @ApiModelProperty(value = "The key for extra header #1 to send to upstream.")
  public String getExtraHeader1() {
    return extraHeader1;
  }

  public void setExtraHeader1(String extraHeader1) {
    this.extraHeader1 = extraHeader1;
  }

  public GoUpstreamRequest extraHeader2(String extraHeader2) {
    this.extraHeader2 = extraHeader2;
    return this;
  }

   /**
   * The key for extra header #2 to send to upstream.
   * @return extraHeader2
  **/
 @Pattern(regexp="^[-\\w]+$") @Size(max=64)  @ApiModelProperty(value = "The key for extra header #2 to send to upstream.")
  public String getExtraHeader2() {
    return extraHeader2;
  }

  public void setExtraHeader2(String extraHeader2) {
    this.extraHeader2 = extraHeader2;
  }

  public GoUpstreamRequest extraValue1(String extraValue1) {
    this.extraValue1 = extraValue1;
    return this;
  }

   /**
   * The value for extra header #1 to send to upstream. This is stored as plaintext, and is NOT encrypted.
   * @return extraValue1
  **/
 @Pattern(regexp="^[^\\n\\r]+$") @Size(max=128)  @ApiModelProperty(value = "The value for extra header #1 to send to upstream. This is stored as plaintext, and is NOT encrypted.")
  public String getExtraValue1() {
    return extraValue1;
  }

  public void setExtraValue1(String extraValue1) {
    this.extraValue1 = extraValue1;
  }

  public GoUpstreamRequest extraValue2(String extraValue2) {
    this.extraValue2 = extraValue2;
    return this;
  }

   /**
   * The value for extra header #2 to send to upstream. This is stored as plaintext, and is NOT encrypted.
   * @return extraValue2
  **/
 @Pattern(regexp="^[^\\n\\r]+$") @Size(max=128)  @ApiModelProperty(value = "The value for extra header #2 to send to upstream. This is stored as plaintext, and is NOT encrypted.")
  public String getExtraValue2() {
    return extraValue2;
  }

  public void setExtraValue2(String extraValue2) {
    this.extraValue2 = extraValue2;
  }

  public GoUpstreamRequest isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Whether or not this upstream is active and ready for requests.
   * @return isActive
  **/
  @ApiModelProperty(value = "Whether or not this upstream is active and ready for requests.")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public GoUpstreamRequest mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * The mode that this upstream should operate in. Upstream sources can be used to proxy resolved packages, as well as operate in a proxy/cache or cache only mode.
   * @return mode
  **/
  @ApiModelProperty(value = "The mode that this upstream should operate in. Upstream sources can be used to proxy resolved packages, as well as operate in a proxy/cache or cache only mode.")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public GoUpstreamRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A descriptive name for this upstream source. A shortened version of this name will be used for tagging cached packages retrieved from this upstream.
   * @return name
  **/
  @NotNull
 @Pattern(regexp="^\\w[\\w \\-'\\./()]+$") @Size(min=1,max=64)  @ApiModelProperty(required = true, value = "A descriptive name for this upstream source. A shortened version of this name will be used for tagging cached packages retrieved from this upstream.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GoUpstreamRequest priority(java.math.BigInteger priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Upstream sources are selected for resolving requests by sequential order (1..n), followed by creation date.
   * minimum: 1
   * maximum: 32767
   * @return priority
  **/
 @Min(1L) @Max(32767L)  @ApiModelProperty(value = "Upstream sources are selected for resolving requests by sequential order (1..n), followed by creation date.")
  public java.math.BigInteger getPriority() {
    return priority;
  }

  public void setPriority(java.math.BigInteger priority) {
    this.priority = priority;
  }

  public GoUpstreamRequest upstreamUrl(String upstreamUrl) {
    this.upstreamUrl = upstreamUrl;
    return this;
  }

   /**
   * The URL for this upstream source. This must be a fully qualified URL including any path elements required to reach the root of the repository. 
   * @return upstreamUrl
  **/
  @NotNull
 @Size(min=1,max=200)  @ApiModelProperty(required = true, value = "The URL for this upstream source. This must be a fully qualified URL including any path elements required to reach the root of the repository. ")
  public String getUpstreamUrl() {
    return upstreamUrl;
  }

  public void setUpstreamUrl(String upstreamUrl) {
    this.upstreamUrl = upstreamUrl;
  }

  public GoUpstreamRequest verifySsl(Boolean verifySsl) {
    this.verifySsl = verifySsl;
    return this;
  }

   /**
   * If enabled, SSL certificates are verified when requests are made to this upstream. It&#39;s recommended to leave this enabled for all public sources to help mitigate Man-In-The-Middle (MITM) attacks. Please note this only applies to HTTPS upstreams.
   * @return verifySsl
  **/
  @ApiModelProperty(value = "If enabled, SSL certificates are verified when requests are made to this upstream. It's recommended to leave this enabled for all public sources to help mitigate Man-In-The-Middle (MITM) attacks. Please note this only applies to HTTPS upstreams.")
  public Boolean isVerifySsl() {
    return verifySsl;
  }

  public void setVerifySsl(Boolean verifySsl) {
    this.verifySsl = verifySsl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoUpstreamRequest goUpstreamRequest = (GoUpstreamRequest) o;
    return Objects.equals(this.authMode, goUpstreamRequest.authMode) &&
        Objects.equals(this.authSecret, goUpstreamRequest.authSecret) &&
        Objects.equals(this.authUsername, goUpstreamRequest.authUsername) &&
        Objects.equals(this.extraHeader1, goUpstreamRequest.extraHeader1) &&
        Objects.equals(this.extraHeader2, goUpstreamRequest.extraHeader2) &&
        Objects.equals(this.extraValue1, goUpstreamRequest.extraValue1) &&
        Objects.equals(this.extraValue2, goUpstreamRequest.extraValue2) &&
        Objects.equals(this.isActive, goUpstreamRequest.isActive) &&
        Objects.equals(this.mode, goUpstreamRequest.mode) &&
        Objects.equals(this.name, goUpstreamRequest.name) &&
        Objects.equals(this.priority, goUpstreamRequest.priority) &&
        Objects.equals(this.upstreamUrl, goUpstreamRequest.upstreamUrl) &&
        Objects.equals(this.verifySsl, goUpstreamRequest.verifySsl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authMode, authSecret, authUsername, extraHeader1, extraHeader2, extraValue1, extraValue2, isActive, mode, name, priority, upstreamUrl, verifySsl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoUpstreamRequest {\n");
    
    sb.append("    authMode: ").append(toIndentedString(authMode)).append("\n");
    sb.append("    authSecret: ").append(toIndentedString(authSecret)).append("\n");
    sb.append("    authUsername: ").append(toIndentedString(authUsername)).append("\n");
    sb.append("    extraHeader1: ").append(toIndentedString(extraHeader1)).append("\n");
    sb.append("    extraHeader2: ").append(toIndentedString(extraHeader2)).append("\n");
    sb.append("    extraValue1: ").append(toIndentedString(extraValue1)).append("\n");
    sb.append("    extraValue2: ").append(toIndentedString(extraValue2)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    upstreamUrl: ").append(toIndentedString(upstreamUrl)).append("\n");
    sb.append("    verifySsl: ").append(toIndentedString(verifySsl)).append("\n");
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

