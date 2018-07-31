# CloudsmithApi::Repository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cdn_url** | **String** |  | [optional] 
**created_at** | **String** |  | [optional] 
**deleted_at** | **String** |  | [optional] 
**description** | **String** |  | 
**gpg_keys** | [**Array&lt;ReposGpgKeys&gt;**](ReposGpgKeys.md) |  | [optional] 
**index_files** | **BOOLEAN** | If checked, files contained in packages will be indexed, which increase the synchronisation time required for packages. Note that it is recommended you keep this enabled unless the synchronisation time is significantly impacted. | [optional] 
**is_open_source** | **BOOLEAN** |  | 
**is_private** | **BOOLEAN** |  | 
**is_public** | **BOOLEAN** |  | 
**name** | **String** | A descriptive name for the repository. | [optional] 
**namespace** | **String** |  | 
**namespace_url** | **String** |  | [optional] 
**num_downloads** | **Integer** | The number of downloads for packages in the repository. | [optional] 
**package_count** | **Integer** | The number of packages in the repository. | [optional] 
**package_group_count** | **Integer** | The number of groups in the repository. | [optional] 
**repository_type** | **String** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Open-Source repositories are always visible to everyone and are restricted by licensing, but are free to use and come with generous bandwidth/storage. You can only select Open-Source at repository creation time. | [optional] 
**repository_type_str** | **String** |  | [optional] 
**self_html_url** | **String** |  | [optional] 
**self_url** | **String** |  | [optional] 
**size** | **Integer** | The calculated size of the repository. | [optional] 
**size_str** | **String** |  | [optional] 
**slug** | **String** | The slug identifies the repository in URIs. | [optional] 
**slug_perm** | **String** |  | [optional] 


