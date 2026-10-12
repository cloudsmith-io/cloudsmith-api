# RateCheck


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interval** | **float** | The time in seconds that you are suggested to wait until the next request in order to avoid consuming too much within the rate limit window. | [optional] [readonly] 
**limit** | **int** | The maximum number of requests that you are permitted to send per hour | [optional] [readonly] 
**remaining** | **int** | The number of requests that are remaining in the current rate limit window | [optional] [readonly] 
**reset** | **int** | The UTC epoch timestamp at which the current rate limit window will reset | [optional] [readonly] 
**reset_iso_8601** | **str** | The ISO 8601 datetime at which the current rate limit window will reset | [optional] [readonly] 
**throttled** | **bool** | If true, throttling is currently being enforced. | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.rate_check import RateCheck

# TODO update the JSON string below
json = "{}"
# create an instance of RateCheck from a JSON string
rate_check_instance = RateCheck.from_json(json)
# print the JSON string representation of the object
print(RateCheck.to_json())

# convert the object into a dict
rate_check_dict = rate_check_instance.to_dict()
# create an instance of RateCheck from a dict
rate_check_from_dict = RateCheck.from_dict(rate_check_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


