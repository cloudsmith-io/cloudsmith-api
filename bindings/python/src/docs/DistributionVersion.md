# DistributionVersion

A list of the versions for this distribution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The textual name for this version. | [optional] 
**slug** | **str** | The slug identifier for this version | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.distribution_version import DistributionVersion

# TODO update the JSON string below
json = "{}"
# create an instance of DistributionVersion from a JSON string
distribution_version_instance = DistributionVersion.from_json(json)
# print the JSON string representation of the object
print(DistributionVersion.to_json())

# convert the object into a dict
distribution_version_dict = distribution_version_instance.to_dict()
# create an instance of DistributionVersion from a dict
distribution_version_from_dict = DistributionVersion.from_dict(distribution_version_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


