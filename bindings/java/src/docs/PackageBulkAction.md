
# PackageBulkAction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | The action to perform on the packages. | 
**identifiers** | **List&lt;String&gt;** | A list of package identifiers to apply the action to. | 
**repository** | **String** | The repository name to filter packages to. If not provided, the action will be performed across all accessible repositories in the workspace. |  [optional]
**targetRepository** | **String** | The slug of the target repository |  [optional]


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
DELETE | &quot;Delete&quot;
RESYNC | &quot;Resync&quot;
QUARANTINE | &quot;Quarantine&quot;
UNQUARANTINE | &quot;Unquarantine&quot;
MOVE | &quot;Move&quot;
COPY | &quot;Copy&quot;
RESCAN | &quot;Rescan&quot;



