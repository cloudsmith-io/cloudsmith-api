

# RepositoryWebhook


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**createdBy** | **String** |  |  [optional] [readonly] |
|**createdByUrl** | **URI** |  |  [optional] [readonly] |
|**disableReason** | **java.math.BigInteger** |  |  [optional] [readonly] |
|**disableReasonStr** | **String** |  |  [optional] [readonly] |
|**events** | **List&lt;String&gt;** |  |  |
|**identifier** | **java.math.BigInteger** | Deprecated (23-05-15): Please use &#39;slug_perm&#39; instead. Previously: A monotonically increasing number that identified a webhook request within a repository. |  [optional] [readonly] |
|**isActive** | **Boolean** | If enabled, the webhook will trigger on subscribed events and send payloads to the configured target URL. |  [optional] |
|**isLastResponseBad** | **Boolean** |  |  [optional] [readonly] |
|**lastResponseStatus** | **java.math.BigInteger** |  |  [optional] [readonly] |
|**lastResponseStatusStr** | **String** |  |  [optional] [readonly] |
|**numSent** | **java.math.BigInteger** |  |  [optional] [readonly] |
|**packageQuery** | **String** | The package-based search query for webhooks to fire. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. If a package does not match, the webhook will not fire. |  [optional] |
|**requestBodyFormat** | **java.math.BigInteger** | The format of the payloads for webhook requests. Valid options are: (0) JSON, (1) JSON array, (2) form encoded JSON and (3) Handlebars template. |  [optional] |
|**requestBodyFormatStr** | **String** |  |  [optional] [readonly] |
|**requestBodyTemplateFormat** | **java.math.BigInteger** | The format of the payloads for webhook requests. Valid options are: (0) Generic/user defined, (1) JSON and (2) XML. |  [optional] |
|**requestBodyTemplateFormatStr** | **String** |  |  [optional] [readonly] |
|**requestContentType** | **String** | The value that will be sent for the &#39;Content Type&#39; header.  |  [optional] |
|**secretHeader** | **String** | The header to send the predefined secret in. This must be unique from existing headers or it won&#39;t be sent. You can use this as a form of authentication on the endpoint side. |  [optional] |
|**selfUrl** | **URI** |  |  [optional] [readonly] |
|**slugPerm** | **String** |  |  [optional] [readonly] |
|**targetUrl** | **URI** | The destination URL that webhook payloads will be POST&#39;ed to. |  |
|**templates** | [**List&lt;WebhookTemplate&gt;**](WebhookTemplate.md) |  |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**updatedBy** | **String** |  |  [optional] [readonly] |
|**updatedByUrl** | **URI** |  |  [optional] [readonly] |
|**verifySsl** | **Boolean** | If enabled, SSL certificates is verified when webhooks are sent. It&#39;s recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks. |  [optional] |


## Implemented Interfaces

* Serializable


