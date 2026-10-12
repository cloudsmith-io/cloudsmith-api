# RepositoryGeoIpRulesRequestPatch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cidr** | [**RepositoryGeoIpCidr**](RepositoryGeoIpCidr.md) |  | [optional] 
**country_code** | [**RepositoryGeoIpCountryCode**](RepositoryGeoIpCountryCode.md) |  | [optional] 

## Example

```python
from cloudsmith_api.models.repository_geo_ip_rules_request_patch import RepositoryGeoIpRulesRequestPatch

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryGeoIpRulesRequestPatch from a JSON string
repository_geo_ip_rules_request_patch_instance = RepositoryGeoIpRulesRequestPatch.from_json(json)
# print the JSON string representation of the object
print(RepositoryGeoIpRulesRequestPatch.to_json())

# convert the object into a dict
repository_geo_ip_rules_request_patch_dict = repository_geo_ip_rules_request_patch_instance.to_dict()
# create an instance of RepositoryGeoIpRulesRequestPatch from a dict
repository_geo_ip_rules_request_patch_from_dict = RepositoryGeoIpRulesRequestPatch.from_dict(repository_geo_ip_rules_request_patch_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


