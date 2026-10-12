# RepositoryGeoIpRulesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cidr** | [**RepositoryGeoIpCidr**](RepositoryGeoIpCidr.md) |  | [optional] 
**country_code** | [**RepositoryGeoIpCountryCode**](RepositoryGeoIpCountryCode.md) |  | [optional] 

## Example

```python
from cloudsmith_api.models.repository_geo_ip_rules_request import RepositoryGeoIpRulesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryGeoIpRulesRequest from a JSON string
repository_geo_ip_rules_request_instance = RepositoryGeoIpRulesRequest.from_json(json)
# print the JSON string representation of the object
print(RepositoryGeoIpRulesRequest.to_json())

# convert the object into a dict
repository_geo_ip_rules_request_dict = repository_geo_ip_rules_request_instance.to_dict()
# create an instance of RepositoryGeoIpRulesRequest from a dict
repository_geo_ip_rules_request_from_dict = RepositoryGeoIpRulesRequest.from_dict(repository_geo_ip_rules_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


