# CloudsmithApi::RecycleBinPackage

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **action_by** | **String** | The name of the user who deleted the package. | [optional][readonly] |
| **downloads** | **Integer** |  | [optional][readonly] |
| **filename** | **String** |  | [optional][readonly] |
| **format** | **String** |  | [optional][readonly] |
| **fully_qualified_name** | **String** | The fully qualified name of the package. | [optional][readonly] |
| **identifiers** | **Hash&lt;String, String&gt;** |  | [optional][readonly] |
| **invoked_retention_rule** | **Hash&lt;String, String&gt;** | Information about the retention rule that triggered deletion (if any). | [optional][readonly] |
| **is_deleteable** | **Boolean** |  | [optional][readonly] |
| **is_malware_detected** | **Boolean** | Whether the package has been detected as containing malware. Requires Ultra plan. | [optional][readonly] |
| **is_quarantined** | **Boolean** |  | [optional][readonly] |
| **is_restorable** | **Boolean** |  | [optional][readonly] |
| **name** | **String** | The name of this package. | [optional][readonly] |
| **policy_violated** | **Boolean** | Whether or not the package has violated any policy. | [optional][readonly] |
| **repository** | **String** |  | [optional][readonly] |
| **security_scan_completed_at** | **Time** | The datetime the security scanning was completed. | [optional][readonly] |
| **security_scan_status** | **String** |  | [optional][readonly] |
| **size** | **Integer** | The calculated size of the package. | [optional][readonly] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **status** | **Integer** | The synchronisation status of the package. | [optional][readonly] |
| **status_updated_at** | **Time** | The datetime the package status was updated at. | [optional][readonly] |
| **tags** | **Object** | All tags on the package, grouped by tag type. This includes immutable tags, but doesn&#39;t distinguish them from mutable. To see which tags are immutable specifically, see the tags_immutable field. | [optional] |
| **type_display** | **String** |  | [optional][readonly] |
| **uploaded_at** | **Time** | The date this package was uploaded. | [optional][readonly] |
| **uploader** | **String** |  | [optional][readonly] |
| **version** | **String** | The raw version for this package. | [optional][readonly] |
| **vulnerability_counts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RecycleBinPackage.new(
  action_by: null,
  downloads: null,
  filename: null,
  format: null,
  fully_qualified_name: null,
  identifiers: null,
  invoked_retention_rule: null,
  is_deleteable: null,
  is_malware_detected: null,
  is_quarantined: null,
  is_restorable: null,
  name: null,
  policy_violated: null,
  repository: null,
  security_scan_completed_at: null,
  security_scan_status: null,
  size: null,
  slug_perm: null,
  status: null,
  status_updated_at: null,
  tags: null,
  type_display: null,
  uploaded_at: null,
  uploader: null,
  version: null,
  vulnerability_counts: null
)
```

