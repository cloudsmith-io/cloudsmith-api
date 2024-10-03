
# Service

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdBy** | **String** |  |  [optional]
**createdByUrl** | **String** |  |  [optional]
**description** | **String** | The description of the service |  [optional]
**key** | **String** | The API key of the service |  [optional]
**name** | **String** | The name of the service | 
**role** | [**RoleEnum**](#RoleEnum) | The role of the service. |  [optional]
**slug** | **String** | The slug of the service |  [optional]
**teams** | [**List&lt;ServiceTeams&gt;**](ServiceTeams.md) |  |  [optional]


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
MANAGER | &quot;Manager&quot;
MEMBER | &quot;Member&quot;



