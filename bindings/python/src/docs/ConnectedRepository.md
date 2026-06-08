# ConnectedRepository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** | The date and time when the connection was created. | [optional] 
**is_active** | **bool** |  | [optional] [default to True]
**priority** | **int** | Repositories are checked in ascending order (starting at 1). If multiple repositories have the same priority, the oldest one is used first. | [optional] 
**slug_perm** | **str** |  | [optional] 
**target_repository** | **str** | The slug of the target repository to connect to. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


