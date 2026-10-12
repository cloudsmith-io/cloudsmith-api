# RepositoryGeoIpTestAddressResponseDict


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowed** | **bool** | The result of the IP test | 
**country_code** | **str** | The country code of the tested IP address | 
**ip_address** | **str** | The IP address that was tested | 
**reason** | **str** | The reason for the result | 

## Example

```python
from cloudsmith_api.models.repository_geo_ip_test_address_response_dict import RepositoryGeoIpTestAddressResponseDict

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryGeoIpTestAddressResponseDict from a JSON string
repository_geo_ip_test_address_response_dict_instance = RepositoryGeoIpTestAddressResponseDict.from_json(json)
# print the JSON string representation of the object
print(RepositoryGeoIpTestAddressResponseDict.to_json())

# convert the object into a dict
repository_geo_ip_test_address_response_dict_dict = repository_geo_ip_test_address_response_dict_instance.to_dict()
# create an instance of RepositoryGeoIpTestAddressResponseDict from a dict
repository_geo_ip_test_address_response_dict_from_dict = RepositoryGeoIpTestAddressResponseDict.from_dict(repository_geo_ip_test_address_response_dict_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


