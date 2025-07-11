# OrgsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orgsDelete**](OrgsApi.md#orgsDelete) | **DELETE** /orgs/{org}/ | Delete the specified organization.
[**orgsDenyPolicyCreate**](OrgsApi.md#orgsDenyPolicyCreate) | **POST** /orgs/{org}/deny-policy/ | Create a package deny policy.
[**orgsDenyPolicyDelete**](OrgsApi.md#orgsDenyPolicyDelete) | **DELETE** /orgs/{org}/deny-policy/{slug_perm}/ | Delete a package deny policy.
[**orgsDenyPolicyList**](OrgsApi.md#orgsDenyPolicyList) | **GET** /orgs/{org}/deny-policy/ | Get a list of all package deny policies.
[**orgsDenyPolicyPartialUpdate**](OrgsApi.md#orgsDenyPolicyPartialUpdate) | **PATCH** /orgs/{org}/deny-policy/{slug_perm}/ | Partially update a package deny policy.
[**orgsDenyPolicyRead**](OrgsApi.md#orgsDenyPolicyRead) | **GET** /orgs/{org}/deny-policy/{slug_perm}/ | Get a package deny policy.
[**orgsDenyPolicyUpdate**](OrgsApi.md#orgsDenyPolicyUpdate) | **PUT** /orgs/{org}/deny-policy/{slug_perm}/ | Update a package deny policy.
[**orgsInvitesCreate**](OrgsApi.md#orgsInvitesCreate) | **POST** /orgs/{org}/invites/ | Create an organization invite for a specific user
[**orgsInvitesDelete**](OrgsApi.md#orgsInvitesDelete) | **DELETE** /orgs/{org}/invites/{slug_perm}/ | Delete a specific organization invite
[**orgsInvitesExtend**](OrgsApi.md#orgsInvitesExtend) | **POST** /orgs/{org}/invites/{slug_perm}/extend/ | Extend an organization invite.
[**orgsInvitesList**](OrgsApi.md#orgsInvitesList) | **GET** /orgs/{org}/invites/ | Get a list of all invites for an organization.
[**orgsInvitesPartialUpdate**](OrgsApi.md#orgsInvitesPartialUpdate) | **PATCH** /orgs/{org}/invites/{slug_perm}/ | Update a specific organization invite.
[**orgsInvitesResend**](OrgsApi.md#orgsInvitesResend) | **POST** /orgs/{org}/invites/{slug_perm}/resend/ | Resend an organization invite.
[**orgsLicensePolicyCreate**](OrgsApi.md#orgsLicensePolicyCreate) | **POST** /orgs/{org}/license-policy/ | Create a package license policy.
[**orgsLicensePolicyDelete**](OrgsApi.md#orgsLicensePolicyDelete) | **DELETE** /orgs/{org}/license-policy/{slug_perm}/ | Delete a package license policy.
[**orgsLicensePolicyEvaluationCreate**](OrgsApi.md#orgsLicensePolicyEvaluationCreate) | **POST** /orgs/{org}/license-policy/{policy_slug_perm}/evaluation/ | Create an evaluation request for this policy.
[**orgsLicensePolicyEvaluationList**](OrgsApi.md#orgsLicensePolicyEvaluationList) | **GET** /orgs/{org}/license-policy/{policy_slug_perm}/evaluation/ | List evaluation requests for this policy.
[**orgsLicensePolicyEvaluationRead**](OrgsApi.md#orgsLicensePolicyEvaluationRead) | **GET** /orgs/{org}/license-policy/{policy_slug_perm}/evaluation/{slug_perm}/ | Retrieve an evaluation request for this policy.
[**orgsLicensePolicyList**](OrgsApi.md#orgsLicensePolicyList) | **GET** /orgs/{org}/license-policy/ | Get a list of all package license policies.
[**orgsLicensePolicyPartialUpdate**](OrgsApi.md#orgsLicensePolicyPartialUpdate) | **PATCH** /orgs/{org}/license-policy/{slug_perm}/ | Partially update a package license policy.
[**orgsLicensePolicyRead**](OrgsApi.md#orgsLicensePolicyRead) | **GET** /orgs/{org}/license-policy/{slug_perm}/ | Get a package license policy.
[**orgsLicensePolicyUpdate**](OrgsApi.md#orgsLicensePolicyUpdate) | **PUT** /orgs/{org}/license-policy/{slug_perm}/ | Update a package license policy.
[**orgsLicensePolicyViolationList**](OrgsApi.md#orgsLicensePolicyViolationList) | **GET** /orgs/{org}/license-policy-violation/ | List all current license policy violations for this Organization.
[**orgsList**](OrgsApi.md#orgsList) | **GET** /orgs/ | Get a list of all the organizations you are associated with.
[**orgsMembersDelete**](OrgsApi.md#orgsMembersDelete) | **DELETE** /orgs/{org}/members/{member}/ | Removes a member from the organization.
[**orgsMembersList**](OrgsApi.md#orgsMembersList) | **GET** /orgs/{org}/members/ | Get the details for all organization members.
[**orgsMembersPartialUpdate**](OrgsApi.md#orgsMembersPartialUpdate) | **PATCH** /orgs/{org}/members/{member}/ | Views for working with organization members.
[**orgsMembersRead**](OrgsApi.md#orgsMembersRead) | **GET** /orgs/{org}/members/{member}/ | Get the details for a specific organization member.
[**orgsMembersRefresh**](OrgsApi.md#orgsMembersRefresh) | **POST** /orgs/{org}/members/{member}/refresh/ | Refresh a member of the organization&#39;s API key.
[**orgsMembersRemove**](OrgsApi.md#orgsMembersRemove) | **GET** /orgs/{org}/members/{member}/remove/ | Removes a member from the organization (deprecated, use DELETE instead).
[**orgsMembersUpdateRole**](OrgsApi.md#orgsMembersUpdateRole) | **PATCH** /orgs/{org}/members/{member}/update-role/ | Update a member&#39;s role in the organization.
[**orgsMembersUpdateVisibility**](OrgsApi.md#orgsMembersUpdateVisibility) | **PATCH** /orgs/{org}/members/{member}/update-visibility/ | Update a member&#39;s visibility in the organization.
[**orgsOpenidConnectCreate**](OrgsApi.md#orgsOpenidConnectCreate) | **POST** /orgs/{org}/openid-connect/ | Create the OpenID Connect provider settings for the org.
[**orgsOpenidConnectDelete**](OrgsApi.md#orgsOpenidConnectDelete) | **DELETE** /orgs/{org}/openid-connect/{slug_perm}/ | Delete a specific OpenID Connect provider setting for the org.
[**orgsOpenidConnectList**](OrgsApi.md#orgsOpenidConnectList) | **GET** /orgs/{org}/openid-connect/ | Retrieve the list of OpenID Connect provider settings for the org.
[**orgsOpenidConnectPartialUpdate**](OrgsApi.md#orgsOpenidConnectPartialUpdate) | **PATCH** /orgs/{org}/openid-connect/{slug_perm}/ | Update a specific OpenID Connect provider setting for the org.
[**orgsOpenidConnectRead**](OrgsApi.md#orgsOpenidConnectRead) | **GET** /orgs/{org}/openid-connect/{slug_perm}/ | Retrieve a specific OpenID Connect provider setting for the org.
[**orgsOpenidConnectUpdate**](OrgsApi.md#orgsOpenidConnectUpdate) | **PUT** /orgs/{org}/openid-connect/{slug_perm}/ | Update a specific OpenID Connect provider setting for the org.
[**orgsRead**](OrgsApi.md#orgsRead) | **GET** /orgs/{org}/ | Get the details for the specific organization.
[**orgsSamlAuthenticationPartialUpdate**](OrgsApi.md#orgsSamlAuthenticationPartialUpdate) | **PATCH** /orgs/{org}/saml-authentication | Update the SAML Authentication settings for this Organization.
[**orgsSamlAuthenticationRead**](OrgsApi.md#orgsSamlAuthenticationRead) | **GET** /orgs/{org}/saml-authentication | Retrieve the SAML Authentication settings for this Organization.
[**orgsSamlGroupSyncCreate**](OrgsApi.md#orgsSamlGroupSyncCreate) | **POST** /orgs/{org}/saml-group-sync/ | Create a new SAML Group Sync mapping within an organization.
[**orgsSamlGroupSyncDelete**](OrgsApi.md#orgsSamlGroupSyncDelete) | **DELETE** /orgs/{org}/saml-group-sync/{slug_perm}/ | Delete a SAML Group Sync mapping from an organization.
[**orgsSamlGroupSyncDisable**](OrgsApi.md#orgsSamlGroupSyncDisable) | **POST** /orgs/{org}/saml-group-sync/disable/ | Disable SAML Group Sync for this organization.
[**orgsSamlGroupSyncEnable**](OrgsApi.md#orgsSamlGroupSyncEnable) | **POST** /orgs/{org}/saml-group-sync/enable/ | Enable SAML Group Sync for this organization.
[**orgsSamlGroupSyncList**](OrgsApi.md#orgsSamlGroupSyncList) | **GET** /orgs/{org}/saml-group-sync/ | Get the details of all SAML Group Sync mapping within an organization.
[**orgsSamlGroupSyncStatus**](OrgsApi.md#orgsSamlGroupSyncStatus) | **GET** /orgs/{org}/saml-group-sync/status/ | Retrieve the SAML Group Sync status for this organization.
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
[**orgsVulnerabilityPolicyCreate**](OrgsApi.md#orgsVulnerabilityPolicyCreate) | **POST** /orgs/{org}/vulnerability-policy/ | Create a package vulnerability policy.
[**orgsVulnerabilityPolicyDelete**](OrgsApi.md#orgsVulnerabilityPolicyDelete) | **DELETE** /orgs/{org}/vulnerability-policy/{slug_perm}/ | Delete a package vulnerability policy.
[**orgsVulnerabilityPolicyEvaluationCreate**](OrgsApi.md#orgsVulnerabilityPolicyEvaluationCreate) | **POST** /orgs/{org}/vulnerability-policy/{policy_slug_perm}/evaluation/ | Create an evaluation request for this policy.
[**orgsVulnerabilityPolicyEvaluationList**](OrgsApi.md#orgsVulnerabilityPolicyEvaluationList) | **GET** /orgs/{org}/vulnerability-policy/{policy_slug_perm}/evaluation/ | List evaluation requests for this policy.
[**orgsVulnerabilityPolicyEvaluationRead**](OrgsApi.md#orgsVulnerabilityPolicyEvaluationRead) | **GET** /orgs/{org}/vulnerability-policy/{policy_slug_perm}/evaluation/{slug_perm}/ | Retrieve an evaluation request for this policy.
[**orgsVulnerabilityPolicyList**](OrgsApi.md#orgsVulnerabilityPolicyList) | **GET** /orgs/{org}/vulnerability-policy/ | Get a list of all package vulnerability policies.
[**orgsVulnerabilityPolicyPartialUpdate**](OrgsApi.md#orgsVulnerabilityPolicyPartialUpdate) | **PATCH** /orgs/{org}/vulnerability-policy/{slug_perm}/ | Partially update a package vulnerability policy.
[**orgsVulnerabilityPolicyRead**](OrgsApi.md#orgsVulnerabilityPolicyRead) | **GET** /orgs/{org}/vulnerability-policy/{slug_perm}/ | Get a package vulnerability policy.
[**orgsVulnerabilityPolicyUpdate**](OrgsApi.md#orgsVulnerabilityPolicyUpdate) | **PUT** /orgs/{org}/vulnerability-policy/{slug_perm}/ | Update a package vulnerability policy.
[**orgsVulnerabilityPolicyViolationList**](OrgsApi.md#orgsVulnerabilityPolicyViolationList) | **GET** /orgs/{org}/vulnerability-policy-violation/ | List all current vulnerability policy violations for this Organization.


<a name="orgsDelete"></a>
# **orgsDelete**
> orgsDelete(org)

Delete the specified organization.

Delete the specified organization.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
try {
    apiInstance.orgsDelete(org);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsDenyPolicyCreate"></a>
# **orgsDenyPolicyCreate**
> PackageDenyPolicy orgsDenyPolicyCreate(org, data)

Create a package deny policy.

Create a package deny policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
PackageDenyPolicyRequest data = new PackageDenyPolicyRequest(); // PackageDenyPolicyRequest | 
try {
    PackageDenyPolicy result = apiInstance.orgsDenyPolicyCreate(org, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsDenyPolicyCreate");
    e.printStackTrace();
}
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

<a name="orgsDenyPolicyDelete"></a>
# **orgsDenyPolicyDelete**
> orgsDenyPolicyDelete(org, slugPerm)

Delete a package deny policy.

Delete a package deny policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.orgsDenyPolicyDelete(org, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsDenyPolicyDelete");
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsDenyPolicyList"></a>
# **orgsDenyPolicyList**
> List&lt;PackageDenyPolicy&gt; orgsDenyPolicyList(org, page, pageSize)

Get a list of all package deny policies.

Get a list of all package deny policies.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
try {
    List<PackageDenyPolicy> result = apiInstance.orgsDenyPolicyList(org, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsDenyPolicyList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]

### Return type

[**List&lt;PackageDenyPolicy&gt;**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsDenyPolicyPartialUpdate"></a>
# **orgsDenyPolicyPartialUpdate**
> PackageDenyPolicy orgsDenyPolicyPartialUpdate(org, slugPerm, data)

Partially update a package deny policy.

Partially update a package deny policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
PackageDenyPolicyRequestPatch data = new PackageDenyPolicyRequestPatch(); // PackageDenyPolicyRequestPatch | 
try {
    PackageDenyPolicy result = apiInstance.orgsDenyPolicyPartialUpdate(org, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsDenyPolicyPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**PackageDenyPolicyRequestPatch**](PackageDenyPolicyRequestPatch.md)|  | [optional]

### Return type

[**PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsDenyPolicyRead"></a>
# **orgsDenyPolicyRead**
> PackageDenyPolicy orgsDenyPolicyRead(org, slugPerm)

Get a package deny policy.

Get a package deny policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
try {
    PackageDenyPolicy result = apiInstance.orgsDenyPolicyRead(org, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsDenyPolicyRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsDenyPolicyUpdate"></a>
# **orgsDenyPolicyUpdate**
> PackageDenyPolicy orgsDenyPolicyUpdate(org, slugPerm, data)

Update a package deny policy.

Update a package deny policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
PackageDenyPolicyRequest data = new PackageDenyPolicyRequest(); // PackageDenyPolicyRequest | 
try {
    PackageDenyPolicy result = apiInstance.orgsDenyPolicyUpdate(org, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsDenyPolicyUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**PackageDenyPolicyRequest**](PackageDenyPolicyRequest.md)|  | [optional]

### Return type

[**PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
OrganizationInviteRequest data = new OrganizationInviteRequest(); // OrganizationInviteRequest | 
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
 **data** | [**OrganizationInviteRequest**](OrganizationInviteRequest.md)|  | [optional]

### Return type

[**OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsInvitesExtend"></a>
# **orgsInvitesExtend**
> OrganizationInviteExtend orgsInvitesExtend(org, slugPerm)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
try {
    OrganizationInviteExtend result = apiInstance.orgsInvitesExtend(org, slugPerm);
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

[**OrganizationInviteExtend**](OrganizationInviteExtend.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
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
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]

### Return type

[**List&lt;OrganizationInvite&gt;**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsInvitesPartialUpdate"></a>
# **orgsInvitesPartialUpdate**
> OrganizationInvite orgsInvitesPartialUpdate(org, slugPerm, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
OrganizationInviteUpdateRequestPatch data = new OrganizationInviteUpdateRequestPatch(); // OrganizationInviteUpdateRequestPatch | 
try {
    OrganizationInvite result = apiInstance.orgsInvitesPartialUpdate(org, slugPerm, data);
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

[**OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsInvitesResend"></a>
# **orgsInvitesResend**
> OrganizationInviteExtend orgsInvitesResend(org, slugPerm)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
try {
    OrganizationInviteExtend result = apiInstance.orgsInvitesResend(org, slugPerm);
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

[**OrganizationInviteExtend**](OrganizationInviteExtend.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsLicensePolicyCreate"></a>
# **orgsLicensePolicyCreate**
> OrganizationPackageLicensePolicy orgsLicensePolicyCreate(org, data)

Create a package license policy.

Create a package license policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
OrganizationPackageLicensePolicyRequest data = new OrganizationPackageLicensePolicyRequest(); // OrganizationPackageLicensePolicyRequest | 
try {
    OrganizationPackageLicensePolicy result = apiInstance.orgsLicensePolicyCreate(org, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsLicensePolicyCreate");
    e.printStackTrace();
}
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

<a name="orgsLicensePolicyDelete"></a>
# **orgsLicensePolicyDelete**
> orgsLicensePolicyDelete(org, slugPerm)

Delete a package license policy.

Delete a package license policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.orgsLicensePolicyDelete(org, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsLicensePolicyDelete");
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsLicensePolicyEvaluationCreate"></a>
# **orgsLicensePolicyEvaluationCreate**
> PackageLicensePolicyEvaluationRequest orgsLicensePolicyEvaluationCreate(org, policySlugPerm, data)

Create an evaluation request for this policy.

Create an evaluation request for this policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String policySlugPerm = "policySlugPerm_example"; // String | 
PackageLicensePolicyEvaluationRequestRequest data = new PackageLicensePolicyEvaluationRequestRequest(); // PackageLicensePolicyEvaluationRequestRequest | 
try {
    PackageLicensePolicyEvaluationRequest result = apiInstance.orgsLicensePolicyEvaluationCreate(org, policySlugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsLicensePolicyEvaluationCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **policySlugPerm** | **String**|  |
 **data** | [**PackageLicensePolicyEvaluationRequestRequest**](PackageLicensePolicyEvaluationRequestRequest.md)|  | [optional]

### Return type

[**PackageLicensePolicyEvaluationRequest**](PackageLicensePolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsLicensePolicyEvaluationList"></a>
# **orgsLicensePolicyEvaluationList**
> List&lt;PackageLicensePolicyEvaluationRequest&gt; orgsLicensePolicyEvaluationList(org, policySlugPerm, page, pageSize)

List evaluation requests for this policy.

List evaluation requests for this policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String policySlugPerm = "policySlugPerm_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
try {
    List<PackageLicensePolicyEvaluationRequest> result = apiInstance.orgsLicensePolicyEvaluationList(org, policySlugPerm, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsLicensePolicyEvaluationList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **policySlugPerm** | **String**|  |
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]

### Return type

[**List&lt;PackageLicensePolicyEvaluationRequest&gt;**](PackageLicensePolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsLicensePolicyEvaluationRead"></a>
# **orgsLicensePolicyEvaluationRead**
> PackageLicensePolicyEvaluationRequest orgsLicensePolicyEvaluationRead(org, policySlugPerm, slugPerm)

Retrieve an evaluation request for this policy.

Retrieve an evaluation request for this policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String policySlugPerm = "policySlugPerm_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
try {
    PackageLicensePolicyEvaluationRequest result = apiInstance.orgsLicensePolicyEvaluationRead(org, policySlugPerm, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsLicensePolicyEvaluationRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **policySlugPerm** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**PackageLicensePolicyEvaluationRequest**](PackageLicensePolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsLicensePolicyList"></a>
# **orgsLicensePolicyList**
> List&lt;OrganizationPackageLicensePolicy&gt; orgsLicensePolicyList(org, page, pageSize)

Get a list of all package license policies.

Get a list of all package license policies.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
try {
    List<OrganizationPackageLicensePolicy> result = apiInstance.orgsLicensePolicyList(org, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsLicensePolicyList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]

### Return type

[**List&lt;OrganizationPackageLicensePolicy&gt;**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsLicensePolicyPartialUpdate"></a>
# **orgsLicensePolicyPartialUpdate**
> OrganizationPackageLicensePolicy orgsLicensePolicyPartialUpdate(org, slugPerm, data)

Partially update a package license policy.

Partially update a package license policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
OrganizationPackageLicensePolicyRequestPatch data = new OrganizationPackageLicensePolicyRequestPatch(); // OrganizationPackageLicensePolicyRequestPatch | 
try {
    OrganizationPackageLicensePolicy result = apiInstance.orgsLicensePolicyPartialUpdate(org, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsLicensePolicyPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**OrganizationPackageLicensePolicyRequestPatch**](OrganizationPackageLicensePolicyRequestPatch.md)|  | [optional]

### Return type

[**OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsLicensePolicyRead"></a>
# **orgsLicensePolicyRead**
> OrganizationPackageLicensePolicy orgsLicensePolicyRead(org, slugPerm)

Get a package license policy.

Get a package license policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
try {
    OrganizationPackageLicensePolicy result = apiInstance.orgsLicensePolicyRead(org, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsLicensePolicyRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsLicensePolicyUpdate"></a>
# **orgsLicensePolicyUpdate**
> OrganizationPackageLicensePolicy orgsLicensePolicyUpdate(org, slugPerm, data)

Update a package license policy.

Update a package license policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
OrganizationPackageLicensePolicyRequest data = new OrganizationPackageLicensePolicyRequest(); // OrganizationPackageLicensePolicyRequest | 
try {
    OrganizationPackageLicensePolicy result = apiInstance.orgsLicensePolicyUpdate(org, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsLicensePolicyUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**OrganizationPackageLicensePolicyRequest**](OrganizationPackageLicensePolicyRequest.md)|  | [optional]

### Return type

[**OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsLicensePolicyViolationList"></a>
# **orgsLicensePolicyViolationList**
> PackageLicensePolicyViolationLogCursorPage orgsLicensePolicyViolationList(org, cursor, pageSize)

List all current license policy violations for this Organization.

List all current license policy violations for this Organization.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String cursor = "cursor_example"; // String | The pagination cursor value.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
try {
    PackageLicensePolicyViolationLogCursorPage result = apiInstance.orgsLicensePolicyViolationList(org, cursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsLicensePolicyViolationList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **cursor** | **String**| The pagination cursor value. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]

### Return type

[**PackageLicensePolicyViolationLogCursorPage**](PackageLicensePolicyViolationLogCursorPage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
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
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]

### Return type

[**List&lt;Organization&gt;**](Organization.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsMembersList"></a>
# **orgsMembersList**
> List&lt;OrganizationMembership&gt; orgsMembersList(org, page, pageSize, isActive, query, sort)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
Boolean isActive = false; // Boolean | Filter for active/inactive users.
String query = ""; // String | A search term for querying of members within an Organization.Available options are: email, org, user, userslug, inactive, user_name, role
String sort = "user_name"; // String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-user_name`). Available options: user_name, role.
try {
    List<OrganizationMembership> result = apiInstance.orgsMembersList(org, page, pageSize, isActive, query, sort);
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
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]
 **isActive** | **Boolean**| Filter for active/inactive users. | [optional] [default to false]
 **query** | **String**| A search term for querying of members within an Organization.Available options are: email, org, user, userslug, inactive, user_name, role | [optional] [default to ]
 **sort** | **String**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-user_name&#x60;). Available options: user_name, role. | [optional] [default to user_name]

### Return type

[**List&lt;OrganizationMembership&gt;**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsMembersPartialUpdate"></a>
# **orgsMembersPartialUpdate**
> OrganizationMembership orgsMembersPartialUpdate(org, member, data)

Views for working with organization members.

Views for working with organization members.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String member = "member_example"; // String | 
OrganizationMembershipRequestPatch data = new OrganizationMembershipRequestPatch(); // OrganizationMembershipRequestPatch | 
try {
    OrganizationMembership result = apiInstance.orgsMembersPartialUpdate(org, member, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsMembersPartialUpdate");
    e.printStackTrace();
}
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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsMembersRefresh"></a>
# **orgsMembersRefresh**
> orgsMembersRefresh(org, member)

Refresh a member of the organization&#39;s API key.

Refresh a member of the organization&#39;s API key.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String member = "member_example"; // String | 
try {
    apiInstance.orgsMembersRefresh(org, member);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsMembersRefresh");
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsMembersUpdateRole"></a>
# **orgsMembersUpdateRole**
> OrganizationMembershipRoleUpdate orgsMembersUpdateRole(org, member, data)

Update a member&#39;s role in the organization.

Update a member&#39;s role in the organization.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String member = "member_example"; // String | 
OrganizationMembershipRoleUpdateRequestPatch data = new OrganizationMembershipRoleUpdateRequestPatch(); // OrganizationMembershipRoleUpdateRequestPatch | 
try {
    OrganizationMembershipRoleUpdate result = apiInstance.orgsMembersUpdateRole(org, member, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsMembersUpdateRole");
    e.printStackTrace();
}
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

<a name="orgsMembersUpdateVisibility"></a>
# **orgsMembersUpdateVisibility**
> OrganizationMembershipVisibilityUpdate orgsMembersUpdateVisibility(org, member, data)

Update a member&#39;s visibility in the organization.

Update a member&#39;s visibility in the organization.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String member = "member_example"; // String | 
OrganizationMembershipVisibilityUpdateRequestPatch data = new OrganizationMembershipVisibilityUpdateRequestPatch(); // OrganizationMembershipVisibilityUpdateRequestPatch | 
try {
    OrganizationMembershipVisibilityUpdate result = apiInstance.orgsMembersUpdateVisibility(org, member, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsMembersUpdateVisibility");
    e.printStackTrace();
}
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

<a name="orgsOpenidConnectCreate"></a>
# **orgsOpenidConnectCreate**
> ProviderSettings orgsOpenidConnectCreate(org, data)

Create the OpenID Connect provider settings for the org.

Create the OpenID Connect provider settings for the org.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
ProviderSettingsRequest data = new ProviderSettingsRequest(); // ProviderSettingsRequest | 
try {
    ProviderSettings result = apiInstance.orgsOpenidConnectCreate(org, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsOpenidConnectCreate");
    e.printStackTrace();
}
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

<a name="orgsOpenidConnectDelete"></a>
# **orgsOpenidConnectDelete**
> orgsOpenidConnectDelete(org, slugPerm)

Delete a specific OpenID Connect provider setting for the org.

Delete a specific OpenID Connect provider setting for the org.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.orgsOpenidConnectDelete(org, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsOpenidConnectDelete");
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsOpenidConnectList"></a>
# **orgsOpenidConnectList**
> List&lt;ProviderSettings&gt; orgsOpenidConnectList(org, page, pageSize, query, sort)

Retrieve the list of OpenID Connect provider settings for the org.

Retrieve the list of OpenID Connect provider settings for the org.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
String query = ""; // String | A search term for querying of OpenID Connect (OIDC) provider settings.Available options are: name, provider_url, service_account
String sort = "name"; // String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name.
try {
    List<ProviderSettings> result = apiInstance.orgsOpenidConnectList(org, page, pageSize, query, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsOpenidConnectList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]
 **query** | **String**| A search term for querying of OpenID Connect (OIDC) provider settings.Available options are: name, provider_url, service_account | [optional] [default to ]
 **sort** | **String**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name. | [optional] [default to name]

### Return type

[**List&lt;ProviderSettings&gt;**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsOpenidConnectPartialUpdate"></a>
# **orgsOpenidConnectPartialUpdate**
> ProviderSettings orgsOpenidConnectPartialUpdate(org, slugPerm, data)

Update a specific OpenID Connect provider setting for the org.

Update a specific OpenID Connect provider setting for the org.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
ProviderSettingsRequestPatch data = new ProviderSettingsRequestPatch(); // ProviderSettingsRequestPatch | 
try {
    ProviderSettings result = apiInstance.orgsOpenidConnectPartialUpdate(org, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsOpenidConnectPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**ProviderSettingsRequestPatch**](ProviderSettingsRequestPatch.md)|  | [optional]

### Return type

[**ProviderSettings**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsOpenidConnectRead"></a>
# **orgsOpenidConnectRead**
> ProviderSettings orgsOpenidConnectRead(org, slugPerm)

Retrieve a specific OpenID Connect provider setting for the org.

Retrieve a specific OpenID Connect provider setting for the org.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
try {
    ProviderSettings result = apiInstance.orgsOpenidConnectRead(org, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsOpenidConnectRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**ProviderSettings**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsOpenidConnectUpdate"></a>
# **orgsOpenidConnectUpdate**
> ProviderSettings orgsOpenidConnectUpdate(org, slugPerm, data)

Update a specific OpenID Connect provider setting for the org.

Update a specific OpenID Connect provider setting for the org.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
ProviderSettingsRequest data = new ProviderSettingsRequest(); // ProviderSettingsRequest | 
try {
    ProviderSettings result = apiInstance.orgsOpenidConnectUpdate(org, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsOpenidConnectUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**ProviderSettingsRequest**](ProviderSettingsRequest.md)|  | [optional]

### Return type

[**ProviderSettings**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsSamlAuthenticationPartialUpdate"></a>
# **orgsSamlAuthenticationPartialUpdate**
> OrganizationSAMLAuth orgsSamlAuthenticationPartialUpdate(org, data)

Update the SAML Authentication settings for this Organization.

Update the SAML Authentication settings for this Organization.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
OrganizationSAMLAuthRequestPatch data = new OrganizationSAMLAuthRequestPatch(); // OrganizationSAMLAuthRequestPatch | 
try {
    OrganizationSAMLAuth result = apiInstance.orgsSamlAuthenticationPartialUpdate(org, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsSamlAuthenticationPartialUpdate");
    e.printStackTrace();
}
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

<a name="orgsSamlAuthenticationRead"></a>
# **orgsSamlAuthenticationRead**
> OrganizationSAMLAuth orgsSamlAuthenticationRead(org)

Retrieve the SAML Authentication settings for this Organization.

Retrieve the SAML Authentication settings for this Organization.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
try {
    OrganizationSAMLAuth result = apiInstance.orgsSamlAuthenticationRead(org);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsSamlAuthenticationRead");
    e.printStackTrace();
}
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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
OrganizationGroupSyncRequest data = new OrganizationGroupSyncRequest(); // OrganizationGroupSyncRequest | 
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
 **data** | [**OrganizationGroupSyncRequest**](OrganizationGroupSyncRequest.md)|  | [optional]

### Return type

[**OrganizationGroupSync**](OrganizationGroupSync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsSamlGroupSyncDisable"></a>
# **orgsSamlGroupSyncDisable**
> orgsSamlGroupSyncDisable(org)

Disable SAML Group Sync for this organization.

Disable SAML Group Sync for this organization.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
try {
    apiInstance.orgsSamlGroupSyncDisable(org);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsSamlGroupSyncDisable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsSamlGroupSyncEnable"></a>
# **orgsSamlGroupSyncEnable**
> orgsSamlGroupSyncEnable(org)

Enable SAML Group Sync for this organization.

Enable SAML Group Sync for this organization.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
try {
    apiInstance.orgsSamlGroupSyncEnable(org);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsSamlGroupSyncEnable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
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
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]

### Return type

[**List&lt;OrganizationGroupSync&gt;**](OrganizationGroupSync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsSamlGroupSyncStatus"></a>
# **orgsSamlGroupSyncStatus**
> OrganizationGroupSyncStatus orgsSamlGroupSyncStatus(org)

Retrieve the SAML Group Sync status for this organization.

Retrieve the SAML Group Sync status for this organization.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
try {
    OrganizationGroupSyncStatus result = apiInstance.orgsSamlGroupSyncStatus(org);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsSamlGroupSyncStatus");
    e.printStackTrace();
}
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

<a name="orgsServicesCreate"></a>
# **orgsServicesCreate**
> Service orgsServicesCreate(org, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
ServiceRequest data = new ServiceRequest(); // ServiceRequest | 
try {
    Service result = apiInstance.orgsServicesCreate(org, data);
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

[**Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsServicesList"></a>
# **orgsServicesList**
> List&lt;Service&gt; orgsServicesList(org, page, pageSize, query, sort)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
String query = ""; // String | A search term for querying of services within an Organization.Available options are: name, role
String sort = "created_at"; // String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-created_at`). Available options: created_at, name, role.
try {
    List<Service> result = apiInstance.orgsServicesList(org, page, pageSize, query, sort);
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
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]
 **query** | **String**| A search term for querying of services within an Organization.Available options are: name, role | [optional] [default to ]
 **sort** | **String**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-created_at&#x60;). Available options: created_at, name, role. | [optional] [default to created_at]

### Return type

[**List&lt;Service&gt;**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsServicesPartialUpdate"></a>
# **orgsServicesPartialUpdate**
> Service orgsServicesPartialUpdate(org, service, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String service = "service_example"; // String | 
ServiceRequestPatch data = new ServiceRequestPatch(); // ServiceRequestPatch | 
try {
    Service result = apiInstance.orgsServicesPartialUpdate(org, service, data);
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

[**Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsServicesRead"></a>
# **orgsServicesRead**
> Service orgsServicesRead(org, service)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String service = "service_example"; // String | 
try {
    Service result = apiInstance.orgsServicesRead(org, service);
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

[**Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsServicesRefresh"></a>
# **orgsServicesRefresh**
> Service orgsServicesRefresh(org, service)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String service = "service_example"; // String | 
try {
    Service result = apiInstance.orgsServicesRefresh(org, service);
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

[**Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
OrganizationTeamRequest data = new OrganizationTeamRequest(); // OrganizationTeamRequest | 
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
 **data** | [**OrganizationTeamRequest**](OrganizationTeamRequest.md)|  | [optional]

### Return type

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsTeamsList"></a>
# **orgsTeamsList**
> List&lt;OrganizationTeam&gt; orgsTeamsList(org, page, pageSize, forUser, query, sort)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
Boolean forUser = false; // Boolean | Filter for teams that you are a member of.
String query = ""; // String | A search term for querying of teams within an Organization.Available options are: name, slug, user, userslug
String sort = "name"; // String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name, members.
try {
    List<OrganizationTeam> result = apiInstance.orgsTeamsList(org, page, pageSize, forUser, query, sort);
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
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]
 **forUser** | **Boolean**| Filter for teams that you are a member of. | [optional] [default to false]
 **query** | **String**| A search term for querying of teams within an Organization.Available options are: name, slug, user, userslug | [optional] [default to ]
 **sort** | **String**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name, members. | [optional] [default to name]

### Return type

[**List&lt;OrganizationTeam&gt;**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsTeamsMembersCreate"></a>
# **orgsTeamsMembersCreate**
> OrganizationTeamMembers orgsTeamsMembersCreate(org, team, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String team = "team_example"; // String | 
OrganizationTeamMembers data = new OrganizationTeamMembers(); // OrganizationTeamMembers | 
try {
    OrganizationTeamMembers result = apiInstance.orgsTeamsMembersCreate(org, team, data);
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

[**OrganizationTeamMembers**](OrganizationTeamMembers.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsTeamsMembersList"></a>
# **orgsTeamsMembersList**
> OrganizationTeamMembers orgsTeamsMembersList(org, team)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String team = "team_example"; // String | 
try {
    OrganizationTeamMembers result = apiInstance.orgsTeamsMembersList(org, team);
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

[**OrganizationTeamMembers**](OrganizationTeamMembers.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsTeamsMembersUpdate"></a>
# **orgsTeamsMembersUpdate**
> OrganizationTeamMembers orgsTeamsMembersUpdate(org, team, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String team = "team_example"; // String | 
OrganizationTeamMembers data = new OrganizationTeamMembers(); // OrganizationTeamMembers | 
try {
    OrganizationTeamMembers result = apiInstance.orgsTeamsMembersUpdate(org, team, data);
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
 **data** | [**OrganizationTeamMembers**](OrganizationTeamMembers.md)|  | [optional]

### Return type

[**OrganizationTeamMembers**](OrganizationTeamMembers.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsTeamsPartialUpdate"></a>
# **orgsTeamsPartialUpdate**
> OrganizationTeam orgsTeamsPartialUpdate(org, team, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String team = "team_example"; // String | 
OrganizationTeamRequestPatch data = new OrganizationTeamRequestPatch(); // OrganizationTeamRequestPatch | 
try {
    OrganizationTeam result = apiInstance.orgsTeamsPartialUpdate(org, team, data);
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

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsTeamsRead"></a>
# **orgsTeamsRead**
> OrganizationTeam orgsTeamsRead(org, team)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String team = "team_example"; // String | 
try {
    OrganizationTeam result = apiInstance.orgsTeamsRead(org, team);
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

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsVulnerabilityPolicyCreate"></a>
# **orgsVulnerabilityPolicyCreate**
> OrganizationPackageVulnerabilityPolicy orgsVulnerabilityPolicyCreate(org, data)

Create a package vulnerability policy.

Create a package vulnerability policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
OrganizationPackageVulnerabilityPolicyRequest data = new OrganizationPackageVulnerabilityPolicyRequest(); // OrganizationPackageVulnerabilityPolicyRequest | 
try {
    OrganizationPackageVulnerabilityPolicy result = apiInstance.orgsVulnerabilityPolicyCreate(org, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsVulnerabilityPolicyCreate");
    e.printStackTrace();
}
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

<a name="orgsVulnerabilityPolicyDelete"></a>
# **orgsVulnerabilityPolicyDelete**
> orgsVulnerabilityPolicyDelete(org, slugPerm)

Delete a package vulnerability policy.

Delete a package vulnerability policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.orgsVulnerabilityPolicyDelete(org, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsVulnerabilityPolicyDelete");
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsVulnerabilityPolicyEvaluationCreate"></a>
# **orgsVulnerabilityPolicyEvaluationCreate**
> PackageVulnerabilityPolicyEvaluationRequest orgsVulnerabilityPolicyEvaluationCreate(org, policySlugPerm, data)

Create an evaluation request for this policy.

Create an evaluation request for this policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String policySlugPerm = "policySlugPerm_example"; // String | 
PackageVulnerabilityPolicyEvaluationRequestRequest data = new PackageVulnerabilityPolicyEvaluationRequestRequest(); // PackageVulnerabilityPolicyEvaluationRequestRequest | 
try {
    PackageVulnerabilityPolicyEvaluationRequest result = apiInstance.orgsVulnerabilityPolicyEvaluationCreate(org, policySlugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsVulnerabilityPolicyEvaluationCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **policySlugPerm** | **String**|  |
 **data** | [**PackageVulnerabilityPolicyEvaluationRequestRequest**](PackageVulnerabilityPolicyEvaluationRequestRequest.md)|  | [optional]

### Return type

[**PackageVulnerabilityPolicyEvaluationRequest**](PackageVulnerabilityPolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsVulnerabilityPolicyEvaluationList"></a>
# **orgsVulnerabilityPolicyEvaluationList**
> List&lt;PackageVulnerabilityPolicyEvaluationRequest&gt; orgsVulnerabilityPolicyEvaluationList(org, policySlugPerm, page, pageSize)

List evaluation requests for this policy.

List evaluation requests for this policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String policySlugPerm = "policySlugPerm_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
try {
    List<PackageVulnerabilityPolicyEvaluationRequest> result = apiInstance.orgsVulnerabilityPolicyEvaluationList(org, policySlugPerm, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsVulnerabilityPolicyEvaluationList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **policySlugPerm** | **String**|  |
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]

### Return type

[**List&lt;PackageVulnerabilityPolicyEvaluationRequest&gt;**](PackageVulnerabilityPolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsVulnerabilityPolicyEvaluationRead"></a>
# **orgsVulnerabilityPolicyEvaluationRead**
> PackageVulnerabilityPolicyEvaluationRequest orgsVulnerabilityPolicyEvaluationRead(org, policySlugPerm, slugPerm)

Retrieve an evaluation request for this policy.

Retrieve an evaluation request for this policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String policySlugPerm = "policySlugPerm_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
try {
    PackageVulnerabilityPolicyEvaluationRequest result = apiInstance.orgsVulnerabilityPolicyEvaluationRead(org, policySlugPerm, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsVulnerabilityPolicyEvaluationRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **policySlugPerm** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**PackageVulnerabilityPolicyEvaluationRequest**](PackageVulnerabilityPolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsVulnerabilityPolicyList"></a>
# **orgsVulnerabilityPolicyList**
> List&lt;OrganizationPackageVulnerabilityPolicy&gt; orgsVulnerabilityPolicyList(org, page, pageSize)

Get a list of all package vulnerability policies.

Get a list of all package vulnerability policies.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
try {
    List<OrganizationPackageVulnerabilityPolicy> result = apiInstance.orgsVulnerabilityPolicyList(org, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsVulnerabilityPolicyList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]

### Return type

[**List&lt;OrganizationPackageVulnerabilityPolicy&gt;**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsVulnerabilityPolicyPartialUpdate"></a>
# **orgsVulnerabilityPolicyPartialUpdate**
> OrganizationPackageVulnerabilityPolicy orgsVulnerabilityPolicyPartialUpdate(org, slugPerm, data)

Partially update a package vulnerability policy.

Partially update a package vulnerability policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
OrganizationPackageVulnerabilityPolicyRequestPatch data = new OrganizationPackageVulnerabilityPolicyRequestPatch(); // OrganizationPackageVulnerabilityPolicyRequestPatch | 
try {
    OrganizationPackageVulnerabilityPolicy result = apiInstance.orgsVulnerabilityPolicyPartialUpdate(org, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsVulnerabilityPolicyPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**OrganizationPackageVulnerabilityPolicyRequestPatch**](OrganizationPackageVulnerabilityPolicyRequestPatch.md)|  | [optional]

### Return type

[**OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsVulnerabilityPolicyRead"></a>
# **orgsVulnerabilityPolicyRead**
> OrganizationPackageVulnerabilityPolicy orgsVulnerabilityPolicyRead(org, slugPerm)

Get a package vulnerability policy.

Get a package vulnerability policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
try {
    OrganizationPackageVulnerabilityPolicy result = apiInstance.orgsVulnerabilityPolicyRead(org, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsVulnerabilityPolicyRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsVulnerabilityPolicyUpdate"></a>
# **orgsVulnerabilityPolicyUpdate**
> OrganizationPackageVulnerabilityPolicy orgsVulnerabilityPolicyUpdate(org, slugPerm, data)

Update a package vulnerability policy.

Update a package vulnerability policy.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String slugPerm = "slugPerm_example"; // String | 
OrganizationPackageVulnerabilityPolicyRequest data = new OrganizationPackageVulnerabilityPolicyRequest(); // OrganizationPackageVulnerabilityPolicyRequest | 
try {
    OrganizationPackageVulnerabilityPolicy result = apiInstance.orgsVulnerabilityPolicyUpdate(org, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsVulnerabilityPolicyUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**OrganizationPackageVulnerabilityPolicyRequest**](OrganizationPackageVulnerabilityPolicyRequest.md)|  | [optional]

### Return type

[**OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgsVulnerabilityPolicyViolationList"></a>
# **orgsVulnerabilityPolicyViolationList**
> PackageVulnerabilityPolicyViolationLogCursorPage orgsVulnerabilityPolicyViolationList(org, cursor, pageSize)

List all current vulnerability policy violations for this Organization.

List all current vulnerability policy violations for this Organization.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

OrgsApi apiInstance = new OrgsApi();
String org = "org_example"; // String | 
String cursor = "cursor_example"; // String | The pagination cursor value.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
try {
    PackageVulnerabilityPolicyViolationLogCursorPage result = apiInstance.orgsVulnerabilityPolicyViolationList(org, cursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrgsApi#orgsVulnerabilityPolicyViolationList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **cursor** | **String**| The pagination cursor value. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]

### Return type

[**PackageVulnerabilityPolicyViolationLogCursorPage**](PackageVulnerabilityPolicyViolationLogCursorPage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

