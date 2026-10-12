# GeoIpLocation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **str** |  | 
**continent** | **str** |  | 
**country** | **str** |  | 
**country_code** | **str** |  | [optional] [readonly] 
**latitude** | **decimal.Decimal** |  | [optional] 
**longitude** | **decimal.Decimal** |  | [optional] 
**postal_code** | **str** |  | 

## Example

```python
from cloudsmith_api.models.geo_ip_location import GeoIpLocation

# TODO update the JSON string below
json = "{}"
# create an instance of GeoIpLocation from a JSON string
geo_ip_location_instance = GeoIpLocation.from_json(json)
# print the JSON string representation of the object
print(GeoIpLocation.to_json())

# convert the object into a dict
geo_ip_location_dict = geo_ip_location_instance.to_dict()
# create an instance of GeoIpLocation from a dict
geo_ip_location_from_dict = GeoIpLocation.from_dict(geo_ip_location_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


