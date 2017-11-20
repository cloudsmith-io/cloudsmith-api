# \UserApi

All URIs are relative to *https://api-prd.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserSelf**](UserApi.md#UserSelf) | **Get** /user/self/ | Provide a brief for the current user (if any).
[**UserTokenCreate**](UserApi.md#UserTokenCreate) | **Post** /user/token/ | Retrieve the API key/token for the authenticated user.


# **UserSelf**
> UserBrief UserSelf()

Provide a brief for the current user (if any).

Provide a brief for the current user (if any).


### Parameters
This endpoint does not need any parameter.

### Return type

[**UserBrief**](UserBrief.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserTokenCreate**
> UserAuthToken UserTokenCreate($data)

Retrieve the API key/token for the authenticated user.

Retrieve the API key/token for the authenticated user.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**UserTokenCreate**](UserTokenCreate.md)|  | [optional] 

### Return type

[**UserAuthToken**](UserAuthToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

