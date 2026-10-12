

# PackageBulkActionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **String** | The action that was performed. |  [optional] [readonly] |
|**packagesActioned** | **List&lt;String&gt;** | List of package identifiers that were successfully actioned. |  [optional] [readonly] |
|**packagesFailedToAction** | **Map&lt;String, Map&lt;String, String&gt;&gt;** | Dictionary of package identifiers that failed with their error details. |  [optional] [readonly] |


## Implemented Interfaces

* Serializable


