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
 * ReposGpgCreate
 */

public class ReposGpgCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("gpg_passphrase")
  private String gpgPassphrase = null;

  @SerializedName("gpg_private_key")
  private String gpgPrivateKey = null;

  public ReposGpgCreate gpgPassphrase(String gpgPassphrase) {
    this.gpgPassphrase = gpgPassphrase;
    return this;
  }

   /**
   * The GPG passphrase used for signing.
   * @return gpgPassphrase
  **/
  @ApiModelProperty(value = "The GPG passphrase used for signing.")
  public String getGpgPassphrase() {
    return gpgPassphrase;
  }

  public void setGpgPassphrase(String gpgPassphrase) {
    this.gpgPassphrase = gpgPassphrase;
  }

  public ReposGpgCreate gpgPrivateKey(String gpgPrivateKey) {
    this.gpgPrivateKey = gpgPrivateKey;
    return this;
  }

   /**
   * The GPG private key.
   * @return gpgPrivateKey
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "The GPG private key.")
  public String getGpgPrivateKey() {
    return gpgPrivateKey;
  }

  public void setGpgPrivateKey(String gpgPrivateKey) {
    this.gpgPrivateKey = gpgPrivateKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReposGpgCreate reposGpgCreate = (ReposGpgCreate) o;
    return Objects.equals(this.gpgPassphrase, reposGpgCreate.gpgPassphrase) &&
        Objects.equals(this.gpgPrivateKey, reposGpgCreate.gpgPrivateKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gpgPassphrase, gpgPrivateKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReposGpgCreate {\n");
    
    sb.append("    gpgPassphrase: ").append(toIndentedString(gpgPassphrase)).append("\n");
    sb.append("    gpgPrivateKey: ").append(toIndentedString(gpgPrivateKey)).append("\n");
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
