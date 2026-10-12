# CloudsmithApi::McpPackageUpload

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **architectures** | [**Array&lt;Architecture&gt;**](Architecture.md) |  | [optional][readonly] |
| **cdn_url** | **String** |  | [optional][readonly] |
| **checksum_md5** | **String** |  | [optional][readonly] |
| **checksum_sha1** | **String** |  | [optional][readonly] |
| **checksum_sha256** | **String** |  | [optional][readonly] |
| **checksum_sha512** | **String** |  | [optional][readonly] |
| **dependencies_checksum_md5** | **String** | A checksum of all of the package&#39;s dependencies. | [optional][readonly] |
| **dependencies_url** | **String** |  | [optional][readonly] |
| **description** | **String** | A textual description of this package. | [optional][readonly] |
| **display_name** | **String** |  | [optional][readonly] |
| **display_source** | **String** | Where the package originated, for example: &#39;upstream&#39; (proxied/cached from a configured upstream), &#39;connected_repository&#39; (blended in from a connected target repository), or &#39;manual_upload&#39; (uploaded directly to Cloudsmith). | [optional][readonly] |
| **distro** | [**Distribution**](Distribution.md) |  | [optional] |
| **distro_version** | [**DistributionVersion**](DistributionVersion.md) |  | [optional] |
| **downloads** | **Integer** |  | [optional][readonly] |
| **epoch** | **Integer** | The epoch of the package version (if any). | [optional][readonly] |
| **extension** | **String** |  | [optional][readonly] |
| **filename** | **String** |  | [optional][readonly] |
| **files** | [**Array&lt;PackageFile&gt;**](PackageFile.md) |  | [optional][readonly] |
| **format** | **String** |  | [optional][readonly] |
| **format_url** | **String** |  | [optional][readonly] |
| **freeable_storage** | **Integer** | Amount of storage that will be freed if this package is deleted | [optional][readonly] |
| **fully_qualified_name** | **String** |  | [optional][readonly] |
| **identifier_perm** | **String** | Unique and permanent identifier for the package. | [optional][readonly] |
| **identifiers** | **Hash&lt;String, String&gt;** | Return a map of identifier field names and their values. | [optional][readonly] |
| **indexed** | **Boolean** |  | [optional][readonly] |
| **is_cancellable** | **Boolean** |  | [optional][readonly] |
| **is_copyable** | **Boolean** |  | [optional][readonly] |
| **is_deleteable** | **Boolean** |  | [optional][readonly] |
| **is_downloadable** | **Boolean** |  | [optional][readonly] |
| **is_hidden** | **Boolean** |  | [optional][readonly] |
| **is_moveable** | **Boolean** |  | [optional][readonly] |
| **is_quarantinable** | **Boolean** |  | [optional][readonly] |
| **is_quarantined** | **Boolean** |  | [optional][readonly] |
| **is_resyncable** | **Boolean** |  | [optional][readonly] |
| **is_security_scannable** | **Boolean** |  | [optional][readonly] |
| **is_sync_awaiting** | **Boolean** |  | [optional][readonly] |
| **is_sync_completed** | **Boolean** |  | [optional][readonly] |
| **is_sync_failed** | **Boolean** |  | [optional][readonly] |
| **is_sync_in_flight** | **Boolean** |  | [optional][readonly] |
| **is_sync_in_progress** | **Boolean** |  | [optional][readonly] |
| **license** | **String** | The license of this package. | [optional][readonly] |
| **name** | **String** | The name of this package. | [optional][readonly] |
| **namespace** | **String** |  | [optional][readonly] |
| **namespace_url** | **String** |  | [optional][readonly] |
| **num_files** | **Integer** |  | [optional][readonly] |
| **origin_repository** | **String** |  | [optional][readonly] |
| **origin_repository_url** | **String** |  | [optional][readonly] |
| **osi_approved** | **Boolean** | Whether the package&#39;s SPDX license is OSI-approved. | [optional][readonly] |
| **package_type** | **Integer** | The type of package contents. | [optional][readonly] |
| **policy_violated** | **Boolean** | Whether or not the package has violated any policy. | [optional][readonly] |
| **raw_license** | **String** | The raw license string. | [optional][readonly] |
| **release** | **String** | The release of the package version (if any). | [optional][readonly] |
| **repository** | **String** |  | [optional][readonly] |
| **repository_url** | **String** |  | [optional][readonly] |
| **security_scan_completed_at** | **Time** | The datetime the security scanning was completed. | [optional][readonly] |
| **security_scan_started_at** | **Time** | The datetime the security scanning was started. | [optional][readonly] |
| **security_scan_status** | **String** |  | [optional][readonly] |
| **security_scan_status_updated_at** | **Time** | The datetime the security scanning status was updated. | [optional][readonly] |
| **self_html_url** | **String** |  | [optional][readonly] |
| **self_url** | **String** |  | [optional][readonly] |
| **self_webapp_url** | **String** |  | [optional][readonly] |
| **signature_url** | **String** |  | [optional][readonly] |
| **size** | **Integer** | The calculated size of the package. | [optional][readonly] |
| **slug** | **String** | The public unique identifier for the package. | [optional][readonly] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **spdx_license** | **String** | The SPDX license identifier for this package. | [optional][readonly] |
| **stage** | **Integer** | The synchronisation (in progress) stage of the package. | [optional][readonly] |
| **stage_str** | **String** |  | [optional][readonly] |
| **stage_updated_at** | **Time** | The datetime the package stage was updated at. | [optional][readonly] |
| **status** | **Integer** | The synchronisation status of the package. | [optional][readonly] |
| **status_reason** | **String** | A textual description for the synchronous status reason (if any | [optional][readonly] |
| **status_str** | **String** |  | [optional][readonly] |
| **status_updated_at** | **Time** | The datetime the package status was updated at. | [optional][readonly] |
| **status_url** | **String** |  | [optional][readonly] |
| **store_path** | **String** | Absolute store path for the package, including store hash and name. | [optional][readonly] |
| **subtype** | **String** |  | [optional][readonly] |
| **summary** | **String** | A one-liner synopsis of this package. | [optional][readonly] |
| **sync_finished_at** | **Time** | The datetime the package sync was finished at. | [optional][readonly] |
| **sync_progress** | **Integer** | Synchronisation progress (from 0-100) | [optional][readonly] |
| **tags_automatic** | **Object** | All tags on the package, grouped by tag type. This includes immutable tags, but doesn&#39;t distinguish them from mutable. To see which tags are immutable specifically, see the tags_immutable field. | [optional] |
| **tags_immutable** | **Object** | All tags on the package, grouped by tag type. This includes immutable tags, but doesn&#39;t distinguish them from mutable. To see which tags are immutable specifically, see the tags_immutable field. | [optional] |
| **tags_static** | **Hash&lt;String, Array&lt;String&gt;&gt;** | All static tags on the package, grouped by context. Static tags are derived from the package&#39;s properties at request time and carry a &#39;context&#39; (rather than a tag type). Includes format-specific badges and the package&#39;s architecture, subtype, and extension. | [optional][readonly] |
| **type_display** | **String** |  | [optional][readonly] |
| **uploaded_at** | **Time** | The date this package was uploaded. | [optional][readonly] |
| **uploader** | **String** |  | [optional][readonly] |
| **uploader_url** | **String** |  | [optional][readonly] |
| **version** | **String** | The raw version for this package. | [optional] |
| **version_orig** | **String** |  | [optional][readonly] |
| **vulnerability_scan_results_url** | **String** |  | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::McpPackageUpload.new(
  architectures: null,
  cdn_url: null,
  checksum_md5: null,
  checksum_sha1: null,
  checksum_sha256: null,
  checksum_sha512: null,
  dependencies_checksum_md5: null,
  dependencies_url: null,
  description: null,
  display_name: null,
  display_source: null,
  distro: null,
  distro_version: null,
  downloads: null,
  epoch: null,
  extension: null,
  filename: null,
  files: null,
  format: null,
  format_url: null,
  freeable_storage: null,
  fully_qualified_name: null,
  identifier_perm: null,
  identifiers: null,
  indexed: null,
  is_cancellable: null,
  is_copyable: null,
  is_deleteable: null,
  is_downloadable: null,
  is_hidden: null,
  is_moveable: null,
  is_quarantinable: null,
  is_quarantined: null,
  is_resyncable: null,
  is_security_scannable: null,
  is_sync_awaiting: null,
  is_sync_completed: null,
  is_sync_failed: null,
  is_sync_in_flight: null,
  is_sync_in_progress: null,
  license: null,
  name: null,
  namespace: null,
  namespace_url: null,
  num_files: null,
  origin_repository: null,
  origin_repository_url: null,
  osi_approved: null,
  package_type: null,
  policy_violated: null,
  raw_license: null,
  release: null,
  repository: null,
  repository_url: null,
  security_scan_completed_at: null,
  security_scan_started_at: null,
  security_scan_status: null,
  security_scan_status_updated_at: null,
  self_html_url: null,
  self_url: null,
  self_webapp_url: null,
  signature_url: null,
  size: null,
  slug: null,
  slug_perm: null,
  spdx_license: null,
  stage: null,
  stage_str: null,
  stage_updated_at: null,
  status: null,
  status_reason: null,
  status_str: null,
  status_updated_at: null,
  status_url: null,
  store_path: null,
  subtype: null,
  summary: null,
  sync_finished_at: null,
  sync_progress: null,
  tags_automatic: null,
  tags_immutable: null,
  tags_static: null,
  type_display: null,
  uploaded_at: null,
  uploader: null,
  uploader_url: null,
  version: null,
  version_orig: null,
  vulnerability_scan_results_url: null
)
```

