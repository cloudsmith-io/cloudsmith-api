# ServiceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | The description of the service | [optional] 
**name** | **str** | The name of the service | [optional] 
**role** | **str** | The role of the service. | [optional] 
**teams** | [**List[ServiceTeams]**](ServiceTeams.md) |  | [optional] 

## Example

```python
from cloudsmith_api.models.service_request import ServiceRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ServiceRequest from a JSON string
service_request_instance = ServiceRequest.from_json(json)
# print the JSON string representation of the object
print(ServiceRequest.to_json())

# convert the object into a dict
service_request_dict = service_request_instance.to_dict()
# create an instance of ServiceRequest from a dict
service_request_from_dict = ServiceRequest.from_dict(service_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


