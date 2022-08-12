# OrgsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orgsInvitesCreate**](OrgsApi.md#orgsInvitesCreate) | **POST** /orgs/{org}/invites/ | Create an organization invite for a specific user
[**orgsInvitesDelete**](OrgsApi.md#orgsInvitesDelete) | **DELETE** /orgs/{org}/invites/{slug_perm}/ | Delete a specific organization invite
[**orgsInvitesExtend**](OrgsApi.md#orgsInvitesExtend) | **POST** /orgs/{org}/invites/{slug_perm}/extend/ | Extend an organization invite.
[**orgsInvitesList**](OrgsApi.md#orgsInvitesList) | **GET** /orgs/{org}/invites/ | Get a list of all invites for an organization.
[**orgsList**](OrgsApi.md#orgsList) | **GET** /orgs/ | Get a list of all the organizations you are associated with.
[**orgsMembersList**](OrgsApi.md#orgsMembersList) | **GET** /orgs/{org}/members/ | Get the details for all organization members.
[**orgsMembersRead**](OrgsApi.md#orgsMembersRead) | **GET** /orgs/{org}/members/{member}/ | Get the details for a specific organization member.
[**orgsMembersRemove**](OrgsApi.md#orgsMembersRemove) | **GET** /orgs/{org}/members/{member}/remove/ | Removes a member from the organization.
[**orgsRead**](OrgsApi.md#orgsRead) | **GET** /orgs/{org}/ | Get the details for the specific organization.
[**orgsSamlGroupSyncCreate**](OrgsApi.md#orgsSamlGroupSyncCreate) | **POST** /orgs/{org}/saml-group-sync/ | Create a new SAML Group Sync mapping within an organization.
[**orgsSamlGroupSyncDelete**](OrgsApi.md#orgsSamlGroupSyncDelete) | **DELETE** /orgs/{org}/saml-group-sync/{slug_perm}/ | Delete a SAML Group Sync mapping from an organization.
[**orgsSamlGroupSyncList**](OrgsApi.md#orgsSamlGroupSyncList) | **GET** /orgs/{org}/saml-group-sync/ | Get the details of all SAML Group Sync mapping within an organization.
[**orgsTeamsCreate**](OrgsApi.md#orgsTeamsCreate) | **POST** /orgs/{org}/teams/ | Create a team for this organization.
[**orgsTeamsDelete**](OrgsApi.md#orgsTeamsDelete) | **DELETE** /orgs/{org}/teams/{slug_perm}/ | Delete a specific team in a organization.
[**orgsTeamsList**](OrgsApi.md#orgsTeamsList) | **GET** /orgs/{org}/teams/ | Get the details of all teams within an organization.
[**orgsTeamsPartialUpdate**](OrgsApi.md#orgsTeamsPartialUpdate) | **PATCH** /orgs/{org}/teams/{slug_perm}/ | Update a specific team in a organization.
[**orgsTeamsRead**](OrgsApi.md#orgsTeamsRead) | **GET** /orgs/{org}/teams/{slug_perm}/ | Viewset for working with Organization teams.


<a name="orgsInvitesCreate"></a>
# **orgsInvitesCreate**
> OrganizationInvite orgsInvitesCreate(org, data)

Create an organization invite for a specific user

Create an organization invite for a specific user

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OrgsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
OrgsInvitesCreate data = new OrgsInvitesCreate(); // OrgsInvitesCreate | 
try {
    OrganizationInvite result = apiInstance.orgsInvitesCreate(org, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsInvitesCreate");
    e.printStackTrace();
}
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

<a name="orgsInvitesDelete"></a>
# **orgsInvitesDelete**
> orgsInvitesDelete(org, slugPerm)

Delete a specific organization invite

Delete a specific organization invite

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OrgsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.orgsInvitesDelete(org, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsInvitesDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgsInvitesExtend"></a>
# **orgsInvitesExtend**
> OrganizationInvite orgsInvitesExtend(org, slugPerm, data)

Extend an organization invite.

Extend an organization invite.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OrgsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
OrgsInvitesExtend data = new OrgsInvitesExtend(); // OrgsInvitesExtend | 
try {
    OrganizationInvite result = apiInstance.orgsInvitesExtend(org, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsInvitesExtend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**OrgsInvitesExtend**](OrgsInvitesExtend.md)|  | [optional]

### Return type

[**OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="orgsInvitesList"></a>
# **orgsInvitesList**
> List&lt;OrganizationInvite&gt; orgsInvitesList(org, page, pageSize)

Get a list of all invites for an organization.

Get a list of all invites for an organization.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OrgsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
try {
    List<OrganizationInvite> result = apiInstance.orgsInvitesList(org, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsInvitesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **page** | **Integer**| A page number within the paginated result set. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]

### Return type

[**List&lt;OrganizationInvite&gt;**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgsList"></a>
# **orgsList**
> List&lt;Organization&gt; orgsList(page, pageSize)

Get a list of all the organizations you are associated with.

Get a list of all the organizations you are associated with.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OrgsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrgsApi apiInstance = new OrgsApi();
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
try {
    List<Organization> result = apiInstance.orgsList(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| A page number within the paginated result set. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]

### Return type

[**List&lt;Organization&gt;**](Organization.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgsMembersList"></a>
# **orgsMembersList**
> List&lt;OrganizationMembership&gt; orgsMembersList(org, page, pageSize)

Get the details for all organization members.

Get the details for all organization members.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OrgsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
try {
    List<OrganizationMembership> result = apiInstance.orgsMembersList(org, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsMembersList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **page** | **Integer**| A page number within the paginated result set. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]

### Return type

[**List&lt;OrganizationMembership&gt;**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgsMembersRead"></a>
# **orgsMembersRead**
> OrganizationMembership orgsMembersRead(org, member)

Get the details for a specific organization member.

Get the details for a specific organization member.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OrgsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String member = "member_example"; // String | 
try {
    OrganizationMembership result = apiInstance.orgsMembersRead(org, member);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsMembersRead");
    e.printStackTrace();
}
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

<a name="orgsMembersRemove"></a>
# **orgsMembersRemove**
> OrganizationMembership orgsMembersRemove(org, member)

Removes a member from the organization.

Removes a member from the organization.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OrgsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String member = "member_example"; // String | 
try {
    OrganizationMembership result = apiInstance.orgsMembersRemove(org, member);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsMembersRemove");
    e.printStackTrace();
}
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

<a name="orgsRead"></a>
# **orgsRead**
> Organization orgsRead(org)

Get the details for the specific organization.

Get the details for the specific organization.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OrgsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
try {
    Organization result = apiInstance.orgsRead(org);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsRead");
    e.printStackTrace();
}
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

<a name="orgsSamlGroupSyncCreate"></a>
# **orgsSamlGroupSyncCreate**
> OrganizationGroupSync orgsSamlGroupSyncCreate(org, data)

Create a new SAML Group Sync mapping within an organization.

Create a new SAML Group Sync mapping within an organization.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OrgsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
OrgsSamlgroupsyncCreate data = new OrgsSamlgroupsyncCreate(); // OrgsSamlgroupsyncCreate | 
try {
    OrganizationGroupSync result = apiInstance.orgsSamlGroupSyncCreate(org, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsSamlGroupSyncCreate");
    e.printStackTrace();
}
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

<a name="orgsSamlGroupSyncDelete"></a>
# **orgsSamlGroupSyncDelete**
> orgsSamlGroupSyncDelete(org, slugPerm)

Delete a SAML Group Sync mapping from an organization.

Delete a SAML Group Sync mapping from an organization.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OrgsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.orgsSamlGroupSyncDelete(org, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsSamlGroupSyncDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgsSamlGroupSyncList"></a>
# **orgsSamlGroupSyncList**
> List&lt;OrganizationGroupSync&gt; orgsSamlGroupSyncList(org, page, pageSize)

Get the details of all SAML Group Sync mapping within an organization.

Get the details of all SAML Group Sync mapping within an organization.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OrgsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
try {
    List<OrganizationGroupSync> result = apiInstance.orgsSamlGroupSyncList(org, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsSamlGroupSyncList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **page** | **Integer**| A page number within the paginated result set. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]

### Return type

[**List&lt;OrganizationGroupSync&gt;**](OrganizationGroupSync.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgsTeamsCreate"></a>
# **orgsTeamsCreate**
> OrganizationTeam orgsTeamsCreate(org, data)

Create a team for this organization.

Create a team for this organization.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OrgsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
OrgsTeamsCreate data = new OrgsTeamsCreate(); // OrgsTeamsCreate | 
try {
    OrganizationTeam result = apiInstance.orgsTeamsCreate(org, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsTeamsCreate");
    e.printStackTrace();
}
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

<a name="orgsTeamsDelete"></a>
# **orgsTeamsDelete**
> orgsTeamsDelete(org, slugPerm)

Delete a specific team in a organization.

Delete a specific team in a organization.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OrgsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.orgsTeamsDelete(org, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsTeamsDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgsTeamsList"></a>
# **orgsTeamsList**
> List&lt;OrganizationTeam&gt; orgsTeamsList(org, page, pageSize)

Get the details of all teams within an organization.

Get the details of all teams within an organization.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OrgsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
try {
    List<OrganizationTeam> result = apiInstance.orgsTeamsList(org, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsTeamsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **page** | **Integer**| A page number within the paginated result set. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]

### Return type

[**List&lt;OrganizationTeam&gt;**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgsTeamsPartialUpdate"></a>
# **orgsTeamsPartialUpdate**
> OrganizationTeam orgsTeamsPartialUpdate(org, slugPerm, data)

Update a specific team in a organization.

Update a specific team in a organization.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OrgsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
OrgsTeamsPartialUpdate data = new OrgsTeamsPartialUpdate(); // OrgsTeamsPartialUpdate | 
try {
    OrganizationTeam result = apiInstance.orgsTeamsPartialUpdate(org, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsTeamsPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**OrgsTeamsPartialUpdate**](OrgsTeamsPartialUpdate.md)|  | [optional]

### Return type

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="orgsTeamsRead"></a>
# **orgsTeamsRead**
> OrganizationTeam orgsTeamsRead(org, slugPerm)

Viewset for working with Organization teams.

Viewset for working with Organization teams.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OrgsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
try {
    OrganizationTeam result = apiInstance.orgsTeamsRead(org, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsTeamsRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

