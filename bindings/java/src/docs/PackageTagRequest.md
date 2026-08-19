
# PackageTagRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) |  |  [optional]
**isImmutable** | **Boolean** | If true, created tags will be immutable. An immutable flag is a tag that cannot be removed from a package. |  [optional]
**isMalwareDetected** | **Boolean** | Whether the package has been detected as containing malware. Requires Ultra plan. |  [optional]
**tags** | **List&lt;String&gt;** | A list of tags to apply the action to. Not required for clears. |  [optional]
**vulnerabilityCounts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  |  [optional]


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
ADD | &quot;Add&quot;
CLEAR | &quot;Clear&quot;
REPLACE | &quot;Replace&quot;
REMOVE | &quot;Remove&quot;



