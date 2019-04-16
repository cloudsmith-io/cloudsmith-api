# \OrgsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OrgsList**](OrgsApi.md#OrgsList) | **Get** /orgs/ | Get a list of all the organizations you are associated with.
[**OrgsRead**](OrgsApi.md#OrgsRead) | **Get** /orgs/{slug}/ | Views for working with organizations.


# **OrgsList**
> []Organization OrgsList($page, $pageSize)

Get a list of all the organizations you are associated with.

Get a list of all the organizations you are associated with.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 

### Return type

[**[]Organization**](Organization.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrgsRead**
> Organization OrgsRead($slug)

Views for working with organizations.

Views for working with organizations.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **string**|  | 

### Return type

[**Organization**](Organization.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

