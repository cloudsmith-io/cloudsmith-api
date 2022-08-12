
# OrganizationMembership

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** |  |  [optional]
**hasTwoFactor** | **Boolean** |  |  [optional]
**joinedAt** | **String** |  |  [optional]
**lastLoginAt** | **String** |  |  [optional]
**role** | [**RoleEnum**](#RoleEnum) |  |  [optional]
**user** | **String** |  |  [optional]
**userId** | **String** |  |  [optional]
**userName** | **String** |  |  [optional]
**userUrl** | **String** |  |  [optional]
**visibility** | [**VisibilityEnum**](#VisibilityEnum) |  |  [optional]


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
OWNER | &quot;Owner&quot;
MANAGER | &quot;Manager&quot;
MEMBER | &quot;Member&quot;
COLLABORATOR | &quot;Collaborator&quot;


<a name="VisibilityEnum"></a>
## Enum: VisibilityEnum
Name | Value
---- | -----
PUBLIC | &quot;Public&quot;
PRIVATE | &quot;Private&quot;



