# cloudsmith_api.OrgsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orgs_invites_create**](OrgsApi.md#orgs_invites_create) | **POST** /orgs/{org}/invites/ | Create an organization invite for a specific user
[**orgs_invites_delete**](OrgsApi.md#orgs_invites_delete) | **DELETE** /orgs/{org}/invites/{slug_perm}/ | Delete a specific organization invite
[**orgs_invites_extend**](OrgsApi.md#orgs_invites_extend) | **POST** /orgs/{org}/invites/{slug_perm}/extend/ | Extend an organization invite.
[**orgs_invites_list**](OrgsApi.md#orgs_invites_list) | **GET** /orgs/{org}/invites/ | Get a list of all invites for an organization.
[**orgs_list**](OrgsApi.md#orgs_list) | **GET** /orgs/ | Get a list of all the organizations you are associated with.
[**orgs_members_delete**](OrgsApi.md#orgs_members_delete) | **DELETE** /orgs/{org}/members/{member}/ | Removes a member from the organization.
[**orgs_members_list**](OrgsApi.md#orgs_members_list) | **GET** /orgs/{org}/members/ | Get the details for all organization members.
[**orgs_members_read**](OrgsApi.md#orgs_members_read) | **GET** /orgs/{org}/members/{member}/ | Get the details for a specific organization member.
[**orgs_members_remove**](OrgsApi.md#orgs_members_remove) | **GET** /orgs/{org}/members/{member}/remove/ | Removes a member from the organization (deprecated, use DELETE instead).
[**orgs_read**](OrgsApi.md#orgs_read) | **GET** /orgs/{org}/ | Get the details for the specific organization.
[**orgs_saml_group_sync_create**](OrgsApi.md#orgs_saml_group_sync_create) | **POST** /orgs/{org}/saml-group-sync/ | Create a new SAML Group Sync mapping within an organization.
[**orgs_saml_group_sync_delete**](OrgsApi.md#orgs_saml_group_sync_delete) | **DELETE** /orgs/{org}/saml-group-sync/{slug_perm}/ | Delete a SAML Group Sync mapping from an organization.
[**orgs_saml_group_sync_list**](OrgsApi.md#orgs_saml_group_sync_list) | **GET** /orgs/{org}/saml-group-sync/ | Get the details of all SAML Group Sync mapping within an organization.
[**orgs_teams_create**](OrgsApi.md#orgs_teams_create) | **POST** /orgs/{org}/teams/ | Create a team for this organization.
[**orgs_teams_delete**](OrgsApi.md#orgs_teams_delete) | **DELETE** /orgs/{org}/teams/{team}/ | Delete a specific team in a organization.
[**orgs_teams_list**](OrgsApi.md#orgs_teams_list) | **GET** /orgs/{org}/teams/ | Get the details of all teams within an organization.
[**orgs_teams_members_create**](OrgsApi.md#orgs_teams_members_create) | **POST** /orgs/{org}/teams/{team}/members | Add users to a team.
[**orgs_teams_members_list**](OrgsApi.md#orgs_teams_members_list) | **GET** /orgs/{org}/teams/{team}/members | List all members for the team.
[**orgs_teams_members_update**](OrgsApi.md#orgs_teams_members_update) | **PUT** /orgs/{org}/teams/{team}/members | Replace all team members.
[**orgs_teams_partial_update**](OrgsApi.md#orgs_teams_partial_update) | **PATCH** /orgs/{org}/teams/{team}/ | Update a specific team in a organization.
[**orgs_teams_read**](OrgsApi.md#orgs_teams_read) | **GET** /orgs/{org}/teams/{team}/ | Get the details for the specific team.


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

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
data = cloudsmith_api.OrgsInvitesCreate() # OrgsInvitesCreate |  (optional)

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
 **data** | [**OrgsInvitesCreate**](OrgsInvitesCreate.md)|  | [optional] 

### Return type

[**OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_extend**
> OrganizationInvite orgs_invites_extend(org, slug_perm, data=data)

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

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.OrgsInvitesExtend() # OrgsInvitesExtend |  (optional)

try:
    # Extend an organization invite.
    api_response = api_instance.orgs_invites_extend(org, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_invites_extend: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**OrgsInvitesExtend**](OrgsInvitesExtend.md)|  | [optional] 

### Return type

[**OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

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

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

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

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_list**
> list[OrganizationMembership] orgs_members_list(org, page=page, page_size=page_size)

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

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # Get the details for all organization members.
    api_response = api_instance.orgs_members_list(org, page=page, page_size=page_size)
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

### Return type

[**list[OrganizationMembership]**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

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

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

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

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

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

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

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

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
data = cloudsmith_api.OrgsSamlgroupsyncCreate() # OrgsSamlgroupsyncCreate |  (optional)

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
 **data** | [**OrgsSamlgroupsyncCreate**](OrgsSamlgroupsyncCreate.md)|  | [optional] 

### Return type

[**OrganizationGroupSync**](OrganizationGroupSync.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

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

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

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

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
data = cloudsmith_api.OrgsTeamsCreate() # OrgsTeamsCreate |  (optional)

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
 **data** | [**OrgsTeamsCreate**](OrgsTeamsCreate.md)|  | [optional] 

### Return type

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_list**
> list[OrganizationTeam] orgs_teams_list(org, page=page, page_size=page_size)

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

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # Get the details of all teams within an organization.
    api_response = api_instance.orgs_teams_list(org, page=page, page_size=page_size)
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

### Return type

[**list[OrganizationTeam]**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

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

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
team = 'team_example' # str | 
data = cloudsmith_api.OrgsTeamsMembersCreate() # OrgsTeamsMembersCreate |  (optional)

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
 **data** | [**OrgsTeamsMembersCreate**](OrgsTeamsMembersCreate.md)|  | [optional] 

### Return type

[**OrganizationTeamMembers**](OrganizationTeamMembers.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_members_update**
> orgs_teams_members_update(org, team, data=data)

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

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
team = 'team_example' # str | 
data = cloudsmith_api.OrgsTeamsMembersUpdate() # OrgsTeamsMembersUpdate |  (optional)

try:
    # Replace all team members.
    api_instance.orgs_teams_members_update(org, team, data=data)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_teams_members_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **team** | **str**|  | 
 **data** | [**OrgsTeamsMembersUpdate**](OrgsTeamsMembersUpdate.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
team = 'team_example' # str | 
data = cloudsmith_api.OrgsTeamsPartialUpdate() # OrgsTeamsPartialUpdate |  (optional)

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
 **data** | [**OrgsTeamsPartialUpdate**](OrgsTeamsPartialUpdate.md)|  | [optional] 

### Return type

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_read**
> OrganizationTeam orgs_teams_read(org, team)

Get the details for the specific team.

Get the details for the specific team.

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

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
team = 'team_example' # str | 

try:
    # Get the details for the specific team.
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

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

