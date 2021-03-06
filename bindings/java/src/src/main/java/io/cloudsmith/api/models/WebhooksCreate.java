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
 * WebhooksCreate
 */

public class WebhooksCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("events")
  private List<String> events = new ArrayList<String>();

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("package_query")
  private String packageQuery = null;

  @SerializedName("request_body_format")
  private String requestBodyFormat = null;

  @SerializedName("request_body_template_format")
  private String requestBodyTemplateFormat = null;

  @SerializedName("request_content_type")
  private String requestContentType = null;

  @SerializedName("secret_header")
  private String secretHeader = null;

  @SerializedName("secret_value")
  private String secretValue = null;

  @SerializedName("signature_key")
  private String signatureKey = null;

  @SerializedName("target_url")
  private String targetUrl = null;

  @SerializedName("templates")
  private List<WebhooksownerrepoTemplates> templates = new ArrayList<WebhooksownerrepoTemplates>();

  @SerializedName("verify_ssl")
  private Boolean verifySsl = null;

  public WebhooksCreate events(List<String> events) {
    this.events = events;
    return this;
  }

  public WebhooksCreate addEventsItem(String eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * None
   * @return events
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "None")
  public List<String> getEvents() {
    return events;
  }

  public void setEvents(List<String> events) {
    this.events = events;
  }

  public WebhooksCreate isActive(Boolean isActive) {
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

  public WebhooksCreate packageQuery(String packageQuery) {
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

  public WebhooksCreate requestBodyFormat(String requestBodyFormat) {
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

  public WebhooksCreate requestBodyTemplateFormat(String requestBodyTemplateFormat) {
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

  public WebhooksCreate requestContentType(String requestContentType) {
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

  public WebhooksCreate secretHeader(String secretHeader) {
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

  public WebhooksCreate secretValue(String secretValue) {
    this.secretValue = secretValue;
    return this;
  }

   /**
   * The value for the predefined secret (note: this is treated as a passphrase and is encrypted when we store it). You can use this as a form of authentication on the endpoint side.
   * @return secretValue
  **/
  @ApiModelProperty(value = "The value for the predefined secret (note: this is treated as a passphrase and is encrypted when we store it). You can use this as a form of authentication on the endpoint side.")
  public String getSecretValue() {
    return secretValue;
  }

  public void setSecretValue(String secretValue) {
    this.secretValue = secretValue;
  }

  public WebhooksCreate signatureKey(String signatureKey) {
    this.signatureKey = signatureKey;
    return this;
  }

   /**
   * The value for the signature key - This is used to generate an HMAC-based hex digest of the request body, which we send as the X-Cloudsmith-Signature header so that you can ensure that the request wasn&#39;t modified by a malicious party (note: this is treated as a passphrase and is encrypted when we store it).
   * @return signatureKey
  **/
  @ApiModelProperty(value = "The value for the signature key - This is used to generate an HMAC-based hex digest of the request body, which we send as the X-Cloudsmith-Signature header so that you can ensure that the request wasn't modified by a malicious party (note: this is treated as a passphrase and is encrypted when we store it).")
  public String getSignatureKey() {
    return signatureKey;
  }

  public void setSignatureKey(String signatureKey) {
    this.signatureKey = signatureKey;
  }

  public WebhooksCreate targetUrl(String targetUrl) {
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

  public WebhooksCreate templates(List<WebhooksownerrepoTemplates> templates) {
    this.templates = templates;
    return this;
  }

  public WebhooksCreate addTemplatesItem(WebhooksownerrepoTemplates templatesItem) {
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * None
   * @return templates
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "None")
  public List<WebhooksownerrepoTemplates> getTemplates() {
    return templates;
  }

  public void setTemplates(List<WebhooksownerrepoTemplates> templates) {
    this.templates = templates;
  }

  public WebhooksCreate verifySsl(Boolean verifySsl) {
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
    WebhooksCreate webhooksCreate = (WebhooksCreate) o;
    return Objects.equals(this.events, webhooksCreate.events) &&
        Objects.equals(this.isActive, webhooksCreate.isActive) &&
        Objects.equals(this.packageQuery, webhooksCreate.packageQuery) &&
        Objects.equals(this.requestBodyFormat, webhooksCreate.requestBodyFormat) &&
        Objects.equals(this.requestBodyTemplateFormat, webhooksCreate.requestBodyTemplateFormat) &&
        Objects.equals(this.requestContentType, webhooksCreate.requestContentType) &&
        Objects.equals(this.secretHeader, webhooksCreate.secretHeader) &&
        Objects.equals(this.secretValue, webhooksCreate.secretValue) &&
        Objects.equals(this.signatureKey, webhooksCreate.signatureKey) &&
        Objects.equals(this.targetUrl, webhooksCreate.targetUrl) &&
        Objects.equals(this.templates, webhooksCreate.templates) &&
        Objects.equals(this.verifySsl, webhooksCreate.verifySsl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, isActive, packageQuery, requestBodyFormat, requestBodyTemplateFormat, requestContentType, secretHeader, secretValue, signatureKey, targetUrl, templates, verifySsl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksCreate {\n");
    
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    packageQuery: ").append(toIndentedString(packageQuery)).append("\n");
    sb.append("    requestBodyFormat: ").append(toIndentedString(requestBodyFormat)).append("\n");
    sb.append("    requestBodyTemplateFormat: ").append(toIndentedString(requestBodyTemplateFormat)).append("\n");
    sb.append("    requestContentType: ").append(toIndentedString(requestContentType)).append("\n");
    sb.append("    secretHeader: ").append(toIndentedString(secretHeader)).append("\n");
    sb.append("    secretValue: ").append(toIndentedString(secretValue)).append("\n");
    sb.append("    signatureKey: ").append(toIndentedString(signatureKey)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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

