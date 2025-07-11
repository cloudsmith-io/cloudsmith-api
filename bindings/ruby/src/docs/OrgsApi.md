# CloudsmithApi::OrgsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orgs_delete**](OrgsApi.md#orgs_delete) | **DELETE** /orgs/{org}/ | Delete the specified organization.
[**orgs_deny_policy_create**](OrgsApi.md#orgs_deny_policy_create) | **POST** /orgs/{org}/deny-policy/ | Create a package deny policy.
[**orgs_deny_policy_delete**](OrgsApi.md#orgs_deny_policy_delete) | **DELETE** /orgs/{org}/deny-policy/{slug_perm}/ | Delete a package deny policy.
[**orgs_deny_policy_list**](OrgsApi.md#orgs_deny_policy_list) | **GET** /orgs/{org}/deny-policy/ | Get a list of all package deny policies.
[**orgs_deny_policy_partial_update**](OrgsApi.md#orgs_deny_policy_partial_update) | **PATCH** /orgs/{org}/deny-policy/{slug_perm}/ | Partially update a package deny policy.
[**orgs_deny_policy_read**](OrgsApi.md#orgs_deny_policy_read) | **GET** /orgs/{org}/deny-policy/{slug_perm}/ | Get a package deny policy.
[**orgs_deny_policy_update**](OrgsApi.md#orgs_deny_policy_update) | **PUT** /orgs/{org}/deny-policy/{slug_perm}/ | Update a package deny policy.
[**orgs_invites_create**](OrgsApi.md#orgs_invites_create) | **POST** /orgs/{org}/invites/ | Create an organization invite for a specific user
[**orgs_invites_delete**](OrgsApi.md#orgs_invites_delete) | **DELETE** /orgs/{org}/invites/{slug_perm}/ | Delete a specific organization invite
[**orgs_invites_extend**](OrgsApi.md#orgs_invites_extend) | **POST** /orgs/{org}/invites/{slug_perm}/extend/ | Extend an organization invite.
[**orgs_invites_list**](OrgsApi.md#orgs_invites_list) | **GET** /orgs/{org}/invites/ | Get a list of all invites for an organization.
[**orgs_invites_partial_update**](OrgsApi.md#orgs_invites_partial_update) | **PATCH** /orgs/{org}/invites/{slug_perm}/ | Update a specific organization invite.
[**orgs_invites_resend**](OrgsApi.md#orgs_invites_resend) | **POST** /orgs/{org}/invites/{slug_perm}/resend/ | Resend an organization invite.
[**orgs_license_policy_create**](OrgsApi.md#orgs_license_policy_create) | **POST** /orgs/{org}/license-policy/ | Create a package license policy.
[**orgs_license_policy_delete**](OrgsApi.md#orgs_license_policy_delete) | **DELETE** /orgs/{org}/license-policy/{slug_perm}/ | Delete a package license policy.
[**orgs_license_policy_evaluation_create**](OrgsApi.md#orgs_license_policy_evaluation_create) | **POST** /orgs/{org}/license-policy/{policy_slug_perm}/evaluation/ | Create an evaluation request for this policy.
[**orgs_license_policy_evaluation_list**](OrgsApi.md#orgs_license_policy_evaluation_list) | **GET** /orgs/{org}/license-policy/{policy_slug_perm}/evaluation/ | List evaluation requests for this policy.
[**orgs_license_policy_evaluation_read**](OrgsApi.md#orgs_license_policy_evaluation_read) | **GET** /orgs/{org}/license-policy/{policy_slug_perm}/evaluation/{slug_perm}/ | Retrieve an evaluation request for this policy.
[**orgs_license_policy_list**](OrgsApi.md#orgs_license_policy_list) | **GET** /orgs/{org}/license-policy/ | Get a list of all package license policies.
[**orgs_license_policy_partial_update**](OrgsApi.md#orgs_license_policy_partial_update) | **PATCH** /orgs/{org}/license-policy/{slug_perm}/ | Partially update a package license policy.
[**orgs_license_policy_read**](OrgsApi.md#orgs_license_policy_read) | **GET** /orgs/{org}/license-policy/{slug_perm}/ | Get a package license policy.
[**orgs_license_policy_update**](OrgsApi.md#orgs_license_policy_update) | **PUT** /orgs/{org}/license-policy/{slug_perm}/ | Update a package license policy.
[**orgs_license_policy_violation_list**](OrgsApi.md#orgs_license_policy_violation_list) | **GET** /orgs/{org}/license-policy-violation/ | List all current license policy violations for this Organization.
[**orgs_list**](OrgsApi.md#orgs_list) | **GET** /orgs/ | Get a list of all the organizations you are associated with.
[**orgs_members_delete**](OrgsApi.md#orgs_members_delete) | **DELETE** /orgs/{org}/members/{member}/ | Removes a member from the organization.
[**orgs_members_list**](OrgsApi.md#orgs_members_list) | **GET** /orgs/{org}/members/ | Get the details for all organization members.
[**orgs_members_partial_update**](OrgsApi.md#orgs_members_partial_update) | **PATCH** /orgs/{org}/members/{member}/ | Views for working with organization members.
[**orgs_members_read**](OrgsApi.md#orgs_members_read) | **GET** /orgs/{org}/members/{member}/ | Get the details for a specific organization member.
[**orgs_members_refresh**](OrgsApi.md#orgs_members_refresh) | **POST** /orgs/{org}/members/{member}/refresh/ | Refresh a member of the organization&#39;s API key.
[**orgs_members_remove**](OrgsApi.md#orgs_members_remove) | **GET** /orgs/{org}/members/{member}/remove/ | Removes a member from the organization (deprecated, use DELETE instead).
[**orgs_members_update_role**](OrgsApi.md#orgs_members_update_role) | **PATCH** /orgs/{org}/members/{member}/update-role/ | Update a member&#39;s role in the organization.
[**orgs_members_update_visibility**](OrgsApi.md#orgs_members_update_visibility) | **PATCH** /orgs/{org}/members/{member}/update-visibility/ | Update a member&#39;s visibility in the organization.
[**orgs_openid_connect_create**](OrgsApi.md#orgs_openid_connect_create) | **POST** /orgs/{org}/openid-connect/ | Create the OpenID Connect provider settings for the org.
[**orgs_openid_connect_delete**](OrgsApi.md#orgs_openid_connect_delete) | **DELETE** /orgs/{org}/openid-connect/{slug_perm}/ | Delete a specific OpenID Connect provider setting for the org.
[**orgs_openid_connect_list**](OrgsApi.md#orgs_openid_connect_list) | **GET** /orgs/{org}/openid-connect/ | Retrieve the list of OpenID Connect provider settings for the org.
[**orgs_openid_connect_partial_update**](OrgsApi.md#orgs_openid_connect_partial_update) | **PATCH** /orgs/{org}/openid-connect/{slug_perm}/ | Update a specific OpenID Connect provider setting for the org.
[**orgs_openid_connect_read**](OrgsApi.md#orgs_openid_connect_read) | **GET** /orgs/{org}/openid-connect/{slug_perm}/ | Retrieve a specific OpenID Connect provider setting for the org.
[**orgs_openid_connect_update**](OrgsApi.md#orgs_openid_connect_update) | **PUT** /orgs/{org}/openid-connect/{slug_perm}/ | Update a specific OpenID Connect provider setting for the org.
[**orgs_read**](OrgsApi.md#orgs_read) | **GET** /orgs/{org}/ | Get the details for the specific organization.
[**orgs_saml_authentication_partial_update**](OrgsApi.md#orgs_saml_authentication_partial_update) | **PATCH** /orgs/{org}/saml-authentication | Update the SAML Authentication settings for this Organization.
[**orgs_saml_authentication_read**](OrgsApi.md#orgs_saml_authentication_read) | **GET** /orgs/{org}/saml-authentication | Retrieve the SAML Authentication settings for this Organization.
[**orgs_saml_group_sync_create**](OrgsApi.md#orgs_saml_group_sync_create) | **POST** /orgs/{org}/saml-group-sync/ | Create a new SAML Group Sync mapping within an organization.
[**orgs_saml_group_sync_delete**](OrgsApi.md#orgs_saml_group_sync_delete) | **DELETE** /orgs/{org}/saml-group-sync/{slug_perm}/ | Delete a SAML Group Sync mapping from an organization.
[**orgs_saml_group_sync_disable**](OrgsApi.md#orgs_saml_group_sync_disable) | **POST** /orgs/{org}/saml-group-sync/disable/ | Disable SAML Group Sync for this organization.
[**orgs_saml_group_sync_enable**](OrgsApi.md#orgs_saml_group_sync_enable) | **POST** /orgs/{org}/saml-group-sync/enable/ | Enable SAML Group Sync for this organization.
[**orgs_saml_group_sync_list**](OrgsApi.md#orgs_saml_group_sync_list) | **GET** /orgs/{org}/saml-group-sync/ | Get the details of all SAML Group Sync mapping within an organization.
[**orgs_saml_group_sync_status**](OrgsApi.md#orgs_saml_group_sync_status) | **GET** /orgs/{org}/saml-group-sync/status/ | Retrieve the SAML Group Sync status for this organization.
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
[**orgs_vulnerability_policy_create**](OrgsApi.md#orgs_vulnerability_policy_create) | **POST** /orgs/{org}/vulnerability-policy/ | Create a package vulnerability policy.
[**orgs_vulnerability_policy_delete**](OrgsApi.md#orgs_vulnerability_policy_delete) | **DELETE** /orgs/{org}/vulnerability-policy/{slug_perm}/ | Delete a package vulnerability policy.
[**orgs_vulnerability_policy_evaluation_create**](OrgsApi.md#orgs_vulnerability_policy_evaluation_create) | **POST** /orgs/{org}/vulnerability-policy/{policy_slug_perm}/evaluation/ | Create an evaluation request for this policy.
[**orgs_vulnerability_policy_evaluation_list**](OrgsApi.md#orgs_vulnerability_policy_evaluation_list) | **GET** /orgs/{org}/vulnerability-policy/{policy_slug_perm}/evaluation/ | List evaluation requests for this policy.
[**orgs_vulnerability_policy_evaluation_read**](OrgsApi.md#orgs_vulnerability_policy_evaluation_read) | **GET** /orgs/{org}/vulnerability-policy/{policy_slug_perm}/evaluation/{slug_perm}/ | Retrieve an evaluation request for this policy.
[**orgs_vulnerability_policy_list**](OrgsApi.md#orgs_vulnerability_policy_list) | **GET** /orgs/{org}/vulnerability-policy/ | Get a list of all package vulnerability policies.
[**orgs_vulnerability_policy_partial_update**](OrgsApi.md#orgs_vulnerability_policy_partial_update) | **PATCH** /orgs/{org}/vulnerability-policy/{slug_perm}/ | Partially update a package vulnerability policy.
[**orgs_vulnerability_policy_read**](OrgsApi.md#orgs_vulnerability_policy_read) | **GET** /orgs/{org}/vulnerability-policy/{slug_perm}/ | Get a package vulnerability policy.
[**orgs_vulnerability_policy_update**](OrgsApi.md#orgs_vulnerability_policy_update) | **PUT** /orgs/{org}/vulnerability-policy/{slug_perm}/ | Update a package vulnerability policy.
[**orgs_vulnerability_policy_violation_list**](OrgsApi.md#orgs_vulnerability_policy_violation_list) | **GET** /orgs/{org}/vulnerability-policy-violation/ | List all current vulnerability policy violations for this Organization.


# **orgs_delete**
> orgs_delete(org)

Delete the specified organization.

Delete the specified organization.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 


begin
  #Delete the specified organization.
  api_instance.orgs_delete(org)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_deny_policy_create**
> PackageDenyPolicy orgs_deny_policy_create(org, opts)

Create a package deny policy.

Create a package deny policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  data: CloudsmithApi::PackageDenyPolicyRequest.new # PackageDenyPolicyRequest | 
}

begin
  #Create a package deny policy.
  result = api_instance.orgs_deny_policy_create(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_deny_policy_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**PackageDenyPolicyRequest**](PackageDenyPolicyRequest.md)|  | [optional] 

### Return type

[**PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_deny_policy_delete**
> orgs_deny_policy_delete(org, slug_perm)

Delete a package deny policy.

Delete a package deny policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a package deny policy.
  api_instance.orgs_deny_policy_delete(org, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_deny_policy_delete: #{e}"
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_deny_policy_list**
> Array&lt;PackageDenyPolicy&gt; orgs_deny_policy_list(org, opts)

Get a list of all package deny policies.

Get a list of all package deny policies.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Get a list of all package deny policies.
  result = api_instance.orgs_deny_policy_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_deny_policy_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;PackageDenyPolicy&gt;**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_deny_policy_partial_update**
> PackageDenyPolicy orgs_deny_policy_partial_update(org, slug_perm, opts)

Partially update a package deny policy.

Partially update a package deny policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::PackageDenyPolicyRequestPatch.new # PackageDenyPolicyRequestPatch | 
}

begin
  #Partially update a package deny policy.
  result = api_instance.orgs_deny_policy_partial_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_deny_policy_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**PackageDenyPolicyRequestPatch**](PackageDenyPolicyRequestPatch.md)|  | [optional] 

### Return type

[**PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_deny_policy_read**
> PackageDenyPolicy orgs_deny_policy_read(org, slug_perm)

Get a package deny policy.

Get a package deny policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 


begin
  #Get a package deny policy.
  result = api_instance.orgs_deny_policy_read(org, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_deny_policy_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_deny_policy_update**
> PackageDenyPolicy orgs_deny_policy_update(org, slug_perm, opts)

Update a package deny policy.

Update a package deny policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::PackageDenyPolicyRequest.new # PackageDenyPolicyRequest | 
}

begin
  #Update a package deny policy.
  result = api_instance.orgs_deny_policy_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_deny_policy_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**PackageDenyPolicyRequest**](PackageDenyPolicyRequest.md)|  | [optional] 

### Return type

[**PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[**OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_invites_extend**
> OrganizationInviteExtend orgs_invites_extend(org, slug_perm)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[**OrganizationInviteExtend**](OrganizationInviteExtend.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_invites_partial_update**
> OrganizationInvite orgs_invites_partial_update(org, slug_perm, opts)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[**OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_invites_resend**
> OrganizationInviteExtend orgs_invites_resend(org, slug_perm)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[**OrganizationInviteExtend**](OrganizationInviteExtend.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_license_policy_create**
> OrganizationPackageLicensePolicy orgs_license_policy_create(org, opts)

Create a package license policy.

Create a package license policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  data: CloudsmithApi::OrganizationPackageLicensePolicyRequest.new # OrganizationPackageLicensePolicyRequest | 
}

begin
  #Create a package license policy.
  result = api_instance.orgs_license_policy_create(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_license_policy_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**OrganizationPackageLicensePolicyRequest**](OrganizationPackageLicensePolicyRequest.md)|  | [optional] 

### Return type

[**OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_license_policy_delete**
> orgs_license_policy_delete(org, slug_perm)

Delete a package license policy.

Delete a package license policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a package license policy.
  api_instance.orgs_license_policy_delete(org, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_license_policy_delete: #{e}"
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_license_policy_evaluation_create**
> PackageLicensePolicyEvaluationRequest orgs_license_policy_evaluation_create(org, policy_slug_perm, opts)

Create an evaluation request for this policy.

Create an evaluation request for this policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

policy_slug_perm = 'policy_slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::PackageLicensePolicyEvaluationRequestRequest.new # PackageLicensePolicyEvaluationRequestRequest | 
}

begin
  #Create an evaluation request for this policy.
  result = api_instance.orgs_license_policy_evaluation_create(org, policy_slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_license_policy_evaluation_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **policy_slug_perm** | **String**|  | 
 **data** | [**PackageLicensePolicyEvaluationRequestRequest**](PackageLicensePolicyEvaluationRequestRequest.md)|  | [optional] 

### Return type

[**PackageLicensePolicyEvaluationRequest**](PackageLicensePolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_license_policy_evaluation_list**
> Array&lt;PackageLicensePolicyEvaluationRequest&gt; orgs_license_policy_evaluation_list(org, policy_slug_perm, opts)

List evaluation requests for this policy.

List evaluation requests for this policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

policy_slug_perm = 'policy_slug_perm_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #List evaluation requests for this policy.
  result = api_instance.orgs_license_policy_evaluation_list(org, policy_slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_license_policy_evaluation_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **policy_slug_perm** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;PackageLicensePolicyEvaluationRequest&gt;**](PackageLicensePolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_license_policy_evaluation_read**
> PackageLicensePolicyEvaluationRequest orgs_license_policy_evaluation_read(org, policy_slug_perm, slug_perm)

Retrieve an evaluation request for this policy.

Retrieve an evaluation request for this policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

policy_slug_perm = 'policy_slug_perm_example' # String | 

slug_perm = 'slug_perm_example' # String | 


begin
  #Retrieve an evaluation request for this policy.
  result = api_instance.orgs_license_policy_evaluation_read(org, policy_slug_perm, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_license_policy_evaluation_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **policy_slug_perm** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**PackageLicensePolicyEvaluationRequest**](PackageLicensePolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_license_policy_list**
> Array&lt;OrganizationPackageLicensePolicy&gt; orgs_license_policy_list(org, opts)

Get a list of all package license policies.

Get a list of all package license policies.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Get a list of all package license policies.
  result = api_instance.orgs_license_policy_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_license_policy_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;OrganizationPackageLicensePolicy&gt;**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_license_policy_partial_update**
> OrganizationPackageLicensePolicy orgs_license_policy_partial_update(org, slug_perm, opts)

Partially update a package license policy.

Partially update a package license policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::OrganizationPackageLicensePolicyRequestPatch.new # OrganizationPackageLicensePolicyRequestPatch | 
}

begin
  #Partially update a package license policy.
  result = api_instance.orgs_license_policy_partial_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_license_policy_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**OrganizationPackageLicensePolicyRequestPatch**](OrganizationPackageLicensePolicyRequestPatch.md)|  | [optional] 

### Return type

[**OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_license_policy_read**
> OrganizationPackageLicensePolicy orgs_license_policy_read(org, slug_perm)

Get a package license policy.

Get a package license policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 


begin
  #Get a package license policy.
  result = api_instance.orgs_license_policy_read(org, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_license_policy_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_license_policy_update**
> OrganizationPackageLicensePolicy orgs_license_policy_update(org, slug_perm, opts)

Update a package license policy.

Update a package license policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::OrganizationPackageLicensePolicyRequest.new # OrganizationPackageLicensePolicyRequest | 
}

begin
  #Update a package license policy.
  result = api_instance.orgs_license_policy_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_license_policy_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**OrganizationPackageLicensePolicyRequest**](OrganizationPackageLicensePolicyRequest.md)|  | [optional] 

### Return type

[**OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_license_policy_violation_list**
> PackageLicensePolicyViolationLogCursorPage orgs_license_policy_violation_list(org, opts)

List all current license policy violations for this Organization.

List all current license policy violations for this Organization.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  cursor: 'cursor_example', # String | The pagination cursor value.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #List all current license policy violations for this Organization.
  result = api_instance.orgs_license_policy_violation_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_license_policy_violation_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **cursor** | **String**| The pagination cursor value. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**PackageLicensePolicyViolationLogCursorPage**](PackageLicensePolicyViolationLogCursorPage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  is_active: false, # BOOLEAN | Filter for active/inactive users.
  query: '', # String | A search term for querying of members within an Organization.Available options are: email, org, user, userslug, inactive, user_name, role
  sort: 'user_name' # String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-user_name`). Available options: user_name, role.
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
 **is_active** | **BOOLEAN**| Filter for active/inactive users. | [optional] [default to false]
 **query** | **String**| A search term for querying of members within an Organization.Available options are: email, org, user, userslug, inactive, user_name, role | [optional] [default to ]
 **sort** | **String**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-user_name&#x60;). Available options: user_name, role. | [optional] [default to user_name]

### Return type

[**Array&lt;OrganizationMembership&gt;**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_members_partial_update**
> OrganizationMembership orgs_members_partial_update(org, member, opts)

Views for working with organization members.

Views for working with organization members.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

member = 'member_example' # String | 

opts = { 
  data: CloudsmithApi::OrganizationMembershipRequestPatch.new # OrganizationMembershipRequestPatch | 
}

begin
  #Views for working with organization members.
  result = api_instance.orgs_members_partial_update(org, member, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_members_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **member** | **String**|  | 
 **data** | [**OrganizationMembershipRequestPatch**](OrganizationMembershipRequestPatch.md)|  | [optional] 

### Return type

[**OrganizationMembership**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_members_refresh**
> orgs_members_refresh(org, member)

Refresh a member of the organization's API key.

Refresh a member of the organization's API key.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

member = 'member_example' # String | 


begin
  #Refresh a member of the organization's API key.
  api_instance.orgs_members_refresh(org, member)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_members_refresh: #{e}"
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_members_update_role**
> OrganizationMembershipRoleUpdate orgs_members_update_role(org, member, opts)

Update a member's role in the organization.

Update a member's role in the organization.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

member = 'member_example' # String | 

opts = { 
  data: CloudsmithApi::OrganizationMembershipRoleUpdateRequestPatch.new # OrganizationMembershipRoleUpdateRequestPatch | 
}

begin
  #Update a member's role in the organization.
  result = api_instance.orgs_members_update_role(org, member, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_members_update_role: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **member** | **String**|  | 
 **data** | [**OrganizationMembershipRoleUpdateRequestPatch**](OrganizationMembershipRoleUpdateRequestPatch.md)|  | [optional] 

### Return type

[**OrganizationMembershipRoleUpdate**](OrganizationMembershipRoleUpdate.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_members_update_visibility**
> OrganizationMembershipVisibilityUpdate orgs_members_update_visibility(org, member, opts)

Update a member's visibility in the organization.

Update a member's visibility in the organization.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

member = 'member_example' # String | 

opts = { 
  data: CloudsmithApi::OrganizationMembershipVisibilityUpdateRequestPatch.new # OrganizationMembershipVisibilityUpdateRequestPatch | 
}

begin
  #Update a member's visibility in the organization.
  result = api_instance.orgs_members_update_visibility(org, member, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_members_update_visibility: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **member** | **String**|  | 
 **data** | [**OrganizationMembershipVisibilityUpdateRequestPatch**](OrganizationMembershipVisibilityUpdateRequestPatch.md)|  | [optional] 

### Return type

[**OrganizationMembershipVisibilityUpdate**](OrganizationMembershipVisibilityUpdate.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_openid_connect_create**
> ProviderSettings orgs_openid_connect_create(org, opts)

Create the OpenID Connect provider settings for the org.

Create the OpenID Connect provider settings for the org.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  data: CloudsmithApi::ProviderSettingsRequest.new # ProviderSettingsRequest | 
}

begin
  #Create the OpenID Connect provider settings for the org.
  result = api_instance.orgs_openid_connect_create(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_openid_connect_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**ProviderSettingsRequest**](ProviderSettingsRequest.md)|  | [optional] 

### Return type

[**ProviderSettings**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_openid_connect_delete**
> orgs_openid_connect_delete(org, slug_perm)

Delete a specific OpenID Connect provider setting for the org.

Delete a specific OpenID Connect provider setting for the org.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a specific OpenID Connect provider setting for the org.
  api_instance.orgs_openid_connect_delete(org, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_openid_connect_delete: #{e}"
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_openid_connect_list**
> Array&lt;ProviderSettings&gt; orgs_openid_connect_list(org, opts)

Retrieve the list of OpenID Connect provider settings for the org.

Retrieve the list of OpenID Connect provider settings for the org.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  query: '', # String | A search term for querying of OpenID Connect (OIDC) provider settings.Available options are: name, provider_url, service_account
  sort: 'name' # String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name.
}

begin
  #Retrieve the list of OpenID Connect provider settings for the org.
  result = api_instance.orgs_openid_connect_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_openid_connect_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 
 **query** | **String**| A search term for querying of OpenID Connect (OIDC) provider settings.Available options are: name, provider_url, service_account | [optional] [default to ]
 **sort** | **String**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name. | [optional] [default to name]

### Return type

[**Array&lt;ProviderSettings&gt;**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_openid_connect_partial_update**
> ProviderSettings orgs_openid_connect_partial_update(org, slug_perm, opts)

Update a specific OpenID Connect provider setting for the org.

Update a specific OpenID Connect provider setting for the org.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::ProviderSettingsRequestPatch.new # ProviderSettingsRequestPatch | 
}

begin
  #Update a specific OpenID Connect provider setting for the org.
  result = api_instance.orgs_openid_connect_partial_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_openid_connect_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**ProviderSettingsRequestPatch**](ProviderSettingsRequestPatch.md)|  | [optional] 

### Return type

[**ProviderSettings**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_openid_connect_read**
> ProviderSettings orgs_openid_connect_read(org, slug_perm)

Retrieve a specific OpenID Connect provider setting for the org.

Retrieve a specific OpenID Connect provider setting for the org.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 


begin
  #Retrieve a specific OpenID Connect provider setting for the org.
  result = api_instance.orgs_openid_connect_read(org, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_openid_connect_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**ProviderSettings**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_openid_connect_update**
> ProviderSettings orgs_openid_connect_update(org, slug_perm, opts)

Update a specific OpenID Connect provider setting for the org.

Update a specific OpenID Connect provider setting for the org.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::ProviderSettingsRequest.new # ProviderSettingsRequest | 
}

begin
  #Update a specific OpenID Connect provider setting for the org.
  result = api_instance.orgs_openid_connect_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_openid_connect_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**ProviderSettingsRequest**](ProviderSettingsRequest.md)|  | [optional] 

### Return type

[**ProviderSettings**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_saml_authentication_partial_update**
> OrganizationSAMLAuth orgs_saml_authentication_partial_update(org, opts)

Update the SAML Authentication settings for this Organization.

Update the SAML Authentication settings for this Organization.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  data: CloudsmithApi::OrganizationSAMLAuthRequestPatch.new # OrganizationSAMLAuthRequestPatch | 
}

begin
  #Update the SAML Authentication settings for this Organization.
  result = api_instance.orgs_saml_authentication_partial_update(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_saml_authentication_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**OrganizationSAMLAuthRequestPatch**](OrganizationSAMLAuthRequestPatch.md)|  | [optional] 

### Return type

[**OrganizationSAMLAuth**](OrganizationSAMLAuth.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_saml_authentication_read**
> OrganizationSAMLAuth orgs_saml_authentication_read(org)

Retrieve the SAML Authentication settings for this Organization.

Retrieve the SAML Authentication settings for this Organization.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 


begin
  #Retrieve the SAML Authentication settings for this Organization.
  result = api_instance.orgs_saml_authentication_read(org)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_saml_authentication_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 

### Return type

[**OrganizationSAMLAuth**](OrganizationSAMLAuth.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[**OrganizationGroupSync**](OrganizationGroupSync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_saml_group_sync_disable**
> orgs_saml_group_sync_disable(org)

Disable SAML Group Sync for this organization.

Disable SAML Group Sync for this organization.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 


begin
  #Disable SAML Group Sync for this organization.
  api_instance.orgs_saml_group_sync_disable(org)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_saml_group_sync_disable: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_saml_group_sync_enable**
> orgs_saml_group_sync_enable(org)

Enable SAML Group Sync for this organization.

Enable SAML Group Sync for this organization.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 


begin
  #Enable SAML Group Sync for this organization.
  api_instance.orgs_saml_group_sync_enable(org)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_saml_group_sync_enable: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_saml_group_sync_status**
> OrganizationGroupSyncStatus orgs_saml_group_sync_status(org)

Retrieve the SAML Group Sync status for this organization.

Retrieve the SAML Group Sync status for this organization.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 


begin
  #Retrieve the SAML Group Sync status for this organization.
  result = api_instance.orgs_saml_group_sync_status(org)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_saml_group_sync_status: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 

### Return type

[**OrganizationGroupSyncStatus**](OrganizationGroupSyncStatus.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_services_create**
> Service orgs_services_create(org, opts)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[**Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_services_list**
> Array&lt;Service&gt; orgs_services_list(org, opts)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  query: '', # String | A search term for querying of services within an Organization.Available options are: name, role
  sort: 'created_at' # String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-created_at`). Available options: created_at, name, role.
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
 **query** | **String**| A search term for querying of services within an Organization.Available options are: name, role | [optional] [default to ]
 **sort** | **String**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-created_at&#x60;). Available options: created_at, name, role. | [optional] [default to created_at]

### Return type

[**Array&lt;Service&gt;**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_services_partial_update**
> Service orgs_services_partial_update(org, service, opts)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[**Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_services_read**
> Service orgs_services_read(org, service)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[**Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_services_refresh**
> Service orgs_services_refresh(org, service)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[**Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  for_user: false, # BOOLEAN | Filter for teams that you are a member of.
  query: '', # String | A search term for querying of teams within an Organization.Available options are: name, slug, user, userslug
  sort: 'name' # String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name, members.
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
 **for_user** | **BOOLEAN**| Filter for teams that you are a member of. | [optional] [default to false]
 **query** | **String**| A search term for querying of teams within an Organization.Available options are: name, slug, user, userslug | [optional] [default to ]
 **sort** | **String**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name, members. | [optional] [default to name]

### Return type

[**Array&lt;OrganizationTeam&gt;**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_teams_members_create**
> OrganizationTeamMembers orgs_teams_members_create(org, team, opts)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[**OrganizationTeamMembers**](OrganizationTeamMembers.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_teams_members_list**
> OrganizationTeamMembers orgs_teams_members_list(org, team)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[**OrganizationTeamMembers**](OrganizationTeamMembers.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_teams_members_update**
> OrganizationTeamMembers orgs_teams_members_update(org, team, opts)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

team = 'team_example' # String | 

opts = { 
  data: CloudsmithApi::OrganizationTeamMembers.new # OrganizationTeamMembers | 
}

begin
  #Replace all team members.
  result = api_instance.orgs_teams_members_update(org, team, opts)
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
 **data** | [**OrganizationTeamMembers**](OrganizationTeamMembers.md)|  | [optional] 

### Return type

[**OrganizationTeamMembers**](OrganizationTeamMembers.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_teams_partial_update**
> OrganizationTeam orgs_teams_partial_update(org, team, opts)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_teams_read**
> OrganizationTeam orgs_teams_read(org, team)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_vulnerability_policy_create**
> OrganizationPackageVulnerabilityPolicy orgs_vulnerability_policy_create(org, opts)

Create a package vulnerability policy.

Create a package vulnerability policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  data: CloudsmithApi::OrganizationPackageVulnerabilityPolicyRequest.new # OrganizationPackageVulnerabilityPolicyRequest | 
}

begin
  #Create a package vulnerability policy.
  result = api_instance.orgs_vulnerability_policy_create(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_vulnerability_policy_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**OrganizationPackageVulnerabilityPolicyRequest**](OrganizationPackageVulnerabilityPolicyRequest.md)|  | [optional] 

### Return type

[**OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_vulnerability_policy_delete**
> orgs_vulnerability_policy_delete(org, slug_perm)

Delete a package vulnerability policy.

Delete a package vulnerability policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a package vulnerability policy.
  api_instance.orgs_vulnerability_policy_delete(org, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_vulnerability_policy_delete: #{e}"
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_vulnerability_policy_evaluation_create**
> PackageVulnerabilityPolicyEvaluationRequest orgs_vulnerability_policy_evaluation_create(org, policy_slug_perm, opts)

Create an evaluation request for this policy.

Create an evaluation request for this policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

policy_slug_perm = 'policy_slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::PackageVulnerabilityPolicyEvaluationRequestRequest.new # PackageVulnerabilityPolicyEvaluationRequestRequest | 
}

begin
  #Create an evaluation request for this policy.
  result = api_instance.orgs_vulnerability_policy_evaluation_create(org, policy_slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_vulnerability_policy_evaluation_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **policy_slug_perm** | **String**|  | 
 **data** | [**PackageVulnerabilityPolicyEvaluationRequestRequest**](PackageVulnerabilityPolicyEvaluationRequestRequest.md)|  | [optional] 

### Return type

[**PackageVulnerabilityPolicyEvaluationRequest**](PackageVulnerabilityPolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_vulnerability_policy_evaluation_list**
> Array&lt;PackageVulnerabilityPolicyEvaluationRequest&gt; orgs_vulnerability_policy_evaluation_list(org, policy_slug_perm, opts)

List evaluation requests for this policy.

List evaluation requests for this policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

policy_slug_perm = 'policy_slug_perm_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #List evaluation requests for this policy.
  result = api_instance.orgs_vulnerability_policy_evaluation_list(org, policy_slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_vulnerability_policy_evaluation_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **policy_slug_perm** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;PackageVulnerabilityPolicyEvaluationRequest&gt;**](PackageVulnerabilityPolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_vulnerability_policy_evaluation_read**
> PackageVulnerabilityPolicyEvaluationRequest orgs_vulnerability_policy_evaluation_read(org, policy_slug_perm, slug_perm)

Retrieve an evaluation request for this policy.

Retrieve an evaluation request for this policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

policy_slug_perm = 'policy_slug_perm_example' # String | 

slug_perm = 'slug_perm_example' # String | 


begin
  #Retrieve an evaluation request for this policy.
  result = api_instance.orgs_vulnerability_policy_evaluation_read(org, policy_slug_perm, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_vulnerability_policy_evaluation_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **policy_slug_perm** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**PackageVulnerabilityPolicyEvaluationRequest**](PackageVulnerabilityPolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_vulnerability_policy_list**
> Array&lt;OrganizationPackageVulnerabilityPolicy&gt; orgs_vulnerability_policy_list(org, opts)

Get a list of all package vulnerability policies.

Get a list of all package vulnerability policies.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Get a list of all package vulnerability policies.
  result = api_instance.orgs_vulnerability_policy_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_vulnerability_policy_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;OrganizationPackageVulnerabilityPolicy&gt;**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_vulnerability_policy_partial_update**
> OrganizationPackageVulnerabilityPolicy orgs_vulnerability_policy_partial_update(org, slug_perm, opts)

Partially update a package vulnerability policy.

Partially update a package vulnerability policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::OrganizationPackageVulnerabilityPolicyRequestPatch.new # OrganizationPackageVulnerabilityPolicyRequestPatch | 
}

begin
  #Partially update a package vulnerability policy.
  result = api_instance.orgs_vulnerability_policy_partial_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_vulnerability_policy_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**OrganizationPackageVulnerabilityPolicyRequestPatch**](OrganizationPackageVulnerabilityPolicyRequestPatch.md)|  | [optional] 

### Return type

[**OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_vulnerability_policy_read**
> OrganizationPackageVulnerabilityPolicy orgs_vulnerability_policy_read(org, slug_perm)

Get a package vulnerability policy.

Get a package vulnerability policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 


begin
  #Get a package vulnerability policy.
  result = api_instance.orgs_vulnerability_policy_read(org, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_vulnerability_policy_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_vulnerability_policy_update**
> OrganizationPackageVulnerabilityPolicy orgs_vulnerability_policy_update(org, slug_perm, opts)

Update a package vulnerability policy.

Update a package vulnerability policy.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::OrganizationPackageVulnerabilityPolicyRequest.new # OrganizationPackageVulnerabilityPolicyRequest | 
}

begin
  #Update a package vulnerability policy.
  result = api_instance.orgs_vulnerability_policy_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_vulnerability_policy_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**OrganizationPackageVulnerabilityPolicyRequest**](OrganizationPackageVulnerabilityPolicyRequest.md)|  | [optional] 

### Return type

[**OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **orgs_vulnerability_policy_violation_list**
> PackageVulnerabilityPolicyViolationLogCursorPage orgs_vulnerability_policy_violation_list(org, opts)

List all current vulnerability policy violations for this Organization.

List all current vulnerability policy violations for this Organization.

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new

org = 'org_example' # String | 

opts = { 
  cursor: 'cursor_example', # String | The pagination cursor value.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #List all current vulnerability policy violations for this Organization.
  result = api_instance.orgs_vulnerability_policy_violation_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OrgsApi->orgs_vulnerability_policy_violation_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **cursor** | **String**| The pagination cursor value. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**PackageVulnerabilityPolicyViolationLogCursorPage**](PackageVulnerabilityPolicyViolationLogCursorPage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



