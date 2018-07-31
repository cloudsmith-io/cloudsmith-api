
# RepositoryWebhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **String** |  |  [optional]
**createdBy** | **String** |  |  [optional]
**createdByUrl** | **String** |  |  [optional]
**disableReason** | **String** |  |  [optional]
**disableReasonStr** | **String** |  |  [optional]
**events** | **List&lt;String&gt;** |  | 
**identifier** | **Integer** |  | 
**isActive** | **Boolean** | If enabled, the webhook will trigger on events and send payloads to the configured target URL. |  [optional]
**isLastResponseBad** | **Boolean** |  |  [optional]
**lastResponseStatus** | **Integer** |  |  [optional]
**lastResponseStatusStr** | **String** |  |  [optional]
**numSent** | **Integer** |  |  [optional]
**requestBodyFormat** | **String** | The format of the payloads for webhook requests. |  [optional]
**requestBodyFormatStr** | **String** |  |  [optional]
**secretHeader** | **String** | The header to send the predefined secret in. This must be unique from existing headers or it won&#39;t be sent. You can use this as a form of authentication on the endpoint side. |  [optional]
**selfUrl** | **String** |  |  [optional]
**slugPerm** | **String** |  |  [optional]
**targetUrl** | **String** | The destination URL that webhook payloads will be POST&#39;ed to. | 
**updatedAt** | **String** |  |  [optional]
**updatedBy** | **String** |  |  [optional]
**updatedByUrl** | **String** |  |  [optional]
**verifySsl** | **Boolean** | If enabled, SSL certificates is verified when webhooks are sent. It&#39;s recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks. |  [optional]



