

# Service


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**createdBy** | **String** |  |  [optional] [readonly] |
|**createdByUrl** | **URI** |  |  [optional] [readonly] |
|**description** | **String** | The description of the service |  [optional] |
|**key** | **String** | The API key of the service |  [optional] [readonly] |
|**keyExpiresAt** | **OffsetDateTime** | The time at which the API key will expire. This will only be populated if the Organization has an active API Key Policy. |  [optional] [readonly] |
|**name** | **String** | The name of the service |  [optional] |
|**role** | **String** | The role of the service. |  [optional] |
|**slug** | **String** | The slug of the service |  [optional] [readonly] |
|**teams** | [**List&lt;ServiceTeams&gt;**](ServiceTeams.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


