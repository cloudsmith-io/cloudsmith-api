
# PackageRecycleBin

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | The action to perform on soft-deleted packages. | 
**identifiers** | **List&lt;String&gt;** | A list of soft-deleted package identifiers to action. | 
**repository** | **String** | The repository name to filter packages to. If not provided, the action will be performed across all accessible repositories in the workspace. |  [optional]


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
HARD_DELETE | &quot;hard_delete&quot;
RESTORE | &quot;restore&quot;



