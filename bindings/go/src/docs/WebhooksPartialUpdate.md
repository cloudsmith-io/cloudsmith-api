# WebhooksPartialUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Identifier** | **int32** | None | [optional] [default to null]
**Events** | **[]string** | None | [optional] [default to null]
**IsActive** | **bool** | If enabled, the webhook will trigger on events and send payloads to the configured target URL. | [optional] [default to null]
**RequestBodyFormat** | **string** | The format of the payloads for webhook requests. | [optional] [default to null]
**SecretHeader** | **string** | The header to send the predefined secret in. This must be unique from existing headers or it won&#39;t be sent. You can use this as a form of authentication on the endpoint side. | [optional] [default to null]
**SecretValue** | **string** | The value for the predefined secret (note: this is treated as a passphrase and is encrypted when we store it). You can use this as a form of authentication on the endpoint side. | [optional] [default to null]
**SignatureKey** | **string** | The value for the signature key - This is used to generate an HMAC-based hex digest of the request body, which we send as the X-Cloudsmith-Signature header so that you can ensure that the request wasn&#39;t modified by a malicious party (note: this is treated as a passphrase and is encrypted when we store it). | [optional] [default to null]
**TargetUrl** | **string** | The destination URL that webhook payloads will be POST&#39;ed to. | [optional] [default to null]
**VerifySsl** | **bool** | If enabled, SSL certificates is verified when webhooks are sent. It&#39;s recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


