# CloudsmithApi::OrgsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orgs_invites_create**](OrgsApi.md#orgs_invites_create) | **POST** /orgs/{org}/invites/ | Create an organization invite for a specific user
[**orgs_invites_delete**](OrgsApi.md#orgs_invites_delete) | **DELETE** /orgs/{org}/invites/{slug_perm}/ | Delete a specific organization invite
[**orgs_invites_extend**](OrgsApi.md#orgs_invites_extend) | **POST** /orgs/{org}/invites/{slug_perm}/extend/ | Extend an organization invite.
[**orgs_invites_list**](OrgsApi.md#orgs_invites_list) | **GET** /orgs/{org}/invites/ | Get a list of all invites for an organization.
[**orgs_list**](OrgsApi.md#orgs_list) | **GET** /orgs/ | Get a list of all the organizations you are associated with.
[**orgs_members_list**](OrgsApi.md#orgs_members_list) | **GET** /orgs/{org}/members/ | Get the details for all organization members.
[**orgs_members_read**](OrgsApi.md#orgs_members_read) | **GET** /orgs/{org}/members/{member}/ | Get the details for a specific organization member.
[**orgs_members_remove**](OrgsApi.md#orgs_members_remove) | **GET** /orgs/{org}/members/{member}/remove/ | Removes a member from the organization.
[**orgs_read**](OrgsApi.md#orgs_read) | **GET** /orgs/{org}/ | Get the details for the specific organization.
[**orgs_saml_group_sync_create**](OrgsApi.md#orgs_saml_group_sync_create) | **POST** /orgs/{org}/saml-group-sync/ | Create a new SAML Group Sync mapping within an organization.
[**orgs_saml_group_sync_delete**](OrgsApi.md#orgs_saml_group_sync_delete) | **DELETE** /orgs/{org}/saml-group-sync/{slug_perm}/ | Delete a SAML Group Sync mapping from an organization.
[**orgs_saml_group_sync_list**](OrgsApi.md#orgs_saml_group_sync_list) | **GET** /orgs/{org}/saml-group-sync/ | Get the details of all SAML Group Sync mapping within an organization.
[**orgs_teams_create**](OrgsApi.md#orgs_teams_create) | **POST** /orgs/{org}/teams/ | Create a team for this organization.
[**orgs_teams_delete**](OrgsApi.md#orgs_teams_delete) | **DELETE** /orgs/{org}/teams/{slug_perm}/ | Delete a specific team in a organization.
[**orgs_teams_list**](OrgsApi.md#orgs_teams_list) | **GET** /orgs/{org}/teams/ | Get the details of all teams within an organization.
[**orgs_teams_partial_update**](OrgsApi.md#orgs_teams_partial_update) | **PATCH** /orgs/{org}/teams/{slug_perm}/ | Update a specific team in a organization.
[**orgs_teams_read**](OrgsApi.md#orgs_teams_read) | **GET** /orgs/{org}/teams/{slug_perm}/ | Viewset for working with Organization teams.


# **orgs_invites_create**
> OrganizationInvite orgs_invites_create(org, opts)

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
  data: CloudsmithApi::OrgsInvitesCreate.new # OrgsInvitesCreate | 
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
 **data** | [**OrgsInvitesCreate**](OrgsInvitesCreate.md)|  | [optional] 

### Return type

[**OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **orgs_invites_extend**
> OrganizationInvite orgs_invites_extend(org, slug_perm, opts)

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

opts = { 
  data: CloudsmithApi::OrgsInvitesExtend.new # OrgsInvitesExtend | 
}

begin
  #Extend an organization invite.
  result = api_instance.orgs_invites_extend(org, slug_perm, opts)
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
 **data** | [**OrgsInvitesExtend**](OrgsInvitesExtend.md)|  | [optional] 

### Return type

[**OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **orgs_invites_list**
> Array&lt;OrganizationInvite&gt; orgs_invites_list(org, opts)

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

[**Array&lt;OrganizationInvite&gt;**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **orgs_list**
> Array&lt;Organization&gt; orgs_list(opts)

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

[**Array&lt;Organization&gt;**](Organization.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **orgs_members_list**
> Array&lt;OrganizationMembership&gt; orgs_members_list(org, opts)

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

[**Array&lt;OrganizationMembership&gt;**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **orgs_members_read**
> OrganizationMembership orgs_members_read(org, member)

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

[**OrganizationMembership**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **orgs_members_remove**
> OrganizationMembership orgs_members_remove(org, member)

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
  result = api_instance.orgs_members_remove(org, member)
  p result
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

[**OrganizationMembership**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **orgs_read**
> Organization orgs_read(org)

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

[**Organization**](Organization.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **orgs_saml_group_sync_create**
> OrganizationGroupSync orgs_saml_group_sync_create(org, opts)

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
  data: CloudsmithApi::OrgsSamlgroupsyncCreate.new # OrgsSamlgroupsyncCreate | 
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
 **data** | [**OrgsSamlgroupsyncCreate**](OrgsSamlgroupsyncCreate.md)|  | [optional] 

### Return type

[**OrganizationGroupSync**](OrganizationGroupSync.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **orgs_saml_group_sync_list**
> Array&lt;OrganizationGroupSync&gt; orgs_saml_group_sync_list(org, opts)

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

[**Array&lt;OrganizationGroupSync&gt;**](OrganizationGroupSync.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **orgs_teams_create**
> OrganizationTeam orgs_teams_create(org, opts)

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
  data: CloudsmithApi::OrgsTeamsCreate.new # OrgsTeamsCreate | 
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
 **data** | [**OrgsTeamsCreate**](OrgsTeamsCreate.md)|  | [optional] 

### Return type

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **orgs_teams_delete**
> orgs_teams_delete(org, slug_perm)

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a specific team in a organization.
  api_instance.orgs_teams_delete(org, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_teams_delete: #{e}"
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

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **orgs_teams_list**
> Array&lt;OrganizationTeam&gt; orgs_teams_list(org, opts)

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

[**Array&lt;OrganizationTeam&gt;**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **orgs_teams_partial_update**
> OrganizationTeam orgs_teams_partial_update(org, slug_perm, opts)

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::OrgsTeamsPartialUpdate.new # OrgsTeamsPartialUpdate | 
}

begin
  #Update a specific team in a organization.
  result = api_instance.orgs_teams_partial_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_teams_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**OrgsTeamsPartialUpdate**](OrgsTeamsPartialUpdate.md)|  | [optional] 

### Return type

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **orgs_teams_read**
> OrganizationTeam orgs_teams_read(org, slug_perm)

Viewset for working with Organization teams.

Viewset for working with Organization teams.

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
  #Viewset for working with Organization teams.
  result = api_instance.orgs_teams_read(org, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_teams_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



