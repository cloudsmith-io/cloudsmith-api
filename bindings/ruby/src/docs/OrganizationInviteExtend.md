# CloudsmithApi::OrganizationInviteExtend

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | The email of the user to be invited. | [optional] 
**expires_at** | **DateTime** |  | [optional] 
**inviter** | **String** |  | [optional] 
**inviter_url** | **String** |  | [optional] 
**org** | **String** |  | [optional] 
**role** | **String** | The role to be assigned to the invited user. | [optional] [default to &#39;Member&#39;]
**slug_perm** | **String** | The slug_perm of the invite to be extended. | [optional] 
**teams** | [**Array&lt;OrganizationTeamInvite&gt;**](OrganizationTeamInvite.md) |  | [optional] 
**user** | **String** | The slug of the user to be invited. | [optional] 
**user_url** | **String** |  | [optional] 


