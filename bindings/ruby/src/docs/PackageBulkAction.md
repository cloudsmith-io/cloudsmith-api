# CloudsmithApi::PackageBulkAction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** | The action to perform on the packages. | 
**identifiers** | **Array&lt;String&gt;** | A list of package identifiers to apply the action to. | 
**repository** | **String** | The repository name to filter packages to. If not provided, the action will be performed across all accessible repositories in the workspace. | [optional] 
**target_repository** | **String** | The slug of the target repository | [optional] 


