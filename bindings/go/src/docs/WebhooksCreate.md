# WebhooksCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Events** | **[]string** | None | [default to null]
**IsActive** | **bool** | If enabled, the webhook will trigger on events and send payloads to the configured target URL. | [optional] [default to null]
**PackageQuery** | **string** | The package-based search query for webhooks to fire. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. If a package does not match, the webhook will not fire. | [optional] [default to null]
**RequestBodyFormat** | **string** | The format of the payloads for webhook requests. | [optional] [default to null]
**RequestBodyTemplateFormat** | **string** | The format of the payloads for webhook requests. | [optional] [default to null]
**RequestContentType** | **string** | The value that will be sent for the &#39;Content Type&#39; header.  | [optional] [default to null]
**SecretHeader** | **string** | The header to send the predefined secret in. This must be unique from existing headers or it won&#39;t be sent. You can use this as a form of authentication on the endpoint side. | [optional] [default to null]
**SecretValue** | **string** | The value for the predefined secret (note: this is treated as a passphrase and is encrypted when we store it). You can use this as a form of authentication on the endpoint side. | [optional] [default to null]
**SignatureKey** | **string** | The value for the signature key - This is used to generate an HMAC-based hex digest of the request body, which we send as the X-Cloudsmith-Signature header so that you can ensure that the request wasn&#39;t modified by a malicious party (note: this is treated as a passphrase and is encrypted when we store it). | [optional] [default to null]
**TargetUrl** | **string** | The destination URL that webhook payloads will be POST&#39;ed to. | [default to null]
**Templates** | [**[]WebhooksownerrepoTemplates**](webhooksownerrepo_templates.md) | None | [default to null]
**VerifySsl** | **bool** | If enabled, SSL certificates is verified when webhooks are sent. It&#39;s recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


