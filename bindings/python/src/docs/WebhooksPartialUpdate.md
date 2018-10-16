# WebhooksPartialUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | **list[int]** | None | [optional] 
**is_active** | **bool** | If enabled, the webhook will trigger on events and send payloads to the configured target URL. | [optional] 
**request_body_format** | **int** | The format of the payloads for webhook requests. | [optional] 
**request_body_template_format** | **int** | The format of the payloads for webhook requests. | [optional] 
**request_content_type** | **str** | The value that will be sent for the &#39;Content Type&#39; header.  | [optional] 
**secret_header** | **str** | The header to send the predefined secret in. This must be unique from existing headers or it won&#39;t be sent. You can use this as a form of authentication on the endpoint side. | [optional] 
**secret_value** | **str** | The value for the predefined secret (note: this is treated as a passphrase and is encrypted when we store it). You can use this as a form of authentication on the endpoint side. | [optional] 
**signature_key** | **str** | The value for the signature key - This is used to generate an HMAC-based hex digest of the request body, which we send as the X-Cloudsmith-Signature header so that you can ensure that the request wasn&#39;t modified by a malicious party (note: this is treated as a passphrase and is encrypted when we store it). | [optional] 
**target_url** | **str** | The destination URL that webhook payloads will be POST&#39;ed to. | [optional] 
**templates** | [**list[WebhooksownerrepoTemplates]**](WebhooksownerrepoTemplates.md) | None | [optional] 
**verify_ssl** | **bool** | If enabled, SSL certificates is verified when webhooks are sent. It&#39;s recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


