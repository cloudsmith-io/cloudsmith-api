# ServiceTeams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the team | [optional] [readonly] 
**role** | **str** | The team role associated with the service | [optional] 
**slug** | **str** | The teams associated with the service | [optional] 

## Example

```python
from cloudsmith_api.models.service_teams import ServiceTeams

# TODO update the JSON string below
json = "{}"
# create an instance of ServiceTeams from a JSON string
service_teams_instance = ServiceTeams.from_json(json)
# print the JSON string representation of the object
print(ServiceTeams.to_json())

# convert the object into a dict
service_teams_dict = service_teams_instance.to_dict()
# create an instance of ServiceTeams from a dict
service_teams_from_dict = ServiceTeams.from_dict(service_teams_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


