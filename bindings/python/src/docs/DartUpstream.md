# DartUpstream


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auth_mode** | **str** | The authentication mode to use when accessing this upstream.  | [optional] [default to 'None']
**auth_secret** | **str** | Secret to provide with requests to upstream. | [optional] 
**auth_username** | **str** | Username to provide with requests to upstream. | [optional] 
**available** | **bool** | Whether the upstream is available for use. | [optional] [readonly] 
**can_reindex** | **bool** | Whether the upstream can be reindexed. | [optional] [readonly] 
**created_at** | **datetime** | The datetime the upstream source was created. | [optional] [readonly] 
**disable_reason** | **str** |  | [optional] [readonly] [default to 'N/A']
**disable_reason_text** | **str** | Human-readable explanation of why this upstream is disabled | [optional] [readonly] 
**extra_header_1** | **str** | The key for extra header #1 to send to upstream. | [optional] 
**extra_header_2** | **str** | The key for extra header #2 to send to upstream. | [optional] 
**extra_value_1** | **str** | The value for extra header #1 to send to upstream. This is stored as plaintext, and is NOT encrypted. | [optional] 
**extra_value_2** | **str** | The value for extra header #2 to send to upstream. This is stored as plaintext, and is NOT encrypted. | [optional] 
**has_failed_signature_verification** | **bool** | Whether the upstream has failed signature verification. | [optional] [readonly] 
**index_package_count** | **int** | The number of packages available in this upstream source | [optional] [readonly] 
**index_status** | **str** | The current indexing status of this upstream source | [optional] [readonly] 
**is_active** | **bool** | Whether or not this upstream is active and ready for requests. | [optional] 
**last_indexed** | **str** | The last time this upstream source was indexed | [optional] [readonly] 
**mode** | **str** | The mode that this upstream should operate in. Upstream sources can be used to proxy resolved packages, as well as operate in a proxy/cache or cache only mode. | [optional] [default to 'Proxy Only']
**name** | **str** | A descriptive name for this upstream source. A shortened version of this name will be used for tagging cached packages retrieved from this upstream. | 
**pending_validation** | **bool** | When true, this upstream source is pending validation. | [optional] [readonly] 
**priority** | **int** | Upstream sources are selected for resolving requests by sequential order (1..n), followed by creation date. | [optional] 
**slug_perm** | **str** |  | [optional] [readonly] 
**updated_at** | **datetime** |  | [optional] [readonly] 
**upstream_url** | **str** | The URL for this upstream source. This must be a fully qualified URL including any path elements required to reach the root of the repository.  | 
**verify_ssl** | **bool** | If enabled, SSL certificates are verified when requests are made to this upstream. It&#39;s recommended to leave this enabled for all public sources to help mitigate Man-In-The-Middle (MITM) attacks. Please note this only applies to HTTPS upstreams. | [optional] 

## Example

```python
from cloudsmith_api.models.dart_upstream import DartUpstream

# TODO update the JSON string below
json = "{}"
# create an instance of DartUpstream from a JSON string
dart_upstream_instance = DartUpstream.from_json(json)
# print the JSON string representation of the object
print(DartUpstream.to_json())

# convert the object into a dict
dart_upstream_dict = dart_upstream_instance.to_dict()
# create an instance of DartUpstream from a dict
dart_upstream_from_dict = DartUpstream.from_dict(dart_upstream_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


