
# RateCheck

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interval** | [**BigDecimal**](BigDecimal.md) | The time in seconds that you are suggested to wait until the next request in order to avoid consuming too much within the rate limit window. |  [optional]
**limit** | **java.math.BigInteger** | The maximum number of requests that you are permitted to send per hour |  [optional]
**remaining** | **java.math.BigInteger** | The number of requests that are remaining in the current rate limit window |  [optional]
**reset** | **java.math.BigInteger** | The UTC epoch timestamp at which the current rate limit window will reset |  [optional]
**resetIso8601** | **String** | The ISO 8601 datetime at which the current rate limit window will reset |  [optional]
**throttled** | **Boolean** | If true, throttling is currently being enforced. |  [optional]



