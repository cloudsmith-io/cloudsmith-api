
# OrganizationInviteRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | The email of the user to be invited. |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | The role to be assigned to the invited user. |  [optional]
**user** | **String** | The slug of the user to be invited. |  [optional]


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
OWNER | &quot;Owner&quot;
MANAGER | &quot;Manager&quot;
MEMBER | &quot;Member&quot;
COLLABORATOR | &quot;Collaborator&quot;



