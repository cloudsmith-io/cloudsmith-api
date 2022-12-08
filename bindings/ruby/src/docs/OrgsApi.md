# CloudsmithApi::OrgsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orgs_invites_create**](OrgsApi.md#orgs_invites_create) | **POST** /orgs/{org}/invites/ | Create an organization invite for a specific user
[**orgs_invites_delete**](OrgsApi.md#orgs_invites_delete) | **DELETE** /orgs/{org}/invites/{slug_perm}/ | Delete a specific organization invite
[**orgs_invites_extend**](OrgsApi.md#orgs_invites_extend) | **POST** /orgs/{org}/invites/{slug_perm}/extend/ | Extend an organization invite.
[**orgs_invites_list**](OrgsApi.md#orgs_invites_list) | **GET** /orgs/{org}/invites/ | Get a list of all invites for an organization.
[**orgs_invites_partial_update**](OrgsApi.md#orgs_invites_partial_update) | **PATCH** /orgs/{org}/invites/{slug_perm}/ | Update a specific organization invite.
[**orgs_invites_resend**](OrgsApi.md#orgs_invites_resend) | **POST** /orgs/{org}/invites/{slug_perm}/resend/ | Resend an organization invite.
[**orgs_list**](OrgsApi.md#orgs_list) | **GET** /orgs/ | Get a list of all the organizations you are associated with.
[**orgs_members_delete**](OrgsApi.md#orgs_members_delete) | **DELETE** /orgs/{org}/members/{member}/ | Removes a member from the organization.
[**orgs_members_list**](OrgsApi.md#orgs_members_list) | **GET** /orgs/{org}/members/ | Get the details for all organization members.
[**orgs_members_read**](OrgsApi.md#orgs_members_read) | **GET** /orgs/{org}/members/{member}/ | Get the details for a specific organization member.
[**orgs_members_remove**](OrgsApi.md#orgs_members_remove) | **GET** /orgs/{org}/members/{member}/remove/ | Removes a member from the organization (deprecated, use DELETE instead).
[**orgs_read**](OrgsApi.md#orgs_read) | **GET** /orgs/{org}/ | Get the details for the specific organization.
[**orgs_saml_group_sync_create**](OrgsApi.md#orgs_saml_group_sync_create) | **POST** /orgs/{org}/saml-group-sync/ | Create a new SAML Group Sync mapping within an organization.
[**orgs_saml_group_sync_delete**](OrgsApi.md#orgs_saml_group_sync_delete) | **DELETE** /orgs/{org}/saml-group-sync/{slug_perm}/ | Delete a SAML Group Sync mapping from an organization.
[**orgs_saml_group_sync_list**](OrgsApi.md#orgs_saml_group_sync_list) | **GET** /orgs/{org}/saml-group-sync/ | Get the details of all SAML Group Sync mapping within an organization.
[**orgs_services_create**](OrgsApi.md#orgs_services_create) | **POST** /orgs/{org}/services/ | Create a service within an organization.
[**orgs_services_delete**](OrgsApi.md#orgs_services_delete) | **DELETE** /orgs/{org}/services/{service}/ | Delete a specific service
[**orgs_services_list**](OrgsApi.md#orgs_services_list) | **GET** /orgs/{org}/services/ | Get a list of all services within an organization.
[**orgs_services_partial_update**](OrgsApi.md#orgs_services_partial_update) | **PATCH** /orgs/{org}/services/{service}/ | Update a service within an organization.
[**orgs_services_read**](OrgsApi.md#orgs_services_read) | **GET** /orgs/{org}/services/{service}/ | Retrieve details of a single service within an organization.
[**orgs_services_refresh**](OrgsApi.md#orgs_services_refresh) | **POST** /orgs/{org}/services/{service}/refresh/ | Refresh service API token.
[**orgs_teams_create**](OrgsApi.md#orgs_teams_create) | **POST** /orgs/{org}/teams/ | Create a team for this organization.
[**orgs_teams_delete**](OrgsApi.md#orgs_teams_delete) | **DELETE** /orgs/{org}/teams/{team}/ | Delete a specific team in a organization.
[**orgs_teams_list**](OrgsApi.md#orgs_teams_list) | **GET** /orgs/{org}/teams/ | Get the details of all teams within an organization.
[**orgs_teams_members_create**](OrgsApi.md#orgs_teams_members_create) | **POST** /orgs/{org}/teams/{team}/members | Add users to a team.
[**orgs_teams_members_list**](OrgsApi.md#orgs_teams_members_list) | **GET** /orgs/{org}/teams/{team}/members | List all members for the team.
[**orgs_teams_members_update**](OrgsApi.md#orgs_teams_members_update) | **PUT** /orgs/{org}/teams/{team}/members | Replace all team members.
[**orgs_teams_partial_update**](OrgsApi.md#orgs_teams_partial_update) | **PATCH** /orgs/{org}/teams/{team}/ | Update a specific team in a organization.
[**orgs_teams_read**](OrgsApi.md#orgs_teams_read) | **GET** /orgs/{org}/teams/{team}/ | Get the details of a specific team within an organization.


# **orgs_invites_create**
> OrganizationInviteResponse orgs_invites_create(org, opts)

Create an organization invite for a specific user

Create an organization invite for a specific user

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  data: CloudsmithApi::OrganizationInviteRequest.new # OrganizationInviteRequest | 
}

begin
  #Create an organization invite for a specific user
  result = api_instance.orgs_invites_create(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_invites_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**OrganizationInviteRequest**](OrganizationInviteRequest.md)|  | [optional] 

### Return type

[**OrganizationInviteResponse**](OrganizationInviteResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_invites_delete**
> orgs_invites_delete(org, slug_perm)

Delete a specific organization invite

Delete a specific organization invite

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a specific organization invite
  api_instance.orgs_invites_delete(org, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_invites_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_invites_extend**
> OrganizationInviteExtendResponse orgs_invites_extend(org, slug_perm)

Extend an organization invite.

Extend an organization invite.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 


begin
  #Extend an organization invite.
  result = api_instance.orgs_invites_extend(org, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_invites_extend: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**OrganizationInviteExtendResponse**](OrganizationInviteExtendResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_invites_list**
> Array&lt;OrganizationInviteResponse&gt; orgs_invites_list(org, opts)

Get a list of all invites for an organization.

Get a list of all invites for an organization.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Get a list of all invites for an organization.
  result = api_instance.orgs_invites_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_invites_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;OrganizationInviteResponse&gt;**](OrganizationInviteResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_invites_partial_update**
> OrganizationInviteResponse orgs_invites_partial_update(org, slug_perm, opts)

Update a specific organization invite.

Update a specific organization invite.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::OrganizationInviteUpdateRequestPatch.new # OrganizationInviteUpdateRequestPatch | 
}

begin
  #Update a specific organization invite.
  result = api_instance.orgs_invites_partial_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_invites_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**OrganizationInviteUpdateRequestPatch**](OrganizationInviteUpdateRequestPatch.md)|  | [optional] 

### Return type

[**OrganizationInviteResponse**](OrganizationInviteResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_invites_resend**
> OrganizationInviteExtendResponse orgs_invites_resend(org, slug_perm)

Resend an organization invite.

Resend an organization invite.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 


begin
  #Resend an organization invite.
  result = api_instance.orgs_invites_resend(org, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_invites_resend: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**OrganizationInviteExtendResponse**](OrganizationInviteExtendResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_list**
> Array&lt;OrganizationResponse&gt; orgs_list(opts)

Get a list of all the organizations you are associated with.

Get a list of all the organizations you are associated with.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Get a list of all the organizations you are associated with.
  result = api_instance.orgs_list(opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;OrganizationResponse&gt;**](OrganizationResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_members_delete**
> orgs_members_delete(org, member)

Removes a member from the organization.

Removes a member from the organization.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

member = 'member_example' # String | 


begin
  #Removes a member from the organization.
  api_instance.orgs_members_delete(org, member)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_members_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **member** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_members_list**
> Array&lt;OrganizationMembershipResponse&gt; orgs_members_list(org, opts)

Get the details for all organization members.

Get the details for all organization members.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Get the details for all organization members.
  result = api_instance.orgs_members_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_members_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;OrganizationMembershipResponse&gt;**](OrganizationMembershipResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_members_read**
> OrganizationMembershipResponse orgs_members_read(org, member)

Get the details for a specific organization member.

Get the details for a specific organization member.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

member = 'member_example' # String | 


begin
  #Get the details for a specific organization member.
  result = api_instance.orgs_members_read(org, member)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_members_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **member** | **String**|  | 

### Return type

[**OrganizationMembershipResponse**](OrganizationMembershipResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_members_remove**
> orgs_members_remove(org, member)

Removes a member from the organization (deprecated, use DELETE instead).

Removes a member from the organization (deprecated, use DELETE instead).

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

member = 'member_example' # String | 


begin
  #Removes a member from the organization (deprecated, use DELETE instead).
  api_instance.orgs_members_remove(org, member)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_members_remove: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **member** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_read**
> OrganizationResponse orgs_read(org)

Get the details for the specific organization.

Get the details for the specific organization.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 


begin
  #Get the details for the specific organization.
  result = api_instance.orgs_read(org)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 

### Return type

[**OrganizationResponse**](OrganizationResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_saml_group_sync_create**
> OrganizationGroupSyncResponse orgs_saml_group_sync_create(org, opts)

Create a new SAML Group Sync mapping within an organization.

Create a new SAML Group Sync mapping within an organization.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  data: CloudsmithApi::OrganizationGroupSyncRequest.new # OrganizationGroupSyncRequest | 
}

begin
  #Create a new SAML Group Sync mapping within an organization.
  result = api_instance.orgs_saml_group_sync_create(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_saml_group_sync_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**OrganizationGroupSyncRequest**](OrganizationGroupSyncRequest.md)|  | [optional] 

### Return type

[**OrganizationGroupSyncResponse**](OrganizationGroupSyncResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_saml_group_sync_delete**
> orgs_saml_group_sync_delete(org, slug_perm)

Delete a SAML Group Sync mapping from an organization.

Delete a SAML Group Sync mapping from an organization.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a SAML Group Sync mapping from an organization.
  api_instance.orgs_saml_group_sync_delete(org, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_saml_group_sync_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_saml_group_sync_list**
> Array&lt;OrganizationGroupSyncResponse&gt; orgs_saml_group_sync_list(org, opts)

Get the details of all SAML Group Sync mapping within an organization.

Get the details of all SAML Group Sync mapping within an organization.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Get the details of all SAML Group Sync mapping within an organization.
  result = api_instance.orgs_saml_group_sync_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_saml_group_sync_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;OrganizationGroupSyncResponse&gt;**](OrganizationGroupSyncResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_services_create**
> ServiceResponse orgs_services_create(org, opts)

Create a service within an organization.

Create a service within an organization.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  data: CloudsmithApi::ServiceRequest.new # ServiceRequest | 
}

begin
  #Create a service within an organization.
  result = api_instance.orgs_services_create(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_services_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**ServiceRequest**](ServiceRequest.md)|  | [optional] 

### Return type

[**ServiceResponse**](ServiceResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_services_delete**
> orgs_services_delete(org, service)

Delete a specific service

Delete a specific service

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

service = 'service_example' # String | 


begin
  #Delete a specific service
  api_instance.orgs_services_delete(org, service)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_services_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **service** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_services_list**
> Array&lt;ServiceResponse&gt; orgs_services_list(org, opts)

Get a list of all services within an organization.

Get a list of all services within an organization.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Get a list of all services within an organization.
  result = api_instance.orgs_services_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_services_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;ServiceResponse&gt;**](ServiceResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_services_partial_update**
> ServiceResponse orgs_services_partial_update(org, service, opts)

Update a service within an organization.

Update a service within an organization.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

service = 'service_example' # String | 

opts = { 
  data: CloudsmithApi::ServiceRequestPatch.new # ServiceRequestPatch | 
}

begin
  #Update a service within an organization.
  result = api_instance.orgs_services_partial_update(org, service, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_services_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **service** | **String**|  | 
 **data** | [**ServiceRequestPatch**](ServiceRequestPatch.md)|  | [optional] 

### Return type

[**ServiceResponse**](ServiceResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_services_read**
> ServiceResponse orgs_services_read(org, service)

Retrieve details of a single service within an organization.

Retrieve details of a single service within an organization.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

service = 'service_example' # String | 


begin
  #Retrieve details of a single service within an organization.
  result = api_instance.orgs_services_read(org, service)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_services_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **service** | **String**|  | 

### Return type

[**ServiceResponse**](ServiceResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_services_refresh**
> ServiceResponse orgs_services_refresh(org, service)

Refresh service API token.

Refresh service API token.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

service = 'service_example' # String | 


begin
  #Refresh service API token.
  result = api_instance.orgs_services_refresh(org, service)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_services_refresh: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **service** | **String**|  | 

### Return type

[**ServiceResponse**](ServiceResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_teams_create**
> OrganizationTeamResponse orgs_teams_create(org, opts)

Create a team for this organization.

Create a team for this organization.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  data: CloudsmithApi::OrganizationTeamRequest.new # OrganizationTeamRequest | 
}

begin
  #Create a team for this organization.
  result = api_instance.orgs_teams_create(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_teams_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**OrganizationTeamRequest**](OrganizationTeamRequest.md)|  | [optional] 

### Return type

[**OrganizationTeamResponse**](OrganizationTeamResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_teams_delete**
> orgs_teams_delete(org, team)

Delete a specific team in a organization.

Delete a specific team in a organization.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

team = 'team_example' # String | 


begin
  #Delete a specific team in a organization.
  api_instance.orgs_teams_delete(org, team)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_teams_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **team** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_teams_list**
> Array&lt;OrganizationTeamResponse&gt; orgs_teams_list(org, opts)

Get the details of all teams within an organization.

Get the details of all teams within an organization.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Get the details of all teams within an organization.
  result = api_instance.orgs_teams_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_teams_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;OrganizationTeamResponse&gt;**](OrganizationTeamResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_teams_members_create**
> OrganizationTeamMembersResponse orgs_teams_members_create(org, team, opts)

Add users to a team.

Add users to a team.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

team = 'team_example' # String | 

opts = { 
  data: CloudsmithApi::OrganizationTeamMembers.new # OrganizationTeamMembers | 
}

begin
  #Add users to a team.
  result = api_instance.orgs_teams_members_create(org, team, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_teams_members_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **team** | **String**|  | 
 **data** | [**OrganizationTeamMembers**](OrganizationTeamMembers.md)|  | [optional] 

### Return type

[**OrganizationTeamMembersResponse**](OrganizationTeamMembersResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_teams_members_list**
> OrganizationTeamMembersResponse orgs_teams_members_list(org, team)

List all members for the team.

List all members for the team.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

team = 'team_example' # String | 


begin
  #List all members for the team.
  result = api_instance.orgs_teams_members_list(org, team)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_teams_members_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **team** | **String**|  | 

### Return type

[**OrganizationTeamMembersResponse**](OrganizationTeamMembersResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_teams_members_update**
> OrganizationTeamMembersResponse orgs_teams_members_update(org, team)

Replace all team members.

Replace all team members.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

team = 'team_example' # String | 


begin
  #Replace all team members.
  result = api_instance.orgs_teams_members_update(org, team)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_teams_members_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **team** | **String**|  | 

### Return type

[**OrganizationTeamMembersResponse**](OrganizationTeamMembersResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_teams_partial_update**
> OrganizationTeamResponse orgs_teams_partial_update(org, team, opts)

Update a specific team in a organization.

Update a specific team in a organization.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

team = 'team_example' # String | 

opts = { 
  data: CloudsmithApi::OrganizationTeamRequestPatch.new # OrganizationTeamRequestPatch | 
}

begin
  #Update a specific team in a organization.
  result = api_instance.orgs_teams_partial_update(org, team, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_teams_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **team** | **String**|  | 
 **data** | [**OrganizationTeamRequestPatch**](OrganizationTeamRequestPatch.md)|  | [optional] 

### Return type

[**OrganizationTeamResponse**](OrganizationTeamResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_teams_read**
> OrganizationTeamResponse orgs_teams_read(org, team)

Get the details of a specific team within an organization.

Get the details of a specific team within an organization.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

team = 'team_example' # String | 


begin
  #Get the details of a specific team within an organization.
  result = api_instance.orgs_teams_read(org, team)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_teams_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **team** | **String**|  | 

### Return type

[**OrganizationTeamResponse**](OrganizationTeamResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



