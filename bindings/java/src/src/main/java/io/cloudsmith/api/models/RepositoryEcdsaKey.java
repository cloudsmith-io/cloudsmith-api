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
import java.time.OffsetDateTime;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * RepositoryEcdsaKey
 */

public class RepositoryEcdsaKey implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("fingerprint")
  private String fingerprint = null;

  @SerializedName("fingerprint_short")
  private String fingerprintShort = null;

  @SerializedName("public_key")
  private String publicKey = null;

  @SerializedName("ssh_fingerprint")
  private String sshFingerprint = null;

   /**
   * If selected this is the active key for this repository.
   * @return active
  **/
  @ApiModelProperty(value = "If selected this is the active key for this repository.")
  public Boolean isActive() {
    return active;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Valid
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

   /**
   * If selected this is the default key for this repository.
   * @return _default
  **/
  @ApiModelProperty(value = "If selected this is the default key for this repository.")
  public Boolean isDefault() {
    return _default;
  }

   /**
   * The long identifier used by ECDSA for this key.
   * @return fingerprint
  **/
 @Size(min=1)  @ApiModelProperty(value = "The long identifier used by ECDSA for this key.")
  public String getFingerprint() {
    return fingerprint;
  }

   /**
   * Get fingerprintShort
   * @return fingerprintShort
  **/
  @ApiModelProperty(value = "")
  public String getFingerprintShort() {
    return fingerprintShort;
  }

   /**
   * The public key given to repository users.
   * @return publicKey
  **/
 @Size(min=1)  @ApiModelProperty(value = "The public key given to repository users.")
  public String getPublicKey() {
    return publicKey;
  }

   /**
   * The SSH fingerprint used by ECDSA for this key.
   * @return sshFingerprint
  **/
  @ApiModelProperty(value = "The SSH fingerprint used by ECDSA for this key.")
  public String getSshFingerprint() {
    return sshFingerprint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryEcdsaKey repositoryEcdsaKey = (RepositoryEcdsaKey) o;
    return Objects.equals(this.active, repositoryEcdsaKey.active) &&
        Objects.equals(this.createdAt, repositoryEcdsaKey.createdAt) &&
        Objects.equals(this._default, repositoryEcdsaKey._default) &&
        Objects.equals(this.fingerprint, repositoryEcdsaKey.fingerprint) &&
        Objects.equals(this.fingerprintShort, repositoryEcdsaKey.fingerprintShort) &&
        Objects.equals(this.publicKey, repositoryEcdsaKey.publicKey) &&
        Objects.equals(this.sshFingerprint, repositoryEcdsaKey.sshFingerprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, createdAt, _default, fingerprint, fingerprintShort, publicKey, sshFingerprint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryEcdsaKey {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    fingerprintShort: ").append(toIndentedString(fingerprintShort)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    sshFingerprint: ").append(toIndentedString(sshFingerprint)).append("\n");
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

