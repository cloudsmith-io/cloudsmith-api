# CloudsmithApi::OrgsApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**orgs_api_key_rules_create**](OrgsApi.md#orgs_api_key_rules_create) | **POST** /orgs/{org}/api-key-rules/ | Create an API key rule. |
| [**orgs_api_key_rules_delete**](OrgsApi.md#orgs_api_key_rules_delete) | **DELETE** /orgs/{org}/api-key-rules/{slug_perm}/ | Delete an API key rule. |
| [**orgs_api_key_rules_list**](OrgsApi.md#orgs_api_key_rules_list) | **GET** /orgs/{org}/api-key-rules/ | List all API key rules for the organization. |
| [**orgs_api_key_rules_partial_update**](OrgsApi.md#orgs_api_key_rules_partial_update) | **PATCH** /orgs/{org}/api-key-rules/{slug_perm}/ | Update an API key rule. |
| [**orgs_api_key_rules_read**](OrgsApi.md#orgs_api_key_rules_read) | **GET** /orgs/{org}/api-key-rules/{slug_perm}/ | Retrieve an API key rule. |
| [**orgs_api_key_rules_update**](OrgsApi.md#orgs_api_key_rules_update) | **PUT** /orgs/{org}/api-key-rules/{slug_perm}/ | Full update of an API key rule. |
| [**orgs_custom_domains_list**](OrgsApi.md#orgs_custom_domains_list) | **GET** /orgs/{org}/custom-domains/ | Get the details for all custom domains. |
| [**orgs_delete**](OrgsApi.md#orgs_delete) | **DELETE** /orgs/{org}/ | Delete the specified organization. |
| [**orgs_deny_policy_create**](OrgsApi.md#orgs_deny_policy_create) | **POST** /orgs/{org}/deny-policy/ | Create a package deny policy. |
| [**orgs_deny_policy_delete**](OrgsApi.md#orgs_deny_policy_delete) | **DELETE** /orgs/{org}/deny-policy/{slug_perm}/ | Delete a package deny policy. |
| [**orgs_deny_policy_list**](OrgsApi.md#orgs_deny_policy_list) | **GET** /orgs/{org}/deny-policy/ | Get a list of all package deny policies. |
| [**orgs_deny_policy_partial_update**](OrgsApi.md#orgs_deny_policy_partial_update) | **PATCH** /orgs/{org}/deny-policy/{slug_perm}/ | Partially update a package deny policy. |
| [**orgs_deny_policy_read**](OrgsApi.md#orgs_deny_policy_read) | **GET** /orgs/{org}/deny-policy/{slug_perm}/ | Get a package deny policy. |
| [**orgs_deny_policy_update**](OrgsApi.md#orgs_deny_policy_update) | **PUT** /orgs/{org}/deny-policy/{slug_perm}/ | Update a package deny policy. |
| [**orgs_invites_create**](OrgsApi.md#orgs_invites_create) | **POST** /orgs/{org}/invites/ | Create an organization invite for a specific user |
| [**orgs_invites_delete**](OrgsApi.md#orgs_invites_delete) | **DELETE** /orgs/{org}/invites/{slug_perm}/ | Delete a specific organization invite |
| [**orgs_invites_extend**](OrgsApi.md#orgs_invites_extend) | **POST** /orgs/{org}/invites/{slug_perm}/extend/ | Extend an organization invite. |
| [**orgs_invites_list**](OrgsApi.md#orgs_invites_list) | **GET** /orgs/{org}/invites/ | Get a list of all invites for an organization. |
| [**orgs_invites_partial_update**](OrgsApi.md#orgs_invites_partial_update) | **PATCH** /orgs/{org}/invites/{slug_perm}/ | Update a specific organization invite. |
| [**orgs_invites_resend**](OrgsApi.md#orgs_invites_resend) | **POST** /orgs/{org}/invites/{slug_perm}/resend/ | Resend an organization invite. |
| [**orgs_license_policy_create**](OrgsApi.md#orgs_license_policy_create) | **POST** /orgs/{org}/license-policy/ | Create a package license policy. |
| [**orgs_license_policy_delete**](OrgsApi.md#orgs_license_policy_delete) | **DELETE** /orgs/{org}/license-policy/{slug_perm}/ | Delete a package license policy. |
| [**orgs_license_policy_evaluation_create**](OrgsApi.md#orgs_license_policy_evaluation_create) | **POST** /orgs/{org}/license-policy/{policy_slug_perm}/evaluation/ | Create an evaluation request for this policy. |
| [**orgs_license_policy_evaluation_list**](OrgsApi.md#orgs_license_policy_evaluation_list) | **GET** /orgs/{org}/license-policy/{policy_slug_perm}/evaluation/ | List evaluation requests for this policy. |
| [**orgs_license_policy_evaluation_read**](OrgsApi.md#orgs_license_policy_evaluation_read) | **GET** /orgs/{org}/license-policy/{policy_slug_perm}/evaluation/{slug_perm}/ | Retrieve an evaluation request for this policy. |
| [**orgs_license_policy_list**](OrgsApi.md#orgs_license_policy_list) | **GET** /orgs/{org}/license-policy/ | Get a list of all package license policies. |
| [**orgs_license_policy_partial_update**](OrgsApi.md#orgs_license_policy_partial_update) | **PATCH** /orgs/{org}/license-policy/{slug_perm}/ | Partially update a package license policy. |
| [**orgs_license_policy_read**](OrgsApi.md#orgs_license_policy_read) | **GET** /orgs/{org}/license-policy/{slug_perm}/ | Get a package license policy. |
| [**orgs_license_policy_update**](OrgsApi.md#orgs_license_policy_update) | **PUT** /orgs/{org}/license-policy/{slug_perm}/ | Update a package license policy. |
| [**orgs_license_policy_violation_list**](OrgsApi.md#orgs_license_policy_violation_list) | **GET** /orgs/{org}/license-policy-violation/ | List all current license policy violations for this Organization. |
| [**orgs_list**](OrgsApi.md#orgs_list) | **GET** /orgs/ | Get a list of all the organizations you are associated with. |
| [**orgs_members_delete**](OrgsApi.md#orgs_members_delete) | **DELETE** /orgs/{org}/members/{member}/ | Removes a member from the organization. |
| [**orgs_members_list**](OrgsApi.md#orgs_members_list) | **GET** /orgs/{org}/members/ | Get the details for all organization members. |
| [**orgs_members_partial_update**](OrgsApi.md#orgs_members_partial_update) | **PATCH** /orgs/{org}/members/{member}/ | Views for working with organization members. |
| [**orgs_members_read**](OrgsApi.md#orgs_members_read) | **GET** /orgs/{org}/members/{member}/ | Get the details for a specific organization member. |
| [**orgs_members_refresh**](OrgsApi.md#orgs_members_refresh) | **POST** /orgs/{org}/members/{member}/refresh/ | Refresh a member of the organization&#39;s API key. |
| [**orgs_members_remove**](OrgsApi.md#orgs_members_remove) | **GET** /orgs/{org}/members/{member}/remove/ | Removes a member from the organization (deprecated, use DELETE instead). |
| [**orgs_members_update_role**](OrgsApi.md#orgs_members_update_role) | **PATCH** /orgs/{org}/members/{member}/update-role/ | Update a member&#39;s role in the organization. |
| [**orgs_members_update_visibility**](OrgsApi.md#orgs_members_update_visibility) | **PATCH** /orgs/{org}/members/{member}/update-visibility/ | Update a member&#39;s visibility in the organization. |
| [**orgs_openid_connect_create**](OrgsApi.md#orgs_openid_connect_create) | **POST** /orgs/{org}/openid-connect/ | Create the OpenID Connect provider settings for the org. |
| [**orgs_openid_connect_delete**](OrgsApi.md#orgs_openid_connect_delete) | **DELETE** /orgs/{org}/openid-connect/{slug_perm}/ | Delete a specific OpenID Connect provider setting for the org. |
| [**orgs_openid_connect_dynamic_mappings_list**](OrgsApi.md#orgs_openid_connect_dynamic_mappings_list) | **GET** /orgs/{org}/openid-connect/{provider_setting}/dynamic-mappings/ | Retrieve the list of OpenID Connect dynamic mappings for the provider setting. |
| [**orgs_openid_connect_dynamic_mappings_read**](OrgsApi.md#orgs_openid_connect_dynamic_mappings_read) | **GET** /orgs/{org}/openid-connect/{provider_setting}/dynamic-mappings/{claim_value}/ | Retrieve a specific OpenID Connect dynamic mapping for the provider setting. |
| [**orgs_openid_connect_list**](OrgsApi.md#orgs_openid_connect_list) | **GET** /orgs/{org}/openid-connect/ | Retrieve the list of OpenID Connect provider settings for the org. |
| [**orgs_openid_connect_partial_update**](OrgsApi.md#orgs_openid_connect_partial_update) | **PATCH** /orgs/{org}/openid-connect/{slug_perm}/ | Update a specific OpenID Connect provider setting for the org. |
| [**orgs_openid_connect_read**](OrgsApi.md#orgs_openid_connect_read) | **GET** /orgs/{org}/openid-connect/{slug_perm}/ | Retrieve a specific OpenID Connect provider setting for the org. |
| [**orgs_openid_connect_update**](OrgsApi.md#orgs_openid_connect_update) | **PUT** /orgs/{org}/openid-connect/{slug_perm}/ | Update a specific OpenID Connect provider setting for the org. |
| [**orgs_read**](OrgsApi.md#orgs_read) | **GET** /orgs/{org}/ | Get the details for the specific organization. |
| [**orgs_retrieve_usage_limits**](OrgsApi.md#orgs_retrieve_usage_limits) | **GET** /orgs/{org}/usage-limits/ |  |
| [**orgs_saml_authentication_partial_update**](OrgsApi.md#orgs_saml_authentication_partial_update) | **PATCH** /orgs/{org}/saml-authentication | Update the SAML Authentication settings for this Organization. |
| [**orgs_saml_authentication_read**](OrgsApi.md#orgs_saml_authentication_read) | **GET** /orgs/{org}/saml-authentication | Retrieve the SAML Authentication settings for this Organization. |
| [**orgs_saml_group_sync_create**](OrgsApi.md#orgs_saml_group_sync_create) | **POST** /orgs/{org}/saml-group-sync/ | Create a new SAML Group Sync mapping within an organization. |
| [**orgs_saml_group_sync_delete**](OrgsApi.md#orgs_saml_group_sync_delete) | **DELETE** /orgs/{org}/saml-group-sync/{slug_perm}/ | Delete a SAML Group Sync mapping from an organization. |
| [**orgs_saml_group_sync_disable**](OrgsApi.md#orgs_saml_group_sync_disable) | **POST** /orgs/{org}/saml-group-sync/disable/ | Disable SAML Group Sync for this organization. |
| [**orgs_saml_group_sync_enable**](OrgsApi.md#orgs_saml_group_sync_enable) | **POST** /orgs/{org}/saml-group-sync/enable/ | Enable SAML Group Sync for this organization. |
| [**orgs_saml_group_sync_list**](OrgsApi.md#orgs_saml_group_sync_list) | **GET** /orgs/{org}/saml-group-sync/ | Get the details of all SAML Group Sync mapping within an organization. |
| [**orgs_saml_group_sync_status**](OrgsApi.md#orgs_saml_group_sync_status) | **GET** /orgs/{org}/saml-group-sync/status/ | Retrieve the SAML Group Sync status for this organization. |
| [**orgs_services_create**](OrgsApi.md#orgs_services_create) | **POST** /orgs/{org}/services/ | Create a service within an organization. |
| [**orgs_services_delete**](OrgsApi.md#orgs_services_delete) | **DELETE** /orgs/{org}/services/{service}/ | Delete a specific service |
| [**orgs_services_list**](OrgsApi.md#orgs_services_list) | **GET** /orgs/{org}/services/ | Get a list of all services within an organization. |
| [**orgs_services_partial_update**](OrgsApi.md#orgs_services_partial_update) | **PATCH** /orgs/{org}/services/{service}/ | Update a service within an organization. |
| [**orgs_services_read**](OrgsApi.md#orgs_services_read) | **GET** /orgs/{org}/services/{service}/ | Retrieve details of a single service within an organization. |
| [**orgs_services_refresh**](OrgsApi.md#orgs_services_refresh) | **POST** /orgs/{org}/services/{service}/refresh/ | Refresh service API token. |
| [**orgs_teams_create**](OrgsApi.md#orgs_teams_create) | **POST** /orgs/{org}/teams/ | Create a team for this organization. |
| [**orgs_teams_delete**](OrgsApi.md#orgs_teams_delete) | **DELETE** /orgs/{org}/teams/{team}/ | Delete a specific team in a organization. |
| [**orgs_teams_list**](OrgsApi.md#orgs_teams_list) | **GET** /orgs/{org}/teams/ | Get the details of all teams within an organization. |
| [**orgs_teams_members_create**](OrgsApi.md#orgs_teams_members_create) | **POST** /orgs/{org}/teams/{team}/members | Add users to a team. |
| [**orgs_teams_members_list**](OrgsApi.md#orgs_teams_members_list) | **GET** /orgs/{org}/teams/{team}/members | List all members for the team. |
| [**orgs_teams_members_update**](OrgsApi.md#orgs_teams_members_update) | **PUT** /orgs/{org}/teams/{team}/members | Replace all team members. |
| [**orgs_teams_partial_update**](OrgsApi.md#orgs_teams_partial_update) | **PATCH** /orgs/{org}/teams/{team}/ | Update a specific team in a organization. |
| [**orgs_teams_read**](OrgsApi.md#orgs_teams_read) | **GET** /orgs/{org}/teams/{team}/ | Get the details of a specific team within an organization. |
| [**orgs_update_usage_limits**](OrgsApi.md#orgs_update_usage_limits) | **PATCH** /orgs/{org}/usage-limits/ |  |
| [**orgs_vulnerability_policy_create**](OrgsApi.md#orgs_vulnerability_policy_create) | **POST** /orgs/{org}/vulnerability-policy/ | Create a package vulnerability policy. |
| [**orgs_vulnerability_policy_delete**](OrgsApi.md#orgs_vulnerability_policy_delete) | **DELETE** /orgs/{org}/vulnerability-policy/{slug_perm}/ | Delete a package vulnerability policy. |
| [**orgs_vulnerability_policy_evaluation_create**](OrgsApi.md#orgs_vulnerability_policy_evaluation_create) | **POST** /orgs/{org}/vulnerability-policy/{policy_slug_perm}/evaluation/ | Create an evaluation request for this policy. |
| [**orgs_vulnerability_policy_evaluation_list**](OrgsApi.md#orgs_vulnerability_policy_evaluation_list) | **GET** /orgs/{org}/vulnerability-policy/{policy_slug_perm}/evaluation/ | List evaluation requests for this policy. |
| [**orgs_vulnerability_policy_evaluation_read**](OrgsApi.md#orgs_vulnerability_policy_evaluation_read) | **GET** /orgs/{org}/vulnerability-policy/{policy_slug_perm}/evaluation/{slug_perm}/ | Retrieve an evaluation request for this policy. |
| [**orgs_vulnerability_policy_list**](OrgsApi.md#orgs_vulnerability_policy_list) | **GET** /orgs/{org}/vulnerability-policy/ | Get a list of all package vulnerability policies. |
| [**orgs_vulnerability_policy_partial_update**](OrgsApi.md#orgs_vulnerability_policy_partial_update) | **PATCH** /orgs/{org}/vulnerability-policy/{slug_perm}/ | Partially update a package vulnerability policy. |
| [**orgs_vulnerability_policy_read**](OrgsApi.md#orgs_vulnerability_policy_read) | **GET** /orgs/{org}/vulnerability-policy/{slug_perm}/ | Get a package vulnerability policy. |
| [**orgs_vulnerability_policy_update**](OrgsApi.md#orgs_vulnerability_policy_update) | **PUT** /orgs/{org}/vulnerability-policy/{slug_perm}/ | Update a package vulnerability policy. |
| [**orgs_vulnerability_policy_violation_list**](OrgsApi.md#orgs_vulnerability_policy_violation_list) | **GET** /orgs/{org}/vulnerability-policy-violation/ | List all current vulnerability policy violations for this Organization. |


## orgs_api_key_rules_create

> <OrganizationApiKeyRule> orgs_api_key_rules_create(org, opts)

Create an API key rule.

Create an API key rule.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
opts = {
  data: CloudsmithApi::OrganizationApiKeyRuleRequest.new({rule_type: 'rule_type_example'}) # OrganizationApiKeyRuleRequest | 
}

begin
  # Create an API key rule.
  result = api_instance.orgs_api_key_rules_create(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_api_key_rules_create: #{e}"
end
```

#### Using the orgs_api_key_rules_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationApiKeyRule>, Integer, Hash)> orgs_api_key_rules_create_with_http_info(org, opts)

```ruby
begin
  # Create an API key rule.
  data, status_code, headers = api_instance.orgs_api_key_rules_create_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationApiKeyRule>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_api_key_rules_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **data** | [**OrganizationApiKeyRuleRequest**](OrganizationApiKeyRuleRequest.md) |  | [optional] |

### Return type

[**OrganizationApiKeyRule**](OrganizationApiKeyRule.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_api_key_rules_delete

> orgs_api_key_rules_delete(org, slug_perm)

Delete an API key rule.

Delete an API key rule.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 

begin
  # Delete an API key rule.
  api_instance.orgs_api_key_rules_delete(org, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_api_key_rules_delete: #{e}"
end
```

#### Using the orgs_api_key_rules_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> orgs_api_key_rules_delete_with_http_info(org, slug_perm)

```ruby
begin
  # Delete an API key rule.
  data, status_code, headers = api_instance.orgs_api_key_rules_delete_with_http_info(org, slug_perm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_api_key_rules_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_api_key_rules_list

> <Array<OrganizationApiKeyRule>> orgs_api_key_rules_list(org)

List all API key rules for the organization.

List all API key rules for the organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 

begin
  # List all API key rules for the organization.
  result = api_instance.orgs_api_key_rules_list(org)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_api_key_rules_list: #{e}"
end
```

#### Using the orgs_api_key_rules_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<OrganizationApiKeyRule>>, Integer, Hash)> orgs_api_key_rules_list_with_http_info(org)

```ruby
begin
  # List all API key rules for the organization.
  data, status_code, headers = api_instance.orgs_api_key_rules_list_with_http_info(org)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<OrganizationApiKeyRule>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_api_key_rules_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |

### Return type

[**Array&lt;OrganizationApiKeyRule&gt;**](OrganizationApiKeyRule.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_api_key_rules_partial_update

> <OrganizationApiKeyRule> orgs_api_key_rules_partial_update(org, slug_perm, opts)

Update an API key rule.

Update an API key rule.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 
opts = {
  data: CloudsmithApi::OrganizationApiKeyRuleRequestPatch.new # OrganizationApiKeyRuleRequestPatch | 
}

begin
  # Update an API key rule.
  result = api_instance.orgs_api_key_rules_partial_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_api_key_rules_partial_update: #{e}"
end
```

#### Using the orgs_api_key_rules_partial_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationApiKeyRule>, Integer, Hash)> orgs_api_key_rules_partial_update_with_http_info(org, slug_perm, opts)

```ruby
begin
  # Update an API key rule.
  data, status_code, headers = api_instance.orgs_api_key_rules_partial_update_with_http_info(org, slug_perm, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationApiKeyRule>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_api_key_rules_partial_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |
| **data** | [**OrganizationApiKeyRuleRequestPatch**](OrganizationApiKeyRuleRequestPatch.md) |  | [optional] |

### Return type

[**OrganizationApiKeyRule**](OrganizationApiKeyRule.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_api_key_rules_read

> <OrganizationApiKeyRule> orgs_api_key_rules_read(org, slug_perm)

Retrieve an API key rule.

Retrieve an API key rule.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 

begin
  # Retrieve an API key rule.
  result = api_instance.orgs_api_key_rules_read(org, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_api_key_rules_read: #{e}"
end
```

#### Using the orgs_api_key_rules_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationApiKeyRule>, Integer, Hash)> orgs_api_key_rules_read_with_http_info(org, slug_perm)

```ruby
begin
  # Retrieve an API key rule.
  data, status_code, headers = api_instance.orgs_api_key_rules_read_with_http_info(org, slug_perm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationApiKeyRule>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_api_key_rules_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |

### Return type

[**OrganizationApiKeyRule**](OrganizationApiKeyRule.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_api_key_rules_update

> <OrganizationApiKeyRule> orgs_api_key_rules_update(org, slug_perm, opts)

Full update of an API key rule.

Full update of an API key rule.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 
opts = {
  data: CloudsmithApi::OrganizationApiKeyRuleRequest.new({rule_type: 'rule_type_example'}) # OrganizationApiKeyRuleRequest | 
}

begin
  # Full update of an API key rule.
  result = api_instance.orgs_api_key_rules_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_api_key_rules_update: #{e}"
end
```

#### Using the orgs_api_key_rules_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationApiKeyRule>, Integer, Hash)> orgs_api_key_rules_update_with_http_info(org, slug_perm, opts)

```ruby
begin
  # Full update of an API key rule.
  data, status_code, headers = api_instance.orgs_api_key_rules_update_with_http_info(org, slug_perm, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationApiKeyRule>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_api_key_rules_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |
| **data** | [**OrganizationApiKeyRuleRequest**](OrganizationApiKeyRuleRequest.md) |  | [optional] |

### Return type

[**OrganizationApiKeyRule**](OrganizationApiKeyRule.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_custom_domains_list

> <Array<OrganizationCustomDomains>> orgs_custom_domains_list(org, opts)

Get the details for all custom domains.

Get the details for all custom domains.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # Get the details for all custom domains.
  result = api_instance.orgs_custom_domains_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_custom_domains_list: #{e}"
end
```

#### Using the orgs_custom_domains_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<OrganizationCustomDomains>>, Integer, Hash)> orgs_custom_domains_list_with_http_info(org, opts)

```ruby
begin
  # Get the details for all custom domains.
  data, status_code, headers = api_instance.orgs_custom_domains_list_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<OrganizationCustomDomains>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_custom_domains_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |

### Return type

[**Array&lt;OrganizationCustomDomains&gt;**](OrganizationCustomDomains.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_delete

> orgs_delete(org)

Delete the specified organization.

Delete the specified organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 

begin
  # Delete the specified organization.
  api_instance.orgs_delete(org)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_delete: #{e}"
end
```

#### Using the orgs_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> orgs_delete_with_http_info(org)

```ruby
begin
  # Delete the specified organization.
  data, status_code, headers = api_instance.orgs_delete_with_http_info(org)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_deny_policy_create

> <PackageDenyPolicy> orgs_deny_policy_create(org, opts)

Create a package deny policy.

Create a package deny policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
opts = {
  data: CloudsmithApi::PackageDenyPolicyRequest.new({package_query_string: 'package_query_string_example'}) # PackageDenyPolicyRequest | 
}

begin
  # Create a package deny policy.
  result = api_instance.orgs_deny_policy_create(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_deny_policy_create: #{e}"
end
```

#### Using the orgs_deny_policy_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackageDenyPolicy>, Integer, Hash)> orgs_deny_policy_create_with_http_info(org, opts)

```ruby
begin
  # Create a package deny policy.
  data, status_code, headers = api_instance.orgs_deny_policy_create_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackageDenyPolicy>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_deny_policy_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **data** | [**PackageDenyPolicyRequest**](PackageDenyPolicyRequest.md) |  | [optional] |

### Return type

[**PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_deny_policy_delete

> orgs_deny_policy_delete(org, slug_perm)

Delete a package deny policy.

Delete a package deny policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 

begin
  # Delete a package deny policy.
  api_instance.orgs_deny_policy_delete(org, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_deny_policy_delete: #{e}"
end
```

#### Using the orgs_deny_policy_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> orgs_deny_policy_delete_with_http_info(org, slug_perm)

```ruby
begin
  # Delete a package deny policy.
  data, status_code, headers = api_instance.orgs_deny_policy_delete_with_http_info(org, slug_perm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_deny_policy_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_deny_policy_list

> <Array<PackageDenyPolicy>> orgs_deny_policy_list(org, opts)

Get a list of all package deny policies.

Get a list of all package deny policies.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # Get a list of all package deny policies.
  result = api_instance.orgs_deny_policy_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_deny_policy_list: #{e}"
end
```

#### Using the orgs_deny_policy_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<PackageDenyPolicy>>, Integer, Hash)> orgs_deny_policy_list_with_http_info(org, opts)

```ruby
begin
  # Get a list of all package deny policies.
  data, status_code, headers = api_instance.orgs_deny_policy_list_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<PackageDenyPolicy>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_deny_policy_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |

### Return type

[**Array&lt;PackageDenyPolicy&gt;**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_deny_policy_partial_update

> <PackageDenyPolicy> orgs_deny_policy_partial_update(org, slug_perm, opts)

Partially update a package deny policy.

Partially update a package deny policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # Partially update a package deny policy.
  result = api_instance.orgs_deny_policy_partial_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_deny_policy_partial_update: #{e}"
end
```

#### Using the orgs_deny_policy_partial_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackageDenyPolicy>, Integer, Hash)> orgs_deny_policy_partial_update_with_http_info(org, slug_perm, opts)

```ruby
begin
  # Partially update a package deny policy.
  data, status_code, headers = api_instance.orgs_deny_policy_partial_update_with_http_info(org, slug_perm, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackageDenyPolicy>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_deny_policy_partial_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |
| **data** | [**PackageDenyPolicyRequestPatch**](PackageDenyPolicyRequestPatch.md) |  | [optional] |

### Return type

[**PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_deny_policy_read

> <PackageDenyPolicy> orgs_deny_policy_read(org, slug_perm)

Get a package deny policy.

Get a package deny policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 

begin
  # Get a package deny policy.
  result = api_instance.orgs_deny_policy_read(org, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_deny_policy_read: #{e}"
end
```

#### Using the orgs_deny_policy_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackageDenyPolicy>, Integer, Hash)> orgs_deny_policy_read_with_http_info(org, slug_perm)

```ruby
begin
  # Get a package deny policy.
  data, status_code, headers = api_instance.orgs_deny_policy_read_with_http_info(org, slug_perm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackageDenyPolicy>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_deny_policy_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |

### Return type

[**PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_deny_policy_update

> <PackageDenyPolicy> orgs_deny_policy_update(org, slug_perm, opts)

Update a package deny policy.

Update a package deny policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 
opts = {
  data: CloudsmithApi::PackageDenyPolicyRequest.new({package_query_string: 'package_query_string_example'}) # PackageDenyPolicyRequest | 
}

begin
  # Update a package deny policy.
  result = api_instance.orgs_deny_policy_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_deny_policy_update: #{e}"
end
```

#### Using the orgs_deny_policy_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackageDenyPolicy>, Integer, Hash)> orgs_deny_policy_update_with_http_info(org, slug_perm, opts)

```ruby
begin
  # Update a package deny policy.
  data, status_code, headers = api_instance.orgs_deny_policy_update_with_http_info(org, slug_perm, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackageDenyPolicy>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_deny_policy_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |
| **data** | [**PackageDenyPolicyRequest**](PackageDenyPolicyRequest.md) |  | [optional] |

### Return type

[**PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_invites_create

> <OrganizationInvite> orgs_invites_create(org, opts)

Create an organization invite for a specific user

Create an organization invite for a specific user

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # Create an organization invite for a specific user
  result = api_instance.orgs_invites_create(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_invites_create: #{e}"
end
```

#### Using the orgs_invites_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationInvite>, Integer, Hash)> orgs_invites_create_with_http_info(org, opts)

```ruby
begin
  # Create an organization invite for a specific user
  data, status_code, headers = api_instance.orgs_invites_create_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationInvite>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_invites_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **data** | [**OrganizationInviteRequest**](OrganizationInviteRequest.md) |  | [optional] |

### Return type

[**OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_invites_delete

> orgs_invites_delete(org, slug_perm)

Delete a specific organization invite

Delete a specific organization invite

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 

begin
  # Delete a specific organization invite
  api_instance.orgs_invites_delete(org, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_invites_delete: #{e}"
end
```

#### Using the orgs_invites_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> orgs_invites_delete_with_http_info(org, slug_perm)

```ruby
begin
  # Delete a specific organization invite
  data, status_code, headers = api_instance.orgs_invites_delete_with_http_info(org, slug_perm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_invites_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_invites_extend

> <OrganizationInviteExtend> orgs_invites_extend(org, slug_perm)

Extend an organization invite.

Extend an organization invite.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 

begin
  # Extend an organization invite.
  result = api_instance.orgs_invites_extend(org, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_invites_extend: #{e}"
end
```

#### Using the orgs_invites_extend_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationInviteExtend>, Integer, Hash)> orgs_invites_extend_with_http_info(org, slug_perm)

```ruby
begin
  # Extend an organization invite.
  data, status_code, headers = api_instance.orgs_invites_extend_with_http_info(org, slug_perm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationInviteExtend>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_invites_extend_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |

### Return type

[**OrganizationInviteExtend**](OrganizationInviteExtend.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_invites_list

> <Array<OrganizationInvite>> orgs_invites_list(org, opts)

Get a list of all invites for an organization.

Get a list of all invites for an organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # Get a list of all invites for an organization.
  result = api_instance.orgs_invites_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_invites_list: #{e}"
end
```

#### Using the orgs_invites_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<OrganizationInvite>>, Integer, Hash)> orgs_invites_list_with_http_info(org, opts)

```ruby
begin
  # Get a list of all invites for an organization.
  data, status_code, headers = api_instance.orgs_invites_list_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<OrganizationInvite>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_invites_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |

### Return type

[**Array&lt;OrganizationInvite&gt;**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_invites_partial_update

> <OrganizationInvite> orgs_invites_partial_update(org, slug_perm, opts)

Update a specific organization invite.

Update a specific organization invite.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # Update a specific organization invite.
  result = api_instance.orgs_invites_partial_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_invites_partial_update: #{e}"
end
```

#### Using the orgs_invites_partial_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationInvite>, Integer, Hash)> orgs_invites_partial_update_with_http_info(org, slug_perm, opts)

```ruby
begin
  # Update a specific organization invite.
  data, status_code, headers = api_instance.orgs_invites_partial_update_with_http_info(org, slug_perm, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationInvite>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_invites_partial_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |
| **data** | [**OrganizationInviteUpdateRequestPatch**](OrganizationInviteUpdateRequestPatch.md) |  | [optional] |

### Return type

[**OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_invites_resend

> <OrganizationInviteExtend> orgs_invites_resend(org, slug_perm)

Resend an organization invite.

Resend an organization invite.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 

begin
  # Resend an organization invite.
  result = api_instance.orgs_invites_resend(org, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_invites_resend: #{e}"
end
```

#### Using the orgs_invites_resend_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationInviteExtend>, Integer, Hash)> orgs_invites_resend_with_http_info(org, slug_perm)

```ruby
begin
  # Resend an organization invite.
  data, status_code, headers = api_instance.orgs_invites_resend_with_http_info(org, slug_perm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationInviteExtend>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_invites_resend_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |

### Return type

[**OrganizationInviteExtend**](OrganizationInviteExtend.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_license_policy_create

> <OrganizationPackageLicensePolicy> orgs_license_policy_create(org, opts)

Create a package license policy.

Create a package license policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
opts = {
  data: CloudsmithApi::OrganizationPackageLicensePolicyRequest.new({name: 'name_example', spdx_identifiers: ['spdx_identifiers_example']}) # OrganizationPackageLicensePolicyRequest | 
}

begin
  # Create a package license policy.
  result = api_instance.orgs_license_policy_create(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_create: #{e}"
end
```

#### Using the orgs_license_policy_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationPackageLicensePolicy>, Integer, Hash)> orgs_license_policy_create_with_http_info(org, opts)

```ruby
begin
  # Create a package license policy.
  data, status_code, headers = api_instance.orgs_license_policy_create_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationPackageLicensePolicy>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **data** | [**OrganizationPackageLicensePolicyRequest**](OrganizationPackageLicensePolicyRequest.md) |  | [optional] |

### Return type

[**OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_license_policy_delete

> orgs_license_policy_delete(org, slug_perm)

Delete a package license policy.

Delete a package license policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 

begin
  # Delete a package license policy.
  api_instance.orgs_license_policy_delete(org, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_delete: #{e}"
end
```

#### Using the orgs_license_policy_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> orgs_license_policy_delete_with_http_info(org, slug_perm)

```ruby
begin
  # Delete a package license policy.
  data, status_code, headers = api_instance.orgs_license_policy_delete_with_http_info(org, slug_perm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_license_policy_evaluation_create

> <PackageLicensePolicyEvaluationRequest> orgs_license_policy_evaluation_create(org, policy_slug_perm, opts)

Create an evaluation request for this policy.

Create an evaluation request for this policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
policy_slug_perm = 'policy_slug_perm_example' # String | 
opts = {
  data: { ... } # Object | 
}

begin
  # Create an evaluation request for this policy.
  result = api_instance.orgs_license_policy_evaluation_create(org, policy_slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_evaluation_create: #{e}"
end
```

#### Using the orgs_license_policy_evaluation_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackageLicensePolicyEvaluationRequest>, Integer, Hash)> orgs_license_policy_evaluation_create_with_http_info(org, policy_slug_perm, opts)

```ruby
begin
  # Create an evaluation request for this policy.
  data, status_code, headers = api_instance.orgs_license_policy_evaluation_create_with_http_info(org, policy_slug_perm, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackageLicensePolicyEvaluationRequest>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_evaluation_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **policy_slug_perm** | **String** |  |  |
| **data** | **Object** |  | [optional] |

### Return type

[**PackageLicensePolicyEvaluationRequest**](PackageLicensePolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_license_policy_evaluation_list

> <Array<PackageLicensePolicyEvaluationRequest>> orgs_license_policy_evaluation_list(org, policy_slug_perm, opts)

List evaluation requests for this policy.

List evaluation requests for this policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # List evaluation requests for this policy.
  result = api_instance.orgs_license_policy_evaluation_list(org, policy_slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_evaluation_list: #{e}"
end
```

#### Using the orgs_license_policy_evaluation_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<PackageLicensePolicyEvaluationRequest>>, Integer, Hash)> orgs_license_policy_evaluation_list_with_http_info(org, policy_slug_perm, opts)

```ruby
begin
  # List evaluation requests for this policy.
  data, status_code, headers = api_instance.orgs_license_policy_evaluation_list_with_http_info(org, policy_slug_perm, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<PackageLicensePolicyEvaluationRequest>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_evaluation_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **policy_slug_perm** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |

### Return type

[**Array&lt;PackageLicensePolicyEvaluationRequest&gt;**](PackageLicensePolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_license_policy_evaluation_read

> <PackageLicensePolicyEvaluationRequest> orgs_license_policy_evaluation_read(org, policy_slug_perm, slug_perm)

Retrieve an evaluation request for this policy.

Retrieve an evaluation request for this policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
policy_slug_perm = 'policy_slug_perm_example' # String | 
slug_perm = 'slug_perm_example' # String | 

begin
  # Retrieve an evaluation request for this policy.
  result = api_instance.orgs_license_policy_evaluation_read(org, policy_slug_perm, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_evaluation_read: #{e}"
end
```

#### Using the orgs_license_policy_evaluation_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackageLicensePolicyEvaluationRequest>, Integer, Hash)> orgs_license_policy_evaluation_read_with_http_info(org, policy_slug_perm, slug_perm)

```ruby
begin
  # Retrieve an evaluation request for this policy.
  data, status_code, headers = api_instance.orgs_license_policy_evaluation_read_with_http_info(org, policy_slug_perm, slug_perm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackageLicensePolicyEvaluationRequest>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_evaluation_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **policy_slug_perm** | **String** |  |  |
| **slug_perm** | **String** |  |  |

### Return type

[**PackageLicensePolicyEvaluationRequest**](PackageLicensePolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_license_policy_list

> <Array<OrganizationPackageLicensePolicy>> orgs_license_policy_list(org, opts)

Get a list of all package license policies.

Get a list of all package license policies.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # Get a list of all package license policies.
  result = api_instance.orgs_license_policy_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_list: #{e}"
end
```

#### Using the orgs_license_policy_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<OrganizationPackageLicensePolicy>>, Integer, Hash)> orgs_license_policy_list_with_http_info(org, opts)

```ruby
begin
  # Get a list of all package license policies.
  data, status_code, headers = api_instance.orgs_license_policy_list_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<OrganizationPackageLicensePolicy>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |

### Return type

[**Array&lt;OrganizationPackageLicensePolicy&gt;**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_license_policy_partial_update

> <OrganizationPackageLicensePolicy> orgs_license_policy_partial_update(org, slug_perm, opts)

Partially update a package license policy.

Partially update a package license policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # Partially update a package license policy.
  result = api_instance.orgs_license_policy_partial_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_partial_update: #{e}"
end
```

#### Using the orgs_license_policy_partial_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationPackageLicensePolicy>, Integer, Hash)> orgs_license_policy_partial_update_with_http_info(org, slug_perm, opts)

```ruby
begin
  # Partially update a package license policy.
  data, status_code, headers = api_instance.orgs_license_policy_partial_update_with_http_info(org, slug_perm, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationPackageLicensePolicy>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_partial_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |
| **data** | [**OrganizationPackageLicensePolicyRequestPatch**](OrganizationPackageLicensePolicyRequestPatch.md) |  | [optional] |

### Return type

[**OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_license_policy_read

> <OrganizationPackageLicensePolicy> orgs_license_policy_read(org, slug_perm)

Get a package license policy.

Get a package license policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 

begin
  # Get a package license policy.
  result = api_instance.orgs_license_policy_read(org, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_read: #{e}"
end
```

#### Using the orgs_license_policy_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationPackageLicensePolicy>, Integer, Hash)> orgs_license_policy_read_with_http_info(org, slug_perm)

```ruby
begin
  # Get a package license policy.
  data, status_code, headers = api_instance.orgs_license_policy_read_with_http_info(org, slug_perm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationPackageLicensePolicy>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |

### Return type

[**OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_license_policy_update

> <OrganizationPackageLicensePolicy> orgs_license_policy_update(org, slug_perm, opts)

Update a package license policy.

Update a package license policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 
opts = {
  data: CloudsmithApi::OrganizationPackageLicensePolicyRequest.new({name: 'name_example', spdx_identifiers: ['spdx_identifiers_example']}) # OrganizationPackageLicensePolicyRequest | 
}

begin
  # Update a package license policy.
  result = api_instance.orgs_license_policy_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_update: #{e}"
end
```

#### Using the orgs_license_policy_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationPackageLicensePolicy>, Integer, Hash)> orgs_license_policy_update_with_http_info(org, slug_perm, opts)

```ruby
begin
  # Update a package license policy.
  data, status_code, headers = api_instance.orgs_license_policy_update_with_http_info(org, slug_perm, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationPackageLicensePolicy>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |
| **data** | [**OrganizationPackageLicensePolicyRequest**](OrganizationPackageLicensePolicyRequest.md) |  | [optional] |

### Return type

[**OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_license_policy_violation_list

> <PackageLicensePolicyViolationLogCursorPage> orgs_license_policy_violation_list(org, opts)

List all current license policy violations for this Organization.

List all current license policy violations for this Organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # List all current license policy violations for this Organization.
  result = api_instance.orgs_license_policy_violation_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_violation_list: #{e}"
end
```

#### Using the orgs_license_policy_violation_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackageLicensePolicyViolationLogCursorPage>, Integer, Hash)> orgs_license_policy_violation_list_with_http_info(org, opts)

```ruby
begin
  # List all current license policy violations for this Organization.
  data, status_code, headers = api_instance.orgs_license_policy_violation_list_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackageLicensePolicyViolationLogCursorPage>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_license_policy_violation_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **cursor** | **String** | The pagination cursor value. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |

### Return type

[**PackageLicensePolicyViolationLogCursorPage**](PackageLicensePolicyViolationLogCursorPage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_list

> <Array<Organization>> orgs_list(opts)

Get a list of all the organizations you are associated with.

Get a list of all the organizations you are associated with.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
opts = {
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  sort: 'sort_example' # String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name, created_at, slug.
}

begin
  # Get a list of all the organizations you are associated with.
  result = api_instance.orgs_list(opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_list: #{e}"
end
```

#### Using the orgs_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<Organization>>, Integer, Hash)> orgs_list_with_http_info(opts)

```ruby
begin
  # Get a list of all the organizations you are associated with.
  data, status_code, headers = api_instance.orgs_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<Organization>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |
| **sort** | **String** | A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name, created_at, slug. | [optional][default to &#39;name&#39;] |

### Return type

[**Array&lt;Organization&gt;**](Organization.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_members_delete

> orgs_members_delete(org, member)

Removes a member from the organization.

Removes a member from the organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
member = 'member_example' # String | 

begin
  # Removes a member from the organization.
  api_instance.orgs_members_delete(org, member)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_members_delete: #{e}"
end
```

#### Using the orgs_members_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> orgs_members_delete_with_http_info(org, member)

```ruby
begin
  # Removes a member from the organization.
  data, status_code, headers = api_instance.orgs_members_delete_with_http_info(org, member)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_members_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **member** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_members_list

> <Array<OrganizationMembership>> orgs_members_list(org, opts)

Get the details for all organization members.

Get the details for all organization members.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
opts = {
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  is_active: true, # Boolean | Filter for active/inactive users.
  query: 'query_example', # String | A search term for querying of members within an Organization.Available options are: email, org, user, userslug, inactive, user_name, role
  sort: 'sort_example' # String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-user_name`). Available options: user_name, role.
}

begin
  # Get the details for all organization members.
  result = api_instance.orgs_members_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_members_list: #{e}"
end
```

#### Using the orgs_members_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<OrganizationMembership>>, Integer, Hash)> orgs_members_list_with_http_info(org, opts)

```ruby
begin
  # Get the details for all organization members.
  data, status_code, headers = api_instance.orgs_members_list_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<OrganizationMembership>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_members_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |
| **is_active** | **Boolean** | Filter for active/inactive users. | [optional][default to false] |
| **query** | **String** | A search term for querying of members within an Organization.Available options are: email, org, user, userslug, inactive, user_name, role | [optional] |
| **sort** | **String** | A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-user_name&#x60;). Available options: user_name, role. | [optional][default to &#39;user_name&#39;] |

### Return type

[**Array&lt;OrganizationMembership&gt;**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_members_partial_update

> <OrganizationMembership> orgs_members_partial_update(org, member, opts)

Views for working with organization members.

Views for working with organization members.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
member = 'member_example' # String | 
opts = {
  data: { ... } # Object | 
}

begin
  # Views for working with organization members.
  result = api_instance.orgs_members_partial_update(org, member, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_members_partial_update: #{e}"
end
```

#### Using the orgs_members_partial_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationMembership>, Integer, Hash)> orgs_members_partial_update_with_http_info(org, member, opts)

```ruby
begin
  # Views for working with organization members.
  data, status_code, headers = api_instance.orgs_members_partial_update_with_http_info(org, member, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationMembership>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_members_partial_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **member** | **String** |  |  |
| **data** | **Object** |  | [optional] |

### Return type

[**OrganizationMembership**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_members_read

> <OrganizationMembership> orgs_members_read(org, member)

Get the details for a specific organization member.

Get the details for a specific organization member.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
member = 'member_example' # String | 

begin
  # Get the details for a specific organization member.
  result = api_instance.orgs_members_read(org, member)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_members_read: #{e}"
end
```

#### Using the orgs_members_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationMembership>, Integer, Hash)> orgs_members_read_with_http_info(org, member)

```ruby
begin
  # Get the details for a specific organization member.
  data, status_code, headers = api_instance.orgs_members_read_with_http_info(org, member)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationMembership>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_members_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **member** | **String** |  |  |

### Return type

[**OrganizationMembership**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_members_refresh

> orgs_members_refresh(org, member)

Refresh a member of the organization's API key.

Refresh a member of the organization's API key.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
member = 'member_example' # String | 

begin
  # Refresh a member of the organization's API key.
  api_instance.orgs_members_refresh(org, member)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_members_refresh: #{e}"
end
```

#### Using the orgs_members_refresh_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> orgs_members_refresh_with_http_info(org, member)

```ruby
begin
  # Refresh a member of the organization's API key.
  data, status_code, headers = api_instance.orgs_members_refresh_with_http_info(org, member)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_members_refresh_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **member** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_members_remove

> orgs_members_remove(org, member)

Removes a member from the organization (deprecated, use DELETE instead).

Removes a member from the organization (deprecated, use DELETE instead).

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
member = 'member_example' # String | 

begin
  # Removes a member from the organization (deprecated, use DELETE instead).
  api_instance.orgs_members_remove(org, member)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_members_remove: #{e}"
end
```

#### Using the orgs_members_remove_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> orgs_members_remove_with_http_info(org, member)

```ruby
begin
  # Removes a member from the organization (deprecated, use DELETE instead).
  data, status_code, headers = api_instance.orgs_members_remove_with_http_info(org, member)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_members_remove_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **member** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_members_update_role

> <OrganizationMembershipRoleUpdate> orgs_members_update_role(org, member, opts)

Update a member's role in the organization.

Update a member's role in the organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # Update a member's role in the organization.
  result = api_instance.orgs_members_update_role(org, member, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_members_update_role: #{e}"
end
```

#### Using the orgs_members_update_role_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationMembershipRoleUpdate>, Integer, Hash)> orgs_members_update_role_with_http_info(org, member, opts)

```ruby
begin
  # Update a member's role in the organization.
  data, status_code, headers = api_instance.orgs_members_update_role_with_http_info(org, member, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationMembershipRoleUpdate>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_members_update_role_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **member** | **String** |  |  |
| **data** | [**OrganizationMembershipRoleUpdateRequestPatch**](OrganizationMembershipRoleUpdateRequestPatch.md) |  | [optional] |

### Return type

[**OrganizationMembershipRoleUpdate**](OrganizationMembershipRoleUpdate.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_members_update_visibility

> <OrganizationMembershipVisibilityUpdate> orgs_members_update_visibility(org, member, opts)

Update a member's visibility in the organization.

Update a member's visibility in the organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # Update a member's visibility in the organization.
  result = api_instance.orgs_members_update_visibility(org, member, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_members_update_visibility: #{e}"
end
```

#### Using the orgs_members_update_visibility_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationMembershipVisibilityUpdate>, Integer, Hash)> orgs_members_update_visibility_with_http_info(org, member, opts)

```ruby
begin
  # Update a member's visibility in the organization.
  data, status_code, headers = api_instance.orgs_members_update_visibility_with_http_info(org, member, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationMembershipVisibilityUpdate>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_members_update_visibility_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **member** | **String** |  |  |
| **data** | [**OrganizationMembershipVisibilityUpdateRequestPatch**](OrganizationMembershipVisibilityUpdateRequestPatch.md) |  | [optional] |

### Return type

[**OrganizationMembershipVisibilityUpdate**](OrganizationMembershipVisibilityUpdate.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_openid_connect_create

> <ProviderSettingsWrite> orgs_openid_connect_create(org, opts)

Create the OpenID Connect provider settings for the org.

Create the OpenID Connect provider settings for the org.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
opts = {
  data: CloudsmithApi::ProviderSettingsWriteRequest.new({claims: 3.56, enabled: false, name: 'name_example', provider_url: 'provider_url_example'}) # ProviderSettingsWriteRequest | 
}

begin
  # Create the OpenID Connect provider settings for the org.
  result = api_instance.orgs_openid_connect_create(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_openid_connect_create: #{e}"
end
```

#### Using the orgs_openid_connect_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProviderSettingsWrite>, Integer, Hash)> orgs_openid_connect_create_with_http_info(org, opts)

```ruby
begin
  # Create the OpenID Connect provider settings for the org.
  data, status_code, headers = api_instance.orgs_openid_connect_create_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProviderSettingsWrite>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_openid_connect_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **data** | [**ProviderSettingsWriteRequest**](ProviderSettingsWriteRequest.md) |  | [optional] |

### Return type

[**ProviderSettingsWrite**](ProviderSettingsWrite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_openid_connect_delete

> orgs_openid_connect_delete(org, slug_perm)

Delete a specific OpenID Connect provider setting for the org.

Delete a specific OpenID Connect provider setting for the org.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 

begin
  # Delete a specific OpenID Connect provider setting for the org.
  api_instance.orgs_openid_connect_delete(org, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_openid_connect_delete: #{e}"
end
```

#### Using the orgs_openid_connect_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> orgs_openid_connect_delete_with_http_info(org, slug_perm)

```ruby
begin
  # Delete a specific OpenID Connect provider setting for the org.
  data, status_code, headers = api_instance.orgs_openid_connect_delete_with_http_info(org, slug_perm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_openid_connect_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_openid_connect_dynamic_mappings_list

> <Array<DynamicMapping>> orgs_openid_connect_dynamic_mappings_list(org, provider_setting, opts)

Retrieve the list of OpenID Connect dynamic mappings for the provider setting.

Retrieve the list of OpenID Connect dynamic mappings for the provider setting.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
provider_setting = 'provider_setting_example' # String | 
opts = {
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  # Retrieve the list of OpenID Connect dynamic mappings for the provider setting.
  result = api_instance.orgs_openid_connect_dynamic_mappings_list(org, provider_setting, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_openid_connect_dynamic_mappings_list: #{e}"
end
```

#### Using the orgs_openid_connect_dynamic_mappings_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<DynamicMapping>>, Integer, Hash)> orgs_openid_connect_dynamic_mappings_list_with_http_info(org, provider_setting, opts)

```ruby
begin
  # Retrieve the list of OpenID Connect dynamic mappings for the provider setting.
  data, status_code, headers = api_instance.orgs_openid_connect_dynamic_mappings_list_with_http_info(org, provider_setting, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<DynamicMapping>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_openid_connect_dynamic_mappings_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **provider_setting** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |

### Return type

[**Array&lt;DynamicMapping&gt;**](DynamicMapping.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_openid_connect_dynamic_mappings_read

> <DynamicMapping> orgs_openid_connect_dynamic_mappings_read(org, provider_setting, claim_value)

Retrieve a specific OpenID Connect dynamic mapping for the provider setting.

Retrieve a specific OpenID Connect dynamic mapping for the provider setting.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
provider_setting = 'provider_setting_example' # String | 
claim_value = 'claim_value_example' # String | 

begin
  # Retrieve a specific OpenID Connect dynamic mapping for the provider setting.
  result = api_instance.orgs_openid_connect_dynamic_mappings_read(org, provider_setting, claim_value)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_openid_connect_dynamic_mappings_read: #{e}"
end
```

#### Using the orgs_openid_connect_dynamic_mappings_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DynamicMapping>, Integer, Hash)> orgs_openid_connect_dynamic_mappings_read_with_http_info(org, provider_setting, claim_value)

```ruby
begin
  # Retrieve a specific OpenID Connect dynamic mapping for the provider setting.
  data, status_code, headers = api_instance.orgs_openid_connect_dynamic_mappings_read_with_http_info(org, provider_setting, claim_value)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DynamicMapping>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_openid_connect_dynamic_mappings_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **provider_setting** | **String** |  |  |
| **claim_value** | **String** |  |  |

### Return type

[**DynamicMapping**](DynamicMapping.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_openid_connect_list

> <Array<ProviderSettings>> orgs_openid_connect_list(org, opts)

Retrieve the list of OpenID Connect provider settings for the org.

Retrieve the list of OpenID Connect provider settings for the org.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
opts = {
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  query: 'query_example', # String | A search term for querying of OpenID Connect (OIDC) provider settings.Available options are: name, provider_url, service_account
  sort: 'sort_example' # String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name.
}

begin
  # Retrieve the list of OpenID Connect provider settings for the org.
  result = api_instance.orgs_openid_connect_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_openid_connect_list: #{e}"
end
```

#### Using the orgs_openid_connect_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<ProviderSettings>>, Integer, Hash)> orgs_openid_connect_list_with_http_info(org, opts)

```ruby
begin
  # Retrieve the list of OpenID Connect provider settings for the org.
  data, status_code, headers = api_instance.orgs_openid_connect_list_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<ProviderSettings>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_openid_connect_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |
| **query** | **String** | A search term for querying of OpenID Connect (OIDC) provider settings.Available options are: name, provider_url, service_account | [optional] |
| **sort** | **String** | A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name. | [optional][default to &#39;name&#39;] |

### Return type

[**Array&lt;ProviderSettings&gt;**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_openid_connect_partial_update

> <ProviderSettingsWrite> orgs_openid_connect_partial_update(org, slug_perm, opts)

Update a specific OpenID Connect provider setting for the org.

Update a specific OpenID Connect provider setting for the org.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 
opts = {
  data: CloudsmithApi::ProviderSettingsWriteRequestPatch.new # ProviderSettingsWriteRequestPatch | 
}

begin
  # Update a specific OpenID Connect provider setting for the org.
  result = api_instance.orgs_openid_connect_partial_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_openid_connect_partial_update: #{e}"
end
```

#### Using the orgs_openid_connect_partial_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProviderSettingsWrite>, Integer, Hash)> orgs_openid_connect_partial_update_with_http_info(org, slug_perm, opts)

```ruby
begin
  # Update a specific OpenID Connect provider setting for the org.
  data, status_code, headers = api_instance.orgs_openid_connect_partial_update_with_http_info(org, slug_perm, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProviderSettingsWrite>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_openid_connect_partial_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |
| **data** | [**ProviderSettingsWriteRequestPatch**](ProviderSettingsWriteRequestPatch.md) |  | [optional] |

### Return type

[**ProviderSettingsWrite**](ProviderSettingsWrite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_openid_connect_read

> <ProviderSettings> orgs_openid_connect_read(org, slug_perm)

Retrieve a specific OpenID Connect provider setting for the org.

Retrieve a specific OpenID Connect provider setting for the org.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 

begin
  # Retrieve a specific OpenID Connect provider setting for the org.
  result = api_instance.orgs_openid_connect_read(org, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_openid_connect_read: #{e}"
end
```

#### Using the orgs_openid_connect_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProviderSettings>, Integer, Hash)> orgs_openid_connect_read_with_http_info(org, slug_perm)

```ruby
begin
  # Retrieve a specific OpenID Connect provider setting for the org.
  data, status_code, headers = api_instance.orgs_openid_connect_read_with_http_info(org, slug_perm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProviderSettings>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_openid_connect_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |

### Return type

[**ProviderSettings**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_openid_connect_update

> <ProviderSettingsWrite> orgs_openid_connect_update(org, slug_perm, opts)

Update a specific OpenID Connect provider setting for the org.

Update a specific OpenID Connect provider setting for the org.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 
opts = {
  data: CloudsmithApi::ProviderSettingsWriteRequest.new({claims: 3.56, enabled: false, name: 'name_example', provider_url: 'provider_url_example'}) # ProviderSettingsWriteRequest | 
}

begin
  # Update a specific OpenID Connect provider setting for the org.
  result = api_instance.orgs_openid_connect_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_openid_connect_update: #{e}"
end
```

#### Using the orgs_openid_connect_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProviderSettingsWrite>, Integer, Hash)> orgs_openid_connect_update_with_http_info(org, slug_perm, opts)

```ruby
begin
  # Update a specific OpenID Connect provider setting for the org.
  data, status_code, headers = api_instance.orgs_openid_connect_update_with_http_info(org, slug_perm, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProviderSettingsWrite>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_openid_connect_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |
| **data** | [**ProviderSettingsWriteRequest**](ProviderSettingsWriteRequest.md) |  | [optional] |

### Return type

[**ProviderSettingsWrite**](ProviderSettingsWrite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_read

> <Organization> orgs_read(org)

Get the details for the specific organization.

Get the details for the specific organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 

begin
  # Get the details for the specific organization.
  result = api_instance.orgs_read(org)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_read: #{e}"
end
```

#### Using the orgs_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Organization>, Integer, Hash)> orgs_read_with_http_info(org)

```ruby
begin
  # Get the details for the specific organization.
  data, status_code, headers = api_instance.orgs_read_with_http_info(org)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Organization>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |

### Return type

[**Organization**](Organization.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_retrieve_usage_limits

> <OrgsRetrieveUsageLimits200Response> orgs_retrieve_usage_limits(org)



### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 

begin
  
  result = api_instance.orgs_retrieve_usage_limits(org)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_retrieve_usage_limits: #{e}"
end
```

#### Using the orgs_retrieve_usage_limits_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrgsRetrieveUsageLimits200Response>, Integer, Hash)> orgs_retrieve_usage_limits_with_http_info(org)

```ruby
begin
  
  data, status_code, headers = api_instance.orgs_retrieve_usage_limits_with_http_info(org)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrgsRetrieveUsageLimits200Response>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_retrieve_usage_limits_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |

### Return type

[**OrgsRetrieveUsageLimits200Response**](OrgsRetrieveUsageLimits200Response.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_saml_authentication_partial_update

> <OrganizationSAMLAuth> orgs_saml_authentication_partial_update(org, opts)

Update the SAML Authentication settings for this Organization.

Update the SAML Authentication settings for this Organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # Update the SAML Authentication settings for this Organization.
  result = api_instance.orgs_saml_authentication_partial_update(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_saml_authentication_partial_update: #{e}"
end
```

#### Using the orgs_saml_authentication_partial_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationSAMLAuth>, Integer, Hash)> orgs_saml_authentication_partial_update_with_http_info(org, opts)

```ruby
begin
  # Update the SAML Authentication settings for this Organization.
  data, status_code, headers = api_instance.orgs_saml_authentication_partial_update_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationSAMLAuth>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_saml_authentication_partial_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **data** | [**OrganizationSAMLAuthRequestPatch**](OrganizationSAMLAuthRequestPatch.md) |  | [optional] |

### Return type

[**OrganizationSAMLAuth**](OrganizationSAMLAuth.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_saml_authentication_read

> <OrganizationSAMLAuth> orgs_saml_authentication_read(org)

Retrieve the SAML Authentication settings for this Organization.

Retrieve the SAML Authentication settings for this Organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 

begin
  # Retrieve the SAML Authentication settings for this Organization.
  result = api_instance.orgs_saml_authentication_read(org)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_saml_authentication_read: #{e}"
end
```

#### Using the orgs_saml_authentication_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationSAMLAuth>, Integer, Hash)> orgs_saml_authentication_read_with_http_info(org)

```ruby
begin
  # Retrieve the SAML Authentication settings for this Organization.
  data, status_code, headers = api_instance.orgs_saml_authentication_read_with_http_info(org)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationSAMLAuth>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_saml_authentication_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |

### Return type

[**OrganizationSAMLAuth**](OrganizationSAMLAuth.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_saml_group_sync_create

> <OrganizationGroupSync> orgs_saml_group_sync_create(org, opts)

Create a new SAML Group Sync mapping within an organization.

Create a new SAML Group Sync mapping within an organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
opts = {
  data: CloudsmithApi::OrganizationGroupSyncRequest.new({idp_key: 'idp_key_example', idp_value: 'idp_value_example', organization: 'organization_example', team: 'team_example'}) # OrganizationGroupSyncRequest | 
}

begin
  # Create a new SAML Group Sync mapping within an organization.
  result = api_instance.orgs_saml_group_sync_create(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_saml_group_sync_create: #{e}"
end
```

#### Using the orgs_saml_group_sync_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationGroupSync>, Integer, Hash)> orgs_saml_group_sync_create_with_http_info(org, opts)

```ruby
begin
  # Create a new SAML Group Sync mapping within an organization.
  data, status_code, headers = api_instance.orgs_saml_group_sync_create_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationGroupSync>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_saml_group_sync_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **data** | [**OrganizationGroupSyncRequest**](OrganizationGroupSyncRequest.md) |  | [optional] |

### Return type

[**OrganizationGroupSync**](OrganizationGroupSync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_saml_group_sync_delete

> orgs_saml_group_sync_delete(org, slug_perm)

Delete a SAML Group Sync mapping from an organization.

Delete a SAML Group Sync mapping from an organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 

begin
  # Delete a SAML Group Sync mapping from an organization.
  api_instance.orgs_saml_group_sync_delete(org, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_saml_group_sync_delete: #{e}"
end
```

#### Using the orgs_saml_group_sync_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> orgs_saml_group_sync_delete_with_http_info(org, slug_perm)

```ruby
begin
  # Delete a SAML Group Sync mapping from an organization.
  data, status_code, headers = api_instance.orgs_saml_group_sync_delete_with_http_info(org, slug_perm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_saml_group_sync_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_saml_group_sync_disable

> orgs_saml_group_sync_disable(org)

Disable SAML Group Sync for this organization.

Disable SAML Group Sync for this organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 

begin
  # Disable SAML Group Sync for this organization.
  api_instance.orgs_saml_group_sync_disable(org)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_saml_group_sync_disable: #{e}"
end
```

#### Using the orgs_saml_group_sync_disable_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> orgs_saml_group_sync_disable_with_http_info(org)

```ruby
begin
  # Disable SAML Group Sync for this organization.
  data, status_code, headers = api_instance.orgs_saml_group_sync_disable_with_http_info(org)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_saml_group_sync_disable_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_saml_group_sync_enable

> orgs_saml_group_sync_enable(org)

Enable SAML Group Sync for this organization.

Enable SAML Group Sync for this organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 

begin
  # Enable SAML Group Sync for this organization.
  api_instance.orgs_saml_group_sync_enable(org)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_saml_group_sync_enable: #{e}"
end
```

#### Using the orgs_saml_group_sync_enable_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> orgs_saml_group_sync_enable_with_http_info(org)

```ruby
begin
  # Enable SAML Group Sync for this organization.
  data, status_code, headers = api_instance.orgs_saml_group_sync_enable_with_http_info(org)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_saml_group_sync_enable_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_saml_group_sync_list

> <Array<OrganizationGroupSync>> orgs_saml_group_sync_list(org, opts)

Get the details of all SAML Group Sync mapping within an organization.

Get the details of all SAML Group Sync mapping within an organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # Get the details of all SAML Group Sync mapping within an organization.
  result = api_instance.orgs_saml_group_sync_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_saml_group_sync_list: #{e}"
end
```

#### Using the orgs_saml_group_sync_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<OrganizationGroupSync>>, Integer, Hash)> orgs_saml_group_sync_list_with_http_info(org, opts)

```ruby
begin
  # Get the details of all SAML Group Sync mapping within an organization.
  data, status_code, headers = api_instance.orgs_saml_group_sync_list_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<OrganizationGroupSync>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_saml_group_sync_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |

### Return type

[**Array&lt;OrganizationGroupSync&gt;**](OrganizationGroupSync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_saml_group_sync_status

> <OrganizationGroupSyncStatus> orgs_saml_group_sync_status(org)

Retrieve the SAML Group Sync status for this organization.

Retrieve the SAML Group Sync status for this organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 

begin
  # Retrieve the SAML Group Sync status for this organization.
  result = api_instance.orgs_saml_group_sync_status(org)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_saml_group_sync_status: #{e}"
end
```

#### Using the orgs_saml_group_sync_status_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationGroupSyncStatus>, Integer, Hash)> orgs_saml_group_sync_status_with_http_info(org)

```ruby
begin
  # Retrieve the SAML Group Sync status for this organization.
  data, status_code, headers = api_instance.orgs_saml_group_sync_status_with_http_info(org)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationGroupSyncStatus>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_saml_group_sync_status_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |

### Return type

[**OrganizationGroupSyncStatus**](OrganizationGroupSyncStatus.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_services_create

> <Service> orgs_services_create(org, opts)

Create a service within an organization.

Create a service within an organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
opts = {
  data: CloudsmithApi::ServiceRequest.new({name: 'name_example'}) # ServiceRequest | 
}

begin
  # Create a service within an organization.
  result = api_instance.orgs_services_create(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_services_create: #{e}"
end
```

#### Using the orgs_services_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Service>, Integer, Hash)> orgs_services_create_with_http_info(org, opts)

```ruby
begin
  # Create a service within an organization.
  data, status_code, headers = api_instance.orgs_services_create_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Service>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_services_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **data** | [**ServiceRequest**](ServiceRequest.md) |  | [optional] |

### Return type

[**Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_services_delete

> orgs_services_delete(org, service)

Delete a specific service

Delete a specific service

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
service = 'service_example' # String | 

begin
  # Delete a specific service
  api_instance.orgs_services_delete(org, service)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_services_delete: #{e}"
end
```

#### Using the orgs_services_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> orgs_services_delete_with_http_info(org, service)

```ruby
begin
  # Delete a specific service
  data, status_code, headers = api_instance.orgs_services_delete_with_http_info(org, service)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_services_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **service** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_services_list

> <Array<Service>> orgs_services_list(org, opts)

Get a list of all services within an organization.

Get a list of all services within an organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
opts = {
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  query: 'query_example', # String | A search term for querying of services within an Organization.Available options are: name, role
  sort: 'sort_example' # String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-created_at`). Available options: created_at, name, role.
}

begin
  # Get a list of all services within an organization.
  result = api_instance.orgs_services_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_services_list: #{e}"
end
```

#### Using the orgs_services_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<Service>>, Integer, Hash)> orgs_services_list_with_http_info(org, opts)

```ruby
begin
  # Get a list of all services within an organization.
  data, status_code, headers = api_instance.orgs_services_list_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<Service>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_services_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |
| **query** | **String** | A search term for querying of services within an Organization.Available options are: name, role | [optional] |
| **sort** | **String** | A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-created_at&#x60;). Available options: created_at, name, role. | [optional][default to &#39;created_at&#39;] |

### Return type

[**Array&lt;Service&gt;**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_services_partial_update

> <Service> orgs_services_partial_update(org, service, opts)

Update a service within an organization.

Update a service within an organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # Update a service within an organization.
  result = api_instance.orgs_services_partial_update(org, service, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_services_partial_update: #{e}"
end
```

#### Using the orgs_services_partial_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Service>, Integer, Hash)> orgs_services_partial_update_with_http_info(org, service, opts)

```ruby
begin
  # Update a service within an organization.
  data, status_code, headers = api_instance.orgs_services_partial_update_with_http_info(org, service, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Service>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_services_partial_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **service** | **String** |  |  |
| **data** | [**ServiceRequestPatch**](ServiceRequestPatch.md) |  | [optional] |

### Return type

[**Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_services_read

> <Service> orgs_services_read(org, service)

Retrieve details of a single service within an organization.

Retrieve details of a single service within an organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
service = 'service_example' # String | 

begin
  # Retrieve details of a single service within an organization.
  result = api_instance.orgs_services_read(org, service)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_services_read: #{e}"
end
```

#### Using the orgs_services_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Service>, Integer, Hash)> orgs_services_read_with_http_info(org, service)

```ruby
begin
  # Retrieve details of a single service within an organization.
  data, status_code, headers = api_instance.orgs_services_read_with_http_info(org, service)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Service>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_services_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **service** | **String** |  |  |

### Return type

[**Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_services_refresh

> <Service> orgs_services_refresh(org, service)

Refresh service API token.

Refresh service API token.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
service = 'service_example' # String | 

begin
  # Refresh service API token.
  result = api_instance.orgs_services_refresh(org, service)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_services_refresh: #{e}"
end
```

#### Using the orgs_services_refresh_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Service>, Integer, Hash)> orgs_services_refresh_with_http_info(org, service)

```ruby
begin
  # Refresh service API token.
  data, status_code, headers = api_instance.orgs_services_refresh_with_http_info(org, service)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Service>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_services_refresh_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **service** | **String** |  |  |

### Return type

[**Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_teams_create

> <OrganizationTeam> orgs_teams_create(org, opts)

Create a team for this organization.

Create a team for this organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
opts = {
  data: CloudsmithApi::OrganizationTeamRequest.new({name: 'name_example'}) # OrganizationTeamRequest | 
}

begin
  # Create a team for this organization.
  result = api_instance.orgs_teams_create(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_teams_create: #{e}"
end
```

#### Using the orgs_teams_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationTeam>, Integer, Hash)> orgs_teams_create_with_http_info(org, opts)

```ruby
begin
  # Create a team for this organization.
  data, status_code, headers = api_instance.orgs_teams_create_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationTeam>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_teams_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **data** | [**OrganizationTeamRequest**](OrganizationTeamRequest.md) |  | [optional] |

### Return type

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_teams_delete

> orgs_teams_delete(org, team)

Delete a specific team in a organization.

Delete a specific team in a organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
team = 'team_example' # String | 

begin
  # Delete a specific team in a organization.
  api_instance.orgs_teams_delete(org, team)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_teams_delete: #{e}"
end
```

#### Using the orgs_teams_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> orgs_teams_delete_with_http_info(org, team)

```ruby
begin
  # Delete a specific team in a organization.
  data, status_code, headers = api_instance.orgs_teams_delete_with_http_info(org, team)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_teams_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **team** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_teams_list

> <Array<OrganizationTeam>> orgs_teams_list(org, opts)

Get the details of all teams within an organization.

Get the details of all teams within an organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
opts = {
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  for_user: true, # Boolean | Filter for teams that you are a member of.
  query: 'query_example', # String | A search term for querying of teams within an Organization.Available options are: name, slug, user, userslug
  sort: 'sort_example' # String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name, members.
}

begin
  # Get the details of all teams within an organization.
  result = api_instance.orgs_teams_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_teams_list: #{e}"
end
```

#### Using the orgs_teams_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<OrganizationTeam>>, Integer, Hash)> orgs_teams_list_with_http_info(org, opts)

```ruby
begin
  # Get the details of all teams within an organization.
  data, status_code, headers = api_instance.orgs_teams_list_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<OrganizationTeam>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_teams_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |
| **for_user** | **Boolean** | Filter for teams that you are a member of. | [optional][default to false] |
| **query** | **String** | A search term for querying of teams within an Organization.Available options are: name, slug, user, userslug | [optional] |
| **sort** | **String** | A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name, members. | [optional][default to &#39;name&#39;] |

### Return type

[**Array&lt;OrganizationTeam&gt;**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_teams_members_create

> <OrganizationTeamMembers> orgs_teams_members_create(org, team, opts)

Add users to a team.

Add users to a team.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
team = 'team_example' # String | 
opts = {
  data: CloudsmithApi::OrganizationTeamMembers.new({members: [CloudsmithApi::OrganizationTeamServiceMember.new({role: 'role_example', user: 'user_example'})]}) # OrganizationTeamMembers | 
}

begin
  # Add users to a team.
  result = api_instance.orgs_teams_members_create(org, team, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_teams_members_create: #{e}"
end
```

#### Using the orgs_teams_members_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationTeamMembers>, Integer, Hash)> orgs_teams_members_create_with_http_info(org, team, opts)

```ruby
begin
  # Add users to a team.
  data, status_code, headers = api_instance.orgs_teams_members_create_with_http_info(org, team, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationTeamMembers>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_teams_members_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **team** | **String** |  |  |
| **data** | [**OrganizationTeamMembers**](OrganizationTeamMembers.md) |  | [optional] |

### Return type

[**OrganizationTeamMembers**](OrganizationTeamMembers.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_teams_members_list

> <OrganizationTeamMembers> orgs_teams_members_list(org, team, opts)

List all members for the team.

List all members for the team.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
team = 'team_example' # String | 
opts = {
  user_kind: 'user_kind_example' # String | Filter accounts by type. Possible values are 'user' and 'service'. If not provided, only users are returned.
}

begin
  # List all members for the team.
  result = api_instance.orgs_teams_members_list(org, team, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_teams_members_list: #{e}"
end
```

#### Using the orgs_teams_members_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationTeamMembers>, Integer, Hash)> orgs_teams_members_list_with_http_info(org, team, opts)

```ruby
begin
  # List all members for the team.
  data, status_code, headers = api_instance.orgs_teams_members_list_with_http_info(org, team, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationTeamMembers>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_teams_members_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **team** | **String** |  |  |
| **user_kind** | **String** | Filter accounts by type. Possible values are &#39;user&#39; and &#39;service&#39;. If not provided, only users are returned. | [optional] |

### Return type

[**OrganizationTeamMembers**](OrganizationTeamMembers.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_teams_members_update

> <OrganizationTeamMembers> orgs_teams_members_update(org, team, opts)

Replace all team members.

Replace all team members.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
team = 'team_example' # String | 
opts = {
  data: CloudsmithApi::OrganizationTeamMembers.new({members: [CloudsmithApi::OrganizationTeamServiceMember.new({role: 'role_example', user: 'user_example'})]}) # OrganizationTeamMembers | 
}

begin
  # Replace all team members.
  result = api_instance.orgs_teams_members_update(org, team, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_teams_members_update: #{e}"
end
```

#### Using the orgs_teams_members_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationTeamMembers>, Integer, Hash)> orgs_teams_members_update_with_http_info(org, team, opts)

```ruby
begin
  # Replace all team members.
  data, status_code, headers = api_instance.orgs_teams_members_update_with_http_info(org, team, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationTeamMembers>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_teams_members_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **team** | **String** |  |  |
| **data** | [**OrganizationTeamMembers**](OrganizationTeamMembers.md) |  | [optional] |

### Return type

[**OrganizationTeamMembers**](OrganizationTeamMembers.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_teams_partial_update

> <OrganizationTeam> orgs_teams_partial_update(org, team, opts)

Update a specific team in a organization.

Update a specific team in a organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # Update a specific team in a organization.
  result = api_instance.orgs_teams_partial_update(org, team, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_teams_partial_update: #{e}"
end
```

#### Using the orgs_teams_partial_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationTeam>, Integer, Hash)> orgs_teams_partial_update_with_http_info(org, team, opts)

```ruby
begin
  # Update a specific team in a organization.
  data, status_code, headers = api_instance.orgs_teams_partial_update_with_http_info(org, team, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationTeam>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_teams_partial_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **team** | **String** |  |  |
| **data** | [**OrganizationTeamRequestPatch**](OrganizationTeamRequestPatch.md) |  | [optional] |

### Return type

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_teams_read

> <OrganizationTeam> orgs_teams_read(org, team)

Get the details of a specific team within an organization.

Get the details of a specific team within an organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
team = 'team_example' # String | 

begin
  # Get the details of a specific team within an organization.
  result = api_instance.orgs_teams_read(org, team)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_teams_read: #{e}"
end
```

#### Using the orgs_teams_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationTeam>, Integer, Hash)> orgs_teams_read_with_http_info(org, team)

```ruby
begin
  # Get the details of a specific team within an organization.
  data, status_code, headers = api_instance.orgs_teams_read_with_http_info(org, team)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationTeam>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_teams_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **team** | **String** |  |  |

### Return type

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_update_usage_limits

> <OrgsUpdateUsageLimits200Response> orgs_update_usage_limits(org, opts)



### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
opts = {
  data: CloudsmithApi::OrganizationUsageUpdateRequestPatch.new # OrganizationUsageUpdateRequestPatch | 
}

begin
  
  result = api_instance.orgs_update_usage_limits(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_update_usage_limits: #{e}"
end
```

#### Using the orgs_update_usage_limits_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrgsUpdateUsageLimits200Response>, Integer, Hash)> orgs_update_usage_limits_with_http_info(org, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.orgs_update_usage_limits_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrgsUpdateUsageLimits200Response>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_update_usage_limits_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **data** | [**OrganizationUsageUpdateRequestPatch**](OrganizationUsageUpdateRequestPatch.md) |  | [optional] |

### Return type

[**OrgsUpdateUsageLimits200Response**](OrgsUpdateUsageLimits200Response.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_vulnerability_policy_create

> <OrganizationPackageVulnerabilityPolicy> orgs_vulnerability_policy_create(org, opts)

Create a package vulnerability policy.

Create a package vulnerability policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
opts = {
  data: CloudsmithApi::OrganizationPackageVulnerabilityPolicyRequest.new({name: 'name_example'}) # OrganizationPackageVulnerabilityPolicyRequest | 
}

begin
  # Create a package vulnerability policy.
  result = api_instance.orgs_vulnerability_policy_create(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_create: #{e}"
end
```

#### Using the orgs_vulnerability_policy_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationPackageVulnerabilityPolicy>, Integer, Hash)> orgs_vulnerability_policy_create_with_http_info(org, opts)

```ruby
begin
  # Create a package vulnerability policy.
  data, status_code, headers = api_instance.orgs_vulnerability_policy_create_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationPackageVulnerabilityPolicy>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **data** | [**OrganizationPackageVulnerabilityPolicyRequest**](OrganizationPackageVulnerabilityPolicyRequest.md) |  | [optional] |

### Return type

[**OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_vulnerability_policy_delete

> orgs_vulnerability_policy_delete(org, slug_perm)

Delete a package vulnerability policy.

Delete a package vulnerability policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 

begin
  # Delete a package vulnerability policy.
  api_instance.orgs_vulnerability_policy_delete(org, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_delete: #{e}"
end
```

#### Using the orgs_vulnerability_policy_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> orgs_vulnerability_policy_delete_with_http_info(org, slug_perm)

```ruby
begin
  # Delete a package vulnerability policy.
  data, status_code, headers = api_instance.orgs_vulnerability_policy_delete_with_http_info(org, slug_perm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_vulnerability_policy_evaluation_create

> <PackageVulnerabilityPolicyEvaluationRequest> orgs_vulnerability_policy_evaluation_create(org, policy_slug_perm, opts)

Create an evaluation request for this policy.

Create an evaluation request for this policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
policy_slug_perm = 'policy_slug_perm_example' # String | 
opts = {
  data: { ... } # Object | 
}

begin
  # Create an evaluation request for this policy.
  result = api_instance.orgs_vulnerability_policy_evaluation_create(org, policy_slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_evaluation_create: #{e}"
end
```

#### Using the orgs_vulnerability_policy_evaluation_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackageVulnerabilityPolicyEvaluationRequest>, Integer, Hash)> orgs_vulnerability_policy_evaluation_create_with_http_info(org, policy_slug_perm, opts)

```ruby
begin
  # Create an evaluation request for this policy.
  data, status_code, headers = api_instance.orgs_vulnerability_policy_evaluation_create_with_http_info(org, policy_slug_perm, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackageVulnerabilityPolicyEvaluationRequest>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_evaluation_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **policy_slug_perm** | **String** |  |  |
| **data** | **Object** |  | [optional] |

### Return type

[**PackageVulnerabilityPolicyEvaluationRequest**](PackageVulnerabilityPolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_vulnerability_policy_evaluation_list

> <Array<PackageVulnerabilityPolicyEvaluationRequest>> orgs_vulnerability_policy_evaluation_list(org, policy_slug_perm, opts)

List evaluation requests for this policy.

List evaluation requests for this policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # List evaluation requests for this policy.
  result = api_instance.orgs_vulnerability_policy_evaluation_list(org, policy_slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_evaluation_list: #{e}"
end
```

#### Using the orgs_vulnerability_policy_evaluation_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<PackageVulnerabilityPolicyEvaluationRequest>>, Integer, Hash)> orgs_vulnerability_policy_evaluation_list_with_http_info(org, policy_slug_perm, opts)

```ruby
begin
  # List evaluation requests for this policy.
  data, status_code, headers = api_instance.orgs_vulnerability_policy_evaluation_list_with_http_info(org, policy_slug_perm, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<PackageVulnerabilityPolicyEvaluationRequest>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_evaluation_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **policy_slug_perm** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |

### Return type

[**Array&lt;PackageVulnerabilityPolicyEvaluationRequest&gt;**](PackageVulnerabilityPolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_vulnerability_policy_evaluation_read

> <PackageVulnerabilityPolicyEvaluationRequest> orgs_vulnerability_policy_evaluation_read(org, policy_slug_perm, slug_perm)

Retrieve an evaluation request for this policy.

Retrieve an evaluation request for this policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
policy_slug_perm = 'policy_slug_perm_example' # String | 
slug_perm = 'slug_perm_example' # String | 

begin
  # Retrieve an evaluation request for this policy.
  result = api_instance.orgs_vulnerability_policy_evaluation_read(org, policy_slug_perm, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_evaluation_read: #{e}"
end
```

#### Using the orgs_vulnerability_policy_evaluation_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackageVulnerabilityPolicyEvaluationRequest>, Integer, Hash)> orgs_vulnerability_policy_evaluation_read_with_http_info(org, policy_slug_perm, slug_perm)

```ruby
begin
  # Retrieve an evaluation request for this policy.
  data, status_code, headers = api_instance.orgs_vulnerability_policy_evaluation_read_with_http_info(org, policy_slug_perm, slug_perm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackageVulnerabilityPolicyEvaluationRequest>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_evaluation_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **policy_slug_perm** | **String** |  |  |
| **slug_perm** | **String** |  |  |

### Return type

[**PackageVulnerabilityPolicyEvaluationRequest**](PackageVulnerabilityPolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_vulnerability_policy_list

> <Array<OrganizationPackageVulnerabilityPolicy>> orgs_vulnerability_policy_list(org, opts)

Get a list of all package vulnerability policies.

Get a list of all package vulnerability policies.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # Get a list of all package vulnerability policies.
  result = api_instance.orgs_vulnerability_policy_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_list: #{e}"
end
```

#### Using the orgs_vulnerability_policy_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<OrganizationPackageVulnerabilityPolicy>>, Integer, Hash)> orgs_vulnerability_policy_list_with_http_info(org, opts)

```ruby
begin
  # Get a list of all package vulnerability policies.
  data, status_code, headers = api_instance.orgs_vulnerability_policy_list_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<OrganizationPackageVulnerabilityPolicy>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |

### Return type

[**Array&lt;OrganizationPackageVulnerabilityPolicy&gt;**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_vulnerability_policy_partial_update

> <OrganizationPackageVulnerabilityPolicy> orgs_vulnerability_policy_partial_update(org, slug_perm, opts)

Partially update a package vulnerability policy.

Partially update a package vulnerability policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # Partially update a package vulnerability policy.
  result = api_instance.orgs_vulnerability_policy_partial_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_partial_update: #{e}"
end
```

#### Using the orgs_vulnerability_policy_partial_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationPackageVulnerabilityPolicy>, Integer, Hash)> orgs_vulnerability_policy_partial_update_with_http_info(org, slug_perm, opts)

```ruby
begin
  # Partially update a package vulnerability policy.
  data, status_code, headers = api_instance.orgs_vulnerability_policy_partial_update_with_http_info(org, slug_perm, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationPackageVulnerabilityPolicy>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_partial_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |
| **data** | [**OrganizationPackageVulnerabilityPolicyRequestPatch**](OrganizationPackageVulnerabilityPolicyRequestPatch.md) |  | [optional] |

### Return type

[**OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_vulnerability_policy_read

> <OrganizationPackageVulnerabilityPolicy> orgs_vulnerability_policy_read(org, slug_perm)

Get a package vulnerability policy.

Get a package vulnerability policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 

begin
  # Get a package vulnerability policy.
  result = api_instance.orgs_vulnerability_policy_read(org, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_read: #{e}"
end
```

#### Using the orgs_vulnerability_policy_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationPackageVulnerabilityPolicy>, Integer, Hash)> orgs_vulnerability_policy_read_with_http_info(org, slug_perm)

```ruby
begin
  # Get a package vulnerability policy.
  data, status_code, headers = api_instance.orgs_vulnerability_policy_read_with_http_info(org, slug_perm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationPackageVulnerabilityPolicy>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |

### Return type

[**OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orgs_vulnerability_policy_update

> <OrganizationPackageVulnerabilityPolicy> orgs_vulnerability_policy_update(org, slug_perm, opts)

Update a package vulnerability policy.

Update a package vulnerability policy.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::OrgsApi.new
org = 'org_example' # String | 
slug_perm = 'slug_perm_example' # String | 
opts = {
  data: CloudsmithApi::OrganizationPackageVulnerabilityPolicyRequest.new({name: 'name_example'}) # OrganizationPackageVulnerabilityPolicyRequest | 
}

begin
  # Update a package vulnerability policy.
  result = api_instance.orgs_vulnerability_policy_update(org, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_update: #{e}"
end
```

#### Using the orgs_vulnerability_policy_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrganizationPackageVulnerabilityPolicy>, Integer, Hash)> orgs_vulnerability_policy_update_with_http_info(org, slug_perm, opts)

```ruby
begin
  # Update a package vulnerability policy.
  data, status_code, headers = api_instance.orgs_vulnerability_policy_update_with_http_info(org, slug_perm, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrganizationPackageVulnerabilityPolicy>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **slug_perm** | **String** |  |  |
| **data** | [**OrganizationPackageVulnerabilityPolicyRequest**](OrganizationPackageVulnerabilityPolicyRequest.md) |  | [optional] |

### Return type

[**OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orgs_vulnerability_policy_violation_list

> <PackageVulnerabilityPolicyViolationLogCursorPage> orgs_vulnerability_policy_violation_list(org, opts)

List all current vulnerability policy violations for this Organization.

List all current vulnerability policy violations for this Organization.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

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
  # List all current vulnerability policy violations for this Organization.
  result = api_instance.orgs_vulnerability_policy_violation_list(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_violation_list: #{e}"
end
```

#### Using the orgs_vulnerability_policy_violation_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackageVulnerabilityPolicyViolationLogCursorPage>, Integer, Hash)> orgs_vulnerability_policy_violation_list_with_http_info(org, opts)

```ruby
begin
  # List all current vulnerability policy violations for this Organization.
  data, status_code, headers = api_instance.orgs_vulnerability_policy_violation_list_with_http_info(org, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackageVulnerabilityPolicyViolationLogCursorPage>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OrgsApi->orgs_vulnerability_policy_violation_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **org** | **String** |  |  |
| **cursor** | **String** | The pagination cursor value. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |

### Return type

[**PackageVulnerabilityPolicyViolationLogCursorPage**](PackageVulnerabilityPolicyViolationLogCursorPage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

