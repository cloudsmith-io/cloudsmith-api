# DistributionFull


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | **str** |  | [optional] [readonly] 
**format_url** | **str** |  | [optional] [readonly] 
**name** | **str** |  | 
**self_url** | **str** |  | [optional] [readonly] 
**slug** | **str** | The slug identifier for this distribution | [optional] [readonly] 
**variants** | **str** |  | [optional] 
**versions** | [**List[DistributionVersion]**](DistributionVersion.md) | A list of the versions for this distribution | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.distribution_full import DistributionFull

# TODO update the JSON string below
json = "{}"
# create an instance of DistributionFull from a JSON string
distribution_full_instance = DistributionFull.from_json(json)
# print the JSON string representation of the object
print(DistributionFull.to_json())

# convert the object into a dict
distribution_full_dict = distribution_full_instance.to_dict()
# create an instance of DistributionFull from a dict
distribution_full_from_dict = DistributionFull.from_dict(distribution_full_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


