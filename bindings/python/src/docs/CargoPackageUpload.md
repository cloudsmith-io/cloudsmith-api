# CargoPackageUpload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**architectures** | [**List[Architecture]**](Architecture.md) |  | [optional] [readonly] 
**cdn_url** | **str** |  | [optional] [readonly] 
**checksum_md5** | **str** |  | [optional] [readonly] 
**checksum_sha1** | **str** |  | [optional] [readonly] 
**checksum_sha256** | **str** |  | [optional] [readonly] 
**checksum_sha512** | **str** |  | [optional] [readonly] 
**dependencies_checksum_md5** | **str** | A checksum of all of the package&#39;s dependencies. | [optional] [readonly] 
**dependencies_url** | **str** |  | [optional] [readonly] 
**description** | **str** | A textual description of this package. | [optional] [readonly] 
**display_name** | **str** |  | [optional] [readonly] 
**display_source** | **str** | Where the package originated, for example: &#39;upstream&#39; (proxied/cached from a configured upstream), &#39;connected_repository&#39; (blended in from a connected target repository), or &#39;manual_upload&#39; (uploaded directly to Cloudsmith). | [optional] [readonly] 
**distro** | [**Distribution**](Distribution.md) |  | [optional] 
**distro_version** | [**DistributionVersion**](DistributionVersion.md) |  | [optional] 
**downloads** | **int** |  | [optional] [readonly] 
**epoch** | **int** | The epoch of the package version (if any). | [optional] [readonly] 
**extension** | **str** |  | [optional] [readonly] 
**filename** | **str** |  | [optional] [readonly] 
**files** | [**List[PackageFile]**](PackageFile.md) |  | [optional] [readonly] 
**format** | **str** |  | [optional] [readonly] 
**format_url** | **str** |  | [optional] [readonly] 
**freeable_storage** | **int** | Amount of storage that will be freed if this package is deleted | [optional] [readonly] 
**fully_qualified_name** | **str** |  | [optional] [readonly] 
**identifier_perm** | **str** | Unique and permanent identifier for the package. | [optional] [readonly] 
**identifiers** | **Dict[str, Optional[str]]** | Return a map of identifier field names and their values. | [optional] [readonly] 
**indexed** | **bool** |  | [optional] [readonly] 
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
**license** | **str** | The license of this package. | [optional] [readonly] 
**name** | **str** | The name of this package. | [optional] [readonly] 
**namespace** | **str** |  | [optional] [readonly] 
**namespace_url** | **str** |  | [optional] [readonly] 
**num_files** | **int** |  | [optional] [readonly] 
**origin_repository** | **str** |  | [optional] [readonly] 
**origin_repository_url** | **str** |  | [optional] [readonly] 
**osi_approved** | **bool** | Whether the package&#39;s SPDX license is OSI-approved. | [optional] [readonly] 
**package_type** | **int** | The type of package contents. | [optional] [readonly] 
**policy_violated** | **bool** | Whether or not the package has violated any policy. | [optional] [readonly] 
**raw_license** | **str** | The raw license string. | [optional] [readonly] 
**release** | **str** | The release of the package version (if any). | [optional] [readonly] 
**repository** | **str** |  | [optional] [readonly] 
**repository_url** | **str** |  | [optional] [readonly] 
**security_scan_completed_at** | **datetime** | The datetime the security scanning was completed. | [optional] [readonly] 
**security_scan_started_at** | **datetime** | The datetime the security scanning was started. | [optional] [readonly] 
**security_scan_status** | **str** |  | [optional] [readonly] 
**security_scan_status_updated_at** | **datetime** | The datetime the security scanning status was updated. | [optional] [readonly] 
**self_html_url** | **str** |  | [optional] [readonly] 
**self_url** | **str** |  | [optional] [readonly] 
**self_webapp_url** | **str** |  | [optional] [readonly] 
**signature_url** | **str** |  | [optional] [readonly] 
**size** | **int** | The calculated size of the package. | [optional] [readonly] 
**slug** | **str** | The public unique identifier for the package. | [optional] [readonly] 
**slug_perm** | **str** |  | [optional] [readonly] 
**spdx_license** | **str** | The SPDX license identifier for this package. | [optional] [readonly] 
**stage** | **int** | The synchronisation (in progress) stage of the package. | [optional] [readonly] 
**stage_str** | **str** |  | [optional] [readonly] 
**stage_updated_at** | **datetime** | The datetime the package stage was updated at. | [optional] [readonly] 
**status** | **int** | The synchronisation status of the package. | [optional] [readonly] 
**status_reason** | **str** | A textual description for the synchronous status reason (if any | [optional] [readonly] 
**status_str** | **str** |  | [optional] [readonly] 
**status_updated_at** | **datetime** | The datetime the package status was updated at. | [optional] [readonly] 
**status_url** | **str** |  | [optional] [readonly] 
**store_path** | **str** | Absolute store path for the package, including store hash and name. | [optional] [readonly] 
**subtype** | **str** |  | [optional] [readonly] 
**summary** | **str** | A one-liner synopsis of this package. | [optional] [readonly] 
**sync_finished_at** | **datetime** | The datetime the package sync was finished at. | [optional] [readonly] 
**sync_progress** | **int** | Synchronisation progress (from 0-100) | [optional] [readonly] 
**tags_automatic** | **object** | All tags on the package, grouped by tag type. This includes immutable tags, but doesn&#39;t distinguish them from mutable. To see which tags are immutable specifically, see the tags_immutable field. | [optional] 
**tags_immutable** | **object** | All tags on the package, grouped by tag type. This includes immutable tags, but doesn&#39;t distinguish them from mutable. To see which tags are immutable specifically, see the tags_immutable field. | [optional] 
**tags_static** | **Dict[str, List[str]]** | All static tags on the package, grouped by context. Static tags are derived from the package&#39;s properties at request time and carry a &#39;context&#39; (rather than a tag type). Includes format-specific badges and the package&#39;s architecture, subtype, and extension. | [optional] [readonly] 
**type_display** | **str** |  | [optional] [readonly] 
**uploaded_at** | **datetime** | The date this package was uploaded. | [optional] [readonly] 
**uploader** | **str** |  | [optional] [readonly] 
**uploader_url** | **str** |  | [optional] [readonly] 
**version** | **str** | The raw version for this package. | [optional] [readonly] 
**version_orig** | **str** |  | [optional] [readonly] 
**vulnerability_scan_results_url** | **str** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.cargo_package_upload import CargoPackageUpload

# TODO update the JSON string below
json = "{}"
# create an instance of CargoPackageUpload from a JSON string
cargo_package_upload_instance = CargoPackageUpload.from_json(json)
# print the JSON string representation of the object
print(CargoPackageUpload.to_json())

# convert the object into a dict
cargo_package_upload_dict = cargo_package_upload_instance.to_dict()
# create an instance of CargoPackageUpload from a dict
cargo_package_upload_from_dict = CargoPackageUpload.from_dict(cargo_package_upload_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


