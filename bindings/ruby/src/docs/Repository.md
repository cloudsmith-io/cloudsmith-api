# CloudsmithApi::Repository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_open_source** | **BOOLEAN** |  | 
**repository_type_str** | **String** |  | [optional] 
**index_files** | **BOOLEAN** | If checked, files contained in packages will be indexed, which increase the synchronisation time required for packages. Note that it is recommended you keep this enabled unless the synchronisation time is significantly impacted. | [optional] 
**package_count** | **Integer** | The number of packages in the repository. | [optional] 
**deleted_at** | **String** |  | [optional] 
**repository_type** | **String** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Open-Source repositories are always visible to everyone and are restricted by licensing, but are free to use and come with generous bandwidth/storage. You can only select Open-Source at repository creation time. | [optional] 
**size** | **Integer** | The calculated size of the repository. | [optional] 
**cdn_url** | **String** |  | [optional] 
**namespace** | **String** |  | 
**self_html_url** | **String** |  | [optional] 
**namespace_url** | **String** |  | [optional] 
**gpg_keys** | [**Array&lt;ReposownerGpgKeys&gt;**](ReposownerGpgKeys.md) |  | [optional] 
**description** | **String** |  | 
**size_str** | **String** |  | [optional] 
**slug_perm** | **String** |  | [optional] 
**is_public** | **BOOLEAN** |  | 
**slug** | **String** | The slug identifies the repository in URIs. | [optional] 
**is_private** | **BOOLEAN** |  | 
**num_downloads** | **Integer** | The number of downloads for packages in the repository. | [optional] 
**self_url** | **String** |  | [optional] 
**name** | **String** | A descriptive name for the repository. | [optional] 
**created_at** | **String** |  | [optional] 
**package_group_count** | **Integer** | The number of groups in the repository. | [optional] 


