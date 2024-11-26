# Service

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | [optional] 
**created_by** | **str** |  | [optional] 
**created_by_url** | **str** |  | [optional] 
**description** | **str** | The description of the service | [optional] 
**key** | **str** | The API key of the service | [optional] 
**key_expires_at** | **datetime** | The time at which the API key will expire. This will only be populated if the Organization has an active API Key Policy. | [optional] 
**name** | **str** | The name of the service | 
**role** | **str** | The role of the service. | [optional] [default to 'Member']
**slug** | **str** | The slug of the service | [optional] 
**teams** | [**list[ServiceTeams]**](ServiceTeams.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


