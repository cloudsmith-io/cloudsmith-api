
# RepositoryWebhookRequestPatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) |  |  [optional]
**isActive** | **Boolean** | If enabled, the webhook will trigger on subscribed events and send payloads to the configured target URL. |  [optional]
**packageQuery** | **String** | The package-based search query for webhooks to fire. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. If a package does not match, the webhook will not fire. |  [optional]
**requestBodyFormat** | **Integer** | The format of the payloads for webhook requests. |  [optional]
**requestBodyTemplateFormat** | **Integer** | The format of the payloads for webhook requests. |  [optional]
**requestContentType** | **String** | The value that will be sent for the &#39;Content Type&#39; header.  |  [optional]
**secretHeader** | **String** | The header to send the predefined secret in. This must be unique from existing headers or it won&#39;t be sent. You can use this as a form of authentication on the endpoint side. |  [optional]
**secretValue** | **String** | The value for the predefined secret (note: this is treated as a passphrase and is encrypted when we store it). You can use this as a form of authentication on the endpoint side. |  [optional]
**signatureKey** | **String** | The value for the signature key - This is used to generate an HMAC-based hex digest of the request body, which we send as the X-Cloudsmith-Signature header so that you can ensure that the request wasn&#39;t modified by a malicious party (note: this is treated as a passphrase and is encrypted when we store it). |  [optional]
**targetUrl** | **String** | The destination URL that webhook payloads will be POST&#39;ed to. |  [optional]
**templates** | [**List&lt;WebhookTemplate&gt;**](WebhookTemplate.md) |  |  [optional]
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



