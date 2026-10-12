

# ConnectedRepository


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canViewTargetRepositorySettings** | **Boolean** | Whether the current user has permission to view the target repository&#39;s settings. When false, &#x60;configured_upstreams&#x60; will be empty even if upstreams are configured. |  [optional] [readonly] |
|**configuredUpstreams** | [**List&lt;ConnectedRepositoryUpstream&gt;**](ConnectedRepositoryUpstream.md) | The upstream sources configured on the target repository, used to display which formats/upstreams the connection exposes. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | The date and time when the connection was created. |  [optional] [readonly] |
|**disableReason** | **String** |  |  [optional] [readonly] |
|**disableReasonText** | **String** | Human-readable explanation of why this connection is disabled. |  [optional] [readonly] |
|**isActive** | **Boolean** |  |  [optional] |
|**priority** | **java.math.BigInteger** | Repositories are checked in ascending order (starting at 1). If multiple repositories have the same priority, the oldest one is used first. |  [optional] |
|**slugPerm** | **String** |  |  [optional] [readonly] |
|**targetRepository** | **String** | The slug of the target repository to connect to. |  [optional] |
|**targetRepositorySummary** | [**ConnectedRepositoryTargetSummary**](ConnectedRepositoryTargetSummary.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


