# cloudsmith_api.OrgsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orgs_api_key_rules_create**](OrgsApi.md#orgs_api_key_rules_create) | **POST** /orgs/{org}/api-key-rules/ | Create an API key rule.
[**orgs_api_key_rules_delete**](OrgsApi.md#orgs_api_key_rules_delete) | **DELETE** /orgs/{org}/api-key-rules/{slug_perm}/ | Delete an API key rule.
[**orgs_api_key_rules_list**](OrgsApi.md#orgs_api_key_rules_list) | **GET** /orgs/{org}/api-key-rules/ | List all API key rules for the organization.
[**orgs_api_key_rules_partial_update**](OrgsApi.md#orgs_api_key_rules_partial_update) | **PATCH** /orgs/{org}/api-key-rules/{slug_perm}/ | Update an API key rule.
[**orgs_api_key_rules_read**](OrgsApi.md#orgs_api_key_rules_read) | **GET** /orgs/{org}/api-key-rules/{slug_perm}/ | Retrieve an API key rule.
[**orgs_api_key_rules_update**](OrgsApi.md#orgs_api_key_rules_update) | **PUT** /orgs/{org}/api-key-rules/{slug_perm}/ | Full update of an API key rule.
[**orgs_custom_domains_list**](OrgsApi.md#orgs_custom_domains_list) | **GET** /orgs/{org}/custom-domains/ | Get the details for all custom domains.
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
[**orgs_openid_connect_dynamic_mappings_list**](OrgsApi.md#orgs_openid_connect_dynamic_mappings_list) | **GET** /orgs/{org}/openid-connect/{provider_setting}/dynamic-mappings/ | Retrieve the list of OpenID Connect dynamic mappings for the provider setting.
[**orgs_openid_connect_dynamic_mappings_read**](OrgsApi.md#orgs_openid_connect_dynamic_mappings_read) | **GET** /orgs/{org}/openid-connect/{provider_setting}/dynamic-mappings/{claim_value}/ | Retrieve a specific OpenID Connect dynamic mapping for the provider setting.
[**orgs_openid_connect_list**](OrgsApi.md#orgs_openid_connect_list) | **GET** /orgs/{org}/openid-connect/ | Retrieve the list of OpenID Connect provider settings for the org.
[**orgs_openid_connect_partial_update**](OrgsApi.md#orgs_openid_connect_partial_update) | **PATCH** /orgs/{org}/openid-connect/{slug_perm}/ | Update a specific OpenID Connect provider setting for the org.
[**orgs_openid_connect_read**](OrgsApi.md#orgs_openid_connect_read) | **GET** /orgs/{org}/openid-connect/{slug_perm}/ | Retrieve a specific OpenID Connect provider setting for the org.
[**orgs_openid_connect_update**](OrgsApi.md#orgs_openid_connect_update) | **PUT** /orgs/{org}/openid-connect/{slug_perm}/ | Update a specific OpenID Connect provider setting for the org.
[**orgs_read**](OrgsApi.md#orgs_read) | **GET** /orgs/{org}/ | Get the details for the specific organization.
[**orgs_retrieve_usage_limits**](OrgsApi.md#orgs_retrieve_usage_limits) | **GET** /orgs/{org}/usage-limits/ | 
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
[**orgs_update_usage_limits**](OrgsApi.md#orgs_update_usage_limits) | **PATCH** /orgs/{org}/usage-limits/ | 
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


# **orgs_api_key_rules_create**
> OrganizationApiKeyRule orgs_api_key_rules_create(org, data=data)

Create an API key rule.

Create an API key rule.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_api_key_rule import OrganizationApiKeyRule
from cloudsmith_api.models.organization_api_key_rule_request import OrganizationApiKeyRuleRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    data = cloudsmith_api.OrganizationApiKeyRuleRequest() # OrganizationApiKeyRuleRequest |  (optional)

    try:
        # Create an API key rule.
        api_response = api_instance.orgs_api_key_rules_create(org, data=data)
        print("The response of OrgsApi->orgs_api_key_rules_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_api_key_rules_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **data** | [**OrganizationApiKeyRuleRequest**](OrganizationApiKeyRuleRequest.md)|  | [optional] 

### Return type

[**OrganizationApiKeyRule**](OrganizationApiKeyRule.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_api_key_rules_delete**
> orgs_api_key_rules_delete(org, slug_perm)

Delete an API key rule.

Delete an API key rule.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 

    try:
        # Delete an API key rule.
        api_instance.orgs_api_key_rules_delete(org, slug_perm)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_api_key_rules_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_api_key_rules_list**
> List[OrganizationApiKeyRule] orgs_api_key_rules_list(org)

List all API key rules for the organization.

List all API key rules for the organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_api_key_rule import OrganizationApiKeyRule
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 

    try:
        # List all API key rules for the organization.
        api_response = api_instance.orgs_api_key_rules_list(org)
        print("The response of OrgsApi->orgs_api_key_rules_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_api_key_rules_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 

### Return type

[**List[OrganizationApiKeyRule]**](OrganizationApiKeyRule.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_api_key_rules_partial_update**
> OrganizationApiKeyRule orgs_api_key_rules_partial_update(org, slug_perm, data=data)

Update an API key rule.

Update an API key rule.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_api_key_rule import OrganizationApiKeyRule
from cloudsmith_api.models.organization_api_key_rule_request_patch import OrganizationApiKeyRuleRequestPatch
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 
    data = cloudsmith_api.OrganizationApiKeyRuleRequestPatch() # OrganizationApiKeyRuleRequestPatch |  (optional)

    try:
        # Update an API key rule.
        api_response = api_instance.orgs_api_key_rules_partial_update(org, slug_perm, data=data)
        print("The response of OrgsApi->orgs_api_key_rules_partial_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_api_key_rules_partial_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**OrganizationApiKeyRuleRequestPatch**](OrganizationApiKeyRuleRequestPatch.md)|  | [optional] 

### Return type

[**OrganizationApiKeyRule**](OrganizationApiKeyRule.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_api_key_rules_read**
> OrganizationApiKeyRule orgs_api_key_rules_read(org, slug_perm)

Retrieve an API key rule.

Retrieve an API key rule.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_api_key_rule import OrganizationApiKeyRule
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 

    try:
        # Retrieve an API key rule.
        api_response = api_instance.orgs_api_key_rules_read(org, slug_perm)
        print("The response of OrgsApi->orgs_api_key_rules_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_api_key_rules_read: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**OrganizationApiKeyRule**](OrganizationApiKeyRule.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_api_key_rules_update**
> OrganizationApiKeyRule orgs_api_key_rules_update(org, slug_perm, data=data)

Full update of an API key rule.

Full update of an API key rule.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_api_key_rule import OrganizationApiKeyRule
from cloudsmith_api.models.organization_api_key_rule_request import OrganizationApiKeyRuleRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 
    data = cloudsmith_api.OrganizationApiKeyRuleRequest() # OrganizationApiKeyRuleRequest |  (optional)

    try:
        # Full update of an API key rule.
        api_response = api_instance.orgs_api_key_rules_update(org, slug_perm, data=data)
        print("The response of OrgsApi->orgs_api_key_rules_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_api_key_rules_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**OrganizationApiKeyRuleRequest**](OrganizationApiKeyRuleRequest.md)|  | [optional] 

### Return type

[**OrganizationApiKeyRule**](OrganizationApiKeyRule.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_custom_domains_list**
> List[OrganizationCustomDomains] orgs_custom_domains_list(org, page=page, page_size=page_size)

Get the details for all custom domains.

Get the details for all custom domains.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_custom_domains import OrganizationCustomDomains
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)

    try:
        # Get the details for all custom domains.
        api_response = api_instance.orgs_custom_domains_list(org, page=page, page_size=page_size)
        print("The response of OrgsApi->orgs_custom_domains_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_custom_domains_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**List[OrganizationCustomDomains]**](OrganizationCustomDomains.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the list of custom domains for the organization. |  -  |
**402** | Custom Domains are not available; upgrade your account! |  -  |
**404** | Organization not found. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_delete**
> orgs_delete(org)

Delete the specified organization.

Delete the specified organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 

    try:
        # Delete the specified organization.
        api_instance.orgs_delete(org)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_create**
> PackageDenyPolicy orgs_deny_policy_create(org, data=data)

Create a package deny policy.

Create a package deny policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_deny_policy import PackageDenyPolicy
from cloudsmith_api.models.package_deny_policy_request import PackageDenyPolicyRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    data = cloudsmith_api.PackageDenyPolicyRequest() # PackageDenyPolicyRequest |  (optional)

    try:
        # Create a package deny policy.
        api_response = api_instance.orgs_deny_policy_create(org, data=data)
        print("The response of OrgsApi->orgs_deny_policy_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_deny_policy_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **data** | [**PackageDenyPolicyRequest**](PackageDenyPolicyRequest.md)|  | [optional] 

### Return type

[**PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_delete**
> orgs_deny_policy_delete(org, slug_perm)

Delete a package deny policy.

Delete a package deny policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 

    try:
        # Delete a package deny policy.
        api_instance.orgs_deny_policy_delete(org, slug_perm)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_deny_policy_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_list**
> List[PackageDenyPolicy] orgs_deny_policy_list(org, page=page, page_size=page_size)

Get a list of all package deny policies.

Get a list of all package deny policies.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_deny_policy import PackageDenyPolicy
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)

    try:
        # Get a list of all package deny policies.
        api_response = api_instance.orgs_deny_policy_list(org, page=page, page_size=page_size)
        print("The response of OrgsApi->orgs_deny_policy_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_deny_policy_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**List[PackageDenyPolicy]**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_partial_update**
> PackageDenyPolicy orgs_deny_policy_partial_update(org, slug_perm, data=data)

Partially update a package deny policy.

Partially update a package deny policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_deny_policy import PackageDenyPolicy
from cloudsmith_api.models.package_deny_policy_request_patch import PackageDenyPolicyRequestPatch
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 
    data = cloudsmith_api.PackageDenyPolicyRequestPatch() # PackageDenyPolicyRequestPatch |  (optional)

    try:
        # Partially update a package deny policy.
        api_response = api_instance.orgs_deny_policy_partial_update(org, slug_perm, data=data)
        print("The response of OrgsApi->orgs_deny_policy_partial_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_deny_policy_partial_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**PackageDenyPolicyRequestPatch**](PackageDenyPolicyRequestPatch.md)|  | [optional] 

### Return type

[**PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_read**
> PackageDenyPolicy orgs_deny_policy_read(org, slug_perm)

Get a package deny policy.

Get a package deny policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_deny_policy import PackageDenyPolicy
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 

    try:
        # Get a package deny policy.
        api_response = api_instance.orgs_deny_policy_read(org, slug_perm)
        print("The response of OrgsApi->orgs_deny_policy_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_deny_policy_read: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_update**
> PackageDenyPolicy orgs_deny_policy_update(org, slug_perm, data=data)

Update a package deny policy.

Update a package deny policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_deny_policy import PackageDenyPolicy
from cloudsmith_api.models.package_deny_policy_request import PackageDenyPolicyRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 
    data = cloudsmith_api.PackageDenyPolicyRequest() # PackageDenyPolicyRequest |  (optional)

    try:
        # Update a package deny policy.
        api_response = api_instance.orgs_deny_policy_update(org, slug_perm, data=data)
        print("The response of OrgsApi->orgs_deny_policy_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_deny_policy_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**PackageDenyPolicyRequest**](PackageDenyPolicyRequest.md)|  | [optional] 

### Return type

[**PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_create**
> OrganizationInvite orgs_invites_create(org, data=data)

Create an organization invite for a specific user

Create an organization invite for a specific user

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_invite import OrganizationInvite
from cloudsmith_api.models.organization_invite_request import OrganizationInviteRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    data = cloudsmith_api.OrganizationInviteRequest() # OrganizationInviteRequest |  (optional)

    try:
        # Create an organization invite for a specific user
        api_response = api_instance.orgs_invites_create(org, data=data)
        print("The response of OrgsApi->orgs_invites_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_invites_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **data** | [**OrganizationInviteRequest**](OrganizationInviteRequest.md)|  | [optional] 

### Return type

[**OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Invite sent |  -  |
**400** | The invite cannot be created. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_delete**
> orgs_invites_delete(org, slug_perm)

Delete a specific organization invite

Delete a specific organization invite

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 

    try:
        # Delete a specific organization invite
        api_instance.orgs_invites_delete(org, slug_perm)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_invites_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Deleted the organization invite successfully. |  -  |
**400** | The organization invite cannot be deleted. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_extend**
> OrganizationInviteExtend orgs_invites_extend(org, slug_perm)

Extend an organization invite.

Extend an organization invite.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_invite_extend import OrganizationInviteExtend
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 

    try:
        # Extend an organization invite.
        api_response = api_instance.orgs_invites_extend(org, slug_perm)
        print("The response of OrgsApi->orgs_invites_extend:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_invites_extend: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**OrganizationInviteExtend**](OrganizationInviteExtend.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The invite has been extended |  -  |
**404** | Invite not found. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_list**
> List[OrganizationInvite] orgs_invites_list(org, page=page, page_size=page_size)

Get a list of all invites for an organization.

Get a list of all invites for an organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_invite import OrganizationInvite
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)

    try:
        # Get a list of all invites for an organization.
        api_response = api_instance.orgs_invites_list(org, page=page, page_size=page_size)
        print("The response of OrgsApi->orgs_invites_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_invites_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**List[OrganizationInvite]**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the list of organization invites |  -  |
**404** | Organization invites not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_partial_update**
> OrganizationInvite orgs_invites_partial_update(org, slug_perm, data=data)

Update a specific organization invite.

Update a specific organization invite.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_invite import OrganizationInvite
from cloudsmith_api.models.organization_invite_update_request_patch import OrganizationInviteUpdateRequestPatch
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 
    data = cloudsmith_api.OrganizationInviteUpdateRequestPatch() # OrganizationInviteUpdateRequestPatch |  (optional)

    try:
        # Update a specific organization invite.
        api_response = api_instance.orgs_invites_partial_update(org, slug_perm, data=data)
        print("The response of OrgsApi->orgs_invites_partial_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_invites_partial_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**OrganizationInviteUpdateRequestPatch**](OrganizationInviteUpdateRequestPatch.md)|  | [optional] 

### Return type

[**OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Invite updated |  -  |
**400** | The invite cannot be updated. |  -  |
**404** | Invite not found. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_resend**
> OrganizationInviteExtend orgs_invites_resend(org, slug_perm)

Resend an organization invite.

Resend an organization invite.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_invite_extend import OrganizationInviteExtend
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 

    try:
        # Resend an organization invite.
        api_response = api_instance.orgs_invites_resend(org, slug_perm)
        print("The response of OrgsApi->orgs_invites_resend:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_invites_resend: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**OrganizationInviteExtend**](OrganizationInviteExtend.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The invite has been resent |  -  |
**404** | Invite not found. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_create**
> OrganizationPackageLicensePolicy orgs_license_policy_create(org, data=data)

Create a package license policy.

Create a package license policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_package_license_policy import OrganizationPackageLicensePolicy
from cloudsmith_api.models.organization_package_license_policy_request import OrganizationPackageLicensePolicyRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    data = cloudsmith_api.OrganizationPackageLicensePolicyRequest() # OrganizationPackageLicensePolicyRequest |  (optional)

    try:
        # Create a package license policy.
        api_response = api_instance.orgs_license_policy_create(org, data=data)
        print("The response of OrgsApi->orgs_license_policy_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_license_policy_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **data** | [**OrganizationPackageLicensePolicyRequest**](OrganizationPackageLicensePolicyRequest.md)|  | [optional] 

### Return type

[**OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_delete**
> orgs_license_policy_delete(org, slug_perm)

Delete a package license policy.

Delete a package license policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 

    try:
        # Delete a package license policy.
        api_instance.orgs_license_policy_delete(org, slug_perm)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_license_policy_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_evaluation_create**
> PackageLicensePolicyEvaluationRequest orgs_license_policy_evaluation_create(org, policy_slug_perm, data=data)

Create an evaluation request for this policy.

Create an evaluation request for this policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_license_policy_evaluation_request import PackageLicensePolicyEvaluationRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    policy_slug_perm = 'policy_slug_perm_example' # str | 
    data = None # object |  (optional)

    try:
        # Create an evaluation request for this policy.
        api_response = api_instance.orgs_license_policy_evaluation_create(org, policy_slug_perm, data=data)
        print("The response of OrgsApi->orgs_license_policy_evaluation_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_license_policy_evaluation_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **policy_slug_perm** | **str**|  | 
 **data** | **object**|  | [optional] 

### Return type

[**PackageLicensePolicyEvaluationRequest**](PackageLicensePolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_evaluation_list**
> List[PackageLicensePolicyEvaluationRequest] orgs_license_policy_evaluation_list(org, policy_slug_perm, page=page, page_size=page_size)

List evaluation requests for this policy.

List evaluation requests for this policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_license_policy_evaluation_request import PackageLicensePolicyEvaluationRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    policy_slug_perm = 'policy_slug_perm_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)

    try:
        # List evaluation requests for this policy.
        api_response = api_instance.orgs_license_policy_evaluation_list(org, policy_slug_perm, page=page, page_size=page_size)
        print("The response of OrgsApi->orgs_license_policy_evaluation_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_license_policy_evaluation_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **policy_slug_perm** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**List[PackageLicensePolicyEvaluationRequest]**](PackageLicensePolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_evaluation_read**
> PackageLicensePolicyEvaluationRequest orgs_license_policy_evaluation_read(org, policy_slug_perm, slug_perm)

Retrieve an evaluation request for this policy.

Retrieve an evaluation request for this policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_license_policy_evaluation_request import PackageLicensePolicyEvaluationRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    policy_slug_perm = 'policy_slug_perm_example' # str | 
    slug_perm = 'slug_perm_example' # str | 

    try:
        # Retrieve an evaluation request for this policy.
        api_response = api_instance.orgs_license_policy_evaluation_read(org, policy_slug_perm, slug_perm)
        print("The response of OrgsApi->orgs_license_policy_evaluation_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_license_policy_evaluation_read: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **policy_slug_perm** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**PackageLicensePolicyEvaluationRequest**](PackageLicensePolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_list**
> List[OrganizationPackageLicensePolicy] orgs_license_policy_list(org, page=page, page_size=page_size)

Get a list of all package license policies.

Get a list of all package license policies.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_package_license_policy import OrganizationPackageLicensePolicy
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)

    try:
        # Get a list of all package license policies.
        api_response = api_instance.orgs_license_policy_list(org, page=page, page_size=page_size)
        print("The response of OrgsApi->orgs_license_policy_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_license_policy_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**List[OrganizationPackageLicensePolicy]**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_partial_update**
> OrganizationPackageLicensePolicy orgs_license_policy_partial_update(org, slug_perm, data=data)

Partially update a package license policy.

Partially update a package license policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_package_license_policy import OrganizationPackageLicensePolicy
from cloudsmith_api.models.organization_package_license_policy_request_patch import OrganizationPackageLicensePolicyRequestPatch
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 
    data = cloudsmith_api.OrganizationPackageLicensePolicyRequestPatch() # OrganizationPackageLicensePolicyRequestPatch |  (optional)

    try:
        # Partially update a package license policy.
        api_response = api_instance.orgs_license_policy_partial_update(org, slug_perm, data=data)
        print("The response of OrgsApi->orgs_license_policy_partial_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_license_policy_partial_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**OrganizationPackageLicensePolicyRequestPatch**](OrganizationPackageLicensePolicyRequestPatch.md)|  | [optional] 

### Return type

[**OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_read**
> OrganizationPackageLicensePolicy orgs_license_policy_read(org, slug_perm)

Get a package license policy.

Get a package license policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_package_license_policy import OrganizationPackageLicensePolicy
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 

    try:
        # Get a package license policy.
        api_response = api_instance.orgs_license_policy_read(org, slug_perm)
        print("The response of OrgsApi->orgs_license_policy_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_license_policy_read: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_update**
> OrganizationPackageLicensePolicy orgs_license_policy_update(org, slug_perm, data=data)

Update a package license policy.

Update a package license policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_package_license_policy import OrganizationPackageLicensePolicy
from cloudsmith_api.models.organization_package_license_policy_request import OrganizationPackageLicensePolicyRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 
    data = cloudsmith_api.OrganizationPackageLicensePolicyRequest() # OrganizationPackageLicensePolicyRequest |  (optional)

    try:
        # Update a package license policy.
        api_response = api_instance.orgs_license_policy_update(org, slug_perm, data=data)
        print("The response of OrgsApi->orgs_license_policy_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_license_policy_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**OrganizationPackageLicensePolicyRequest**](OrganizationPackageLicensePolicyRequest.md)|  | [optional] 

### Return type

[**OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_violation_list**
> PackageLicensePolicyViolationLogCursorPage orgs_license_policy_violation_list(org, cursor=cursor, page_size=page_size)

List all current license policy violations for this Organization.

List all current license policy violations for this Organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_license_policy_violation_log_cursor_page import PackageLicensePolicyViolationLogCursorPage
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    cursor = 'cursor_example' # str | The pagination cursor value. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)

    try:
        # List all current license policy violations for this Organization.
        api_response = api_instance.orgs_license_policy_violation_list(org, cursor=cursor, page_size=page_size)
        print("The response of OrgsApi->orgs_license_policy_violation_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_license_policy_violation_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **cursor** | **str**| The pagination cursor value. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**PackageLicensePolicyViolationLogCursorPage**](PackageLicensePolicyViolationLogCursorPage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_list**
> List[Organization] orgs_list(page=page, page_size=page_size, sort=sort)

Get a list of all the organizations you are associated with.

Get a list of all the organizations you are associated with.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization import Organization
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)
    sort = 'name' # str | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name, created_at, slug. (optional) (default to 'name')

    try:
        # Get a list of all the organizations you are associated with.
        api_response = api_instance.orgs_list(page=page, page_size=page_size, sort=sort)
        print("The response of OrgsApi->orgs_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **sort** | **str**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name, created_at, slug. | [optional] [default to &#39;name&#39;]

### Return type

[**List[Organization]**](Organization.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_delete**
> orgs_members_delete(org, member)

Removes a member from the organization.

Removes a member from the organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    member = 'member_example' # str | 

    try:
        # Removes a member from the organization.
        api_instance.orgs_members_delete(org, member)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_members_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **member** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Removed the organization member successfully. |  -  |
**400** | The organization member cannot be deleted. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_list**
> List[OrganizationMembership] orgs_members_list(org, page=page, page_size=page_size, is_active=is_active, query=query, sort=sort)

Get the details for all organization members.

Get the details for all organization members.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_membership import OrganizationMembership
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)
    is_active = False # bool | Filter for active/inactive users. (optional) (default to False)
    query = 'query_example' # str | A search term for querying of members within an Organization.Available options are: email, org, user, userslug, inactive, user_name, role (optional)
    sort = 'user_name' # str | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-user_name`). Available options: user_name, role. (optional) (default to 'user_name')

    try:
        # Get the details for all organization members.
        api_response = api_instance.orgs_members_list(org, page=page, page_size=page_size, is_active=is_active, query=query, sort=sort)
        print("The response of OrgsApi->orgs_members_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_members_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **is_active** | **bool**| Filter for active/inactive users. | [optional] [default to False]
 **query** | **str**| A search term for querying of members within an Organization.Available options are: email, org, user, userslug, inactive, user_name, role | [optional] 
 **sort** | **str**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-user_name&#x60;). Available options: user_name, role. | [optional] [default to &#39;user_name&#39;]

### Return type

[**List[OrganizationMembership]**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the list of organization&#39;s members |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_partial_update**
> OrganizationMembership orgs_members_partial_update(org, member, data=data)

Views for working with organization members.

Views for working with organization members.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_membership import OrganizationMembership
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    member = 'member_example' # str | 
    data = None # object |  (optional)

    try:
        # Views for working with organization members.
        api_response = api_instance.orgs_members_partial_update(org, member, data=data)
        print("The response of OrgsApi->orgs_members_partial_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_members_partial_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **member** | **str**|  | 
 **data** | **object**|  | [optional] 

### Return type

[**OrganizationMembership**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_read**
> OrganizationMembership orgs_members_read(org, member)

Get the details for a specific organization member.

Get the details for a specific organization member.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_membership import OrganizationMembership
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    member = 'member_example' # str | 

    try:
        # Get the details for a specific organization member.
        api_response = api_instance.orgs_members_read(org, member)
        print("The response of OrgsApi->orgs_members_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_members_read: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **member** | **str**|  | 

### Return type

[**OrganizationMembership**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_refresh**
> orgs_members_refresh(org, member)

Refresh a member of the organization's API key.

Refresh a member of the organization's API key.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    member = 'member_example' # str | 

    try:
        # Refresh a member of the organization's API key.
        api_instance.orgs_members_refresh(org, member)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_members_refresh: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **member** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Org member API key has been refreshed. |  -  |
**400** | The org member&#39;s API key cannot be refreshed. |  -  |
**404** | Org member not found. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_remove**
> orgs_members_remove(org, member)

Removes a member from the organization (deprecated, use DELETE instead).

Removes a member from the organization (deprecated, use DELETE instead).

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    member = 'member_example' # str | 

    try:
        # Removes a member from the organization (deprecated, use DELETE instead).
        api_instance.orgs_members_remove(org, member)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_members_remove: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **member** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Removed the organization member successfully. |  -  |
**400** | The organization member cannot be deleted. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_update_role**
> OrganizationMembershipRoleUpdate orgs_members_update_role(org, member, data=data)

Update a member's role in the organization.

Update a member's role in the organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_membership_role_update import OrganizationMembershipRoleUpdate
from cloudsmith_api.models.organization_membership_role_update_request_patch import OrganizationMembershipRoleUpdateRequestPatch
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    member = 'member_example' # str | 
    data = cloudsmith_api.OrganizationMembershipRoleUpdateRequestPatch() # OrganizationMembershipRoleUpdateRequestPatch |  (optional)

    try:
        # Update a member's role in the organization.
        api_response = api_instance.orgs_members_update_role(org, member, data=data)
        print("The response of OrgsApi->orgs_members_update_role:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_members_update_role: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **member** | **str**|  | 
 **data** | [**OrganizationMembershipRoleUpdateRequestPatch**](OrganizationMembershipRoleUpdateRequestPatch.md)|  | [optional] 

### Return type

[**OrganizationMembershipRoleUpdate**](OrganizationMembershipRoleUpdate.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_update_visibility**
> OrganizationMembershipVisibilityUpdate orgs_members_update_visibility(org, member, data=data)

Update a member's visibility in the organization.

Update a member's visibility in the organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_membership_visibility_update import OrganizationMembershipVisibilityUpdate
from cloudsmith_api.models.organization_membership_visibility_update_request_patch import OrganizationMembershipVisibilityUpdateRequestPatch
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    member = 'member_example' # str | 
    data = cloudsmith_api.OrganizationMembershipVisibilityUpdateRequestPatch() # OrganizationMembershipVisibilityUpdateRequestPatch |  (optional)

    try:
        # Update a member's visibility in the organization.
        api_response = api_instance.orgs_members_update_visibility(org, member, data=data)
        print("The response of OrgsApi->orgs_members_update_visibility:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_members_update_visibility: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **member** | **str**|  | 
 **data** | [**OrganizationMembershipVisibilityUpdateRequestPatch**](OrganizationMembershipVisibilityUpdateRequestPatch.md)|  | [optional] 

### Return type

[**OrganizationMembershipVisibilityUpdate**](OrganizationMembershipVisibilityUpdate.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_create**
> ProviderSettingsWrite orgs_openid_connect_create(org, data=data)

Create the OpenID Connect provider settings for the org.

Create the OpenID Connect provider settings for the org.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.provider_settings_write import ProviderSettingsWrite
from cloudsmith_api.models.provider_settings_write_request import ProviderSettingsWriteRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    data = cloudsmith_api.ProviderSettingsWriteRequest() # ProviderSettingsWriteRequest |  (optional)

    try:
        # Create the OpenID Connect provider settings for the org.
        api_response = api_instance.orgs_openid_connect_create(org, data=data)
        print("The response of OrgsApi->orgs_openid_connect_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_openid_connect_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **data** | [**ProviderSettingsWriteRequest**](ProviderSettingsWriteRequest.md)|  | [optional] 

### Return type

[**ProviderSettingsWrite**](ProviderSettingsWrite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created the OpenID Connect provider settings for the org |  -  |
**404** | Organization not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_delete**
> orgs_openid_connect_delete(org, slug_perm)

Delete a specific OpenID Connect provider setting for the org.

Delete a specific OpenID Connect provider setting for the org.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 

    try:
        # Delete a specific OpenID Connect provider setting for the org.
        api_instance.orgs_openid_connect_delete(org, slug_perm)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_openid_connect_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Deleted the specified OpenID Connect provider setting successfully. |  -  |
**400** | The specified OpenID Connect provider setting cannot be deleted. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_dynamic_mappings_list**
> List[DynamicMapping] orgs_openid_connect_dynamic_mappings_list(org, provider_setting, page=page, page_size=page_size)

Retrieve the list of OpenID Connect dynamic mappings for the provider setting.

Retrieve the list of OpenID Connect dynamic mappings for the provider setting.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.dynamic_mapping import DynamicMapping
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    provider_setting = 'provider_setting_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)

    try:
        # Retrieve the list of OpenID Connect dynamic mappings for the provider setting.
        api_response = api_instance.orgs_openid_connect_dynamic_mappings_list(org, provider_setting, page=page, page_size=page_size)
        print("The response of OrgsApi->orgs_openid_connect_dynamic_mappings_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_openid_connect_dynamic_mappings_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **provider_setting** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**List[DynamicMapping]**](DynamicMapping.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the list of OpenID Connect dynamic mappings for the selected provider setting |  -  |
**404** | Organization or Provider Setting not found (see detail) |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_dynamic_mappings_read**
> DynamicMapping orgs_openid_connect_dynamic_mappings_read(org, provider_setting, claim_value)

Retrieve a specific OpenID Connect dynamic mapping for the provider setting.

Retrieve a specific OpenID Connect dynamic mapping for the provider setting.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.dynamic_mapping import DynamicMapping
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    provider_setting = 'provider_setting_example' # str | 
    claim_value = 'claim_value_example' # str | 

    try:
        # Retrieve a specific OpenID Connect dynamic mapping for the provider setting.
        api_response = api_instance.orgs_openid_connect_dynamic_mappings_read(org, provider_setting, claim_value)
        print("The response of OrgsApi->orgs_openid_connect_dynamic_mappings_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_openid_connect_dynamic_mappings_read: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **provider_setting** | **str**|  | 
 **claim_value** | **str**|  | 

### Return type

[**DynamicMapping**](DynamicMapping.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the specified OpenID Connect dynamic mapping |  -  |
**404** | Organization, Provider Setting or Dynamic Mapping with claim not found (see detail) |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_list**
> List[ProviderSettings] orgs_openid_connect_list(org, page=page, page_size=page_size, query=query, sort=sort)

Retrieve the list of OpenID Connect provider settings for the org.

Retrieve the list of OpenID Connect provider settings for the org.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.provider_settings import ProviderSettings
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)
    query = 'query_example' # str | A search term for querying of OpenID Connect (OIDC) provider settings.Available options are: name, provider_url, service_account (optional)
    sort = 'name' # str | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name. (optional) (default to 'name')

    try:
        # Retrieve the list of OpenID Connect provider settings for the org.
        api_response = api_instance.orgs_openid_connect_list(org, page=page, page_size=page_size, query=query, sort=sort)
        print("The response of OrgsApi->orgs_openid_connect_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_openid_connect_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **query** | **str**| A search term for querying of OpenID Connect (OIDC) provider settings.Available options are: name, provider_url, service_account | [optional] 
 **sort** | **str**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name. | [optional] [default to &#39;name&#39;]

### Return type

[**List[ProviderSettings]**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the list of OpenID Connect provider settings for the org |  -  |
**404** | Organization not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_partial_update**
> ProviderSettingsWrite orgs_openid_connect_partial_update(org, slug_perm, data=data)

Update a specific OpenID Connect provider setting for the org.

Update a specific OpenID Connect provider setting for the org.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.provider_settings_write import ProviderSettingsWrite
from cloudsmith_api.models.provider_settings_write_request_patch import ProviderSettingsWriteRequestPatch
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 
    data = cloudsmith_api.ProviderSettingsWriteRequestPatch() # ProviderSettingsWriteRequestPatch |  (optional)

    try:
        # Update a specific OpenID Connect provider setting for the org.
        api_response = api_instance.orgs_openid_connect_partial_update(org, slug_perm, data=data)
        print("The response of OrgsApi->orgs_openid_connect_partial_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_openid_connect_partial_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**ProviderSettingsWriteRequestPatch**](ProviderSettingsWriteRequestPatch.md)|  | [optional] 

### Return type

[**ProviderSettingsWrite**](ProviderSettingsWrite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated the specified OpenID Connect provider setting for the org |  -  |
**404** | Organization not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_read**
> ProviderSettings orgs_openid_connect_read(org, slug_perm)

Retrieve a specific OpenID Connect provider setting for the org.

Retrieve a specific OpenID Connect provider setting for the org.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.provider_settings import ProviderSettings
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 

    try:
        # Retrieve a specific OpenID Connect provider setting for the org.
        api_response = api_instance.orgs_openid_connect_read(org, slug_perm)
        print("The response of OrgsApi->orgs_openid_connect_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_openid_connect_read: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**ProviderSettings**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_update**
> ProviderSettingsWrite orgs_openid_connect_update(org, slug_perm, data=data)

Update a specific OpenID Connect provider setting for the org.

Update a specific OpenID Connect provider setting for the org.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.provider_settings_write import ProviderSettingsWrite
from cloudsmith_api.models.provider_settings_write_request import ProviderSettingsWriteRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 
    data = cloudsmith_api.ProviderSettingsWriteRequest() # ProviderSettingsWriteRequest |  (optional)

    try:
        # Update a specific OpenID Connect provider setting for the org.
        api_response = api_instance.orgs_openid_connect_update(org, slug_perm, data=data)
        print("The response of OrgsApi->orgs_openid_connect_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_openid_connect_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**ProviderSettingsWriteRequest**](ProviderSettingsWriteRequest.md)|  | [optional] 

### Return type

[**ProviderSettingsWrite**](ProviderSettingsWrite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated the specified OpenID Connect provider setting for the org |  -  |
**404** | Organization not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_read**
> Organization orgs_read(org)

Get the details for the specific organization.

Get the details for the specific organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization import Organization
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 

    try:
        # Get the details for the specific organization.
        api_response = api_instance.orgs_read(org)
        print("The response of OrgsApi->orgs_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_read: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 

### Return type

[**Organization**](Organization.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_retrieve_usage_limits**
> OrgsRetrieveUsageLimits200Response orgs_retrieve_usage_limits(org)

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.orgs_retrieve_usage_limits200_response import OrgsRetrieveUsageLimits200Response
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 

    try:
        api_response = api_instance.orgs_retrieve_usage_limits(org)
        print("The response of OrgsApi->orgs_retrieve_usage_limits:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_retrieve_usage_limits: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 

### Return type

[**OrgsRetrieveUsageLimits200Response**](OrgsRetrieveUsageLimits200Response.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Organization usage limits configuration. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_authentication_partial_update**
> OrganizationSAMLAuth orgs_saml_authentication_partial_update(org, data=data)

Update the SAML Authentication settings for this Organization.

Update the SAML Authentication settings for this Organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_saml_auth import OrganizationSAMLAuth
from cloudsmith_api.models.organization_saml_auth_request_patch import OrganizationSAMLAuthRequestPatch
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    data = cloudsmith_api.OrganizationSAMLAuthRequestPatch() # OrganizationSAMLAuthRequestPatch |  (optional)

    try:
        # Update the SAML Authentication settings for this Organization.
        api_response = api_instance.orgs_saml_authentication_partial_update(org, data=data)
        print("The response of OrgsApi->orgs_saml_authentication_partial_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_saml_authentication_partial_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **data** | [**OrganizationSAMLAuthRequestPatch**](OrganizationSAMLAuthRequestPatch.md)|  | [optional] 

### Return type

[**OrganizationSAMLAuth**](OrganizationSAMLAuth.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated the SAML Authentication settings. |  -  |
**402** | SAML Authentication is not available; please upgrade your account! |  -  |
**404** | Organization not found. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_authentication_read**
> OrganizationSAMLAuth orgs_saml_authentication_read(org)

Retrieve the SAML Authentication settings for this Organization.

Retrieve the SAML Authentication settings for this Organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_saml_auth import OrganizationSAMLAuth
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 

    try:
        # Retrieve the SAML Authentication settings for this Organization.
        api_response = api_instance.orgs_saml_authentication_read(org)
        print("The response of OrgsApi->orgs_saml_authentication_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_saml_authentication_read: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 

### Return type

[**OrganizationSAMLAuth**](OrganizationSAMLAuth.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the SAML Authentication settings. |  -  |
**402** | SAML Authentication is not available; please upgrade your account! |  -  |
**404** | Organization not found. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_create**
> OrganizationGroupSync orgs_saml_group_sync_create(org, data=data)

Create a new SAML Group Sync mapping within an organization.

Create a new SAML Group Sync mapping within an organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_group_sync import OrganizationGroupSync
from cloudsmith_api.models.organization_group_sync_request import OrganizationGroupSyncRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    data = cloudsmith_api.OrganizationGroupSyncRequest() # OrganizationGroupSyncRequest |  (optional)

    try:
        # Create a new SAML Group Sync mapping within an organization.
        api_response = api_instance.orgs_saml_group_sync_create(org, data=data)
        print("The response of OrgsApi->orgs_saml_group_sync_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_saml_group_sync_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **data** | [**OrganizationGroupSyncRequest**](OrganizationGroupSyncRequest.md)|  | [optional] 

### Return type

[**OrganizationGroupSync**](OrganizationGroupSync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The SAML Group Sync mapping was created. |  -  |
**404** | Org namespace not found. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_delete**
> orgs_saml_group_sync_delete(org, slug_perm)

Delete a SAML Group Sync mapping from an organization.

Delete a SAML Group Sync mapping from an organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 

    try:
        # Delete a SAML Group Sync mapping from an organization.
        api_instance.orgs_saml_group_sync_delete(org, slug_perm)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_saml_group_sync_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Mapping removed successfully |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_disable**
> orgs_saml_group_sync_disable(org)

Disable SAML Group Sync for this organization.

Disable SAML Group Sync for this organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 

    try:
        # Disable SAML Group Sync for this organization.
        api_instance.orgs_saml_group_sync_disable(org)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_saml_group_sync_disable: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | SAML Group Sync has been disabled for this organization. |  -  |
**404** | Org namespace not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_enable**
> orgs_saml_group_sync_enable(org)

Enable SAML Group Sync for this organization.

Enable SAML Group Sync for this organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 

    try:
        # Enable SAML Group Sync for this organization.
        api_instance.orgs_saml_group_sync_enable(org)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_saml_group_sync_enable: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | SAML Group Sync has been enabled for this organization. |  -  |
**404** | Org namespace not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_list**
> List[OrganizationGroupSync] orgs_saml_group_sync_list(org, page=page, page_size=page_size)

Get the details of all SAML Group Sync mapping within an organization.

Get the details of all SAML Group Sync mapping within an organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_group_sync import OrganizationGroupSync
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)

    try:
        # Get the details of all SAML Group Sync mapping within an organization.
        api_response = api_instance.orgs_saml_group_sync_list(org, page=page, page_size=page_size)
        print("The response of OrgsApi->orgs_saml_group_sync_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_saml_group_sync_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**List[OrganizationGroupSync]**](OrganizationGroupSync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the list of all SAML Group Sync mappings for this org |  -  |
**404** | Org namespace not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_status**
> OrganizationGroupSyncStatus orgs_saml_group_sync_status(org)

Retrieve the SAML Group Sync status for this organization.

Retrieve the SAML Group Sync status for this organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_group_sync_status import OrganizationGroupSyncStatus
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 

    try:
        # Retrieve the SAML Group Sync status for this organization.
        api_response = api_instance.orgs_saml_group_sync_status(org)
        print("The response of OrgsApi->orgs_saml_group_sync_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_saml_group_sync_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 

### Return type

[**OrganizationGroupSyncStatus**](OrganizationGroupSyncStatus.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the SAML Group Sync status for this organization. |  -  |
**404** | Org namespace not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_create**
> Service orgs_services_create(org, data=data)

Create a service within an organization.

Create a service within an organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.service import Service
from cloudsmith_api.models.service_request import ServiceRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    data = cloudsmith_api.ServiceRequest() # ServiceRequest |  (optional)

    try:
        # Create a service within an organization.
        api_response = api_instance.orgs_services_create(org, data=data)
        print("The response of OrgsApi->orgs_services_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_services_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **data** | [**ServiceRequest**](ServiceRequest.md)|  | [optional] 

### Return type

[**Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Created the service within the org |  -  |
**404** | Org namespace not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_delete**
> orgs_services_delete(org, service)

Delete a specific service

Delete a specific service

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    service = 'service_example' # str | 

    try:
        # Delete a specific service
        api_instance.orgs_services_delete(org, service)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_services_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **service** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Deleted the service successfully. |  -  |
**400** | The service cannot be deleted. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_list**
> List[Service] orgs_services_list(org, page=page, page_size=page_size, query=query, sort=sort)

Get a list of all services within an organization.

Get a list of all services within an organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.service import Service
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)
    query = 'query_example' # str | A search term for querying of services within an Organization.Available options are: name, role (optional)
    sort = 'created_at' # str | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-created_at`). Available options: created_at, name, role. (optional) (default to 'created_at')

    try:
        # Get a list of all services within an organization.
        api_response = api_instance.orgs_services_list(org, page=page, page_size=page_size, query=query, sort=sort)
        print("The response of OrgsApi->orgs_services_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_services_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **query** | **str**| A search term for querying of services within an Organization.Available options are: name, role | [optional] 
 **sort** | **str**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-created_at&#x60;). Available options: created_at, name, role. | [optional] [default to &#39;created_at&#39;]

### Return type

[**List[Service]**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the list of services within the org |  -  |
**404** | Org namespace not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_partial_update**
> Service orgs_services_partial_update(org, service, data=data)

Update a service within an organization.

Update a service within an organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.service import Service
from cloudsmith_api.models.service_request_patch import ServiceRequestPatch
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    service = 'service_example' # str | 
    data = cloudsmith_api.ServiceRequestPatch() # ServiceRequestPatch |  (optional)

    try:
        # Update a service within an organization.
        api_response = api_instance.orgs_services_partial_update(org, service, data=data)
        print("The response of OrgsApi->orgs_services_partial_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_services_partial_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **service** | **str**|  | 
 **data** | [**ServiceRequestPatch**](ServiceRequestPatch.md)|  | [optional] 

### Return type

[**Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated the service within the org |  -  |
**404** | Org namespace not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_read**
> Service orgs_services_read(org, service)

Retrieve details of a single service within an organization.

Retrieve details of a single service within an organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.service import Service
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    service = 'service_example' # str | 

    try:
        # Retrieve details of a single service within an organization.
        api_response = api_instance.orgs_services_read(org, service)
        print("The response of OrgsApi->orgs_services_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_services_read: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **service** | **str**|  | 

### Return type

[**Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_refresh**
> Service orgs_services_refresh(org, service)

Refresh service API token.

Refresh service API token.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.service import Service
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    service = 'service_example' # str | 

    try:
        # Refresh service API token.
        api_response = api_instance.orgs_services_refresh(org, service)
        print("The response of OrgsApi->orgs_services_refresh:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_services_refresh: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **service** | **str**|  | 

### Return type

[**Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Refreshed the service token successfully. |  -  |
**400** | The service token cannot be refreshed. |  -  |
**404** | Org namespace not found |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_create**
> OrganizationTeam orgs_teams_create(org, data=data)

Create a team for this organization.

Create a team for this organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_team import OrganizationTeam
from cloudsmith_api.models.organization_team_request import OrganizationTeamRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    data = cloudsmith_api.OrganizationTeamRequest() # OrganizationTeamRequest |  (optional)

    try:
        # Create a team for this organization.
        api_response = api_instance.orgs_teams_create(org, data=data)
        print("The response of OrgsApi->orgs_teams_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_teams_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **data** | [**OrganizationTeamRequest**](OrganizationTeamRequest.md)|  | [optional] 

### Return type

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Team created |  -  |
**400** | The team cannot be created. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_delete**
> orgs_teams_delete(org, team)

Delete a specific team in a organization.

Delete a specific team in a organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    team = 'team_example' # str | 

    try:
        # Delete a specific team in a organization.
        api_instance.orgs_teams_delete(org, team)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_teams_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **team** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Deleted the team successfully. |  -  |
**400** | The team cannot be deleted. |  -  |
**404** | Team not found. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_list**
> List[OrganizationTeam] orgs_teams_list(org, page=page, page_size=page_size, for_user=for_user, query=query, sort=sort)

Get the details of all teams within an organization.

Get the details of all teams within an organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_team import OrganizationTeam
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)
    for_user = False # bool | Filter for teams that you are a member of. (optional) (default to False)
    query = 'query_example' # str | A search term for querying of teams within an Organization.Available options are: name, slug, user, userslug (optional)
    sort = 'name' # str | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name, members. (optional) (default to 'name')

    try:
        # Get the details of all teams within an organization.
        api_response = api_instance.orgs_teams_list(org, page=page, page_size=page_size, for_user=for_user, query=query, sort=sort)
        print("The response of OrgsApi->orgs_teams_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_teams_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **for_user** | **bool**| Filter for teams that you are a member of. | [optional] [default to False]
 **query** | **str**| A search term for querying of teams within an Organization.Available options are: name, slug, user, userslug | [optional] 
 **sort** | **str**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name, members. | [optional] [default to &#39;name&#39;]

### Return type

[**List[OrganizationTeam]**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the list of teams within the org |  -  |
**404** | Org namespace not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_members_create**
> OrganizationTeamMembers orgs_teams_members_create(org, team, data=data)

Add users to a team.

Add users to a team.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_team_members import OrganizationTeamMembers
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    team = 'team_example' # str | 
    data = cloudsmith_api.OrganizationTeamMembers() # OrganizationTeamMembers |  (optional)

    try:
        # Add users to a team.
        api_response = api_instance.orgs_teams_members_create(org, team, data=data)
        print("The response of OrgsApi->orgs_teams_members_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_teams_members_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **team** | **str**|  | 
 **data** | [**OrganizationTeamMembers**](OrganizationTeamMembers.md)|  | [optional] 

### Return type

[**OrganizationTeamMembers**](OrganizationTeamMembers.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The users were added to the team. |  -  |
**404** | Team not found. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_members_list**
> OrganizationTeamMembers orgs_teams_members_list(org, team, user_kind=user_kind)

List all members for the team.

List all members for the team.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_team_members import OrganizationTeamMembers
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    team = 'team_example' # str | 
    user_kind = 'user_kind_example' # str | Filter accounts by type. Possible values are 'user' and 'service'. If not provided, only users are returned. (optional)

    try:
        # List all members for the team.
        api_response = api_instance.orgs_teams_members_list(org, team, user_kind=user_kind)
        print("The response of OrgsApi->orgs_teams_members_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_teams_members_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **team** | **str**|  | 
 **user_kind** | **str**| Filter accounts by type. Possible values are &#39;user&#39; and &#39;service&#39;. If not provided, only users are returned. | [optional] 

### Return type

[**OrganizationTeamMembers**](OrganizationTeamMembers.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved users for the specified team. |  -  |
**404** | Team not found. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_members_update**
> OrganizationTeamMembers orgs_teams_members_update(org, team, data=data)

Replace all team members.

Replace all team members.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_team_members import OrganizationTeamMembers
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    team = 'team_example' # str | 
    data = cloudsmith_api.OrganizationTeamMembers() # OrganizationTeamMembers |  (optional)

    try:
        # Replace all team members.
        api_response = api_instance.orgs_teams_members_update(org, team, data=data)
        print("The response of OrgsApi->orgs_teams_members_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_teams_members_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **team** | **str**|  | 
 **data** | [**OrganizationTeamMembers**](OrganizationTeamMembers.md)|  | [optional] 

### Return type

[**OrganizationTeamMembers**](OrganizationTeamMembers.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The team members were replaced. |  -  |
**404** | Team not found. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_partial_update**
> OrganizationTeam orgs_teams_partial_update(org, team, data=data)

Update a specific team in a organization.

Update a specific team in a organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_team import OrganizationTeam
from cloudsmith_api.models.organization_team_request_patch import OrganizationTeamRequestPatch
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    team = 'team_example' # str | 
    data = cloudsmith_api.OrganizationTeamRequestPatch() # OrganizationTeamRequestPatch |  (optional)

    try:
        # Update a specific team in a organization.
        api_response = api_instance.orgs_teams_partial_update(org, team, data=data)
        print("The response of OrgsApi->orgs_teams_partial_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_teams_partial_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **team** | **str**|  | 
 **data** | [**OrganizationTeamRequestPatch**](OrganizationTeamRequestPatch.md)|  | [optional] 

### Return type

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated the specified team. |  -  |
**400** | The team cannot be edited. |  -  |
**404** | Team not found. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_read**
> OrganizationTeam orgs_teams_read(org, team)

Get the details of a specific team within an organization.

Get the details of a specific team within an organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_team import OrganizationTeam
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    team = 'team_example' # str | 

    try:
        # Get the details of a specific team within an organization.
        api_response = api_instance.orgs_teams_read(org, team)
        print("The response of OrgsApi->orgs_teams_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_teams_read: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **team** | **str**|  | 

### Return type

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the details of the requested team. |  -  |
**404** | Team not found. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_update_usage_limits**
> OrgsUpdateUsageLimits200Response orgs_update_usage_limits(org, data=data)

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_usage_update_request_patch import OrganizationUsageUpdateRequestPatch
from cloudsmith_api.models.orgs_update_usage_limits200_response import OrgsUpdateUsageLimits200Response
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    data = cloudsmith_api.OrganizationUsageUpdateRequestPatch() # OrganizationUsageUpdateRequestPatch |  (optional)

    try:
        api_response = api_instance.orgs_update_usage_limits(org, data=data)
        print("The response of OrgsApi->orgs_update_usage_limits:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_update_usage_limits: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **data** | [**OrganizationUsageUpdateRequestPatch**](OrganizationUsageUpdateRequestPatch.md)|  | [optional] 

### Return type

[**OrgsUpdateUsageLimits200Response**](OrgsUpdateUsageLimits200Response.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Organization usage limits configuration updated. |  -  |
**422** | Invalid input |  -  |
**400** | Request could not be processed (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_create**
> OrganizationPackageVulnerabilityPolicy orgs_vulnerability_policy_create(org, data=data)

Create a package vulnerability policy.

Create a package vulnerability policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_package_vulnerability_policy import OrganizationPackageVulnerabilityPolicy
from cloudsmith_api.models.organization_package_vulnerability_policy_request import OrganizationPackageVulnerabilityPolicyRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    data = cloudsmith_api.OrganizationPackageVulnerabilityPolicyRequest() # OrganizationPackageVulnerabilityPolicyRequest |  (optional)

    try:
        # Create a package vulnerability policy.
        api_response = api_instance.orgs_vulnerability_policy_create(org, data=data)
        print("The response of OrgsApi->orgs_vulnerability_policy_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_vulnerability_policy_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **data** | [**OrganizationPackageVulnerabilityPolicyRequest**](OrganizationPackageVulnerabilityPolicyRequest.md)|  | [optional] 

### Return type

[**OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_delete**
> orgs_vulnerability_policy_delete(org, slug_perm)

Delete a package vulnerability policy.

Delete a package vulnerability policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 

    try:
        # Delete a package vulnerability policy.
        api_instance.orgs_vulnerability_policy_delete(org, slug_perm)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_vulnerability_policy_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_evaluation_create**
> PackageVulnerabilityPolicyEvaluationRequest orgs_vulnerability_policy_evaluation_create(org, policy_slug_perm, data=data)

Create an evaluation request for this policy.

Create an evaluation request for this policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_vulnerability_policy_evaluation_request import PackageVulnerabilityPolicyEvaluationRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    policy_slug_perm = 'policy_slug_perm_example' # str | 
    data = None # object |  (optional)

    try:
        # Create an evaluation request for this policy.
        api_response = api_instance.orgs_vulnerability_policy_evaluation_create(org, policy_slug_perm, data=data)
        print("The response of OrgsApi->orgs_vulnerability_policy_evaluation_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_vulnerability_policy_evaluation_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **policy_slug_perm** | **str**|  | 
 **data** | **object**|  | [optional] 

### Return type

[**PackageVulnerabilityPolicyEvaluationRequest**](PackageVulnerabilityPolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_evaluation_list**
> List[PackageVulnerabilityPolicyEvaluationRequest] orgs_vulnerability_policy_evaluation_list(org, policy_slug_perm, page=page, page_size=page_size)

List evaluation requests for this policy.

List evaluation requests for this policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_vulnerability_policy_evaluation_request import PackageVulnerabilityPolicyEvaluationRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    policy_slug_perm = 'policy_slug_perm_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)

    try:
        # List evaluation requests for this policy.
        api_response = api_instance.orgs_vulnerability_policy_evaluation_list(org, policy_slug_perm, page=page, page_size=page_size)
        print("The response of OrgsApi->orgs_vulnerability_policy_evaluation_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_vulnerability_policy_evaluation_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **policy_slug_perm** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**List[PackageVulnerabilityPolicyEvaluationRequest]**](PackageVulnerabilityPolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_evaluation_read**
> PackageVulnerabilityPolicyEvaluationRequest orgs_vulnerability_policy_evaluation_read(org, policy_slug_perm, slug_perm)

Retrieve an evaluation request for this policy.

Retrieve an evaluation request for this policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_vulnerability_policy_evaluation_request import PackageVulnerabilityPolicyEvaluationRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    policy_slug_perm = 'policy_slug_perm_example' # str | 
    slug_perm = 'slug_perm_example' # str | 

    try:
        # Retrieve an evaluation request for this policy.
        api_response = api_instance.orgs_vulnerability_policy_evaluation_read(org, policy_slug_perm, slug_perm)
        print("The response of OrgsApi->orgs_vulnerability_policy_evaluation_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_vulnerability_policy_evaluation_read: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **policy_slug_perm** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**PackageVulnerabilityPolicyEvaluationRequest**](PackageVulnerabilityPolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_list**
> List[OrganizationPackageVulnerabilityPolicy] orgs_vulnerability_policy_list(org, page=page, page_size=page_size)

Get a list of all package vulnerability policies.

Get a list of all package vulnerability policies.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_package_vulnerability_policy import OrganizationPackageVulnerabilityPolicy
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)

    try:
        # Get a list of all package vulnerability policies.
        api_response = api_instance.orgs_vulnerability_policy_list(org, page=page, page_size=page_size)
        print("The response of OrgsApi->orgs_vulnerability_policy_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_vulnerability_policy_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**List[OrganizationPackageVulnerabilityPolicy]**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_partial_update**
> OrganizationPackageVulnerabilityPolicy orgs_vulnerability_policy_partial_update(org, slug_perm, data=data)

Partially update a package vulnerability policy.

Partially update a package vulnerability policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_package_vulnerability_policy import OrganizationPackageVulnerabilityPolicy
from cloudsmith_api.models.organization_package_vulnerability_policy_request_patch import OrganizationPackageVulnerabilityPolicyRequestPatch
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 
    data = cloudsmith_api.OrganizationPackageVulnerabilityPolicyRequestPatch() # OrganizationPackageVulnerabilityPolicyRequestPatch |  (optional)

    try:
        # Partially update a package vulnerability policy.
        api_response = api_instance.orgs_vulnerability_policy_partial_update(org, slug_perm, data=data)
        print("The response of OrgsApi->orgs_vulnerability_policy_partial_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_vulnerability_policy_partial_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**OrganizationPackageVulnerabilityPolicyRequestPatch**](OrganizationPackageVulnerabilityPolicyRequestPatch.md)|  | [optional] 

### Return type

[**OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_read**
> OrganizationPackageVulnerabilityPolicy orgs_vulnerability_policy_read(org, slug_perm)

Get a package vulnerability policy.

Get a package vulnerability policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_package_vulnerability_policy import OrganizationPackageVulnerabilityPolicy
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 

    try:
        # Get a package vulnerability policy.
        api_response = api_instance.orgs_vulnerability_policy_read(org, slug_perm)
        print("The response of OrgsApi->orgs_vulnerability_policy_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_vulnerability_policy_read: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_update**
> OrganizationPackageVulnerabilityPolicy orgs_vulnerability_policy_update(org, slug_perm, data=data)

Update a package vulnerability policy.

Update a package vulnerability policy.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.organization_package_vulnerability_policy import OrganizationPackageVulnerabilityPolicy
from cloudsmith_api.models.organization_package_vulnerability_policy_request import OrganizationPackageVulnerabilityPolicyRequest
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    slug_perm = 'slug_perm_example' # str | 
    data = cloudsmith_api.OrganizationPackageVulnerabilityPolicyRequest() # OrganizationPackageVulnerabilityPolicyRequest |  (optional)

    try:
        # Update a package vulnerability policy.
        api_response = api_instance.orgs_vulnerability_policy_update(org, slug_perm, data=data)
        print("The response of OrgsApi->orgs_vulnerability_policy_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_vulnerability_policy_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**OrganizationPackageVulnerabilityPolicyRequest**](OrganizationPackageVulnerabilityPolicyRequest.md)|  | [optional] 

### Return type

[**OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_violation_list**
> PackageVulnerabilityPolicyViolationLogCursorPage orgs_vulnerability_policy_violation_list(org, cursor=cursor, page_size=page_size)

List all current vulnerability policy violations for this Organization.

List all current vulnerability policy violations for this Organization.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_vulnerability_policy_violation_log_cursor_page import PackageVulnerabilityPolicyViolationLogCursorPage
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.OrgsApi(api_client)
    org = 'org_example' # str | 
    cursor = 'cursor_example' # str | The pagination cursor value. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)

    try:
        # List all current vulnerability policy violations for this Organization.
        api_response = api_instance.orgs_vulnerability_policy_violation_list(org, cursor=cursor, page_size=page_size)
        print("The response of OrgsApi->orgs_vulnerability_policy_violation_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_vulnerability_policy_violation_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **cursor** | **str**| The pagination cursor value. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**PackageVulnerabilityPolicyViolationLogCursorPage**](PackageVulnerabilityPolicyViolationLogCursorPage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

