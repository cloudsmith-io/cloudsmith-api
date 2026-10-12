# ServiceRequestPatch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | The description of the service | [optional] 
**name** | **str** | The name of the service | [optional] 
**role** | **str** | The role of the service. | [optional] 
**teams** | [**List[ServiceTeams]**](ServiceTeams.md) |  | [optional] 

## Example

```python
from cloudsmith_api.models.service_request_patch import ServiceRequestPatch

# TODO update the JSON string below
json = "{}"
# create an instance of ServiceRequestPatch from a JSON string
service_request_patch_instance = ServiceRequestPatch.from_json(json)
# print the JSON string representation of the object
print(ServiceRequestPatch.to_json())

# convert the object into a dict
service_request_patch_dict = service_request_patch_instance.to_dict()
# create an instance of ServiceRequestPatch from a dict
service_request_patch_from_dict = ServiceRequestPatch.from_dict(service_request_patch_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


