
# RepositoryWebhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdBy** | **String** |  |  [optional]
**createdByUrl** | **String** |  |  [optional]
**disableReason** | **java.math.BigInteger** |  |  [optional]
**disableReasonStr** | **String** |  |  [optional]
**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) |  | 
**identifier** | **java.math.BigInteger** | Deprecated (23-05-15): Please use &#39;slug_perm&#39; instead. Previously: A monotonically increasing number that identified a webhook request within a repository. |  [optional]
**isActive** | **Boolean** | If enabled, the webhook will trigger on subscribed events and send payloads to the configured target URL. |  [optional]
**isLastResponseBad** | **Boolean** |  |  [optional]
**lastResponseStatus** | **java.math.BigInteger** |  |  [optional]
**lastResponseStatusStr** | **String** |  |  [optional]
**numSent** | **java.math.BigInteger** |  |  [optional]
**packageQuery** | **String** | The package-based search query for webhooks to fire. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. If a package does not match, the webhook will not fire. |  [optional]
**requestBodyFormat** | **java.math.BigInteger** | The format of the payloads for webhook requests. |  [optional]
**requestBodyFormatStr** | **String** |  |  [optional]
**requestBodyTemplateFormat** | **java.math.BigInteger** | The format of the payloads for webhook requests. |  [optional]
**requestBodyTemplateFormatStr** | **String** |  |  [optional]
**requestContentType** | **String** | The value that will be sent for the &#39;Content Type&#39; header.  |  [optional]
**secretHeader** | **String** | The header to send the predefined secret in. This must be unique from existing headers or it won&#39;t be sent. You can use this as a form of authentication on the endpoint side. |  [optional]
**selfUrl** | **String** |  |  [optional]
**slugPerm** | **String** |  |  [optional]
**targetUrl** | **String** | The destination URL that webhook payloads will be POST&#39;ed to. | 
**templates** | [**List&lt;WebhookTemplate&gt;**](WebhookTemplate.md) |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedBy** | **String** |  |  [optional]
**updatedByUrl** | **String** |  |  [optional]
**verifySsl** | **Boolean** | If enabled, SSL certificates is verified when webhooks are sent. It&#39;s recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks. |  [optional]


<a name="List<EventsEnum>"></a>
## Enum: List&lt;EventsEnum&gt;
Name | Value
---- | -----
STAR | &quot;*&quot;
PACKAGE_CREATED | &quot;package.created&quot;
PACKAGE_DELETED | &quot;package.deleted&quot;
PACKAGE_DOWNLOADED | &quot;package.downloaded&quot;
PACKAGE_FAILED | &quot;package.failed&quot;
PACKAGE_SECURITY_SCANNED | &quot;package.security_scanned&quot;
PACKAGE_SYNCED | &quot;package.synced&quot;
PACKAGE_SYNCING | &quot;package.syncing&quot;
PACKAGE_TAGS_UPDATED | &quot;package.tags_updated&quot;



