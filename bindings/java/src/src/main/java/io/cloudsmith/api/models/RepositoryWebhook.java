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
import io.cloudsmith.api.models.WebhooksownerrepoTemplates;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * RepositoryWebhook
 */

public class RepositoryWebhook implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("created_by")
  private String createdBy = null;

  @SerializedName("created_by_url")
  private String createdByUrl = null;

  @SerializedName("disable_reason")
  private String disableReason = null;

  @SerializedName("disable_reason_str")
  private String disableReasonStr = null;

  @SerializedName("events")
  private List<String> events = new ArrayList<String>();

  @SerializedName("identifier")
  private Integer identifier = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("is_last_response_bad")
  private Boolean isLastResponseBad = null;

  @SerializedName("last_response_status")
  private Integer lastResponseStatus = null;

  @SerializedName("last_response_status_str")
  private String lastResponseStatusStr = null;

  @SerializedName("num_sent")
  private Integer numSent = null;

  @SerializedName("package_query")
  private String packageQuery = null;

  @SerializedName("request_body_format")
  private String requestBodyFormat = null;

  @SerializedName("request_body_format_str")
  private String requestBodyFormatStr = null;

  @SerializedName("request_body_template_format")
  private String requestBodyTemplateFormat = null;

  @SerializedName("request_body_template_format_str")
  private String requestBodyTemplateFormatStr = null;

  @SerializedName("request_content_type")
  private String requestContentType = null;

  @SerializedName("secret_header")
  private String secretHeader = null;

  @SerializedName("self_url")
  private String selfUrl = null;

  @SerializedName("slug_perm")
  private String slugPerm = null;

  @SerializedName("target_url")
  private String targetUrl = null;

  @SerializedName("templates")
  private List<WebhooksownerrepoTemplates> templates = new ArrayList<WebhooksownerrepoTemplates>();

  @SerializedName("updated_at")
  private String updatedAt = null;

  @SerializedName("updated_by")
  private String updatedBy = null;

  @SerializedName("updated_by_url")
  private String updatedByUrl = null;

  @SerializedName("verify_ssl")
  private Boolean verifySsl = null;

  public RepositoryWebhook createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * 
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public RepositoryWebhook createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public RepositoryWebhook createdByUrl(String createdByUrl) {
    this.createdByUrl = createdByUrl;
    return this;
  }

   /**
   * 
   * @return createdByUrl
  **/
  @ApiModelProperty(value = "")
  public String getCreatedByUrl() {
    return createdByUrl;
  }

  public void setCreatedByUrl(String createdByUrl) {
    this.createdByUrl = createdByUrl;
  }

  public RepositoryWebhook disableReason(String disableReason) {
    this.disableReason = disableReason;
    return this;
  }

   /**
   * 
   * @return disableReason
  **/
  @ApiModelProperty(value = "")
  public String getDisableReason() {
    return disableReason;
  }

  public void setDisableReason(String disableReason) {
    this.disableReason = disableReason;
  }

  public RepositoryWebhook disableReasonStr(String disableReasonStr) {
    this.disableReasonStr = disableReasonStr;
    return this;
  }

   /**
   * 
   * @return disableReasonStr
  **/
  @ApiModelProperty(value = "")
  public String getDisableReasonStr() {
    return disableReasonStr;
  }

  public void setDisableReasonStr(String disableReasonStr) {
    this.disableReasonStr = disableReasonStr;
  }

  public RepositoryWebhook events(List<String> events) {
    this.events = events;
    return this;
  }

  public RepositoryWebhook addEventsItem(String eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * 
   * @return events
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "")
  public List<String> getEvents() {
    return events;
  }

  public void setEvents(List<String> events) {
    this.events = events;
  }

  public RepositoryWebhook identifier(Integer identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * 
   * @return identifier
  **/
  @ApiModelProperty(value = "")
  public Integer getIdentifier() {
    return identifier;
  }

  public void setIdentifier(Integer identifier) {
    this.identifier = identifier;
  }

  public RepositoryWebhook isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * If enabled, the webhook will trigger on events and send payloads to the configured target URL.
   * @return isActive
  **/
  @ApiModelProperty(value = "If enabled, the webhook will trigger on events and send payloads to the configured target URL.")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public RepositoryWebhook isLastResponseBad(Boolean isLastResponseBad) {
    this.isLastResponseBad = isLastResponseBad;
    return this;
  }

   /**
   * 
   * @return isLastResponseBad
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsLastResponseBad() {
    return isLastResponseBad;
  }

  public void setIsLastResponseBad(Boolean isLastResponseBad) {
    this.isLastResponseBad = isLastResponseBad;
  }

  public RepositoryWebhook lastResponseStatus(Integer lastResponseStatus) {
    this.lastResponseStatus = lastResponseStatus;
    return this;
  }

   /**
   * 
   * @return lastResponseStatus
  **/
  @ApiModelProperty(value = "")
  public Integer getLastResponseStatus() {
    return lastResponseStatus;
  }

  public void setLastResponseStatus(Integer lastResponseStatus) {
    this.lastResponseStatus = lastResponseStatus;
  }

  public RepositoryWebhook lastResponseStatusStr(String lastResponseStatusStr) {
    this.lastResponseStatusStr = lastResponseStatusStr;
    return this;
  }

   /**
   * 
   * @return lastResponseStatusStr
  **/
  @ApiModelProperty(value = "")
  public String getLastResponseStatusStr() {
    return lastResponseStatusStr;
  }

  public void setLastResponseStatusStr(String lastResponseStatusStr) {
    this.lastResponseStatusStr = lastResponseStatusStr;
  }

  public RepositoryWebhook numSent(Integer numSent) {
    this.numSent = numSent;
    return this;
  }

   /**
   * 
   * @return numSent
  **/
  @ApiModelProperty(value = "")
  public Integer getNumSent() {
    return numSent;
  }

  public void setNumSent(Integer numSent) {
    this.numSent = numSent;
  }

  public RepositoryWebhook packageQuery(String packageQuery) {
    this.packageQuery = packageQuery;
    return this;
  }

   /**
   * The package-based search query for webhooks to fire. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. If a package does not match, the webhook will not fire.
   * @return packageQuery
  **/
  @ApiModelProperty(value = "The package-based search query for webhooks to fire. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. If a package does not match, the webhook will not fire.")
  public String getPackageQuery() {
    return packageQuery;
  }

  public void setPackageQuery(String packageQuery) {
    this.packageQuery = packageQuery;
  }

  public RepositoryWebhook requestBodyFormat(String requestBodyFormat) {
    this.requestBodyFormat = requestBodyFormat;
    return this;
  }

   /**
   * The format of the payloads for webhook requests.
   * @return requestBodyFormat
  **/
  @ApiModelProperty(value = "The format of the payloads for webhook requests.")
  public String getRequestBodyFormat() {
    return requestBodyFormat;
  }

  public void setRequestBodyFormat(String requestBodyFormat) {
    this.requestBodyFormat = requestBodyFormat;
  }

  public RepositoryWebhook requestBodyFormatStr(String requestBodyFormatStr) {
    this.requestBodyFormatStr = requestBodyFormatStr;
    return this;
  }

   /**
   * 
   * @return requestBodyFormatStr
  **/
  @ApiModelProperty(value = "")
  public String getRequestBodyFormatStr() {
    return requestBodyFormatStr;
  }

  public void setRequestBodyFormatStr(String requestBodyFormatStr) {
    this.requestBodyFormatStr = requestBodyFormatStr;
  }

  public RepositoryWebhook requestBodyTemplateFormat(String requestBodyTemplateFormat) {
    this.requestBodyTemplateFormat = requestBodyTemplateFormat;
    return this;
  }

   /**
   * The format of the payloads for webhook requests.
   * @return requestBodyTemplateFormat
  **/
  @ApiModelProperty(value = "The format of the payloads for webhook requests.")
  public String getRequestBodyTemplateFormat() {
    return requestBodyTemplateFormat;
  }

  public void setRequestBodyTemplateFormat(String requestBodyTemplateFormat) {
    this.requestBodyTemplateFormat = requestBodyTemplateFormat;
  }

  public RepositoryWebhook requestBodyTemplateFormatStr(String requestBodyTemplateFormatStr) {
    this.requestBodyTemplateFormatStr = requestBodyTemplateFormatStr;
    return this;
  }

   /**
   * 
   * @return requestBodyTemplateFormatStr
  **/
  @ApiModelProperty(value = "")
  public String getRequestBodyTemplateFormatStr() {
    return requestBodyTemplateFormatStr;
  }

  public void setRequestBodyTemplateFormatStr(String requestBodyTemplateFormatStr) {
    this.requestBodyTemplateFormatStr = requestBodyTemplateFormatStr;
  }

  public RepositoryWebhook requestContentType(String requestContentType) {
    this.requestContentType = requestContentType;
    return this;
  }

   /**
   * The value that will be sent for the &#39;Content Type&#39; header. 
   * @return requestContentType
  **/
  @ApiModelProperty(value = "The value that will be sent for the 'Content Type' header. ")
  public String getRequestContentType() {
    return requestContentType;
  }

  public void setRequestContentType(String requestContentType) {
    this.requestContentType = requestContentType;
  }

  public RepositoryWebhook secretHeader(String secretHeader) {
    this.secretHeader = secretHeader;
    return this;
  }

   /**
   * The header to send the predefined secret in. This must be unique from existing headers or it won&#39;t be sent. You can use this as a form of authentication on the endpoint side.
   * @return secretHeader
  **/
  @ApiModelProperty(value = "The header to send the predefined secret in. This must be unique from existing headers or it won't be sent. You can use this as a form of authentication on the endpoint side.")
  public String getSecretHeader() {
    return secretHeader;
  }

  public void setSecretHeader(String secretHeader) {
    this.secretHeader = secretHeader;
  }

  public RepositoryWebhook selfUrl(String selfUrl) {
    this.selfUrl = selfUrl;
    return this;
  }

   /**
   * 
   * @return selfUrl
  **/
  @ApiModelProperty(value = "")
  public String getSelfUrl() {
    return selfUrl;
  }

  public void setSelfUrl(String selfUrl) {
    this.selfUrl = selfUrl;
  }

  public RepositoryWebhook slugPerm(String slugPerm) {
    this.slugPerm = slugPerm;
    return this;
  }

   /**
   * 
   * @return slugPerm
  **/
  @ApiModelProperty(value = "")
  public String getSlugPerm() {
    return slugPerm;
  }

  public void setSlugPerm(String slugPerm) {
    this.slugPerm = slugPerm;
  }

  public RepositoryWebhook targetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * The destination URL that webhook payloads will be POST&#39;ed to.
   * @return targetUrl
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "The destination URL that webhook payloads will be POST'ed to.")
  public String getTargetUrl() {
    return targetUrl;
  }

  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }

  public RepositoryWebhook templates(List<WebhooksownerrepoTemplates> templates) {
    this.templates = templates;
    return this;
  }

  public RepositoryWebhook addTemplatesItem(WebhooksownerrepoTemplates templatesItem) {
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * 
   * @return templates
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public List<WebhooksownerrepoTemplates> getTemplates() {
    return templates;
  }

  public void setTemplates(List<WebhooksownerrepoTemplates> templates) {
    this.templates = templates;
  }

  public RepositoryWebhook updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * 
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public RepositoryWebhook updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * 
   * @return updatedBy
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public RepositoryWebhook updatedByUrl(String updatedByUrl) {
    this.updatedByUrl = updatedByUrl;
    return this;
  }

   /**
   * 
   * @return updatedByUrl
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedByUrl() {
    return updatedByUrl;
  }

  public void setUpdatedByUrl(String updatedByUrl) {
    this.updatedByUrl = updatedByUrl;
  }

  public RepositoryWebhook verifySsl(Boolean verifySsl) {
    this.verifySsl = verifySsl;
    return this;
  }

   /**
   * If enabled, SSL certificates is verified when webhooks are sent. It&#39;s recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks.
   * @return verifySsl
  **/
  @ApiModelProperty(value = "If enabled, SSL certificates is verified when webhooks are sent. It's recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks.")
  public Boolean getVerifySsl() {
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
    RepositoryWebhook repositoryWebhook = (RepositoryWebhook) o;
    return Objects.equals(this.createdAt, repositoryWebhook.createdAt) &&
        Objects.equals(this.createdBy, repositoryWebhook.createdBy) &&
        Objects.equals(this.createdByUrl, repositoryWebhook.createdByUrl) &&
        Objects.equals(this.disableReason, repositoryWebhook.disableReason) &&
        Objects.equals(this.disableReasonStr, repositoryWebhook.disableReasonStr) &&
        Objects.equals(this.events, repositoryWebhook.events) &&
        Objects.equals(this.identifier, repositoryWebhook.identifier) &&
        Objects.equals(this.isActive, repositoryWebhook.isActive) &&
        Objects.equals(this.isLastResponseBad, repositoryWebhook.isLastResponseBad) &&
        Objects.equals(this.lastResponseStatus, repositoryWebhook.lastResponseStatus) &&
        Objects.equals(this.lastResponseStatusStr, repositoryWebhook.lastResponseStatusStr) &&
        Objects.equals(this.numSent, repositoryWebhook.numSent) &&
        Objects.equals(this.packageQuery, repositoryWebhook.packageQuery) &&
        Objects.equals(this.requestBodyFormat, repositoryWebhook.requestBodyFormat) &&
        Objects.equals(this.requestBodyFormatStr, repositoryWebhook.requestBodyFormatStr) &&
        Objects.equals(this.requestBodyTemplateFormat, repositoryWebhook.requestBodyTemplateFormat) &&
        Objects.equals(this.requestBodyTemplateFormatStr, repositoryWebhook.requestBodyTemplateFormatStr) &&
        Objects.equals(this.requestContentType, repositoryWebhook.requestContentType) &&
        Objects.equals(this.secretHeader, repositoryWebhook.secretHeader) &&
        Objects.equals(this.selfUrl, repositoryWebhook.selfUrl) &&
        Objects.equals(this.slugPerm, repositoryWebhook.slugPerm) &&
        Objects.equals(this.targetUrl, repositoryWebhook.targetUrl) &&
        Objects.equals(this.templates, repositoryWebhook.templates) &&
        Objects.equals(this.updatedAt, repositoryWebhook.updatedAt) &&
        Objects.equals(this.updatedBy, repositoryWebhook.updatedBy) &&
        Objects.equals(this.updatedByUrl, repositoryWebhook.updatedByUrl) &&
        Objects.equals(this.verifySsl, repositoryWebhook.verifySsl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdBy, createdByUrl, disableReason, disableReasonStr, events, identifier, isActive, isLastResponseBad, lastResponseStatus, lastResponseStatusStr, numSent, packageQuery, requestBodyFormat, requestBodyFormatStr, requestBodyTemplateFormat, requestBodyTemplateFormatStr, requestContentType, secretHeader, selfUrl, slugPerm, targetUrl, templates, updatedAt, updatedBy, updatedByUrl, verifySsl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryWebhook {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdByUrl: ").append(toIndentedString(createdByUrl)).append("\n");
    sb.append("    disableReason: ").append(toIndentedString(disableReason)).append("\n");
    sb.append("    disableReasonStr: ").append(toIndentedString(disableReasonStr)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isLastResponseBad: ").append(toIndentedString(isLastResponseBad)).append("\n");
    sb.append("    lastResponseStatus: ").append(toIndentedString(lastResponseStatus)).append("\n");
    sb.append("    lastResponseStatusStr: ").append(toIndentedString(lastResponseStatusStr)).append("\n");
    sb.append("    numSent: ").append(toIndentedString(numSent)).append("\n");
    sb.append("    packageQuery: ").append(toIndentedString(packageQuery)).append("\n");
    sb.append("    requestBodyFormat: ").append(toIndentedString(requestBodyFormat)).append("\n");
    sb.append("    requestBodyFormatStr: ").append(toIndentedString(requestBodyFormatStr)).append("\n");
    sb.append("    requestBodyTemplateFormat: ").append(toIndentedString(requestBodyTemplateFormat)).append("\n");
    sb.append("    requestBodyTemplateFormatStr: ").append(toIndentedString(requestBodyTemplateFormatStr)).append("\n");
    sb.append("    requestContentType: ").append(toIndentedString(requestContentType)).append("\n");
    sb.append("    secretHeader: ").append(toIndentedString(secretHeader)).append("\n");
    sb.append("    selfUrl: ").append(toIndentedString(selfUrl)).append("\n");
    sb.append("    slugPerm: ").append(toIndentedString(slugPerm)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedByUrl: ").append(toIndentedString(updatedByUrl)).append("\n");
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

