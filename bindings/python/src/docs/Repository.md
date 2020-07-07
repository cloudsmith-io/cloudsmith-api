# Repository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cdn_url** | **str** | Base URL from which packages and other artifacts are downloaded. | [optional] 
**created_at** | **str** |  | [optional] 
**deleted_at** | **str** |  | [optional] 
**description** | **str** | A description of the repository&#39;s purpose/contents. | [optional] 
**gpg_keys** | [**list[ReposGpgKeys]**](ReposGpgKeys.md) |  | [optional] 
**index_files** | **bool** | If checked, files contained in packages will be indexed, which increase the synchronisation time required for packages. Note that it is recommended you keep this enabled unless the synchronisation time is significantly impacted. | [optional] 
**is_open_source** | **bool** |  | [optional] 
**is_private** | **bool** |  | [optional] 
**is_public** | **bool** |  | [optional] 
**name** | **str** | A descriptive name for the repository. | 
**namespace** | **str** | Namespace to which this repository belongs. | [optional] 
**namespace_url** | **str** | API endpoint where data about this namespace can be retrieved. | [optional] 
**num_downloads** | **int** | The number of downloads for packages in the repository. | [optional] 
**package_count** | **int** | The number of packages in the repository. | [optional] 
**package_group_count** | **int** | The number of groups in the repository. | [optional] 
**repository_type** | **str** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Open-Source repositories are always visible to everyone and are restricted by licensing, but are free to use and come with generous bandwidth/storage. You can only select Open-Source at repository creation time. | [optional] 
**repository_type_str** | **str** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Public repositories are free to use on all plans and visible to all Cloudsmith users. | [optional] 
**self_html_url** | **str** | Website URL for this repository. | [optional] 
**self_url** | **str** | API endpoint where data about this repository can be retrieved. | [optional] 
**size** | **int** | The calculated size of the repository. | [optional] 
**size_str** | **str** | The calculated size of the repository (human readable). | [optional] 
**slug** | **str** | The slug identifies the repository in URIs. | [optional] 
**slug_perm** | **str** | The slug_perm immutably identifies the repository. It will never change once a repository has been created. | [optional] 
**storage_region** | **str** | The Cloudsmith region in which package files are stored. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


