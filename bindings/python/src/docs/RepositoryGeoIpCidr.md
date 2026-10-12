# RepositoryGeoIpCidr


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow** | **List[str]** | The allowed CIDRs for this repository | [optional] 
**deny** | **List[str]** | The denied CIDRs for this repository | [optional] 

## Example

```python
from cloudsmith_api.models.repository_geo_ip_cidr import RepositoryGeoIpCidr

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryGeoIpCidr from a JSON string
repository_geo_ip_cidr_instance = RepositoryGeoIpCidr.from_json(json)
# print the JSON string representation of the object
print(RepositoryGeoIpCidr.to_json())

# convert the object into a dict
repository_geo_ip_cidr_dict = repository_geo_ip_cidr_instance.to_dict()
# create an instance of RepositoryGeoIpCidr from a dict
repository_geo_ip_cidr_from_dict = RepositoryGeoIpCidr.from_dict(repository_geo_ip_cidr_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


