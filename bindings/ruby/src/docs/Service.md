# CloudsmithApi::Service

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **DateTime** |  | [optional] 
**created_by** | **String** |  | [optional] 
**created_by_url** | **String** |  | [optional] 
**description** | **String** | The description of the service | [optional] 
**key** | **String** | The API key of the service | [optional] 
**key_expires_at** | **DateTime** | The time at which the API key will expire. This will only be populated if the Organization has an active API Key Policy. | [optional] 
**name** | **String** | The name of the service | 
**role** | **String** | The role of the service. | [optional] [default to &#39;Member&#39;]
**slug** | **String** | The slug of the service | [optional] 
**teams** | [**Array&lt;ServiceTeams&gt;**](ServiceTeams.md) |  | [optional] 


