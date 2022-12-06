# OrgsApi

All URIs are relative to *https://api.cloudsmith.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orgsInvitesCreate**](OrgsApi.md#orgsInvitesCreate) | **POST** /orgs/{org}/invites/ | Create an organization invite for a specific user
[**orgsInvitesDelete**](OrgsApi.md#orgsInvitesDelete) | **DELETE** /orgs/{org}/invites/{slug_perm}/ | Delete a specific organization invite
[**orgsInvitesExtend**](OrgsApi.md#orgsInvitesExtend) | **POST** /orgs/{org}/invites/{slug_perm}/extend/ | Extend an organization invite.
[**orgsInvitesList**](OrgsApi.md#orgsInvitesList) | **GET** /orgs/{org}/invites/ | Get a list of all invites for an organization.
[**orgsInvitesPartialUpdate**](OrgsApi.md#orgsInvitesPartialUpdate) | **PATCH** /orgs/{org}/invites/{slug_perm}/ | Update a specific organization invite.
[**orgsInvitesResend**](OrgsApi.md#orgsInvitesResend) | **POST** /orgs/{org}/invites/{slug_perm}/resend/ | Resend an organization invite.
[**orgsList**](OrgsApi.md#orgsList) | **GET** /orgs/ | Get a list of all the organizations you are associated with.
[**orgsMembersDelete**](OrgsApi.md#orgsMembersDelete) | **DELETE** /orgs/{org}/members/{member}/ | Removes a member from the organization.
[**orgsMembersList**](OrgsApi.md#orgsMembersList) | **GET** /orgs/{org}/members/ | Get the details for all organization members.
[**orgsMembersRead**](OrgsApi.md#orgsMembersRead) | **GET** /orgs/{org}/members/{member}/ | Get the details for a specific organization member.
[**orgsMembersRemove**](OrgsApi.md#orgsMembersRemove) | **GET** /orgs/{org}/members/{member}/remove/ | Removes a member from the organization (deprecated, use DELETE instead).
[**orgsRead**](OrgsApi.md#orgsRead) | **GET** /orgs/{org}/ | Get the details for the specific organization.
[**orgsSamlGroupSyncCreate**](OrgsApi.md#orgsSamlGroupSyncCreate) | **POST** /orgs/{org}/saml-group-sync/ | Create a new SAML Group Sync mapping within an organization.
[**orgsSamlGroupSyncDelete**](OrgsApi.md#orgsSamlGroupSyncDelete) | **DELETE** /orgs/{org}/saml-group-sync/{slug_perm}/ | Delete a SAML Group Sync mapping from an organization.
[**orgsSamlGroupSyncList**](OrgsApi.md#orgsSamlGroupSyncList) | **GET** /orgs/{org}/saml-group-sync/ | Get the details of all SAML Group Sync mapping within an organization.
[**orgsServicesCreate**](OrgsApi.md#orgsServicesCreate) | **POST** /orgs/{org}/services/ | Create a service within an organization.
[**orgsServicesDelete**](OrgsApi.md#orgsServicesDelete) | **DELETE** /orgs/{org}/services/{service}/ | Delete a specific service
[**orgsServicesList**](OrgsApi.md#orgsServicesList) | **GET** /orgs/{org}/services/ | Get a list of all services within an organization.
[**orgsServicesPartialUpdate**](OrgsApi.md#orgsServicesPartialUpdate) | **PATCH** /orgs/{org}/services/{service}/ | Update a service within an organization.
[**orgsServicesRead**](OrgsApi.md#orgsServicesRead) | **GET** /orgs/{org}/services/{service}/ | Retrieve details of a single service within an organization.
[**orgsServicesRefresh**](OrgsApi.md#orgsServicesRefresh) | **POST** /orgs/{org}/services/{service}/refresh/ | Refresh service API token.
[**orgsTeamsCreate**](OrgsApi.md#orgsTeamsCreate) | **POST** /orgs/{org}/teams/ | Create a team for this organization.
[**orgsTeamsDelete**](OrgsApi.md#orgsTeamsDelete) | **DELETE** /orgs/{org}/teams/{team}/ | Delete a specific team in a organization.
[**orgsTeamsList**](OrgsApi.md#orgsTeamsList) | **GET** /orgs/{org}/teams/ | Get the details of all teams within an organization.
[**orgsTeamsMembersCreate**](OrgsApi.md#orgsTeamsMembersCreate) | **POST** /orgs/{org}/teams/{team}/members | Add users to a team.
[**orgsTeamsMembersList**](OrgsApi.md#orgsTeamsMembersList) | **GET** /orgs/{org}/teams/{team}/members | List all members for the team.
[**orgsTeamsMembersUpdate**](OrgsApi.md#orgsTeamsMembersUpdate) | **PUT** /orgs/{org}/teams/{team}/members | Replace all team members.
[**orgsTeamsPartialUpdate**](OrgsApi.md#orgsTeamsPartialUpdate) | **PATCH** /orgs/{org}/teams/{team}/ | Update a specific team in a organization.
[**orgsTeamsRead**](OrgsApi.md#orgsTeamsRead) | **GET** /orgs/{org}/teams/{team}/ | Get the details of a specific team within an organization.


<a name="orgsInvitesCreate"></a>
# **orgsInvitesCreate**
> OrganizationInviteResponse orgsInvitesCreate(org, data)

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
OrganizationInviteRequest data = new OrganizationInviteRequest(); // OrganizationInviteRequest | 
try {
    OrganizationInviteResponse result = apiInstance.orgsInvitesCreate(org, data);
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
 **data** | [**OrganizationInviteRequest**](OrganizationInviteRequest.md)|  | [optional]

### Return type

[**OrganizationInviteResponse**](OrganizationInviteResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsInvitesExtend"></a>
# **orgsInvitesExtend**
> OrganizationInviteExtendResponse orgsInvitesExtend(org, slugPerm)

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
try {
    OrganizationInviteExtendResponse result = apiInstance.orgsInvitesExtend(org, slugPerm);
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

### Return type

[**OrganizationInviteExtendResponse**](OrganizationInviteExtendResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsInvitesList"></a>
# **orgsInvitesList**
> List&lt;OrganizationInviteResponse&gt; orgsInvitesList(org, page, pageSize)

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
    List<OrganizationInviteResponse> result = apiInstance.orgsInvitesList(org, page, pageSize);
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

[**List&lt;OrganizationInviteResponse&gt;**](OrganizationInviteResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsInvitesPartialUpdate"></a>
# **orgsInvitesPartialUpdate**
> OrganizationInviteResponse orgsInvitesPartialUpdate(org, slugPerm, data)

Update a specific organization invite.

Update a specific organization invite.

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
OrganizationInviteUpdateRequestPatch data = new OrganizationInviteUpdateRequestPatch(); // OrganizationInviteUpdateRequestPatch | 
try {
    OrganizationInviteResponse result = apiInstance.orgsInvitesPartialUpdate(org, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsInvitesPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**OrganizationInviteUpdateRequestPatch**](OrganizationInviteUpdateRequestPatch.md)|  | [optional]

### Return type

[**OrganizationInviteResponse**](OrganizationInviteResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsInvitesResend"></a>
# **orgsInvitesResend**
> OrganizationInviteExtendResponse orgsInvitesResend(org, slugPerm)

Resend an organization invite.

Resend an organization invite.

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
    OrganizationInviteExtendResponse result = apiInstance.orgsInvitesResend(org, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsInvitesResend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**OrganizationInviteExtendResponse**](OrganizationInviteExtendResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsList"></a>
# **orgsList**
> List&lt;OrganizationResponse&gt; orgsList(page, pageSize)

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
    List<OrganizationResponse> result = apiInstance.orgsList(page, pageSize);
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

[**List&lt;OrganizationResponse&gt;**](OrganizationResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsMembersDelete"></a>
# **orgsMembersDelete**
> orgsMembersDelete(org, member)

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
    apiInstance.orgsMembersDelete(org, member);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsMembersDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **member** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsMembersList"></a>
# **orgsMembersList**
> List&lt;OrganizationMembershipResponse&gt; orgsMembersList(org, page, pageSize)

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
    List<OrganizationMembershipResponse> result = apiInstance.orgsMembersList(org, page, pageSize);
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

[**List&lt;OrganizationMembershipResponse&gt;**](OrganizationMembershipResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsMembersRead"></a>
# **orgsMembersRead**
> OrganizationMembershipResponse orgsMembersRead(org, member)

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
    OrganizationMembershipResponse result = apiInstance.orgsMembersRead(org, member);
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

[**OrganizationMembershipResponse**](OrganizationMembershipResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsMembersRemove"></a>
# **orgsMembersRemove**
> orgsMembersRemove(org, member)

Removes a member from the organization (deprecated, use DELETE instead).

Removes a member from the organization (deprecated, use DELETE instead).

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
    apiInstance.orgsMembersRemove(org, member);
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

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsRead"></a>
# **orgsRead**
> OrganizationResponse orgsRead(org)

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
    OrganizationResponse result = apiInstance.orgsRead(org);
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

[**OrganizationResponse**](OrganizationResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsSamlGroupSyncCreate"></a>
# **orgsSamlGroupSyncCreate**
> OrganizationGroupSyncResponse orgsSamlGroupSyncCreate(org, data)

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
OrganizationGroupSyncRequest data = new OrganizationGroupSyncRequest(); // OrganizationGroupSyncRequest | 
try {
    OrganizationGroupSyncResponse result = apiInstance.orgsSamlGroupSyncCreate(org, data);
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
 **data** | [**OrganizationGroupSyncRequest**](OrganizationGroupSyncRequest.md)|  | [optional]

### Return type

[**OrganizationGroupSyncResponse**](OrganizationGroupSyncResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsSamlGroupSyncList"></a>
# **orgsSamlGroupSyncList**
> List&lt;OrganizationGroupSyncResponse&gt; orgsSamlGroupSyncList(org, page, pageSize)

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
    List<OrganizationGroupSyncResponse> result = apiInstance.orgsSamlGroupSyncList(org, page, pageSize);
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

[**List&lt;OrganizationGroupSyncResponse&gt;**](OrganizationGroupSyncResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsServicesCreate"></a>
# **orgsServicesCreate**
> ServiceResponse orgsServicesCreate(org, data)

Create a service within an organization.

Create a service within an organization.

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
ServiceRequest data = new ServiceRequest(); // ServiceRequest | 
try {
    ServiceResponse result = apiInstance.orgsServicesCreate(org, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsServicesCreate");
    e.printStackTrace();
}
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

<a name="orgsServicesDelete"></a>
# **orgsServicesDelete**
> orgsServicesDelete(org, service)

Delete a specific service

Delete a specific service

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
String service = "service_example"; // String | 
try {
    apiInstance.orgsServicesDelete(org, service);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsServicesDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **service** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsServicesList"></a>
# **orgsServicesList**
> List&lt;ServiceResponse&gt; orgsServicesList(org, page, pageSize)

Get a list of all services within an organization.

Get a list of all services within an organization.

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
    List<ServiceResponse> result = apiInstance.orgsServicesList(org, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsServicesList");
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

[**List&lt;ServiceResponse&gt;**](ServiceResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsServicesPartialUpdate"></a>
# **orgsServicesPartialUpdate**
> ServiceResponse orgsServicesPartialUpdate(org, service, data)

Update a service within an organization.

Update a service within an organization.

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
String service = "service_example"; // String | 
ServiceRequestPatch data = new ServiceRequestPatch(); // ServiceRequestPatch | 
try {
    ServiceResponse result = apiInstance.orgsServicesPartialUpdate(org, service, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsServicesPartialUpdate");
    e.printStackTrace();
}
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

<a name="orgsServicesRead"></a>
# **orgsServicesRead**
> ServiceResponse orgsServicesRead(org, service)

Retrieve details of a single service within an organization.

Retrieve details of a single service within an organization.

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
String service = "service_example"; // String | 
try {
    ServiceResponse result = apiInstance.orgsServicesRead(org, service);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsServicesRead");
    e.printStackTrace();
}
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

<a name="orgsServicesRefresh"></a>
# **orgsServicesRefresh**
> ServiceResponse orgsServicesRefresh(org, service)

Refresh service API token.

Refresh service API token.

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
String service = "service_example"; // String | 
try {
    ServiceResponse result = apiInstance.orgsServicesRefresh(org, service);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsServicesRefresh");
    e.printStackTrace();
}
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

<a name="orgsTeamsCreate"></a>
# **orgsTeamsCreate**
> OrganizationTeamResponse orgsTeamsCreate(org, data)

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
OrganizationTeamRequest data = new OrganizationTeamRequest(); // OrganizationTeamRequest | 
try {
    OrganizationTeamResponse result = apiInstance.orgsTeamsCreate(org, data);
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
 **data** | [**OrganizationTeamRequest**](OrganizationTeamRequest.md)|  | [optional]

### Return type

[**OrganizationTeamResponse**](OrganizationTeamResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsTeamsDelete"></a>
# **orgsTeamsDelete**
> orgsTeamsDelete(org, team)

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
String team = "team_example"; // String | 
try {
    apiInstance.orgsTeamsDelete(org, team);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsTeamsDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **team** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsTeamsList"></a>
# **orgsTeamsList**
> List&lt;OrganizationTeamResponse&gt; orgsTeamsList(org, page, pageSize)

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
    List<OrganizationTeamResponse> result = apiInstance.orgsTeamsList(org, page, pageSize);
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

[**List&lt;OrganizationTeamResponse&gt;**](OrganizationTeamResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsTeamsMembersCreate"></a>
# **orgsTeamsMembersCreate**
> OrganizationTeamMembersResponse orgsTeamsMembersCreate(org, team, data)

Add users to a team.

Add users to a team.

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
String team = "team_example"; // String | 
OrganizationTeamMembers data = new OrganizationTeamMembers(); // OrganizationTeamMembers | 
try {
    OrganizationTeamMembersResponse result = apiInstance.orgsTeamsMembersCreate(org, team, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsTeamsMembersCreate");
    e.printStackTrace();
}
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

<a name="orgsTeamsMembersList"></a>
# **orgsTeamsMembersList**
> OrganizationTeamMembersResponse orgsTeamsMembersList(org, team)

List all members for the team.

List all members for the team.

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
String team = "team_example"; // String | 
try {
    OrganizationTeamMembersResponse result = apiInstance.orgsTeamsMembersList(org, team);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsTeamsMembersList");
    e.printStackTrace();
}
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

<a name="orgsTeamsMembersUpdate"></a>
# **orgsTeamsMembersUpdate**
> OrganizationTeamMembersResponse orgsTeamsMembersUpdate(org, team)

Replace all team members.

Replace all team members.

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
String team = "team_example"; // String | 
try {
    OrganizationTeamMembersResponse result = apiInstance.orgsTeamsMembersUpdate(org, team);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsTeamsMembersUpdate");
    e.printStackTrace();
}
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

<a name="orgsTeamsPartialUpdate"></a>
# **orgsTeamsPartialUpdate**
> OrganizationTeamResponse orgsTeamsPartialUpdate(org, team, data)

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
String team = "team_example"; // String | 
OrganizationTeamRequestPatch data = new OrganizationTeamRequestPatch(); // OrganizationTeamRequestPatch | 
try {
    OrganizationTeamResponse result = apiInstance.orgsTeamsPartialUpdate(org, team, data);
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
 **team** | **String**|  |
 **data** | [**OrganizationTeamRequestPatch**](OrganizationTeamRequestPatch.md)|  | [optional]

### Return type

[**OrganizationTeamResponse**](OrganizationTeamResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsTeamsRead"></a>
# **orgsTeamsRead**
> OrganizationTeamResponse orgsTeamsRead(org, team)

Get the details of a specific team within an organization.

Get the details of a specific team within an organization.

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
String team = "team_example"; // String | 
try {
    OrganizationTeamResponse result = apiInstance.orgsTeamsRead(org, team);
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
 **team** | **String**|  |

### Return type

[**OrganizationTeamResponse**](OrganizationTeamResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

