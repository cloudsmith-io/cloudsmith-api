# Service


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | [optional] [readonly] 
**created_by** | **str** |  | [optional] [readonly] 
**created_by_url** | **str** |  | [optional] [readonly] 
**description** | **str** | The description of the service | [optional] 
**key** | **str** | The API key of the service | [optional] [readonly] 
**key_expires_at** | **datetime** | The time at which the API key will expire. This will only be populated if the Organization has an active API Key Policy. | [optional] [readonly] 
**name** | **str** | The name of the service | [optional] 
**role** | **str** | The role of the service. | [optional] 
**slug** | **str** | The slug of the service | [optional] [readonly] 
**teams** | [**List[ServiceTeams]**](ServiceTeams.md) |  | [optional] 

## Example

```python
from cloudsmith_api.models.service import Service

# TODO update the JSON string below
json = "{}"
# create an instance of Service from a JSON string
service_instance = Service.from_json(json)
# print the JSON string representation of the object
print(Service.to_json())

# convert the object into a dict
service_dict = service_instance.to_dict()
# create an instance of Service from a dict
service_from_dict = Service.from_dict(service_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


