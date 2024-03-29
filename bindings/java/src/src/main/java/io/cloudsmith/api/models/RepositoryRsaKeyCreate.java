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
 * RepositoryRsaKeyCreate
 */

public class RepositoryRsaKeyCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("rsa_passphrase")
  private String rsaPassphrase = null;

  @SerializedName("rsa_private_key")
  private String rsaPrivateKey = null;

  public RepositoryRsaKeyCreate rsaPassphrase(String rsaPassphrase) {
    this.rsaPassphrase = rsaPassphrase;
    return this;
  }

   /**
   * The RSA passphrase used for signing.
   * @return rsaPassphrase
  **/
 @Size(min=1)  @ApiModelProperty(value = "The RSA passphrase used for signing.")
  public String getRsaPassphrase() {
    return rsaPassphrase;
  }

  public void setRsaPassphrase(String rsaPassphrase) {
    this.rsaPassphrase = rsaPassphrase;
  }

  public RepositoryRsaKeyCreate rsaPrivateKey(String rsaPrivateKey) {
    this.rsaPrivateKey = rsaPrivateKey;
    return this;
  }

   /**
   * The RSA private key.
   * @return rsaPrivateKey
  **/
  @NotNull
 @Size(min=1)  @ApiModelProperty(required = true, value = "The RSA private key.")
  public String getRsaPrivateKey() {
    return rsaPrivateKey;
  }

  public void setRsaPrivateKey(String rsaPrivateKey) {
    this.rsaPrivateKey = rsaPrivateKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryRsaKeyCreate repositoryRsaKeyCreate = (RepositoryRsaKeyCreate) o;
    return Objects.equals(this.rsaPassphrase, repositoryRsaKeyCreate.rsaPassphrase) &&
        Objects.equals(this.rsaPrivateKey, repositoryRsaKeyCreate.rsaPrivateKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rsaPassphrase, rsaPrivateKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryRsaKeyCreate {\n");
    
    sb.append("    rsaPassphrase: ").append(toIndentedString(rsaPassphrase)).append("\n");
    sb.append("    rsaPrivateKey: ").append(toIndentedString(rsaPrivateKey)).append("\n");
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

