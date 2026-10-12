# PackageStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_cancellable** | **bool** |  | [optional] [readonly] 
**is_copyable** | **bool** |  | [optional] [readonly] 
**is_deleteable** | **bool** |  | [optional] [readonly] 
**is_downloadable** | **bool** |  | [optional] [readonly] 
**is_hidden** | **bool** |  | [optional] [readonly] 
**is_moveable** | **bool** |  | [optional] [readonly] 
**is_quarantinable** | **bool** |  | [optional] [readonly] 
**is_quarantined** | **bool** |  | [optional] [readonly] 
**is_resyncable** | **bool** |  | [optional] [readonly] 
**is_security_scannable** | **bool** |  | [optional] [readonly] 
**is_sync_awaiting** | **bool** |  | [optional] [readonly] 
**is_sync_completed** | **bool** |  | [optional] [readonly] 
**is_sync_failed** | **bool** |  | [optional] [readonly] 
**is_sync_in_flight** | **bool** |  | [optional] [readonly] 
**is_sync_in_progress** | **bool** |  | [optional] [readonly] 
**self_url** | **str** |  | [optional] [readonly] 
**stage** | **int** | The synchronisation (in progress) stage of the package. | [optional] [readonly] 
**stage_str** | **str** |  | [optional] [readonly] 
**stage_updated_at** | **datetime** | The datetime the package stage was updated at. | [optional] [readonly] 
**status** | **int** | The synchronisation status of the package. | [optional] [readonly] 
**status_reason** | **str** | A textual description for the synchronous status reason (if any | [optional] [readonly] 
**status_str** | **str** |  | [optional] [readonly] 
**status_updated_at** | **datetime** | The datetime the package status was updated at. | [optional] [readonly] 
**sync_finished_at** | **datetime** | The datetime the package sync was finished at. | [optional] [readonly] 
**sync_progress** | **int** | Synchronisation progress (from 0-100) | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.package_status import PackageStatus

# TODO update the JSON string below
json = "{}"
# create an instance of PackageStatus from a JSON string
package_status_instance = PackageStatus.from_json(json)
# print the JSON string representation of the object
print(PackageStatus.to_json())

# convert the object into a dict
package_status_dict = package_status_instance.to_dict()
# create an instance of PackageStatus from a dict
package_status_from_dict = PackageStatus.from_dict(package_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


