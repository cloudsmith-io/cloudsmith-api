# CloudsmithApi::ConnectedRepository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **DateTime** | The date and time when the connection was created. | [optional] 
**is_active** | **BOOLEAN** |  | [optional] [default to true]
**priority** | **Integer** | Repositories are checked in ascending order (starting at 1). If multiple repositories have the same priority, the oldest one is used first. | [optional] 
**slug_perm** | **String** |  | [optional] 
**target_repository** | **String** | The slug of the target repository to connect to. | 


