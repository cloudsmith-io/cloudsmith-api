# ConnectedRepository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** | The date and time when the connection was created. | [optional] 
**disable_reason** | **str** |  | [optional] [default to 'N/A']
**disable_reason_text** | **str** | Human-readable explanation of why this connection is disabled. | [optional] 
**is_active** | **bool** |  | [optional] [default to False]
**priority** | **int** | Repositories are checked in ascending order (starting at 1). If multiple repositories have the same priority, the oldest one is used first. | [optional] 
**slug_perm** | **str** |  | [optional] 
**target_repository** | **str** | The slug of the target repository to connect to. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


