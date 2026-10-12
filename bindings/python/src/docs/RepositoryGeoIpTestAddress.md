# RepositoryGeoIpTestAddress


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | **List[str]** | The IP addresses to test against this repository | 

## Example

```python
from cloudsmith_api.models.repository_geo_ip_test_address import RepositoryGeoIpTestAddress

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryGeoIpTestAddress from a JSON string
repository_geo_ip_test_address_instance = RepositoryGeoIpTestAddress.from_json(json)
# print the JSON string representation of the object
print(RepositoryGeoIpTestAddress.to_json())

# convert the object into a dict
repository_geo_ip_test_address_dict = repository_geo_ip_test_address_instance.to_dict()
# create an instance of RepositoryGeoIpTestAddress from a dict
repository_geo_ip_test_address_from_dict = RepositoryGeoIpTestAddress.from_dict(repository_geo_ip_test_address_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


