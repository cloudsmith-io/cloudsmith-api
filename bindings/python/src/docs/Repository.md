# Repository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cdn_url** | **str** |  | [optional] 
**created_at** | **str** |  | [optional] 
**deleted_at** | **str** |  | [optional] 
**description** | **str** |  | 
**gpg_keys** | [**list[ReposGpgKeys]**](ReposGpgKeys.md) |  | [optional] 
**index_files** | **bool** | If checked, files contained in packages will be indexed, which increase the synchronisation time required for packages. Note that it is recommended you keep this enabled unless the synchronisation time is significantly impacted. | [optional] 
**is_open_source** | **bool** |  | 
**is_private** | **bool** |  | 
**is_public** | **bool** |  | 
**name** | **str** | A descriptive name for the repository. | [optional] 
**namespace** | **str** |  | 
**namespace_url** | **str** |  | [optional] 
**num_downloads** | **int** | The number of downloads for packages in the repository. | [optional] 
**package_count** | **int** | The number of packages in the repository. | [optional] 
**package_group_count** | **int** | The number of groups in the repository. | [optional] 
**repository_type** | **int** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Open-Source repositories are always visible to everyone and are restricted by licensing, but are free to use and come with generous bandwidth/storage. You can only select Open-Source at repository creation time. | [optional] 
**repository_type_str** | **str** |  | [optional] 
**self_html_url** | **str** |  | [optional] 
**self_url** | **str** |  | [optional] 
**size** | **int** | The calculated size of the repository. | [optional] 
**size_str** | **str** |  | [optional] 
**slug** | **str** | The slug identifies the repository in URIs. | [optional] 
**slug_perm** | **str** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


