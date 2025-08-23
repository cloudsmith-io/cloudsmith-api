# \UsersApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**users_profile_read**](UsersApi.md#users_profile_read) | **Get** /users/profile/{slug}/ | Provide a brief for the specified user (if any).


# **users_profile_read**
> ::models::UserProfile users_profile_read(ctx, ctx, slug)
Provide a brief for the specified user (if any).

Provide a brief for the specified user (if any).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **slug** | **String**|  | 

### Return type

[**::models::UserProfile**](UserProfile.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

