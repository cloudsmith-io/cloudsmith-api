# CloudsmithApi::ConnectedRepository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **DateTime** | The date and time when the connection was created. | [optional] 
**disable_reason** | **String** |  | [optional] [default to &#39;N/A&#39;]
**disable_reason_text** | **String** | Human-readable explanation of why this connection is disabled. | [optional] 
**is_active** | **BOOLEAN** |  | [optional] [default to false]
**priority** | **Integer** | Repositories are checked in ascending order (starting at 1). If multiple repositories have the same priority, the oldest one is used first. | [optional] 
**slug_perm** | **String** |  | [optional] 
**target_repository** | **String** | The slug of the target repository to connect to. | 


