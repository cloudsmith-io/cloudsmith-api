# RepositoryWebhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **str** |  | [optional] 
**created_by** | **str** |  | [optional] 
**created_by_url** | **str** |  | [optional] 
**disable_reason** | **str** |  | [optional] 
**disable_reason_str** | **str** |  | [optional] 
**events** | **list[str]** |  | 
**identifier** | **int** |  | 
**is_active** | **bool** | If enabled, the webhook will trigger on events and send payloads to the configured target URL. | [optional] 
**is_last_response_bad** | **bool** |  | [optional] 
**last_response_status** | **int** |  | [optional] 
**last_response_status_str** | **str** |  | [optional] 
**num_sent** | **int** |  | [optional] 
**request_body_format** | **str** | The format of the payloads for webhook requests. | [optional] 
**request_body_format_str** | **str** |  | [optional] 
**secret_header** | **str** | The header to send the predefined secret in. This must be unique from existing headers or it won&#39;t be sent. You can use this as a form of authentication on the endpoint side. | [optional] 
**self_url** | **str** |  | [optional] 
**slug_perm** | **str** |  | [optional] 
**target_url** | **str** | The destination URL that webhook payloads will be POST&#39;ed to. | 
**updated_at** | **str** |  | [optional] 
**updated_by** | **str** |  | [optional] 
**updated_by_url** | **str** |  | [optional] 
**verify_ssl** | **bool** | If enabled, SSL certificates is verified when webhooks are sent. It&#39;s recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

