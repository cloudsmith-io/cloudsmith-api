# RateCheck

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interval** | **f32** | The time in seconds that you are suggested to wait until the next request in order to avoid consuming too much within the rate limit window. | [optional] [default to null]
**limit** | **i32** | The maximum number of requests that you are permitted to send per hour | [optional] [default to null]
**remaining** | **i32** | The number of requests that are remaining in the current rate limit window | [optional] [default to null]
**reset** | **i32** | The UTC epoch timestamp at which the current rate limit window will reset | [optional] [default to null]
**reset_iso_8601** | **String** | The ISO 8601 datetime at which the current rate limit window will reset | [optional] [default to null]
**throttled** | **bool** | If true, throttling is currently being enforced. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


