# CloudsmithApi::RepositoryWebhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **String** |  | [optional] 
**created_by** | **String** |  | [optional] 
**created_by_url** | **String** |  | [optional] 
**disable_reason** | **Integer** |  | [optional] 
**disable_reason_str** | **String** |  | [optional] 
**events** | **Array&lt;Integer&gt;** |  | 
**identifier** | **Integer** |  | [optional] 
**is_active** | **BOOLEAN** | If enabled, the webhook will trigger on events and send payloads to the configured target URL. | [optional] 
**is_last_response_bad** | **BOOLEAN** |  | [optional] 
**last_response_status** | **Integer** |  | [optional] 
**last_response_status_str** | **String** |  | [optional] 
**num_sent** | **Integer** |  | [optional] 
**request_body_format** | **Integer** | The format of the payloads for webhook requests. | [optional] 
**request_body_format_str** | **String** |  | [optional] 
**request_body_template_format** | **Integer** | The format of the payloads for webhook requests. | [optional] 
**request_body_template_format_str** | **String** |  | [optional] 
**request_content_type** | **String** | The value that will be sent for the &#39;Content Type&#39; header.  | [optional] 
**secret_header** | **String** | The header to send the predefined secret in. This must be unique from existing headers or it won&#39;t be sent. You can use this as a form of authentication on the endpoint side. | [optional] 
**self_url** | **String** |  | [optional] 
**slug_perm** | **String** |  | [optional] 
**target_url** | **String** | The destination URL that webhook payloads will be POST&#39;ed to. | 
**templates** | [**Array&lt;WebhooksownerrepoTemplates&gt;**](WebhooksownerrepoTemplates.md) |  | 
**updated_at** | **String** |  | [optional] 
**updated_by** | **String** |  | [optional] 
**updated_by_url** | **String** |  | [optional] 
**verify_ssl** | **BOOLEAN** | If enabled, SSL certificates is verified when webhooks are sent. It&#39;s recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks. | [optional] 


