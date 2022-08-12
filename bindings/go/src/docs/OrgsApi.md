# \OrgsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OrgsInvitesCreate**](OrgsApi.md#OrgsInvitesCreate) | **Post** /orgs/{org}/invites/ | Create an organization invite for a specific user
[**OrgsInvitesDelete**](OrgsApi.md#OrgsInvitesDelete) | **Delete** /orgs/{org}/invites/{slug_perm}/ | Delete a specific organization invite
[**OrgsInvitesExtend**](OrgsApi.md#OrgsInvitesExtend) | **Post** /orgs/{org}/invites/{slug_perm}/extend/ | Extend an organization invite.
[**OrgsInvitesList**](OrgsApi.md#OrgsInvitesList) | **Get** /orgs/{org}/invites/ | Get a list of all invites for an organization.
[**OrgsList**](OrgsApi.md#OrgsList) | **Get** /orgs/ | Get a list of all the organizations you are associated with.
[**OrgsMembersList**](OrgsApi.md#OrgsMembersList) | **Get** /orgs/{org}/members/ | Get the details for all organization members.
[**OrgsMembersRead**](OrgsApi.md#OrgsMembersRead) | **Get** /orgs/{org}/members/{member}/ | Get the details for a specific organization member.
[**OrgsMembersRemove**](OrgsApi.md#OrgsMembersRemove) | **Get** /orgs/{org}/members/{member}/remove/ | Removes a member from the organization.
[**OrgsRead**](OrgsApi.md#OrgsRead) | **Get** /orgs/{org}/ | Get the details for the specific organization.
[**OrgsSamlGroupSyncCreate**](OrgsApi.md#OrgsSamlGroupSyncCreate) | **Post** /orgs/{org}/saml-group-sync/ | Create a new SAML Group Sync mapping within an organization.
[**OrgsSamlGroupSyncDelete**](OrgsApi.md#OrgsSamlGroupSyncDelete) | **Delete** /orgs/{org}/saml-group-sync/{slug_perm}/ | Delete a SAML Group Sync mapping from an organization.
[**OrgsSamlGroupSyncList**](OrgsApi.md#OrgsSamlGroupSyncList) | **Get** /orgs/{org}/saml-group-sync/ | Get the details of all SAML Group Sync mapping within an organization.
[**OrgsTeamsCreate**](OrgsApi.md#OrgsTeamsCreate) | **Post** /orgs/{org}/teams/ | Create a team for this organization.
[**OrgsTeamsDelete**](OrgsApi.md#OrgsTeamsDelete) | **Delete** /orgs/{org}/teams/{slug_perm}/ | Delete a specific team in a organization.
[**OrgsTeamsList**](OrgsApi.md#OrgsTeamsList) | **Get** /orgs/{org}/teams/ | Get the details of all teams within an organization.
[**OrgsTeamsPartialUpdate**](OrgsApi.md#OrgsTeamsPartialUpdate) | **Patch** /orgs/{org}/teams/{slug_perm}/ | Update a specific team in a organization.
[**OrgsTeamsRead**](OrgsApi.md#OrgsTeamsRead) | **Get** /orgs/{org}/teams/{slug_perm}/ | Viewset for working with Organization teams.


# **OrgsInvitesCreate**
> OrganizationInvite OrgsInvitesCreate(ctx, org, optional)
Create an organization invite for a specific user

Create an organization invite for a specific user

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **org** | **string**|  | 
 **optional** | ***OrgsApiOrgsInvitesCreateOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OrgsApiOrgsInvitesCreateOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **data** | [**optional.Interface of OrgsInvitesCreate**](OrgsInvitesCreate.md)|  | 

### Return type

[**OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrgsInvitesDelete**
> OrgsInvitesDelete(ctx, org, slugPerm)
Delete a specific organization invite

Delete a specific organization invite

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **org** | **string**|  | 
  **slugPerm** | **string**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrgsInvitesExtend**
> OrganizationInvite OrgsInvitesExtend(ctx, org, slugPerm, optional)
Extend an organization invite.

Extend an organization invite.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **org** | **string**|  | 
  **slugPerm** | **string**|  | 
 **optional** | ***OrgsApiOrgsInvitesExtendOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OrgsApiOrgsInvitesExtendOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of OrgsInvitesExtend**](OrgsInvitesExtend.md)|  | 

### Return type

[**OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrgsInvitesList**
> []OrganizationInvite OrgsInvitesList(ctx, org, optional)
Get a list of all invites for an organization.

Get a list of all invites for an organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **org** | **string**|  | 
 **optional** | ***OrgsApiOrgsInvitesListOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OrgsApiOrgsInvitesListOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **page** | **optional.Int32**| A page number within the paginated result set. | 
 **pageSize** | **optional.Int32**| Number of results to return per page. | 

### Return type

[**[]OrganizationInvite**](OrganizationInvite.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrgsList**
> []Organization OrgsList(ctx, optional)
Get a list of all the organizations you are associated with.

Get a list of all the organizations you are associated with.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***OrgsApiOrgsListOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OrgsApiOrgsListOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **optional.Int32**| A page number within the paginated result set. | 
 **pageSize** | **optional.Int32**| Number of results to return per page. | 

### Return type

[**[]Organization**](Organization.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrgsMembersList**
> []OrganizationMembership OrgsMembersList(ctx, org, optional)
Get the details for all organization members.

Get the details for all organization members.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **org** | **string**|  | 
 **optional** | ***OrgsApiOrgsMembersListOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OrgsApiOrgsMembersListOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **page** | **optional.Int32**| A page number within the paginated result set. | 
 **pageSize** | **optional.Int32**| Number of results to return per page. | 

### Return type

[**[]OrganizationMembership**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrgsMembersRead**
> OrganizationMembership OrgsMembersRead(ctx, org, member)
Get the details for a specific organization member.

Get the details for a specific organization member.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **org** | **string**|  | 
  **member** | **string**|  | 

### Return type

[**OrganizationMembership**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrgsMembersRemove**
> OrganizationMembership OrgsMembersRemove(ctx, org, member)
Removes a member from the organization.

Removes a member from the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **org** | **string**|  | 
  **member** | **string**|  | 

### Return type

[**OrganizationMembership**](OrganizationMembership.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrgsRead**
> Organization OrgsRead(ctx, org)
Get the details for the specific organization.

Get the details for the specific organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **org** | **string**|  | 

### Return type

[**Organization**](Organization.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrgsSamlGroupSyncCreate**
> OrganizationGroupSync OrgsSamlGroupSyncCreate(ctx, org, optional)
Create a new SAML Group Sync mapping within an organization.

Create a new SAML Group Sync mapping within an organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **org** | **string**|  | 
 **optional** | ***OrgsApiOrgsSamlGroupSyncCreateOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OrgsApiOrgsSamlGroupSyncCreateOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **data** | [**optional.Interface of OrgsSamlgroupsyncCreate**](OrgsSamlgroupsyncCreate.md)|  | 

### Return type

[**OrganizationGroupSync**](OrganizationGroupSync.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrgsSamlGroupSyncDelete**
> OrgsSamlGroupSyncDelete(ctx, org, slugPerm)
Delete a SAML Group Sync mapping from an organization.

Delete a SAML Group Sync mapping from an organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **org** | **string**|  | 
  **slugPerm** | **string**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrgsSamlGroupSyncList**
> []OrganizationGroupSync OrgsSamlGroupSyncList(ctx, org, optional)
Get the details of all SAML Group Sync mapping within an organization.

Get the details of all SAML Group Sync mapping within an organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **org** | **string**|  | 
 **optional** | ***OrgsApiOrgsSamlGroupSyncListOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OrgsApiOrgsSamlGroupSyncListOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **page** | **optional.Int32**| A page number within the paginated result set. | 
 **pageSize** | **optional.Int32**| Number of results to return per page. | 

### Return type

[**[]OrganizationGroupSync**](OrganizationGroupSync.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrgsTeamsCreate**
> OrganizationTeam OrgsTeamsCreate(ctx, org, optional)
Create a team for this organization.

Create a team for this organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **org** | **string**|  | 
 **optional** | ***OrgsApiOrgsTeamsCreateOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OrgsApiOrgsTeamsCreateOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **data** | [**optional.Interface of OrgsTeamsCreate**](OrgsTeamsCreate.md)|  | 

### Return type

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrgsTeamsDelete**
> OrgsTeamsDelete(ctx, org, slugPerm)
Delete a specific team in a organization.

Delete a specific team in a organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **org** | **string**|  | 
  **slugPerm** | **string**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrgsTeamsList**
> []OrganizationTeam OrgsTeamsList(ctx, org, optional)
Get the details of all teams within an organization.

Get the details of all teams within an organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **org** | **string**|  | 
 **optional** | ***OrgsApiOrgsTeamsListOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OrgsApiOrgsTeamsListOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **page** | **optional.Int32**| A page number within the paginated result set. | 
 **pageSize** | **optional.Int32**| Number of results to return per page. | 

### Return type

[**[]OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrgsTeamsPartialUpdate**
> OrganizationTeam OrgsTeamsPartialUpdate(ctx, org, slugPerm, optional)
Update a specific team in a organization.

Update a specific team in a organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **org** | **string**|  | 
  **slugPerm** | **string**|  | 
 **optional** | ***OrgsApiOrgsTeamsPartialUpdateOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OrgsApiOrgsTeamsPartialUpdateOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of OrgsTeamsPartialUpdate**](OrgsTeamsPartialUpdate.md)|  | 

### Return type

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrgsTeamsRead**
> OrganizationTeam OrgsTeamsRead(ctx, org, slugPerm)
Viewset for working with Organization teams.

Viewset for working with Organization teams.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **org** | **string**|  | 
  **slugPerm** | **string**|  | 

### Return type

[**OrganizationTeam**](OrganizationTeam.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

