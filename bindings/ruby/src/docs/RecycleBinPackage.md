# CloudsmithApi::RecycleBinPackage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_by** | **String** | The name of the user who deleted the package. | [optional] 
**downloads** | **Integer** |  | [optional] 
**filename** | **String** |  | [optional] 
**format** | **String** |  | [optional] 
**fully_qualified_name** | **String** | The fully qualified name of the package. | [optional] 
**identifiers** | **Hash&lt;String, String&gt;** |  | [optional] 
**invoked_retention_rule** | **Hash&lt;String, String&gt;** | Information about the retention rule that triggered deletion (if any). | [optional] 
**is_deleteable** | **BOOLEAN** |  | [optional] 
**is_quarantined** | **BOOLEAN** |  | [optional] 
**is_restorable** | **BOOLEAN** |  | [optional] 
**name** | **String** | The name of this package. | [optional] 
**policy_violated** | **BOOLEAN** | Whether or not the package has violated any policy. | [optional] 
**repository** | **String** |  | [optional] 
**security_scan_completed_at** | **DateTime** | The datetime the security scanning was completed. | [optional] 
**security_scan_status** | **String** |  | [optional] [default to &#39;Awaiting Security Scan&#39;]
**size** | **Integer** | The calculated size of the package. | [optional] 
**slug_perm** | **String** |  | [optional] 
**status** | **Integer** | The synchronisation status of the package. | [optional] 
**status_updated_at** | **DateTime** | The datetime the package status was updated at. | [optional] 
**tags** | [**Tags**](Tags.md) |  | [optional] 
**type_display** | **String** |  | [optional] 
**uploaded_at** | **DateTime** | The date this package was uploaded. | [optional] 
**uploader** | **String** |  | [optional] 
**version** | **String** | The raw version for this package. | [optional] 


