
# OrganizationMembership

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** |  |  [optional]
**hasTwoFactor** | **Boolean** |  |  [optional]
**joinedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastLoginAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastLoginMethod** | [**LastLoginMethodEnum**](#LastLoginMethodEnum) |  |  [optional]
**role** | [**RoleEnum**](#RoleEnum) |  |  [optional]
**user** | **String** |  |  [optional]
**userId** | **String** |  |  [optional]
**userName** | **String** |  |  [optional]
**userUrl** | **String** |  |  [optional]
**visibility** | [**VisibilityEnum**](#VisibilityEnum) |  |  [optional]


<a name="LastLoginMethodEnum"></a>
## Enum: LastLoginMethodEnum
Name | Value
---- | -----
UNKNOWN | &quot;Unknown&quot;
PASSWORD | &quot;Password&quot;
SOCIAL | &quot;Social&quot;
SAML | &quot;SAML&quot;


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



