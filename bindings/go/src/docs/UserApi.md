# \UserApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserSelf**](UserApi.md#UserSelf) | **Get** /user/self/ | Provide a brief for the current user (if any).
[**UserTokenCreate**](UserApi.md#UserTokenCreate) | **Post** /user/token/ | Retrieve the API key/token for the authenticated user.


# **UserSelf**
> UserBrief UserSelf(ctx, )
Provide a brief for the current user (if any).

Provide a brief for the current user (if any).

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**UserBrief**](UserBrief.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserTokenCreate**
> UserAuthToken UserTokenCreate(ctx, optional)
Retrieve the API key/token for the authenticated user.

Retrieve the API key/token for the authenticated user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserApiUserTokenCreateOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserTokenCreateOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**optional.Interface of UserTokenCreate**](UserTokenCreate.md)|  | 

### Return type

[**UserAuthToken**](UserAuthToken.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

