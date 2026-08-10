# RepositoryWebhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **String** |  | [optional] [default to null]
**created_by** | **String** |  | [optional] [default to null]
**created_by_url** | **String** |  | [optional] [default to null]
**disable_reason** | **i32** |  | [optional] [default to null]
**disable_reason_str** | **String** |  | [optional] [default to null]
**events** | **Vec<String>** |  | [default to null]
**identifier** | **i32** | Deprecated (23-05-15): Please use &#39;slug_perm&#39; instead. Previously: A monotonically increasing number that identified a webhook request within a repository. | [optional] [default to null]
**is_active** | **bool** | If enabled, the webhook will trigger on subscribed events and send payloads to the configured target URL. | [optional] [default to null]
**is_last_response_bad** | **bool** |  | [optional] [default to null]
**last_response_status** | **i32** |  | [optional] [default to null]
**last_response_status_str** | **String** |  | [optional] [default to null]
**num_sent** | **i32** |  | [optional] [default to null]
**package_query** | **String** | The package-based search query for webhooks to fire. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. If a package does not match, the webhook will not fire. | [optional] [default to null]
**request_body_format** | **i32** | The format of the payloads for webhook requests. Valid options are: (0) JSON, (1) JSON array, (2) form encoded JSON and (3) Handlebars template. | [optional] [default to null]
**request_body_format_str** | **String** |  | [optional] [default to null]
**request_body_template_format** | **i32** | The format of the payloads for webhook requests. Valid options are: (0) Generic/user defined, (1) JSON and (2) XML. | [optional] [default to null]
**request_body_template_format_str** | **String** |  | [optional] [default to null]
**request_content_type** | **String** | The value that will be sent for the &#39;Content Type&#39; header.  | [optional] [default to null]
**secret_header** | **String** | The header to send the predefined secret in. This must be unique from existing headers or it won&#39;t be sent. You can use this as a form of authentication on the endpoint side. | [optional] [default to null]
**self_url** | **String** |  | [optional] [default to null]
**slug_perm** | **String** |  | [optional] [default to null]
**target_url** | **String** | The destination URL that webhook payloads will be POST&#39;ed to. | [default to null]
**templates** | [**Vec<::models::WebhookTemplate>**](WebhookTemplate.md) |  | [default to null]
**updated_at** | **String** |  | [optional] [default to null]
**updated_by** | **String** |  | [optional] [default to null]
**updated_by_url** | **String** |  | [optional] [default to null]
**verify_ssl** | **bool** | If enabled, SSL certificates is verified when webhooks are sent. It&#39;s recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


