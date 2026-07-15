
# ConnectedRepository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the connection was created. |  [optional]
**disableReason** | [**DisableReasonEnum**](#DisableReasonEnum) |  |  [optional]
**disableReasonText** | **String** | Human-readable explanation of why this connection is disabled. |  [optional]
**isActive** | **Boolean** |  |  [optional]
**priority** | **java.math.BigInteger** | Repositories are checked in ascending order (starting at 1). If multiple repositories have the same priority, the oldest one is used first. |  [optional]
**slugPerm** | **String** |  |  [optional]
**targetRepository** | **String** | The slug of the target repository to connect to. | 


<a name="DisableReasonEnum"></a>
## Enum: DisableReasonEnum
Name | Value
---- | -----
N_A | &quot;N/A&quot;
THE_CONNECTION_CONTAINS_A_CIRCULAR_REFERENCE | &quot;The connection contains a circular reference&quot;



