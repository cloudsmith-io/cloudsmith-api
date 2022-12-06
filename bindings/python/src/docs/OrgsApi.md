# cloudsmith_api.OrgsApi

All URIs are relative to *https://api.cloudsmith.io/api/v1*

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
> OrganizationInviteResponse orgs_invites_create(org, data=data)

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

[**OrganizationInviteResponse**](OrganizationInviteResponse.md)

### Authorization

[apikey](../README.md#apikey)

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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_extend**
> OrganizationInviteExtendResponse orgs_invites_extend(org, slug_perm)

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

[**OrganizationInviteExtendResponse**](OrganizationInviteExtendResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_list**
> list[OrganizationInviteResponse] orgs_invites_list(org, page=page, page_size=page_size)

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

[**list[OrganizationInviteResponse]**](OrganizationInviteResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_partial_update**
> OrganizationInviteResponse orgs_invites_partial_update(org, slug_perm, data=data)

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

[**OrganizationInviteResponse**](OrganizationInviteResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_resend**
> OrganizationInviteExtendResponse orgs_invites_resend(org, slug_perm)

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

[**OrganizationInviteExtendResponse**](OrganizationInviteExtendResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_list**
> list[OrganizationResponse] orgs_list(page=page, page_size=page_size)

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

[**list[OrganizationResponse]**](OrganizationResponse.md)

### Authorization

[apikey](../README.md#apikey)

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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_list**
> list[OrganizationMembershipResponse] orgs_members_list(org, page=page, page_size=page_size)

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

[**list[OrganizationMembershipResponse]**](OrganizationMembershipResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_read**
> OrganizationMembershipResponse orgs_members_read(org, member)

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

[**OrganizationMembershipResponse**](OrganizationMembershipResponse.md)

### Authorization

[apikey](../README.md#apikey)

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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_read**
> OrganizationResponse orgs_read(org)

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

[**OrganizationResponse**](OrganizationResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_create**
> OrganizationGroupSyncResponse orgs_saml_group_sync_create(org, data=data)

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

[**OrganizationGroupSyncResponse**](OrganizationGroupSyncResponse.md)

### Authorization

[apikey](../README.md#apikey)

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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_list**
> list[OrganizationGroupSyncResponse] orgs_saml_group_sync_list(org, page=page, page_size=page_size)

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

[**list[OrganizationGroupSyncResponse]**](OrganizationGroupSyncResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_create**
> ServiceResponse orgs_services_create(org, data=data)

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

[**ServiceResponse**](ServiceResponse.md)

### Authorization

[apikey](../README.md#apikey)

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

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_list**
> list[ServiceResponse] orgs_services_list(org, page=page, page_size=page_size)

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

# create an instance of the API class
api_instance = cloudsmith_api.OrgsApi(cloudsmith_api.ApiClient(configuration))
org = 'org_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # Get a list of all services within an organization.
    api_response = api_instance.orgs_services_list(org, page=page, page_size=page_size)
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

### Return type

[**list[ServiceResponse]**](ServiceResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_partial_update**
> ServiceResponse orgs_services_partial_update(org, service, data=data)

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

[**ServiceResponse**](ServiceResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_read**
> ServiceResponse orgs_services_read(org, service)

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

[**ServiceResponse**](ServiceResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_refresh**
> ServiceResponse orgs_services_refresh(org, service)

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

[**ServiceResponse**](ServiceResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_create**
> OrganizationTeamResponse orgs_teams_create(org, data=data)

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

[**OrganizationTeamResponse**](OrganizationTeamResponse.md)

### Authorization

[apikey](../README.md#apikey)

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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_list**
> list[OrganizationTeamResponse] orgs_teams_list(org, page=page, page_size=page_size)

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

[**list[OrganizationTeamResponse]**](OrganizationTeamResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_members_create**
> OrganizationTeamMembersResponse orgs_teams_members_create(org, team, data=data)

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

[**OrganizationTeamMembersResponse**](OrganizationTeamMembersResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_members_list**
> OrganizationTeamMembersResponse orgs_teams_members_list(org, team)

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

[**OrganizationTeamMembersResponse**](OrganizationTeamMembersResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_members_update**
> OrganizationTeamMembersResponse orgs_teams_members_update(org, team)

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

try:
    # Replace all team members.
    api_response = api_instance.orgs_teams_members_update(org, team)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrgsApi->orgs_teams_members_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **team** | **str**|  | 

### Return type

[**OrganizationTeamMembersResponse**](OrganizationTeamMembersResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_partial_update**
> OrganizationTeamResponse orgs_teams_partial_update(org, team, data=data)

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

[**OrganizationTeamResponse**](OrganizationTeamResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_read**
> OrganizationTeamResponse orgs_teams_read(org, team)

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

[**OrganizationTeamResponse**](OrganizationTeamResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

