# RepositoryWebhook


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | [optional] [readonly] 
**created_by** | **str** |  | [optional] [readonly] 
**created_by_url** | **str** |  | [optional] [readonly] 
**disable_reason** | **int** |  | [optional] [readonly] 
**disable_reason_str** | **str** |  | [optional] [readonly] 
**events** | **List[str]** |  | 
**identifier** | **int** | Deprecated (23-05-15): Please use &#39;slug_perm&#39; instead. Previously: A monotonically increasing number that identified a webhook request within a repository. | [optional] [readonly] 
**is_active** | **bool** | If enabled, the webhook will trigger on subscribed events and send payloads to the configured target URL. | [optional] 
**is_last_response_bad** | **bool** |  | [optional] [readonly] 
**last_response_status** | **int** |  | [optional] [readonly] 
**last_response_status_str** | **str** |  | [optional] [readonly] 
**num_sent** | **int** |  | [optional] [readonly] 
**package_query** | **str** | The package-based search query for webhooks to fire. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. If a package does not match, the webhook will not fire. | [optional] 
**request_body_format** | **int** | The format of the payloads for webhook requests. Valid options are: (0) JSON, (1) JSON array, (2) form encoded JSON and (3) Handlebars template. | [optional] 
**request_body_format_str** | **str** |  | [optional] [readonly] 
**request_body_template_format** | **int** | The format of the payloads for webhook requests. Valid options are: (0) Generic/user defined, (1) JSON and (2) XML. | [optional] 
**request_body_template_format_str** | **str** |  | [optional] [readonly] 
**request_content_type** | **str** | The value that will be sent for the &#39;Content Type&#39; header.  | [optional] 
**secret_header** | **str** | The header to send the predefined secret in. This must be unique from existing headers or it won&#39;t be sent. You can use this as a form of authentication on the endpoint side. | [optional] 
**self_url** | **str** |  | [optional] [readonly] 
**slug_perm** | **str** |  | [optional] [readonly] 
**target_url** | **str** | The destination URL that webhook payloads will be POST&#39;ed to. | 
**templates** | [**List[WebhookTemplate]**](WebhookTemplate.md) |  | 
**updated_at** | **datetime** |  | [optional] [readonly] 
**updated_by** | **str** |  | [optional] [readonly] 
**updated_by_url** | **str** |  | [optional] [readonly] 
**verify_ssl** | **bool** | If enabled, SSL certificates is verified when webhooks are sent. It&#39;s recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks. | [optional] 

## Example

```python
from cloudsmith_api.models.repository_webhook import RepositoryWebhook

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryWebhook from a JSON string
repository_webhook_instance = RepositoryWebhook.from_json(json)
# print the JSON string representation of the object
print(RepositoryWebhook.to_json())

# convert the object into a dict
repository_webhook_dict = repository_webhook_instance.to_dict()
# create an instance of RepositoryWebhook from a dict
repository_webhook_from_dict = RepositoryWebhook.from_dict(repository_webhook_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


