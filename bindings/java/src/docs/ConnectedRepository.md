
# ConnectedRepository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canViewTargetRepositorySettings** | **Boolean** | Whether the current user has permission to view the target repository&#39;s settings. When false, &#x60;configured_upstreams&#x60; will be empty even if upstreams are configured. |  [optional]
**configuredUpstreams** | [**List&lt;ConnectedRepositoryUpstream&gt;**](ConnectedRepositoryUpstream.md) | The upstream sources configured on the target repository, used to display which formats/upstreams the connection exposes. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the connection was created. |  [optional]
**disableReason** | [**DisableReasonEnum**](#DisableReasonEnum) |  |  [optional]
**disableReasonText** | **String** | Human-readable explanation of why this connection is disabled. |  [optional]
**isActive** | **Boolean** |  |  [optional]
**priority** | **java.math.BigInteger** | Repositories are checked in ascending order (starting at 1). If multiple repositories have the same priority, the oldest one is used first. |  [optional]
**slugPerm** | **String** |  |  [optional]
**targetRepository** | **String** | The slug of the target repository to connect to. | 
**targetRepositorySummary** | [**ConnectedRepositoryTargetSummary**](ConnectedRepositoryTargetSummary.md) |  |  [optional]


<a name="DisableReasonEnum"></a>
## Enum: DisableReasonEnum
Name | Value
---- | -----
N_A | &quot;N/A&quot;
THE_CONNECTION_CONTAINS_A_CIRCULAR_REFERENCE | &quot;The connection contains a circular reference&quot;



