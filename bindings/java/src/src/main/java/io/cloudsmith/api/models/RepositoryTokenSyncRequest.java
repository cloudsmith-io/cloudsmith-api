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
 * RepositoryTokenSyncRequest
 */

public class RepositoryTokenSyncRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("source")
  private String source = null;

  public RepositoryTokenSyncRequest source(String source) {
    this.source = source;
    return this;
  }

   /**
   * The source repository slug (in the same owner namespace).
   * @return source
  **/
  @NotNull
 @Size(min=1)  @ApiModelProperty(required = true, value = "The source repository slug (in the same owner namespace).")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryTokenSyncRequest repositoryTokenSyncRequest = (RepositoryTokenSyncRequest) o;
    return Objects.equals(this.source, repositoryTokenSyncRequest.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryTokenSyncRequest {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
