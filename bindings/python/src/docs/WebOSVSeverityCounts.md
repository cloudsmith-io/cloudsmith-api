# WebOSVSeverityCounts

Per-severity OSV vulnerability counts for non-hidden matches. Requires Ultra plan.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**critical** | **int** |  | [optional] [readonly] 
**high** | **int** |  | [optional] [readonly] 
**low** | **int** |  | [optional] [readonly] 
**malware** | **int** |  | [optional] [readonly] 
**medium** | **int** |  | [optional] [readonly] 
**total** | **int** |  | [optional] [readonly] 
**unknown** | **int** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.web_osv_severity_counts import WebOSVSeverityCounts

# TODO update the JSON string below
json = "{}"
# create an instance of WebOSVSeverityCounts from a JSON string
web_osv_severity_counts_instance = WebOSVSeverityCounts.from_json(json)
# print the JSON string representation of the object
print(WebOSVSeverityCounts.to_json())

# convert the object into a dict
web_osv_severity_counts_dict = web_osv_severity_counts_instance.to_dict()
# create an instance of WebOSVSeverityCounts from a dict
web_osv_severity_counts_from_dict = WebOSVSeverityCounts.from_dict(web_osv_severity_counts_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


