# DebUpstream


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auth_mode** | **str** | The authentication mode to use when accessing this upstream.  | [optional] 
**auth_secret** | **str** | Secret to provide with requests to upstream. | [optional] 
**auth_username** | **str** | Username to provide with requests to upstream. | [optional] 
**available** | **bool** | Whether the upstream is available for use. | [optional] [readonly] 
**can_reindex** | **bool** | Whether the upstream can be reindexed. | [optional] [readonly] 
**component** | **str** | The component to fetch from the upstream | [optional] 
**created_at** | **datetime** | The datetime the upstream source was created. | [optional] [readonly] 
**disable_reason** | **str** |  | [optional] [readonly] 
**disable_reason_text** | **str** | Human-readable explanation of why this upstream is disabled | [optional] [readonly] 
**distro_versions** | **List[str]** | The distribution version that packages found on this upstream could be associated with. | [optional] 
**extra_header_1** | **str** | The key for extra header #1 to send to upstream. | [optional] 
**extra_header_2** | **str** | The key for extra header #2 to send to upstream. | [optional] 
**extra_value_1** | **str** | The value for extra header #1 to send to upstream. This is stored as plaintext, and is NOT encrypted. | [optional] 
**extra_value_2** | **str** | The value for extra header #2 to send to upstream. This is stored as plaintext, and is NOT encrypted. | [optional] 
**gpg_key_fingerprint_short** | **str** |  | [optional] [readonly] 
**gpg_key_inline** | **str** | A public GPG key to associate with packages found on this upstream. When using the Cloudsmith setup script, this GPG key will be automatically imported on your deployment machines to allow upstream packages to validate and install. | [optional] 
**gpg_key_url** | **str** | When provided, Cloudsmith will fetch, validate, and associate a public GPG key found at the provided URL. When using the Cloudsmith setup script, this GPG key will be automatically imported on your deployment machines to allow upstream packages to validate and install. | [optional] 
**gpg_verification** | **str** | The GPG signature verification mode for this upstream. | [optional] 
**has_failed_signature_verification** | **bool** | Whether the upstream has failed signature verification. | [optional] [readonly] 
**include_sources** | **bool** | When true, source packages will be available from this upstream. | [optional] 
**index_package_count** | **int** | The number of packages available in this upstream source | [optional] [readonly] 
**index_status** | **str** | The current indexing status of this upstream source | [optional] [readonly] 
**is_active** | **bool** | Whether or not this upstream is active and ready for requests. | [optional] 
**last_indexed** | **str** | The last time this upstream source was indexed | [optional] [readonly] 
**mode** | **str** | The mode that this upstream should operate in. Upstream sources can be used to proxy resolved packages, as well as operate in a proxy/cache or cache only mode. | [optional] 
**name** | **str** | A descriptive name for this upstream source. A shortened version of this name will be used for tagging cached packages retrieved from this upstream. | [optional] 
**pending_validation** | **bool** | When true, this upstream source is pending validation. | [optional] [readonly] 
**priority** | **int** | Upstream sources are selected for resolving requests by sequential order (1..n), followed by creation date. | [optional] 
**slug_perm** | **str** |  | [optional] [readonly] 
**updated_at** | **datetime** |  | [optional] [readonly] 
**upstream_distribution** | **str** | The distribution to fetch from the upstream | [optional] 
**upstream_url** | **str** | The URL for this upstream source. This must be a fully qualified URL including any path elements required to reach the root of the repository.  | [optional] 
**verification_status** | **str** | The signature verification status for this upstream. | [optional] [readonly] 
**verify_ssl** | **bool** | If enabled, SSL certificates are verified when requests are made to this upstream. It&#39;s recommended to leave this enabled for all public sources to help mitigate Man-In-The-Middle (MITM) attacks. Please note this only applies to HTTPS upstreams. | [optional] 

## Example

```python
from cloudsmith_api.models.deb_upstream import DebUpstream

# TODO update the JSON string below
json = "{}"
# create an instance of DebUpstream from a JSON string
deb_upstream_instance = DebUpstream.from_json(json)
# print the JSON string representation of the object
print(DebUpstream.to_json())

# convert the object into a dict
deb_upstream_dict = deb_upstream_instance.to_dict()
# create an instance of DebUpstream from a dict
deb_upstream_from_dict = DebUpstream.from_dict(deb_upstream_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


