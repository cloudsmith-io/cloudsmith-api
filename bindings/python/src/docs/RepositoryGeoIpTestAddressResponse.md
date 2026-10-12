# RepositoryGeoIpTestAddressResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | [**List[RepositoryGeoIpTestAddressResponseDict]**](RepositoryGeoIpTestAddressResponseDict.md) | The IP address test results ordered by allowed | [optional] 

## Example

```python
from cloudsmith_api.models.repository_geo_ip_test_address_response import RepositoryGeoIpTestAddressResponse

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryGeoIpTestAddressResponse from a JSON string
repository_geo_ip_test_address_response_instance = RepositoryGeoIpTestAddressResponse.from_json(json)
# print the JSON string representation of the object
print(RepositoryGeoIpTestAddressResponse.to_json())

# convert the object into a dict
repository_geo_ip_test_address_response_dict = repository_geo_ip_test_address_response_instance.to_dict()
# create an instance of RepositoryGeoIpTestAddressResponse from a dict
repository_geo_ip_test_address_response_from_dict = RepositoryGeoIpTestAddressResponse.from_dict(repository_geo_ip_test_address_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


