# RepositoryGeoIpRules


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cidr** | [**RepositoryGeoIpCidr**](RepositoryGeoIpCidr.md) |  | 
**country_code** | [**RepositoryGeoIpCountryCode**](RepositoryGeoIpCountryCode.md) |  | 

## Example

```python
from cloudsmith_api.models.repository_geo_ip_rules import RepositoryGeoIpRules

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryGeoIpRules from a JSON string
repository_geo_ip_rules_instance = RepositoryGeoIpRules.from_json(json)
# print the JSON string representation of the object
print(RepositoryGeoIpRules.to_json())

# convert the object into a dict
repository_geo_ip_rules_dict = repository_geo_ip_rules_instance.to_dict()
# create an instance of RepositoryGeoIpRules from a dict
repository_geo_ip_rules_from_dict = RepositoryGeoIpRules.from_dict(repository_geo_ip_rules_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


