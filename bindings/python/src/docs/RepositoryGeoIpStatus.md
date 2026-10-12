# RepositoryGeoIpStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**geoip_enabled** | **bool** | If checked, any access to the website or downloads for this repository is allowed/denied according to the configured Geo/IP restriction rules. | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.repository_geo_ip_status import RepositoryGeoIpStatus

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryGeoIpStatus from a JSON string
repository_geo_ip_status_instance = RepositoryGeoIpStatus.from_json(json)
# print the JSON string representation of the object
print(RepositoryGeoIpStatus.to_json())

# convert the object into a dict
repository_geo_ip_status_dict = repository_geo_ip_status_instance.to_dict()
# create an instance of RepositoryGeoIpStatus from a dict
repository_geo_ip_status_from_dict = RepositoryGeoIpStatus.from_dict(repository_geo_ip_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


