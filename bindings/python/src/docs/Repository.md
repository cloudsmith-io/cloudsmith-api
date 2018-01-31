# Repository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cdn_url** | **str** |  | [optional] 
**self_url** | **str** |  | [optional] 
**repository_type_str** | **str** |  | [optional] 
**description** | **str** |  | 
**name** | **str** | A descriptive name for the repository. | [optional] 
**index_files** | **bool** | If checked, files contained in packages will be indexed, which increase the synchronisation time required for packages. Note that it is recommended you keep this enabled unless the synchronisation time is significantly impacted. | [optional] 
**created_at** | **str** |  | [optional] 
**is_open_source** | **bool** |  | 
**namespace** | **str** |  | 
**self_html_url** | **str** |  | [optional] 
**slug_perm** | **str** |  | [optional] 
**namespace_url** | **str** |  | [optional] 
**gpg_keys** | [**list[ReposownerGpgKeys]**](ReposownerGpgKeys.md) |  | [optional] 
**is_public** | **bool** |  | 
**deleted_at** | **str** |  | [optional] 
**repository_type** | **str** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Open-Source repositories are always visible to everyone and are restricted by licensing, but are free to use and come with generous bandwidth/storage. You can only select Open-Source at repository creation time. | [optional] 
**slug** | **str** | The slug identifies the repository in URIs. | [optional] 
**is_private** | **bool** |  | 
**size** | **int** | The calculated size of the repository. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


