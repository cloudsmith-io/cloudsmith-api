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
 * FilesValidate
 */

public class FilesValidate implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("md5_checksum")
  private String md5Checksum = null;

  @SerializedName("filename")
  private String filename = null;

  public FilesValidate md5Checksum(String md5Checksum) {
    this.md5Checksum = md5Checksum;
    return this;
  }

   /**
   * MD5 checksum for the package file upload.
   * @return md5Checksum
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "MD5 checksum for the package file upload.")
  public String getMd5Checksum() {
    return md5Checksum;
  }

  public void setMd5Checksum(String md5Checksum) {
    this.md5Checksum = md5Checksum;
  }

  public FilesValidate filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Filename for the package file upload.
   * @return filename
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Filename for the package file upload.")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilesValidate filesValidate = (FilesValidate) o;
    return Objects.equals(this.md5Checksum, filesValidate.md5Checksum) &&
        Objects.equals(this.filename, filesValidate.filename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(md5Checksum, filename);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesValidate {\n");
    
    sb.append("    md5Checksum: ").append(toIndentedString(md5Checksum)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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
