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
import io.cloudsmith.api.models.RepositoryPrivilegeDict;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * RepositoryPrivilegeInputRequestPatch
 */

public class RepositoryPrivilegeInputRequestPatch implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("privileges")
  private List<RepositoryPrivilegeDict> privileges = null;

  public RepositoryPrivilegeInputRequestPatch privileges(List<RepositoryPrivilegeDict> privileges) {
    this.privileges = privileges;
    return this;
  }

  public RepositoryPrivilegeInputRequestPatch addPrivilegesItem(RepositoryPrivilegeDict privilegesItem) {
    if (this.privileges == null) {
      this.privileges = new ArrayList<>();
    }
    this.privileges.add(privilegesItem);
    return this;
  }

   /**
   * List of objects with explicit privileges to the repository.
   * @return privileges
  **/
  @Valid
  @ApiModelProperty(value = "List of objects with explicit privileges to the repository.")
  public List<RepositoryPrivilegeDict> getPrivileges() {
    return privileges;
  }

  public void setPrivileges(List<RepositoryPrivilegeDict> privileges) {
    this.privileges = privileges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryPrivilegeInputRequestPatch repositoryPrivilegeInputRequestPatch = (RepositoryPrivilegeInputRequestPatch) o;
    return Objects.equals(this.privileges, repositoryPrivilegeInputRequestPatch.privileges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privileges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryPrivilegeInputRequestPatch {\n");
    
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
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

