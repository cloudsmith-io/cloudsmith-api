# RepositoryAuditLog


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actor** | **str** |  | [optional] 
**actor_ip_address** | **str** |  | [optional] 
**actor_kind** | **str** |  | [optional] [readonly] 
**actor_location** | [**GeoIpLocation**](GeoIpLocation.md) |  | [optional] 
**actor_slug_perm** | **str** |  | [optional] 
**actor_url** | **str** |  | [optional] [readonly] 
**context** | **str** |  | [optional] 
**event** | **str** |  | [optional] 
**event_at** | **datetime** |  | [optional] 
**object** | **str** |  | [optional] 
**object_kind** | **str** |  | [optional] 
**object_slug_perm** | **str** |  | [optional] 
**uuid** | **UUID** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.repository_audit_log import RepositoryAuditLog

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryAuditLog from a JSON string
repository_audit_log_instance = RepositoryAuditLog.from_json(json)
# print the JSON string representation of the object
print(RepositoryAuditLog.to_json())

# convert the object into a dict
repository_audit_log_dict = repository_audit_log_instance.to_dict()
# create an instance of RepositoryAuditLog from a dict
repository_audit_log_from_dict = RepositoryAuditLog.from_dict(repository_audit_log_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


