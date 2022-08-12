
# PackagesTag

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | None |  [optional]
**isImmutable** | **Boolean** | If true, created tags will be immutable. An immutable flag is a tag that cannot be removed from a package. |  [optional]
**tags** | **List&lt;String&gt;** | A list of tags to apply the action to. Not required for clears. |  [optional]


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
ADD | &quot;add&quot;
CLEAR | &quot;clear&quot;
REMOVE | &quot;remove&quot;
REPLACE | &quot;replace&quot;



