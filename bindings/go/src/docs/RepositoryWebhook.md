# RepositoryWebhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **string** |  | [optional] [default to null]
**CreatedBy** | **string** |  | [optional] [default to null]
**CreatedByUrl** | **string** |  | [optional] [default to null]
**DisableReason** | **string** |  | [optional] [default to null]
**DisableReasonStr** | **string** |  | [optional] [default to null]
**Events** | **[]string** |  | [default to null]
**Identifier** | **int32** |  | [optional] [default to null]
**IsActive** | **bool** | If enabled, the webhook will trigger on events and send payloads to the configured target URL. | [optional] [default to null]
**IsLastResponseBad** | **bool** |  | [optional] [default to null]
**LastResponseStatus** | **int32** |  | [optional] [default to null]
**LastResponseStatusStr** | **string** |  | [optional] [default to null]
**NumSent** | **int32** |  | [optional] [default to null]
**RequestBodyFormat** | **string** | The format of the payloads for webhook requests. | [optional] [default to null]
**RequestBodyFormatStr** | **string** |  | [optional] [default to null]
**RequestBodyTemplateFormat** | **string** | The format of the payloads for webhook requests. | [optional] [default to null]
**RequestBodyTemplateFormatStr** | **string** |  | [optional] [default to null]
**RequestContentType** | **string** | The value that will be sent for the &#39;Content Type&#39; header.  | [optional] [default to null]
**SecretHeader** | **string** | The header to send the predefined secret in. This must be unique from existing headers or it won&#39;t be sent. You can use this as a form of authentication on the endpoint side. | [optional] [default to null]
**SelfUrl** | **string** |  | [optional] [default to null]
**SlugPerm** | **string** |  | [optional] [default to null]
**TargetUrl** | **string** | The destination URL that webhook payloads will be POST&#39;ed to. | [default to null]
**Templates** | [**[]WebhooksownerrepoTemplates**](webhooksownerrepo_templates.md) |  | [default to null]
**UpdatedAt** | **string** |  | [optional] [default to null]
**UpdatedBy** | **string** |  | [optional] [default to null]
**UpdatedByUrl** | **string** |  | [optional] [default to null]
**VerifySsl** | **bool** | If enabled, SSL certificates is verified when webhooks are sent. It&#39;s recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


