
# PackageDenyPolicy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**description** | **String** |  |  [optional]
**enabled** | **Boolean** | Whether this rule is enabled or disabled. |  [optional]
**name** | **String** |  |  [optional]
**packageQueryString** | **String** | Packages that match this query will trigger this deny rule. | 
**slugPerm** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
BLOCK_DOWNLOADS | &quot;Block downloads&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;Pending&quot;
IN_PROGRESS | &quot;In Progress&quot;
COMPLETE | &quot;Complete&quot;
CANCELLED | &quot;Cancelled&quot;
ERRORED | &quot;Errored&quot;



