

# OrganizationInviteExtend


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | The email of the user to be invited. |  [optional] |
|**expiresAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**inviter** | **String** |  |  [optional] [readonly] |
|**inviterUrl** | **URI** |  |  [optional] [readonly] |
|**org** | **String** |  |  [optional] [readonly] |
|**role** | **String** | The role to be assigned to the invited user. |  [optional] |
|**slugPerm** | **String** | The slug_perm of the invite to be extended. |  [optional] [readonly] |
|**teams** | [**List&lt;OrganizationTeamInvite&gt;**](OrganizationTeamInvite.md) |  |  [optional] |
|**user** | **String** | The slug of the user to be invited. |  [optional] |
|**userUrl** | **URI** |  |  [optional] [readonly] |


## Implemented Interfaces

* Serializable


