# \NamespacesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**NamespacesList**](NamespacesApi.md#NamespacesList) | **Get** /namespaces/ | Get a list of all namespaces the user belongs to.
[**NamespacesRead**](NamespacesApi.md#NamespacesRead) | **Get** /namespaces/{slug}/ | Views for working with namespaces.


# **NamespacesList**
> []Namespace NamespacesList(ctx, optional)
Get a list of all namespaces the user belongs to.

Get a list of all namespaces the user belongs to.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***NamespacesApiNamespacesListOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a NamespacesApiNamespacesListOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **optional.Int32**| A page number within the paginated result set. | 
 **pageSize** | **optional.Int32**| Number of results to return per page. | 

### Return type

[**[]Namespace**](Namespace.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **NamespacesRead**
> Namespace NamespacesRead(ctx, slug)
Views for working with namespaces.

Views for working with namespaces.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **slug** | **string**|  | 

### Return type

[**Namespace**](Namespace.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

