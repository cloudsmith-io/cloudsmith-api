# CloudsmithApi::PackageBulkActionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** | The action that was performed. | [optional] 
**packages_actioned** | **Array&lt;String&gt;** | List of package identifiers that were successfully actioned. | [optional] 
**packages_failed_to_action** | **Hash&lt;String, Hash&lt;String, String&gt;&gt;** | Dictionary of package identifiers that failed with their error details. | [optional] 


