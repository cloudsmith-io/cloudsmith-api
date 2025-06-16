# \OrgsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orgs_delete**](OrgsApi.md#orgs_delete) | **Delete** /orgs/{org}/ | Delete the specified organization.
[**orgs_deny_policy_create**](OrgsApi.md#orgs_deny_policy_create) | **Post** /orgs/{org}/deny-policy/ | Create a package deny policy.
[**orgs_deny_policy_delete**](OrgsApi.md#orgs_deny_policy_delete) | **Delete** /orgs/{org}/deny-policy/{slug_perm}/ | Delete a package deny policy.
[**orgs_deny_policy_list**](OrgsApi.md#orgs_deny_policy_list) | **Get** /orgs/{org}/deny-policy/ | Get a list of all package deny policies.
[**orgs_deny_policy_partial_update**](OrgsApi.md#orgs_deny_policy_partial_update) | **Patch** /orgs/{org}/deny-policy/{slug_perm}/ | Partially update a package deny policy.
[**orgs_deny_policy_read**](OrgsApi.md#orgs_deny_policy_read) | **Get** /orgs/{org}/deny-policy/{slug_perm}/ | Get a package deny policy.
[**orgs_deny_policy_update**](OrgsApi.md#orgs_deny_policy_update) | **Put** /orgs/{org}/deny-policy/{slug_perm}/ | Update a package deny policy.
[**orgs_invites_create**](OrgsApi.md#orgs_invites_create) | **Post** /orgs/{org}/invites/ | Create an organization invite for a specific user
[**orgs_invites_delete**](OrgsApi.md#orgs_invites_delete) | **Delete** /orgs/{org}/invites/{slug_perm}/ | Delete a specific organization invite
[**orgs_invites_extend**](OrgsApi.md#orgs_invites_extend) | **Post** /orgs/{org}/invites/{slug_perm}/extend/ | Extend an organization invite.
[**orgs_invites_list**](OrgsApi.md#orgs_invites_list) | **Get** /orgs/{org}/invites/ | Get a list of all invites for an organization.
[**orgs_invites_partial_update**](OrgsApi.md#orgs_invites_partial_update) | **Patch** /orgs/{org}/invites/{slug_perm}/ | Update a specific organization invite.
[**orgs_invites_resend**](OrgsApi.md#orgs_invites_resend) | **Post** /orgs/{org}/invites/{slug_perm}/resend/ | Resend an organization invite.
[**orgs_license_policy_create**](OrgsApi.md#orgs_license_policy_create) | **Post** /orgs/{org}/license-policy/ | Create a package license policy.
[**orgs_license_policy_delete**](OrgsApi.md#orgs_license_policy_delete) | **Delete** /orgs/{org}/license-policy/{slug_perm}/ | Delete a package license policy.
[**orgs_license_policy_evaluation_create**](OrgsApi.md#orgs_license_policy_evaluation_create) | **Post** /orgs/{org}/license-policy/{policy_slug_perm}/evaluation/ | Create an evaluation request for this policy.
[**orgs_license_policy_evaluation_list**](OrgsApi.md#orgs_license_policy_evaluation_list) | **Get** /orgs/{org}/license-policy/{policy_slug_perm}/evaluation/ | List evaluation requests for this policy.
[**orgs_license_policy_evaluation_read**](OrgsApi.md#orgs_license_policy_evaluation_read) | **Get** /orgs/{org}/license-policy/{policy_slug_perm}/evaluation/{slug_perm}/ | Retrieve an evaluation request for this policy.
[**orgs_license_policy_list**](OrgsApi.md#orgs_license_policy_list) | **Get** /orgs/{org}/license-policy/ | Get a list of all package license policies.
[**orgs_license_policy_partial_update**](OrgsApi.md#orgs_license_policy_partial_update) | **Patch** /orgs/{org}/license-policy/{slug_perm}/ | Partially update a package license policy.
[**orgs_license_policy_read**](OrgsApi.md#orgs_license_policy_read) | **Get** /orgs/{org}/license-policy/{slug_perm}/ | Get a package license policy.
[**orgs_license_policy_update**](OrgsApi.md#orgs_license_policy_update) | **Put** /orgs/{org}/license-policy/{slug_perm}/ | Update a package license policy.
[**orgs_license_policy_violation_list**](OrgsApi.md#orgs_license_policy_violation_list) | **Get** /orgs/{org}/license-policy-violation/ | List all current license policy violations for this Organization.
[**orgs_list**](OrgsApi.md#orgs_list) | **Get** /orgs/ | Get a list of all the organizations you are associated with.
[**orgs_members_delete**](OrgsApi.md#orgs_members_delete) | **Delete** /orgs/{org}/members/{member}/ | Removes a member from the organization.
[**orgs_members_list**](OrgsApi.md#orgs_members_list) | **Get** /orgs/{org}/members/ | Get the details for all organization members.
[**orgs_members_partial_update**](OrgsApi.md#orgs_members_partial_update) | **Patch** /orgs/{org}/members/{member}/ | Views for working with organization members.
[**orgs_members_read**](OrgsApi.md#orgs_members_read) | **Get** /orgs/{org}/members/{member}/ | Get the details for a specific organization member.
[**orgs_members_refresh**](OrgsApi.md#orgs_members_refresh) | **Post** /orgs/{org}/members/{member}/refresh/ | Refresh a member of the organization&#39;s API key.
[**orgs_members_remove**](OrgsApi.md#orgs_members_remove) | **Get** /orgs/{org}/members/{member}/remove/ | Removes a member from the organization (deprecated, use DELETE instead).
[**orgs_members_update_role**](OrgsApi.md#orgs_members_update_role) | **Patch** /orgs/{org}/members/{member}/update-role/ | Update a member&#39;s role in the organization.
[**orgs_members_update_visibility**](OrgsApi.md#orgs_members_update_visibility) | **Patch** /orgs/{org}/members/{member}/update-visibility/ | Update a member&#39;s visibility in the organization.
[**orgs_openid_connect_create**](OrgsApi.md#orgs_openid_connect_create) | **Post** /orgs/{org}/openid-connect/ | Create the OpenID Connect provider settings for the org.
[**orgs_openid_connect_delete**](OrgsApi.md#orgs_openid_connect_delete) | **Delete** /orgs/{org}/openid-connect/{slug_perm}/ | Delete a specific OpenID Connect provider setting for the org.
[**orgs_openid_connect_list**](OrgsApi.md#orgs_openid_connect_list) | **Get** /orgs/{org}/openid-connect/ | Retrieve the list of OpenID Connect provider settings for the org.
[**orgs_openid_connect_partial_update**](OrgsApi.md#orgs_openid_connect_partial_update) | **Patch** /orgs/{org}/openid-connect/{slug_perm}/ | Update a specific OpenID Connect provider setting for the org.
[**orgs_openid_connect_read**](OrgsApi.md#orgs_openid_connect_read) | **Get** /orgs/{org}/openid-connect/{slug_perm}/ | Retrieve a specific OpenID Connect provider setting for the org.
[**orgs_openid_connect_update**](OrgsApi.md#orgs_openid_connect_update) | **Put** /orgs/{org}/openid-connect/{slug_perm}/ | Update a specific OpenID Connect provider setting for the org.
[**orgs_read**](OrgsApi.md#orgs_read) | **Get** /orgs/{org}/ | Get the details for the specific organization.
[**orgs_saml_authentication_partial_update**](OrgsApi.md#orgs_saml_authentication_partial_update) | **Patch** /orgs/{org}/saml-authentication | Update the SAML Authentication settings for this Organization.
[**orgs_saml_authentication_read**](OrgsApi.md#orgs_saml_authentication_read) | **Get** /orgs/{org}/saml-authentication | Retrieve the SAML Authentication settings for this Organization.
[**orgs_saml_group_sync_create**](OrgsApi.md#orgs_saml_group_sync_create) | **Post** /orgs/{org}/saml-group-sync/ | Create a new SAML Group Sync mapping within an organization.
[**orgs_saml_group_sync_delete**](OrgsApi.md#orgs_saml_group_sync_delete) | **Delete** /orgs/{org}/saml-group-sync/{slug_perm}/ | Delete a SAML Group Sync mapping from an organization.
[**orgs_saml_group_sync_disable**](OrgsApi.md#orgs_saml_group_sync_disable) | **Post** /orgs/{org}/saml-group-sync/disable/ | Disable SAML Group Sync for this organization.
[**orgs_saml_group_sync_enable**](OrgsApi.md#orgs_saml_group_sync_enable) | **Post** /orgs/{org}/saml-group-sync/enable/ | Enable SAML Group Sync for this organization.
[**orgs_saml_group_sync_list**](OrgsApi.md#orgs_saml_group_sync_list) | **Get** /orgs/{org}/saml-group-sync/ | Get the details of all SAML Group Sync mapping within an organization.
[**orgs_saml_group_sync_status**](OrgsApi.md#orgs_saml_group_sync_status) | **Get** /orgs/{org}/saml-group-sync/status/ | Retrieve the SAML Group Sync status for this organization.
[**orgs_services_create**](OrgsApi.md#orgs_services_create) | **Post** /orgs/{org}/services/ | Create a service within an organization.
[**orgs_services_delete**](OrgsApi.md#orgs_services_delete) | **Delete** /orgs/{org}/services/{service}/ | Delete a specific service
[**orgs_services_list**](OrgsApi.md#orgs_services_list) | **Get** /orgs/{org}/services/ | Get a list of all services within an organization.
[**orgs_services_partial_update**](OrgsApi.md#orgs_services_partial_update) | **Patch** /orgs/{org}/services/{service}/ | Update a service within an organization.
[**orgs_services_read**](OrgsApi.md#orgs_services_read) | **Get** /orgs/{org}/services/{service}/ | Retrieve details of a single service within an organization.
[**orgs_services_refresh**](OrgsApi.md#orgs_services_refresh) | **Post** /orgs/{org}/services/{service}/refresh/ | Refresh service API token.
[**orgs_teams_create**](OrgsApi.md#orgs_teams_create) | **Post** /orgs/{org}/teams/ | Create a team for this organization.
[**orgs_teams_delete**](OrgsApi.md#orgs_teams_delete) | **Delete** /orgs/{org}/teams/{team}/ | Delete a specific team in a organization.
[**orgs_teams_list**](OrgsApi.md#orgs_teams_list) | **Get** /orgs/{org}/teams/ | Get the details of all teams within an organization.
[**orgs_teams_members_create**](OrgsApi.md#orgs_teams_members_create) | **Post** /orgs/{org}/teams/{team}/members | Add users to a team.
[**orgs_teams_members_list**](OrgsApi.md#orgs_teams_members_list) | **Get** /orgs/{org}/teams/{team}/members | List all members for the team.
[**orgs_teams_members_update**](OrgsApi.md#orgs_teams_members_update) | **Put** /orgs/{org}/teams/{team}/members | Replace all team members.
[**orgs_teams_partial_update**](OrgsApi.md#orgs_teams_partial_update) | **Patch** /orgs/{org}/teams/{team}/ | Update a specific team in a organization.
[**orgs_teams_read**](OrgsApi.md#orgs_teams_read) | **Get** /orgs/{org}/teams/{team}/ | Get the details of a specific team within an organization.
[**orgs_vulnerability_policy_create**](OrgsApi.md#orgs_vulnerability_policy_create) | **Post** /orgs/{org}/vulnerability-policy/ | Create a package vulnerability policy.
[**orgs_vulnerability_policy_delete**](OrgsApi.md#orgs_vulnerability_policy_delete) | **Delete** /orgs/{org}/vulnerability-policy/{slug_perm}/ | Delete a package vulnerability policy.
[**orgs_vulnerability_policy_evaluation_create**](OrgsApi.md#orgs_vulnerability_policy_evaluation_create) | **Post** /orgs/{org}/vulnerability-policy/{policy_slug_perm}/evaluation/ | Create an evaluation request for this policy.
[**orgs_vulnerability_policy_evaluation_list**](OrgsApi.md#orgs_vulnerability_policy_evaluation_list) | **Get** /orgs/{org}/vulnerability-policy/{policy_slug_perm}/evaluation/ | List evaluation requests for this policy.
[**orgs_vulnerability_policy_evaluation_read**](OrgsApi.md#orgs_vulnerability_policy_evaluation_read) | **Get** /orgs/{org}/vulnerability-policy/{policy_slug_perm}/evaluation/{slug_perm}/ | Retrieve an evaluation request for this policy.
[**orgs_vulnerability_policy_list**](OrgsApi.md#orgs_vulnerability_policy_list) | **Get** /orgs/{org}/vulnerability-policy/ | Get a list of all package vulnerability policies.
[**orgs_vulnerability_policy_partial_update**](OrgsApi.md#orgs_vulnerability_policy_partial_update) | **Patch** /orgs/{org}/vulnerability-policy/{slug_perm}/ | Partially update a package vulnerability policy.
[**orgs_vulnerability_policy_read**](OrgsApi.md#orgs_vulnerability_policy_read) | **Get** /orgs/{org}/vulnerability-policy/{slug_perm}/ | Get a package vulnerability policy.
[**orgs_vulnerability_policy_update**](OrgsApi.md#orgs_vulnerability_policy_update) | **Put** /orgs/{org}/vulnerability-policy/{slug_perm}/ | Update a package vulnerability policy.
[**orgs_vulnerability_policy_violation_list**](OrgsApi.md#orgs_vulnerability_policy_violation_list) | **Get** /orgs/{org}/vulnerability-policy-violation/ | List all current vulnerability policy violations for this Organization.


# **orgs_delete**
> orgs_delete(ctx, ctx, org)
Delete the specified organization.

Delete the specified organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_create**
> ::models::PackageDenyPolicy orgs_deny_policy_create(ctx, ctx, org, optional)
Create a package deny policy.

Create a package deny policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**PackageDenyPolicyRequest**](PackageDenyPolicyRequest.md)|  | 

### Return type

[**::models::PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_delete**
> orgs_deny_policy_delete(ctx, ctx, org, slug_perm)
Delete a package deny policy.

Delete a package deny policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_list**
> Vec<::models::PackageDenyPolicy> orgs_deny_policy_list(ctx, ctx, org, optional)
Get a list of all package deny policies.

Get a list of all package deny policies.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::PackageDenyPolicy>**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_partial_update**
> ::models::PackageDenyPolicy orgs_deny_policy_partial_update(ctx, ctx, org, slug_perm, optional)
Partially update a package deny policy.

Partially update a package deny policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**PackageDenyPolicyRequestPatch**](PackageDenyPolicyRequestPatch.md)|  | 

### Return type

[**::models::PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_read**
> ::models::PackageDenyPolicy orgs_deny_policy_read(ctx, ctx, org, slug_perm)
Get a package deny policy.

Get a package deny policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_deny_policy_update**
> ::models::PackageDenyPolicy orgs_deny_policy_update(ctx, ctx, org, slug_perm, optional)
Update a package deny policy.

Update a package deny policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**PackageDenyPolicyRequest**](PackageDenyPolicyRequest.md)|  | 

### Return type

[**::models::PackageDenyPolicy**](PackageDenyPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_create**
> ::models::OrganizationInvite orgs_invites_create(ctx, ctx, org, optional)
Create an organization invite for a specific user

Create an organization invite for a specific user

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**OrganizationInviteRequest**](OrganizationInviteRequest.md)|  | 

### Return type

[**::models::OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_delete**
> orgs_invites_delete(ctx, ctx, org, slug_perm)
Delete a specific organization invite

Delete a specific organization invite

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_extend**
> ::models::OrganizationInviteExtend orgs_invites_extend(ctx, ctx, org, slug_perm)
Extend an organization invite.

Extend an organization invite.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::OrganizationInviteExtend**](OrganizationInviteExtend.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_list**
> Vec<::models::OrganizationInvite> orgs_invites_list(ctx, ctx, org, optional)
Get a list of all invites for an organization.

Get a list of all invites for an organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::OrganizationInvite>**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_partial_update**
> ::models::OrganizationInvite orgs_invites_partial_update(ctx, ctx, org, slug_perm, optional)
Update a specific organization invite.

Update a specific organization invite.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**OrganizationInviteUpdateRequestPatch**](OrganizationInviteUpdateRequestPatch.md)|  | 

### Return type

[**::models::OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_invites_resend**
> ::models::OrganizationInviteExtend orgs_invites_resend(ctx, ctx, org, slug_perm)
Resend an organization invite.

Resend an organization invite.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::OrganizationInviteExtend**](OrganizationInviteExtend.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_create**
> ::models::OrganizationPackageLicensePolicy orgs_license_policy_create(ctx, ctx, org, optional)
Create a package license policy.

Create a package license policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**OrganizationPackageLicensePolicyRequest**](OrganizationPackageLicensePolicyRequest.md)|  | 

### Return type

[**::models::OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_delete**
> orgs_license_policy_delete(ctx, ctx, org, slug_perm)
Delete a package license policy.

Delete a package license policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_evaluation_create**
> ::models::PackageLicensePolicyEvaluationRequest orgs_license_policy_evaluation_create(ctx, ctx, org, policy_slug_perm, optional)
Create an evaluation request for this policy.

Create an evaluation request for this policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **policy_slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **policy_slug_perm** | **String**|  | 
 **data** | [**PackageLicensePolicyEvaluationRequestRequest**](PackageLicensePolicyEvaluationRequestRequest.md)|  | 

### Return type

[**::models::PackageLicensePolicyEvaluationRequest**](PackageLicensePolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_evaluation_list**
> Vec<::models::PackageLicensePolicyEvaluationRequest> orgs_license_policy_evaluation_list(ctx, ctx, org, policy_slug_perm, optional)
List evaluation requests for this policy.

List evaluation requests for this policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **policy_slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **policy_slug_perm** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::PackageLicensePolicyEvaluationRequest>**](PackageLicensePolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_evaluation_read**
> ::models::PackageLicensePolicyEvaluationRequest orgs_license_policy_evaluation_read(ctx, ctx, org, policy_slug_perm, slug_perm)
Retrieve an evaluation request for this policy.

Retrieve an evaluation request for this policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **policy_slug_perm** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::PackageLicensePolicyEvaluationRequest**](PackageLicensePolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_list**
> Vec<::models::OrganizationPackageLicensePolicy> orgs_license_policy_list(ctx, ctx, org, optional)
Get a list of all package license policies.

Get a list of all package license policies.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::OrganizationPackageLicensePolicy>**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_partial_update**
> ::models::OrganizationPackageLicensePolicy orgs_license_policy_partial_update(ctx, ctx, org, slug_perm, optional)
Partially update a package license policy.

Partially update a package license policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**OrganizationPackageLicensePolicyRequestPatch**](OrganizationPackageLicensePolicyRequestPatch.md)|  | 

### Return type

[**::models::OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_read**
> ::models::OrganizationPackageLicensePolicy orgs_license_policy_read(ctx, ctx, org, slug_perm)
Get a package license policy.

Get a package license policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_update**
> ::models::OrganizationPackageLicensePolicy orgs_license_policy_update(ctx, ctx, org, slug_perm, optional)
Update a package license policy.

Update a package license policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**OrganizationPackageLicensePolicyRequest**](OrganizationPackageLicensePolicyRequest.md)|  | 

### Return type

[**::models::OrganizationPackageLicensePolicy**](OrganizationPackageLicensePolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_license_policy_violation_list**
> ::models::PackageLicensePolicyViolationLogCursorPage orgs_license_policy_violation_list(ctx, ctx, org, optional)
List all current license policy violations for this Organization.

List all current license policy violations for this Organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **cursor** | **String**| The pagination cursor value. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**::models::PackageLicensePolicyViolationLogCursorPage**](PackageLicensePolicyViolationLogCursorPage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_list**
> Vec<::models::Organization> orgs_list(ctx, ctx, optional)
Get a list of all the organizations you are associated with.

Get a list of all the organizations you are associated with.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::Organization>**](Organization.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_delete**
> orgs_members_delete(ctx, ctx, org, member)
Removes a member from the organization.

Removes a member from the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **member** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_list**
> Vec<::models::OrganizationMembership> orgs_members_list(ctx, ctx, org, optional)
Get the details for all organization members.

Get the details for all organization members.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 
 **is_active** | **bool**| Filter for active/inactive users. | [default to false]
 **query** | **String**| A search term for querying of members within an Organization.Available options are: email, org, user, userslug, inactive, user_name, role | [default to ]
 **sort** | **String**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-user_name&#x60;). Available options: user_name, role. | [default to user_name]

### Return type

[**Vec<::models::OrganizationMembership>**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_partial_update**
> ::models::OrganizationMembership orgs_members_partial_update(ctx, ctx, org, member, optional)
Views for working with organization members.

Views for working with organization members.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **member** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **member** | **String**|  | 
 **data** | [**OrganizationMembershipRequestPatch**](OrganizationMembershipRequestPatch.md)|  | 

### Return type

[**::models::OrganizationMembership**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_read**
> ::models::OrganizationMembership orgs_members_read(ctx, ctx, org, member)
Get the details for a specific organization member.

Get the details for a specific organization member.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **member** | **String**|  | 

### Return type

[**::models::OrganizationMembership**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_refresh**
> orgs_members_refresh(ctx, ctx, org, member)
Refresh a member of the organization's API key.

Refresh a member of the organization's API key.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **member** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_remove**
> orgs_members_remove(ctx, ctx, org, member)
Removes a member from the organization (deprecated, use DELETE instead).

Removes a member from the organization (deprecated, use DELETE instead).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **member** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_update_role**
> ::models::OrganizationMembershipRoleUpdate orgs_members_update_role(ctx, ctx, org, member, optional)
Update a member's role in the organization.

Update a member's role in the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **member** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **member** | **String**|  | 
 **data** | [**OrganizationMembershipRoleUpdateRequestPatch**](OrganizationMembershipRoleUpdateRequestPatch.md)|  | 

### Return type

[**::models::OrganizationMembershipRoleUpdate**](OrganizationMembershipRoleUpdate.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_members_update_visibility**
> ::models::OrganizationMembershipVisibilityUpdate orgs_members_update_visibility(ctx, ctx, org, member, optional)
Update a member's visibility in the organization.

Update a member's visibility in the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **member** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **member** | **String**|  | 
 **data** | [**OrganizationMembershipVisibilityUpdateRequestPatch**](OrganizationMembershipVisibilityUpdateRequestPatch.md)|  | 

### Return type

[**::models::OrganizationMembershipVisibilityUpdate**](OrganizationMembershipVisibilityUpdate.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_create**
> ::models::ProviderSettings orgs_openid_connect_create(ctx, ctx, org, optional)
Create the OpenID Connect provider settings for the org.

Create the OpenID Connect provider settings for the org.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**ProviderSettingsRequest**](ProviderSettingsRequest.md)|  | 

### Return type

[**::models::ProviderSettings**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_delete**
> orgs_openid_connect_delete(ctx, ctx, org, slug_perm)
Delete a specific OpenID Connect provider setting for the org.

Delete a specific OpenID Connect provider setting for the org.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_list**
> Vec<::models::ProviderSettings> orgs_openid_connect_list(ctx, ctx, org, optional)
Retrieve the list of OpenID Connect provider settings for the org.

Retrieve the list of OpenID Connect provider settings for the org.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::ProviderSettings>**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_partial_update**
> ::models::ProviderSettings orgs_openid_connect_partial_update(ctx, ctx, org, slug_perm, optional)
Update a specific OpenID Connect provider setting for the org.

Update a specific OpenID Connect provider setting for the org.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**ProviderSettingsRequestPatch**](ProviderSettingsRequestPatch.md)|  | 

### Return type

[**::models::ProviderSettings**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_read**
> ::models::ProviderSettings orgs_openid_connect_read(ctx, ctx, org, slug_perm)
Retrieve a specific OpenID Connect provider setting for the org.

Retrieve a specific OpenID Connect provider setting for the org.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::ProviderSettings**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_openid_connect_update**
> ::models::ProviderSettings orgs_openid_connect_update(ctx, ctx, org, slug_perm, optional)
Update a specific OpenID Connect provider setting for the org.

Update a specific OpenID Connect provider setting for the org.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**ProviderSettingsRequest**](ProviderSettingsRequest.md)|  | 

### Return type

[**::models::ProviderSettings**](ProviderSettings.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_read**
> ::models::Organization orgs_read(ctx, ctx, org)
Get the details for the specific organization.

Get the details for the specific organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 

### Return type

[**::models::Organization**](Organization.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_authentication_partial_update**
> ::models::OrganizationSamlAuth orgs_saml_authentication_partial_update(ctx, ctx, org, optional)
Update the SAML Authentication settings for this Organization.

Update the SAML Authentication settings for this Organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**OrganizationSamlAuthRequestPatch**](OrganizationSamlAuthRequestPatch.md)|  | 

### Return type

[**::models::OrganizationSamlAuth**](OrganizationSAMLAuth.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_authentication_read**
> ::models::OrganizationSamlAuth orgs_saml_authentication_read(ctx, ctx, org)
Retrieve the SAML Authentication settings for this Organization.

Retrieve the SAML Authentication settings for this Organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 

### Return type

[**::models::OrganizationSamlAuth**](OrganizationSAMLAuth.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_create**
> ::models::OrganizationGroupSync orgs_saml_group_sync_create(ctx, ctx, org, optional)
Create a new SAML Group Sync mapping within an organization.

Create a new SAML Group Sync mapping within an organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**OrganizationGroupSyncRequest**](OrganizationGroupSyncRequest.md)|  | 

### Return type

[**::models::OrganizationGroupSync**](OrganizationGroupSync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_delete**
> orgs_saml_group_sync_delete(ctx, ctx, org, slug_perm)
Delete a SAML Group Sync mapping from an organization.

Delete a SAML Group Sync mapping from an organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_disable**
> orgs_saml_group_sync_disable(ctx, ctx, org)
Disable SAML Group Sync for this organization.

Disable SAML Group Sync for this organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_enable**
> orgs_saml_group_sync_enable(ctx, ctx, org)
Enable SAML Group Sync for this organization.

Enable SAML Group Sync for this organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_list**
> Vec<::models::OrganizationGroupSync> orgs_saml_group_sync_list(ctx, ctx, org, optional)
Get the details of all SAML Group Sync mapping within an organization.

Get the details of all SAML Group Sync mapping within an organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::OrganizationGroupSync>**](OrganizationGroupSync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_saml_group_sync_status**
> ::models::OrganizationGroupSyncStatus orgs_saml_group_sync_status(ctx, ctx, org)
Retrieve the SAML Group Sync status for this organization.

Retrieve the SAML Group Sync status for this organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 

### Return type

[**::models::OrganizationGroupSyncStatus**](OrganizationGroupSyncStatus.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_create**
> ::models::Service orgs_services_create(ctx, ctx, org, optional)
Create a service within an organization.

Create a service within an organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**ServiceRequest**](ServiceRequest.md)|  | 

### Return type

[**::models::Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_delete**
> orgs_services_delete(ctx, ctx, org, service)
Delete a specific service

Delete a specific service

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **service** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_list**
> Vec<::models::Service> orgs_services_list(ctx, ctx, org, optional)
Get a list of all services within an organization.

Get a list of all services within an organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::Service>**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_partial_update**
> ::models::Service orgs_services_partial_update(ctx, ctx, org, service, optional)
Update a service within an organization.

Update a service within an organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **service** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **service** | **String**|  | 
 **data** | [**ServiceRequestPatch**](ServiceRequestPatch.md)|  | 

### Return type

[**::models::Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_read**
> ::models::Service orgs_services_read(ctx, ctx, org, service)
Retrieve details of a single service within an organization.

Retrieve details of a single service within an organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **service** | **String**|  | 

### Return type

[**::models::Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_services_refresh**
> ::models::Service orgs_services_refresh(ctx, ctx, org, service)
Refresh service API token.

Refresh service API token.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **service** | **String**|  | 

### Return type

[**::models::Service**](Service.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_create**
> ::models::OrganizationTeam orgs_teams_create(ctx, ctx, org, optional)
Create a team for this organization.

Create a team for this organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**OrganizationTeamRequest**](OrganizationTeamRequest.md)|  | 

### Return type

[**::models::OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_delete**
> orgs_teams_delete(ctx, ctx, org, team)
Delete a specific team in a organization.

Delete a specific team in a organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **team** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_list**
> Vec<::models::OrganizationTeam> orgs_teams_list(ctx, ctx, org, optional)
Get the details of all teams within an organization.

Get the details of all teams within an organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::OrganizationTeam>**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_members_create**
> ::models::OrganizationTeamMembers orgs_teams_members_create(ctx, ctx, org, team, optional)
Add users to a team.

Add users to a team.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **team** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **team** | **String**|  | 
 **data** | [**OrganizationTeamMembers**](OrganizationTeamMembers.md)|  | 

### Return type

[**::models::OrganizationTeamMembers**](OrganizationTeamMembers.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_members_list**
> ::models::OrganizationTeamMembers orgs_teams_members_list(ctx, ctx, org, team)
List all members for the team.

List all members for the team.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **team** | **String**|  | 

### Return type

[**::models::OrganizationTeamMembers**](OrganizationTeamMembers.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_members_update**
> ::models::OrganizationTeamMembers orgs_teams_members_update(ctx, ctx, org, team, optional)
Replace all team members.

Replace all team members.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **team** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **team** | **String**|  | 
 **data** | [**OrganizationTeamMembers**](OrganizationTeamMembers.md)|  | 

### Return type

[**::models::OrganizationTeamMembers**](OrganizationTeamMembers.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_partial_update**
> ::models::OrganizationTeam orgs_teams_partial_update(ctx, ctx, org, team, optional)
Update a specific team in a organization.

Update a specific team in a organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **team** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **team** | **String**|  | 
 **data** | [**OrganizationTeamRequestPatch**](OrganizationTeamRequestPatch.md)|  | 

### Return type

[**::models::OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_teams_read**
> ::models::OrganizationTeam orgs_teams_read(ctx, ctx, org, team)
Get the details of a specific team within an organization.

Get the details of a specific team within an organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **team** | **String**|  | 

### Return type

[**::models::OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_create**
> ::models::OrganizationPackageVulnerabilityPolicy orgs_vulnerability_policy_create(ctx, ctx, org, optional)
Create a package vulnerability policy.

Create a package vulnerability policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**OrganizationPackageVulnerabilityPolicyRequest**](OrganizationPackageVulnerabilityPolicyRequest.md)|  | 

### Return type

[**::models::OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_delete**
> orgs_vulnerability_policy_delete(ctx, ctx, org, slug_perm)
Delete a package vulnerability policy.

Delete a package vulnerability policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_evaluation_create**
> ::models::PackageVulnerabilityPolicyEvaluationRequest orgs_vulnerability_policy_evaluation_create(ctx, ctx, org, policy_slug_perm, optional)
Create an evaluation request for this policy.

Create an evaluation request for this policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **policy_slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **policy_slug_perm** | **String**|  | 
 **data** | [**PackageVulnerabilityPolicyEvaluationRequestRequest**](PackageVulnerabilityPolicyEvaluationRequestRequest.md)|  | 

### Return type

[**::models::PackageVulnerabilityPolicyEvaluationRequest**](PackageVulnerabilityPolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_evaluation_list**
> Vec<::models::PackageVulnerabilityPolicyEvaluationRequest> orgs_vulnerability_policy_evaluation_list(ctx, ctx, org, policy_slug_perm, optional)
List evaluation requests for this policy.

List evaluation requests for this policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **policy_slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **policy_slug_perm** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::PackageVulnerabilityPolicyEvaluationRequest>**](PackageVulnerabilityPolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_evaluation_read**
> ::models::PackageVulnerabilityPolicyEvaluationRequest orgs_vulnerability_policy_evaluation_read(ctx, ctx, org, policy_slug_perm, slug_perm)
Retrieve an evaluation request for this policy.

Retrieve an evaluation request for this policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **policy_slug_perm** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::PackageVulnerabilityPolicyEvaluationRequest**](PackageVulnerabilityPolicyEvaluationRequest.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_list**
> Vec<::models::OrganizationPackageVulnerabilityPolicy> orgs_vulnerability_policy_list(ctx, ctx, org, optional)
Get a list of all package vulnerability policies.

Get a list of all package vulnerability policies.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::OrganizationPackageVulnerabilityPolicy>**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_partial_update**
> ::models::OrganizationPackageVulnerabilityPolicy orgs_vulnerability_policy_partial_update(ctx, ctx, org, slug_perm, optional)
Partially update a package vulnerability policy.

Partially update a package vulnerability policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**OrganizationPackageVulnerabilityPolicyRequestPatch**](OrganizationPackageVulnerabilityPolicyRequestPatch.md)|  | 

### Return type

[**::models::OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_read**
> ::models::OrganizationPackageVulnerabilityPolicy orgs_vulnerability_policy_read(ctx, ctx, org, slug_perm)
Get a package vulnerability policy.

Get a package vulnerability policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_update**
> ::models::OrganizationPackageVulnerabilityPolicy orgs_vulnerability_policy_update(ctx, ctx, org, slug_perm, optional)
Update a package vulnerability policy.

Update a package vulnerability policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**OrganizationPackageVulnerabilityPolicyRequest**](OrganizationPackageVulnerabilityPolicyRequest.md)|  | 

### Return type

[**::models::OrganizationPackageVulnerabilityPolicy**](OrganizationPackageVulnerabilityPolicy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_vulnerability_policy_violation_list**
> ::models::PackageVulnerabilityPolicyViolationLogCursorPage orgs_vulnerability_policy_violation_list(ctx, ctx, org, optional)
List all current vulnerability policy violations for this Organization.

List all current vulnerability policy violations for this Organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **org** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **cursor** | **String**| The pagination cursor value. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**::models::PackageVulnerabilityPolicyViolationLogCursorPage**](PackageVulnerabilityPolicyViolationLogCursorPage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

