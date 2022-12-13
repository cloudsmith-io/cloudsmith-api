# CloudsmithApi::StatusApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**status_check_basic**](StatusApi.md#status_check_basic) | **GET** /status/check/basic/ | Endpoint to check basic API connectivity.


# **status_check_basic**
> StatusBasic status_check_basic

Endpoint to check basic API connectivity.

Endpoint to check basic API connectivity.

### Example
```ruby
# load the gem
require 'cloudsmith-api'

api_instance = CloudsmithApi::StatusApi.new

begin
  #Endpoint to check basic API connectivity.
  result = api_instance.status_check_basic
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling StatusApi->status_check_basic: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StatusBasic**](StatusBasic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



