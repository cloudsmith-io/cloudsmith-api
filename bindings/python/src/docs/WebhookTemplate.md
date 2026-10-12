# WebhookTemplate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**template** | **str** |  | [optional] 

## Example

```python
from cloudsmith_api.models.webhook_template import WebhookTemplate

# TODO update the JSON string below
json = "{}"
# create an instance of WebhookTemplate from a JSON string
webhook_template_instance = WebhookTemplate.from_json(json)
# print the JSON string representation of the object
print(WebhookTemplate.to_json())

# convert the object into a dict
webhook_template_dict = webhook_template_instance.to_dict()
# create an instance of WebhookTemplate from a dict
webhook_template_from_dict = WebhookTemplate.from_dict(webhook_template_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


