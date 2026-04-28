# \QuotaApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**quota_history_read**](QuotaApi.md#quota_history_read) | **Get** /quota/history/{owner}/ | Quota history for a given namespace.
[**quota_oss_history_read**](QuotaApi.md#quota_oss_history_read) | **Get** /quota/oss/history/{owner}/ | Open-source Quota history for a given namespace.
[**quota_oss_read**](QuotaApi.md#quota_oss_read) | **Get** /quota/oss/{owner}/ | Open-source Quota usage for a given namespace.
[**quota_read**](QuotaApi.md#quota_read) | **Get** /quota/{owner}/ | Quota usage for a given namespace.


# **quota_history_read**
> ::models::QuotaHistory quota_history_read(ctx, ctx, owner)
Quota history for a given namespace.

Quota history for a given namespace.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 

### Return type

[**::models::QuotaHistory**](QuotaHistory.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **quota_oss_history_read**
> ::models::QuotaHistory quota_oss_history_read(ctx, ctx, owner)
Open-source Quota history for a given namespace.

Open-source Quota history for a given namespace.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 

### Return type

[**::models::QuotaHistory**](QuotaHistory.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **quota_oss_read**
> ::models::Quota quota_oss_read(ctx, ctx, owner)
Open-source Quota usage for a given namespace.

Open-source Quota usage for a given namespace.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 

### Return type

[**::models::Quota**](Quota.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **quota_read**
> ::models::Quota quota_read(ctx, ctx, owner)
Quota usage for a given namespace.

Quota usage for a given namespace.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 

### Return type

[**::models::Quota**](Quota.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

