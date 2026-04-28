# Service

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **String** |  | [optional] [default to null]
**created_by** | **String** |  | [optional] [default to null]
**created_by_url** | **String** |  | [optional] [default to null]
**description** | **String** | The description of the service | [optional] [default to null]
**key** | **String** | The API key of the service | [optional] [default to null]
**key_expires_at** | **String** | The time at which the API key will expire. This will only be populated if the Organization has an active API Key Policy. | [optional] [default to null]
**name** | **String** | The name of the service | [default to null]
**role** | **String** | The role of the service. | [optional] [default to null]
**slug** | **String** | The slug of the service | [optional] [default to null]
**teams** | [**Vec<::models::ServiceTeams>**](ServiceTeams.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


