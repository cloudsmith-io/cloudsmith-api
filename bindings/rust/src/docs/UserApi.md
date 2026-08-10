# \UserApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_self**](UserApi.md#user_self) | **Get** /user/self/ | Provide a brief for the current user (if any).
[**user_token_create**](UserApi.md#user_token_create) | **Post** /user/token/ | Retrieve/Create API key/token for the authenticated user.


# **user_self**
> ::models::UserBrief user_self(ctx, ctx, )
Provide a brief for the current user (if any).

Provide a brief for the current user (if any).

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**::models::UserBrief**](UserBrief.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_token_create**
> ::models::UserAuthToken user_token_create(ctx, optional)
Retrieve/Create API key/token for the authenticated user.

Retrieve/Create API key/token for the authenticated user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**UserAuthTokenRequest**](UserAuthTokenRequest.md)|  | 

### Return type

[**::models::UserAuthToken**](UserAuthToken.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

