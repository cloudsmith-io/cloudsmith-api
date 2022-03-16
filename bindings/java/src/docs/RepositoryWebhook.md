
# RepositoryWebhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **String** |  |  [optional]
**createdBy** | **String** |  |  [optional]
**createdByUrl** | **String** |  |  [optional]
**disableReason** | **Integer** |  |  [optional]
**disableReasonStr** | **String** |  |  [optional]
**events** | **List&lt;String&gt;** |  | 
**identifier** | **Integer** |  |  [optional]
**isActive** | **Boolean** | If enabled, the webhook will trigger on events and send payloads to the configured target URL. |  [optional]
**isLastResponseBad** | **Boolean** |  |  [optional]
**lastResponseStatus** | **Integer** |  |  [optional]
**lastResponseStatusStr** | **String** |  |  [optional]
**numSent** | **Integer** |  |  [optional]
**packageQuery** | **String** | The package-based search query for webhooks to fire. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. If a package does not match, the webhook will not fire. |  [optional]
**requestBodyFormat** | **Integer** | The format of the payloads for webhook requests. |  [optional]
**requestBodyFormatStr** | **String** |  |  [optional]
**requestBodyTemplateFormat** | **Integer** | The format of the payloads for webhook requests. |  [optional]
**requestBodyTemplateFormatStr** | **String** |  |  [optional]
**requestContentType** | **String** | The value that will be sent for the &#39;Content Type&#39; header.  |  [optional]
**secretHeader** | **String** | The header to send the predefined secret in. This must be unique from existing headers or it won&#39;t be sent. You can use this as a form of authentication on the endpoint side. |  [optional]
**selfUrl** | **String** |  |  [optional]
**slugPerm** | **String** |  |  [optional]
**targetUrl** | **String** | The destination URL that webhook payloads will be POST&#39;ed to. | 
**templates** | [**List&lt;WebhooksownerrepoTemplates&gt;**](WebhooksownerrepoTemplates.md) |  | 
**updatedAt** | **String** |  |  [optional]
**updatedBy** | **String** |  |  [optional]
**updatedByUrl** | **String** |  |  [optional]
**verifySsl** | **Boolean** | If enabled, SSL certificates is verified when webhooks are sent. It&#39;s recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks. |  [optional]



