# RateCheck

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interval** | **float** | The time in seconds that you are suggested to wait until the next request in order to avoid consuming too much within the rate limit window. | [optional] 
**limit** | **int** | The maximum number of requests that you are permitted to send per hour | [optional] 
**remaining** | **int** | The number of requests that are remaining in the current rate limit window | [optional] 
**reset** | **int** | The UTC epoch timestamp at which the current rate limit window will reset | [optional] 
**reset_iso_8601** | **str** | The ISO 8601 datetime at which the current rate limit window will reset | [optional] 
**throttled** | **bool** | If true, throttling is currently being enforced. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


