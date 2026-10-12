# Organization


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **str** |  | [optional] [readonly] 
**created_at** | **datetime** |  | [optional] [readonly] 
**location** | **str** | The city/town/area your organization is based in. | [optional] [readonly] 
**name** | **str** |  | 
**slug** | **str** |  | [optional] [readonly] 
**slug_perm** | **str** |  | [optional] [readonly] 
**tagline** | **str** | A short public descriptive for your organization. | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.organization import Organization

# TODO update the JSON string below
json = "{}"
# create an instance of Organization from a JSON string
organization_instance = Organization.from_json(json)
# print the JSON string representation of the object
print(Organization.to_json())

# convert the object into a dict
organization_dict = organization_instance.to_dict()
# create an instance of Organization from a dict
organization_from_dict = Organization.from_dict(organization_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


