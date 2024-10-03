# CloudsmithApi::RepositoryWebhookRequestPatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | **Array&lt;String&gt;** |  | [optional] 
**is_active** | **BOOLEAN** | If enabled, the webhook will trigger on subscribed events and send payloads to the configured target URL. | [optional] 
**package_query** | **String** | The package-based search query for webhooks to fire. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. If a package does not match, the webhook will not fire. | [optional] 
**request_body_format** | **Integer** | The format of the payloads for webhook requests. | [optional] 
**request_body_template_format** | **Integer** | The format of the payloads for webhook requests. | [optional] 
**request_content_type** | **String** | The value that will be sent for the &#39;Content Type&#39; header.  | [optional] 
**secret_header** | **String** | The header to send the predefined secret in. This must be unique from existing headers or it won&#39;t be sent. You can use this as a form of authentication on the endpoint side. | [optional] 
**secret_value** | **String** | The value for the predefined secret (note: this is treated as a passphrase and is encrypted when we store it). You can use this as a form of authentication on the endpoint side. | [optional] 
**signature_key** | **String** | The value for the signature key - This is used to generate an HMAC-based hex digest of the request body, which we send as the X-Cloudsmith-Signature header so that you can ensure that the request wasn&#39;t modified by a malicious party (note: this is treated as a passphrase and is encrypted when we store it). | [optional] 
**target_url** | **String** | The destination URL that webhook payloads will be POST&#39;ed to. | [optional] 
**templates** | [**Array&lt;WebhookTemplate&gt;**](WebhookTemplate.md) |  | [optional] 
**verify_ssl** | **BOOLEAN** | If enabled, SSL certificates is verified when webhooks are sent. It&#39;s recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks. | [optional] 


