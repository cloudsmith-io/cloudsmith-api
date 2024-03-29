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
 * CranPackageUploadRequest
 */

public class CranPackageUploadRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("architecture")
  private String architecture = null;

  @SerializedName("package_file")
  private String packageFile = null;

  @SerializedName("r_version")
  private String rVersion = null;

  @SerializedName("republish")
  private Boolean republish = null;

  @SerializedName("tags")
  private String tags = null;

  public CranPackageUploadRequest architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

   /**
   * Binary package uploads for macOS should specify the architecture they were built for.
   * @return architecture
  **/
 @Size(min=1)  @ApiModelProperty(value = "Binary package uploads for macOS should specify the architecture they were built for.")
  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public CranPackageUploadRequest packageFile(String packageFile) {
    this.packageFile = packageFile;
    return this;
  }

   /**
   * The primary file for the package.
   * @return packageFile
  **/
  @NotNull
 @Size(min=1)  @ApiModelProperty(required = true, value = "The primary file for the package.")
  public String getPackageFile() {
    return packageFile;
  }

  public void setPackageFile(String packageFile) {
    this.packageFile = packageFile;
  }

  public CranPackageUploadRequest rVersion(String rVersion) {
    this.rVersion = rVersion;
    return this;
  }

   /**
   * Binary package uploads should specify the version of R they were built for.
   * @return rVersion
  **/
 @Size(min=1,max=16)  @ApiModelProperty(value = "Binary package uploads should specify the version of R they were built for.")
  public String getRVersion() {
    return rVersion;
  }

  public void setRVersion(String rVersion) {
    this.rVersion = rVersion;
  }

  public CranPackageUploadRequest republish(Boolean republish) {
    this.republish = republish;
    return this;
  }

   /**
   * If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate.
   * @return republish
  **/
  @ApiModelProperty(value = "If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate.")
  public Boolean isRepublish() {
    return republish;
  }

  public void setRepublish(Boolean republish) {
    this.republish = republish;
  }

  public CranPackageUploadRequest tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * A comma-separated values list of tags to add to the package.
   * @return tags
  **/
 @Size(min=1,max=1024)  @ApiModelProperty(value = "A comma-separated values list of tags to add to the package.")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CranPackageUploadRequest cranPackageUploadRequest = (CranPackageUploadRequest) o;
    return Objects.equals(this.architecture, cranPackageUploadRequest.architecture) &&
        Objects.equals(this.packageFile, cranPackageUploadRequest.packageFile) &&
        Objects.equals(this.rVersion, cranPackageUploadRequest.rVersion) &&
        Objects.equals(this.republish, cranPackageUploadRequest.republish) &&
        Objects.equals(this.tags, cranPackageUploadRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, packageFile, rVersion, republish, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CranPackageUploadRequest {\n");
    
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    packageFile: ").append(toIndentedString(packageFile)).append("\n");
    sb.append("    rVersion: ").append(toIndentedString(rVersion)).append("\n");
    sb.append("    republish: ").append(toIndentedString(republish)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

