# CloudsmithApi::Repository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cdn_url** | **String** |  | [optional] 
**self_url** | **String** |  | [optional] 
**repository_type_str** | **String** |  | [optional] 
**description** | **String** |  | 
**index_files** | **BOOLEAN** | If checked, files contained in packages will be indexed, which increase the synchronisation time required for packages. Note that it is recommended you keep this enabled unless the synchronisation time is significantly impacted. | [optional] 
**created_at** | **String** |  | [optional] 
**is_open_source** | **BOOLEAN** |  | 
**namespace** | **String** |  | 
**slug** | **String** | The slug identifies the repository in URIs. | [optional] 
**size** | **Integer** | The calculated size of the repository. | [optional] 
**namespace_url** | **String** |  | [optional] 
**gpg_keys** | [**Array&lt;ReposownerGpgKeys&gt;**](ReposownerGpgKeys.md) |  | [optional] 
**slug_perm** | **String** |  | [optional] 
**is_public** | **BOOLEAN** |  | 
**deleted_at** | **String** |  | [optional] 
**repository_type** | **String** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Open-Source repositories are always visible to everyone and are restricted by licensing, but are free to use and come with generous bandwidth/storage. You can only select Open-Source at repository creation time. | [optional] 
**self_html_url** | **String** |  | [optional] 
**is_private** | **BOOLEAN** |  | 
**name** | **String** | A descriptive name for the repository. | [optional] 


