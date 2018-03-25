# Repository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_open_source** | **bool** |  | 
**repository_type_str** | **str** |  | [optional] 
**index_files** | **bool** | If checked, files contained in packages will be indexed, which increase the synchronisation time required for packages. Note that it is recommended you keep this enabled unless the synchronisation time is significantly impacted. | [optional] 
**package_count** | **int** | The number of packages in the repository. | [optional] 
**deleted_at** | **str** |  | [optional] 
**repository_type** | **str** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Open-Source repositories are always visible to everyone and are restricted by licensing, but are free to use and come with generous bandwidth/storage. You can only select Open-Source at repository creation time. | [optional] 
**size** | **int** | The calculated size of the repository. | [optional] 
**cdn_url** | **str** |  | [optional] 
**namespace** | **str** |  | 
**self_html_url** | **str** |  | [optional] 
**namespace_url** | **str** |  | [optional] 
**gpg_keys** | [**list[ReposownerGpgKeys]**](ReposownerGpgKeys.md) |  | [optional] 
**description** | **str** |  | 
**size_str** | **str** |  | [optional] 
**slug_perm** | **str** |  | [optional] 
**is_public** | **bool** |  | 
**slug** | **str** | The slug identifies the repository in URIs. | [optional] 
**is_private** | **bool** |  | 
**num_downloads** | **int** | The number of downloads for packages in the repository. | [optional] 
**self_url** | **str** |  | [optional] 
**name** | **str** | A descriptive name for the repository. | [optional] 
**created_at** | **str** |  | [optional] 
**package_group_count** | **int** | The number of groups in the repository. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


