# cloudsmith_api.OrgsApi

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
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 

try:
    # Delete the specified organization.
    api_instance.orgs_delete(org)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_create**
> PackageDenyPolicy orgs_deny_policy_create(org, data=data)

Create a package deny policy.

Create a package deny policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
data = cloudsmith_api.PackageDenyPolicyRequest() # PackageDenyPolicyRequest |  (optional)

try:
    # Create a package deny policy.
    api_response = api_instance.orgs_deny_policy_create(org, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_delete**
> orgs_deny_policy_delete(org, slug_perm)

Delete a package deny policy.

Delete a package deny policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a package deny policy.
    api_instance.orgs_deny_policy_delete(org, slug_perm)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_list**
> list[PackageDenyPolicy] orgs_deny_policy_list(org, page=page, page_size=page_size)

Get a list of all package deny policies.

Get a list of all package deny policies.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # Get a list of all package deny policies.
    api_response = api_instance.orgs_deny_policy_list(org, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_deny_policy_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[PackageDenyPolicy]**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_partial_update**
> PackageDenyPolicy orgs_deny_policy_partial_update(org, slug_perm, data=data)

Partially update a package deny policy.

Partially update a package deny policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.PackageDenyPolicyRequestPatch() # PackageDenyPolicyRequestPatch |  (optional)

try:
    # Partially update a package deny policy.
    api_response = api_instance.orgs_deny_policy_partial_update(org, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_read**
> PackageDenyPolicy orgs_deny_policy_read(org, slug_perm)

Get a package deny policy.

Get a package deny policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 

try:
    # Get a package deny policy.
    api_response = api_instance.orgs_deny_policy_read(org, slug_perm)
    pprint(api_response)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_update**
> PackageDenyPolicy orgs_deny_policy_update(org, slug_perm, data=data)

Update a package deny policy.

Update a package deny policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.PackageDenyPolicyRequest() # PackageDenyPolicyRequest |  (optional)

try:
    # Update a package deny policy.
    api_response = api_instance.orgs_deny_policy_update(org, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_create**
> OrganizationInvite orgs_invites_create(org, data=data)

Create an organization invite for a specific user

Create an organization invite for a specific user

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
data = cloudsmith_api.OrganizationInviteRequest() # OrganizationInviteRequest |  (optional)

try:
    # Create an organization invite for a specific user
    api_response = api_instance.orgs_invites_create(org, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_delete**
> orgs_invites_delete(org, slug_perm)

Delete a specific organization invite

Delete a specific organization invite

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a specific organization invite
    api_instance.orgs_invites_delete(org, slug_perm)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_extend**
> OrganizationInviteExtend orgs_invites_extend(org, slug_perm)

Extend an organization invite.

Extend an organization invite.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 

try:
    # Extend an organization invite.
    api_response = api_instance.orgs_invites_extend(org, slug_perm)
    pprint(api_response)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_list**
> list[OrganizationInvite] orgs_invites_list(org, page=page, page_size=page_size)

Get a list of all invites for an organization.

Get a list of all invites for an organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # Get a list of all invites for an organization.
    api_response = api_instance.orgs_invites_list(org, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_invites_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[OrganizationInvite]**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_partial_update**
> OrganizationInvite orgs_invites_partial_update(org, slug_perm, data=data)

Update a specific organization invite.

Update a specific organization invite.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.OrganizationInviteUpdateRequestPatch() # OrganizationInviteUpdateRequestPatch |  (optional)

try:
    # Update a specific organization invite.
    api_response = api_instance.orgs_invites_partial_update(org, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_resend**
> OrganizationInviteExtend orgs_invites_resend(org, slug_perm)

Resend an organization invite.

Resend an organization invite.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 

try:
    # Resend an organization invite.
    api_response = api_instance.orgs_invites_resend(org, slug_perm)
    pprint(api_response)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_create**
> OrganizationPackageLicensePolicy orgs_license_policy_create(org, data=data)

Create a package license policy.

Create a package license policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
data = cloudsmith_api.OrganizationPackageLicensePolicyRequest() # OrganizationPackageLicensePolicyRequest |  (optional)

try:
    # Create a package license policy.
    api_response = api_instance.orgs_license_policy_create(org, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_delete**
> orgs_license_policy_delete(org, slug_perm)

Delete a package license policy.

Delete a package license policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a package license policy.
    api_instance.orgs_license_policy_delete(org, slug_perm)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_evaluation_create**
> PackageLicensePolicyEvaluationRequest orgs_license_policy_evaluation_create(org, policy_slug_perm, data=data)

Create an evaluation request for this policy.

Create an evaluation request for this policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
policy_slug_perm = 'policy_slug_perm_example' # str | 
data = cloudsmith_api.PackageLicensePolicyEvaluationRequestRequest() # PackageLicensePolicyEvaluationRequestRequest |  (optional)

try:
    # Create an evaluation request for this policy.
    api_response = api_instance.orgs_license_policy_evaluation_create(org, policy_slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_license_policy_evaluation_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **policy_slug_perm** | **str**|  | 
 **data** | [**PackageLicensePolicyEvaluationRequestRequest**](PackageLicensePolicyEvaluationRequestRequest.md)|  | [optional] 

### Return type

[**PackageLicensePolicyEvaluationRequest**](PackageLicensePolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_evaluation_list**
> list[PackageLicensePolicyEvaluationRequest] orgs_license_policy_evaluation_list(org, policy_slug_perm, page=page, page_size=page_size)

List evaluation requests for this policy.

List evaluation requests for this policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
policy_slug_perm = 'policy_slug_perm_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # List evaluation requests for this policy.
    api_response = api_instance.orgs_license_policy_evaluation_list(org, policy_slug_perm, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
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

[**list[PackageLicensePolicyEvaluationRequest]**](PackageLicensePolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_evaluation_read**
> PackageLicensePolicyEvaluationRequest orgs_license_policy_evaluation_read(org, policy_slug_perm, slug_perm)

Retrieve an evaluation request for this policy.

Retrieve an evaluation request for this policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
policy_slug_perm = 'policy_slug_perm_example' # str | 
slug_perm = 'slug_perm_example' # str | 

try:
    # Retrieve an evaluation request for this policy.
    api_response = api_instance.orgs_license_policy_evaluation_read(org, policy_slug_perm, slug_perm)
    pprint(api_response)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_list**
> list[OrganizationPackageLicensePolicy] orgs_license_policy_list(org, page=page, page_size=page_size)

Get a list of all package license policies.

Get a list of all package license policies.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # Get a list of all package license policies.
    api_response = api_instance.orgs_license_policy_list(org, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_license_policy_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[OrganizationPackageLicensePolicy]**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_partial_update**
> OrganizationPackageLicensePolicy orgs_license_policy_partial_update(org, slug_perm, data=data)

Partially update a package license policy.

Partially update a package license policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.OrganizationPackageLicensePolicyRequestPatch() # OrganizationPackageLicensePolicyRequestPatch |  (optional)

try:
    # Partially update a package license policy.
    api_response = api_instance.orgs_license_policy_partial_update(org, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_read**
> OrganizationPackageLicensePolicy orgs_license_policy_read(org, slug_perm)

Get a package license policy.

Get a package license policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 

try:
    # Get a package license policy.
    api_response = api_instance.orgs_license_policy_read(org, slug_perm)
    pprint(api_response)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_update**
> OrganizationPackageLicensePolicy orgs_license_policy_update(org, slug_perm, data=data)

Update a package license policy.

Update a package license policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.OrganizationPackageLicensePolicyRequest() # OrganizationPackageLicensePolicyRequest |  (optional)

try:
    # Update a package license policy.
    api_response = api_instance.orgs_license_policy_update(org, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_violation_list**
> PackageLicensePolicyViolationLogCursorPage orgs_license_policy_violation_list(org, cursor=cursor, page_size=page_size)

List all current license policy violations for this Organization.

List all current license policy violations for this Organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
cursor = 'cursor_example' # str | The pagination cursor value. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # List all current license policy violations for this Organization.
    api_response = api_instance.orgs_license_policy_violation_list(org, cursor=cursor, page_size=page_size)
    pprint(api_response)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_list**
> list[Organization] orgs_list(page=page, page_size=page_size)

Get a list of all the organizations you are associated with.

Get a list of all the organizations you are associated with.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # Get a list of all the organizations you are associated with.
    api_response = api_instance.orgs_list(page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[Organization]**](Organization.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_delete**
> orgs_members_delete(org, member)

Removes a member from the organization.

Removes a member from the organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
member = 'member_example' # str | 

try:
    # Removes a member from the organization.
    api_instance.orgs_members_delete(org, member)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_list**
> list[OrganizationMembership] orgs_members_list(org, page=page, page_size=page_size, is_active=is_active, query=query, sort=sort)

Get the details for all organization members.

Get the details for all organization members.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)
is_active = false # bool | Filter for active/inactive users. (optional) (default to false)
query = '' # str | A search term for querying of members within an Organization.Available options are: email, org, user, userslug, inactive, user_name, role (optional) (default to )
sort = 'user_name' # str | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-user_name`). Available options: user_name, role. (optional) (default to user_name)

try:
    # Get the details for all organization members.
    api_response = api_instance.orgs_members_list(org, page=page, page_size=page_size, is_active=is_active, query=query, sort=sort)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_members_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **is_active** | **bool**| Filter for active/inactive users. | [optional] [default to false]
 **query** | **str**| A search term for querying of members within an Organization.Available options are: email, org, user, userslug, inactive, user_name, role | [optional] [default to ]
 **sort** | **str**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-user_name&#x60;). Available options: user_name, role. | [optional] [default to user_name]

### Return type

[**list[OrganizationMembership]**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_partial_update**
> OrganizationMembership orgs_members_partial_update(org, member, data=data)

Views for working with organization members.

Views for working with organization members.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
member = 'member_example' # str | 
data = cloudsmith_api.OrganizationMembershipRequestPatch() # OrganizationMembershipRequestPatch |  (optional)

try:
    # Views for working with organization members.
    api_response = api_instance.orgs_members_partial_update(org, member, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_members_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **member** | **str**|  | 
 **data** | [**OrganizationMembershipRequestPatch**](OrganizationMembershipRequestPatch.md)|  | [optional] 

### Return type

[**OrganizationMembership**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_read**
> OrganizationMembership orgs_members_read(org, member)

Get the details for a specific organization member.

Get the details for a specific organization member.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
member = 'member_example' # str | 

try:
    # Get the details for a specific organization member.
    api_response = api_instance.orgs_members_read(org, member)
    pprint(api_response)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_refresh**
> orgs_members_refresh(org, member)

Refresh a member of the organization's API key.

Refresh a member of the organization's API key.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
member = 'member_example' # str | 

try:
    # Refresh a member of the organization's API key.
    api_instance.orgs_members_refresh(org, member)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_remove**
> orgs_members_remove(org, member)

Removes a member from the organization (deprecated, use DELETE instead).

Removes a member from the organization (deprecated, use DELETE instead).

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
member = 'member_example' # str | 

try:
    # Removes a member from the organization (deprecated, use DELETE instead).
    api_instance.orgs_members_remove(org, member)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_update_role**
> OrganizationMembershipRoleUpdate orgs_members_update_role(org, member, data=data)

Update a member's role in the organization.

Update a member's role in the organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
member = 'member_example' # str | 
data = cloudsmith_api.OrganizationMembershipRoleUpdateRequestPatch() # OrganizationMembershipRoleUpdateRequestPatch |  (optional)

try:
    # Update a member's role in the organization.
    api_response = api_instance.orgs_members_update_role(org, member, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_update_visibility**
> OrganizationMembershipVisibilityUpdate orgs_members_update_visibility(org, member, data=data)

Update a member's visibility in the organization.

Update a member's visibility in the organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
member = 'member_example' # str | 
data = cloudsmith_api.OrganizationMembershipVisibilityUpdateRequestPatch() # OrganizationMembershipVisibilityUpdateRequestPatch |  (optional)

try:
    # Update a member's visibility in the organization.
    api_response = api_instance.orgs_members_update_visibility(org, member, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_create**
> ProviderSettings orgs_openid_connect_create(org, data=data)

Create the OpenID Connect provider settings for the org.

Create the OpenID Connect provider settings for the org.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
data = cloudsmith_api.ProviderSettingsRequest() # ProviderSettingsRequest |  (optional)

try:
    # Create the OpenID Connect provider settings for the org.
    api_response = api_instance.orgs_openid_connect_create(org, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_openid_connect_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **data** | [**ProviderSettingsRequest**](ProviderSettingsRequest.md)|  | [optional] 

### Return type

[**ProviderSettings**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_delete**
> orgs_openid_connect_delete(org, slug_perm)

Delete a specific OpenID Connect provider setting for the org.

Delete a specific OpenID Connect provider setting for the org.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a specific OpenID Connect provider setting for the org.
    api_instance.orgs_openid_connect_delete(org, slug_perm)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_list**
> list[ProviderSettings] orgs_openid_connect_list(org, page=page, page_size=page_size, query=query, sort=sort)

Retrieve the list of OpenID Connect provider settings for the org.

Retrieve the list of OpenID Connect provider settings for the org.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)
query = '' # str | A search term for querying of OpenID Connect (OIDC) provider settings.Available options are: name, provider_url, service_account (optional) (default to )
sort = 'name' # str | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name. (optional) (default to name)

try:
    # Retrieve the list of OpenID Connect provider settings for the org.
    api_response = api_instance.orgs_openid_connect_list(org, page=page, page_size=page_size, query=query, sort=sort)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_openid_connect_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **query** | **str**| A search term for querying of OpenID Connect (OIDC) provider settings.Available options are: name, provider_url, service_account | [optional] [default to ]
 **sort** | **str**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name. | [optional] [default to name]

### Return type

[**list[ProviderSettings]**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_partial_update**
> ProviderSettings orgs_openid_connect_partial_update(org, slug_perm, data=data)

Update a specific OpenID Connect provider setting for the org.

Update a specific OpenID Connect provider setting for the org.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.ProviderSettingsRequestPatch() # ProviderSettingsRequestPatch |  (optional)

try:
    # Update a specific OpenID Connect provider setting for the org.
    api_response = api_instance.orgs_openid_connect_partial_update(org, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_openid_connect_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**ProviderSettingsRequestPatch**](ProviderSettingsRequestPatch.md)|  | [optional] 

### Return type

[**ProviderSettings**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_read**
> ProviderSettings orgs_openid_connect_read(org, slug_perm)

Retrieve a specific OpenID Connect provider setting for the org.

Retrieve a specific OpenID Connect provider setting for the org.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 

try:
    # Retrieve a specific OpenID Connect provider setting for the org.
    api_response = api_instance.orgs_openid_connect_read(org, slug_perm)
    pprint(api_response)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_update**
> ProviderSettings orgs_openid_connect_update(org, slug_perm, data=data)

Update a specific OpenID Connect provider setting for the org.

Update a specific OpenID Connect provider setting for the org.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.ProviderSettingsRequest() # ProviderSettingsRequest |  (optional)

try:
    # Update a specific OpenID Connect provider setting for the org.
    api_response = api_instance.orgs_openid_connect_update(org, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_openid_connect_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**ProviderSettingsRequest**](ProviderSettingsRequest.md)|  | [optional] 

### Return type

[**ProviderSettings**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_read**
> Organization orgs_read(org)

Get the details for the specific organization.

Get the details for the specific organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 

try:
    # Get the details for the specific organization.
    api_response = api_instance.orgs_read(org)
    pprint(api_response)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_authentication_partial_update**
> OrganizationSAMLAuth orgs_saml_authentication_partial_update(org, data=data)

Update the SAML Authentication settings for this Organization.

Update the SAML Authentication settings for this Organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
data = cloudsmith_api.OrganizationSAMLAuthRequestPatch() # OrganizationSAMLAuthRequestPatch |  (optional)

try:
    # Update the SAML Authentication settings for this Organization.
    api_response = api_instance.orgs_saml_authentication_partial_update(org, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_authentication_read**
> OrganizationSAMLAuth orgs_saml_authentication_read(org)

Retrieve the SAML Authentication settings for this Organization.

Retrieve the SAML Authentication settings for this Organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 

try:
    # Retrieve the SAML Authentication settings for this Organization.
    api_response = api_instance.orgs_saml_authentication_read(org)
    pprint(api_response)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_create**
> OrganizationGroupSync orgs_saml_group_sync_create(org, data=data)

Create a new SAML Group Sync mapping within an organization.

Create a new SAML Group Sync mapping within an organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
data = cloudsmith_api.OrganizationGroupSyncRequest() # OrganizationGroupSyncRequest |  (optional)

try:
    # Create a new SAML Group Sync mapping within an organization.
    api_response = api_instance.orgs_saml_group_sync_create(org, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_delete**
> orgs_saml_group_sync_delete(org, slug_perm)

Delete a SAML Group Sync mapping from an organization.

Delete a SAML Group Sync mapping from an organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a SAML Group Sync mapping from an organization.
    api_instance.orgs_saml_group_sync_delete(org, slug_perm)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_disable**
> orgs_saml_group_sync_disable(org)

Disable SAML Group Sync for this organization.

Disable SAML Group Sync for this organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 

try:
    # Disable SAML Group Sync for this organization.
    api_instance.orgs_saml_group_sync_disable(org)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_enable**
> orgs_saml_group_sync_enable(org)

Enable SAML Group Sync for this organization.

Enable SAML Group Sync for this organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 

try:
    # Enable SAML Group Sync for this organization.
    api_instance.orgs_saml_group_sync_enable(org)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_list**
> list[OrganizationGroupSync] orgs_saml_group_sync_list(org, page=page, page_size=page_size)

Get the details of all SAML Group Sync mapping within an organization.

Get the details of all SAML Group Sync mapping within an organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # Get the details of all SAML Group Sync mapping within an organization.
    api_response = api_instance.orgs_saml_group_sync_list(org, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_saml_group_sync_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[OrganizationGroupSync]**](OrganizationGroupSync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_status**
> OrganizationGroupSyncStatus orgs_saml_group_sync_status(org)

Retrieve the SAML Group Sync status for this organization.

Retrieve the SAML Group Sync status for this organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 

try:
    # Retrieve the SAML Group Sync status for this organization.
    api_response = api_instance.orgs_saml_group_sync_status(org)
    pprint(api_response)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_create**
> Service orgs_services_create(org, data=data)

Create a service within an organization.

Create a service within an organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
data = cloudsmith_api.ServiceRequest() # ServiceRequest |  (optional)

try:
    # Create a service within an organization.
    api_response = api_instance.orgs_services_create(org, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_delete**
> orgs_services_delete(org, service)

Delete a specific service

Delete a specific service

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
service = 'service_example' # str | 

try:
    # Delete a specific service
    api_instance.orgs_services_delete(org, service)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_list**
> list[Service] orgs_services_list(org, page=page, page_size=page_size, query=query, sort=sort)

Get a list of all services within an organization.

Get a list of all services within an organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)
query = '' # str | A search term for querying of services within an Organization.Available options are: name, role (optional) (default to )
sort = 'created_at' # str | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-created_at`). Available options: created_at, name, role. (optional) (default to created_at)

try:
    # Get a list of all services within an organization.
    api_response = api_instance.orgs_services_list(org, page=page, page_size=page_size, query=query, sort=sort)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_services_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **query** | **str**| A search term for querying of services within an Organization.Available options are: name, role | [optional] [default to ]
 **sort** | **str**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-created_at&#x60;). Available options: created_at, name, role. | [optional] [default to created_at]

### Return type

[**list[Service]**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_partial_update**
> Service orgs_services_partial_update(org, service, data=data)

Update a service within an organization.

Update a service within an organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
service = 'service_example' # str | 
data = cloudsmith_api.ServiceRequestPatch() # ServiceRequestPatch |  (optional)

try:
    # Update a service within an organization.
    api_response = api_instance.orgs_services_partial_update(org, service, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_read**
> Service orgs_services_read(org, service)

Retrieve details of a single service within an organization.

Retrieve details of a single service within an organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
service = 'service_example' # str | 

try:
    # Retrieve details of a single service within an organization.
    api_response = api_instance.orgs_services_read(org, service)
    pprint(api_response)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_refresh**
> Service orgs_services_refresh(org, service)

Refresh service API token.

Refresh service API token.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
service = 'service_example' # str | 

try:
    # Refresh service API token.
    api_response = api_instance.orgs_services_refresh(org, service)
    pprint(api_response)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_create**
> OrganizationTeam orgs_teams_create(org, data=data)

Create a team for this organization.

Create a team for this organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
data = cloudsmith_api.OrganizationTeamRequest() # OrganizationTeamRequest |  (optional)

try:
    # Create a team for this organization.
    api_response = api_instance.orgs_teams_create(org, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_delete**
> orgs_teams_delete(org, team)

Delete a specific team in a organization.

Delete a specific team in a organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
team = 'team_example' # str | 

try:
    # Delete a specific team in a organization.
    api_instance.orgs_teams_delete(org, team)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_list**
> list[OrganizationTeam] orgs_teams_list(org, page=page, page_size=page_size, for_user=for_user, query=query, sort=sort)

Get the details of all teams within an organization.

Get the details of all teams within an organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)
for_user = false # bool | Filter for teams that you are a member of. (optional) (default to false)
query = '' # str | A search term for querying of teams within an Organization.Available options are: name, slug, user, userslug (optional) (default to )
sort = 'name' # str | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name, members. (optional) (default to name)

try:
    # Get the details of all teams within an organization.
    api_response = api_instance.orgs_teams_list(org, page=page, page_size=page_size, for_user=for_user, query=query, sort=sort)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_teams_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **for_user** | **bool**| Filter for teams that you are a member of. | [optional] [default to false]
 **query** | **str**| A search term for querying of teams within an Organization.Available options are: name, slug, user, userslug | [optional] [default to ]
 **sort** | **str**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name, members. | [optional] [default to name]

### Return type

[**list[OrganizationTeam]**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_members_create**
> OrganizationTeamMembers orgs_teams_members_create(org, team, data=data)

Add users to a team.

Add users to a team.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
team = 'team_example' # str | 
data = cloudsmith_api.OrganizationTeamMembers() # OrganizationTeamMembers |  (optional)

try:
    # Add users to a team.
    api_response = api_instance.orgs_teams_members_create(org, team, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_members_list**
> OrganizationTeamMembers orgs_teams_members_list(org, team)

List all members for the team.

List all members for the team.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
team = 'team_example' # str | 

try:
    # List all members for the team.
    api_response = api_instance.orgs_teams_members_list(org, team)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_teams_members_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **team** | **str**|  | 

### Return type

[**OrganizationTeamMembers**](OrganizationTeamMembers.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_members_update**
> OrganizationTeamMembers orgs_teams_members_update(org, team, data=data)

Replace all team members.

Replace all team members.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
team = 'team_example' # str | 
data = cloudsmith_api.OrganizationTeamMembers() # OrganizationTeamMembers |  (optional)

try:
    # Replace all team members.
    api_response = api_instance.orgs_teams_members_update(org, team, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_partial_update**
> OrganizationTeam orgs_teams_partial_update(org, team, data=data)

Update a specific team in a organization.

Update a specific team in a organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
team = 'team_example' # str | 
data = cloudsmith_api.OrganizationTeamRequestPatch() # OrganizationTeamRequestPatch |  (optional)

try:
    # Update a specific team in a organization.
    api_response = api_instance.orgs_teams_partial_update(org, team, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_read**
> OrganizationTeam orgs_teams_read(org, team)

Get the details of a specific team within an organization.

Get the details of a specific team within an organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
team = 'team_example' # str | 

try:
    # Get the details of a specific team within an organization.
    api_response = api_instance.orgs_teams_read(org, team)
    pprint(api_response)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_create**
> OrganizationPackageVulnerabilityPolicy orgs_vulnerability_policy_create(org, data=data)

Create a package vulnerability policy.

Create a package vulnerability policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
data = cloudsmith_api.OrganizationPackageVulnerabilityPolicyRequest() # OrganizationPackageVulnerabilityPolicyRequest |  (optional)

try:
    # Create a package vulnerability policy.
    api_response = api_instance.orgs_vulnerability_policy_create(org, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_delete**
> orgs_vulnerability_policy_delete(org, slug_perm)

Delete a package vulnerability policy.

Delete a package vulnerability policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a package vulnerability policy.
    api_instance.orgs_vulnerability_policy_delete(org, slug_perm)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_evaluation_create**
> PackageVulnerabilityPolicyEvaluationRequest orgs_vulnerability_policy_evaluation_create(org, policy_slug_perm, data=data)

Create an evaluation request for this policy.

Create an evaluation request for this policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
policy_slug_perm = 'policy_slug_perm_example' # str | 
data = cloudsmith_api.PackageVulnerabilityPolicyEvaluationRequestRequest() # PackageVulnerabilityPolicyEvaluationRequestRequest |  (optional)

try:
    # Create an evaluation request for this policy.
    api_response = api_instance.orgs_vulnerability_policy_evaluation_create(org, policy_slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_vulnerability_policy_evaluation_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **policy_slug_perm** | **str**|  | 
 **data** | [**PackageVulnerabilityPolicyEvaluationRequestRequest**](PackageVulnerabilityPolicyEvaluationRequestRequest.md)|  | [optional] 

### Return type

[**PackageVulnerabilityPolicyEvaluationRequest**](PackageVulnerabilityPolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_evaluation_list**
> list[PackageVulnerabilityPolicyEvaluationRequest] orgs_vulnerability_policy_evaluation_list(org, policy_slug_perm, page=page, page_size=page_size)

List evaluation requests for this policy.

List evaluation requests for this policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
policy_slug_perm = 'policy_slug_perm_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # List evaluation requests for this policy.
    api_response = api_instance.orgs_vulnerability_policy_evaluation_list(org, policy_slug_perm, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
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

[**list[PackageVulnerabilityPolicyEvaluationRequest]**](PackageVulnerabilityPolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_evaluation_read**
> PackageVulnerabilityPolicyEvaluationRequest orgs_vulnerability_policy_evaluation_read(org, policy_slug_perm, slug_perm)

Retrieve an evaluation request for this policy.

Retrieve an evaluation request for this policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
policy_slug_perm = 'policy_slug_perm_example' # str | 
slug_perm = 'slug_perm_example' # str | 

try:
    # Retrieve an evaluation request for this policy.
    api_response = api_instance.orgs_vulnerability_policy_evaluation_read(org, policy_slug_perm, slug_perm)
    pprint(api_response)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_list**
> list[OrganizationPackageVulnerabilityPolicy] orgs_vulnerability_policy_list(org, page=page, page_size=page_size)

Get a list of all package vulnerability policies.

Get a list of all package vulnerability policies.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # Get a list of all package vulnerability policies.
    api_response = api_instance.orgs_vulnerability_policy_list(org, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_vulnerability_policy_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[OrganizationPackageVulnerabilityPolicy]**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_partial_update**
> OrganizationPackageVulnerabilityPolicy orgs_vulnerability_policy_partial_update(org, slug_perm, data=data)

Partially update a package vulnerability policy.

Partially update a package vulnerability policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.OrganizationPackageVulnerabilityPolicyRequestPatch() # OrganizationPackageVulnerabilityPolicyRequestPatch |  (optional)

try:
    # Partially update a package vulnerability policy.
    api_response = api_instance.orgs_vulnerability_policy_partial_update(org, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_read**
> OrganizationPackageVulnerabilityPolicy orgs_vulnerability_policy_read(org, slug_perm)

Get a package vulnerability policy.

Get a package vulnerability policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 

try:
    # Get a package vulnerability policy.
    api_response = api_instance.orgs_vulnerability_policy_read(org, slug_perm)
    pprint(api_response)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_update**
> OrganizationPackageVulnerabilityPolicy orgs_vulnerability_policy_update(org, slug_perm, data=data)

Update a package vulnerability policy.

Update a package vulnerability policy.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.OrganizationPackageVulnerabilityPolicyRequest() # OrganizationPackageVulnerabilityPolicyRequest |  (optional)

try:
    # Update a package vulnerability policy.
    api_response = api_instance.orgs_vulnerability_policy_update(org, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_violation_list**
> PackageVulnerabilityPolicyViolationLogCursorPage orgs_vulnerability_policy_violation_list(org, cursor=cursor, page_size=page_size)

List all current vulnerability policy violations for this Organization.

List all current vulnerability policy violations for this Organization.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
cursor = 'cursor_example' # str | The pagination cursor value. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # List all current vulnerability policy violations for this Organization.
    api_response = api_instance.orgs_vulnerability_policy_violation_list(org, cursor=cursor, page_size=page_size)
    pprint(api_response)
except ApiException as e:
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

