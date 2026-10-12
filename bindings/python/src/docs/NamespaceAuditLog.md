# NamespaceAuditLog


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actor** | **str** |  | 
**actor_ip_address** | **str** |  | 
**actor_kind** | **str** |  | [optional] [readonly] 
**actor_location** | [**GeoIpLocation**](GeoIpLocation.md) |  | 
**actor_slug_perm** | **str** |  | 
**actor_url** | **str** |  | [optional] [readonly] 
**context** | **str** |  | 
**event** | **str** |  | 
**event_at** | **datetime** |  | 
**object** | **str** |  | 
**object_kind** | **str** |  | 
**object_slug_perm** | **str** |  | 
**target** | **str** |  | 
**target_kind** | **str** |  | 
**target_slug_perm** | **str** |  | [optional] 
**uuid** | **UUID** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.namespace_audit_log import NamespaceAuditLog

# TODO update the JSON string below
json = "{}"
# create an instance of NamespaceAuditLog from a JSON string
namespace_audit_log_instance = NamespaceAuditLog.from_json(json)
# print the JSON string representation of the object
print(NamespaceAuditLog.to_json())

# convert the object into a dict
namespace_audit_log_dict = namespace_audit_log_instance.to_dict()
# create an instance of NamespaceAuditLog from a dict
namespace_audit_log_from_dict = NamespaceAuditLog.from_dict(namespace_audit_log_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


