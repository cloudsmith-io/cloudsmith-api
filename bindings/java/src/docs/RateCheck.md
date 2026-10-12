

# RateCheck


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**interval** | **BigDecimal** | The time in seconds that you are suggested to wait until the next request in order to avoid consuming too much within the rate limit window. |  [optional] [readonly] |
|**limit** | **java.math.BigInteger** | The maximum number of requests that you are permitted to send per hour |  [optional] [readonly] |
|**remaining** | **java.math.BigInteger** | The number of requests that are remaining in the current rate limit window |  [optional] [readonly] |
|**reset** | **java.math.BigInteger** | The UTC epoch timestamp at which the current rate limit window will reset |  [optional] [readonly] |
|**resetIso8601** | **String** | The ISO 8601 datetime at which the current rate limit window will reset |  [optional] [readonly] |
|**throttled** | **Boolean** | If true, throttling is currently being enforced. |  [optional] [readonly] |


## Implemented Interfaces

* Serializable


