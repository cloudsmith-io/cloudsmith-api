# RepositoryGeoIpCountryCode


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow** | **List[str]** | The allowed country codes for this repository | [optional] 
**deny** | **List[str]** | The denied country codes for this repository | [optional] 

## Example

```python
from cloudsmith_api.models.repository_geo_ip_country_code import RepositoryGeoIpCountryCode

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryGeoIpCountryCode from a JSON string
repository_geo_ip_country_code_instance = RepositoryGeoIpCountryCode.from_json(json)
# print the JSON string representation of the object
print(RepositoryGeoIpCountryCode.to_json())

# convert the object into a dict
repository_geo_ip_country_code_dict = repository_geo_ip_country_code_instance.to_dict()
# create an instance of RepositoryGeoIpCountryCode from a dict
repository_geo_ip_country_code_from_dict = RepositoryGeoIpCountryCode.from_dict(repository_geo_ip_country_code_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


