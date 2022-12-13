
# OrganizationInviteExtend

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | The email of the user to be invited. |  [optional]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**inviter** | **String** |  |  [optional]
**inviterUrl** | **String** |  |  [optional]
**org** | **String** |  |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | The role to be assigned to the invited user. |  [optional]
**slugPerm** | **String** | The slug_perm of the invite to be extended. |  [optional]
**user** | **String** | The slug of the user to be invited. |  [optional]
**userUrl** | **String** |  |  [optional]


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
OWNER | &quot;Owner&quot;
MANAGER | &quot;Manager&quot;
MEMBER | &quot;Member&quot;
COLLABORATOR | &quot;Collaborator&quot;



