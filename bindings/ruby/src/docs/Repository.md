# CloudsmithApi::Repository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cdn_url** | **String** | Base URL from which packages and other artifacts are downloaded. | [optional] 
**created_at** | **String** |  | [optional] 
**deleted_at** | **String** |  | [optional] 
**description** | **String** | A description of the repository&#39;s purpose/contents. | [optional] 
**gpg_keys** | [**Array&lt;ReposGpgKeys&gt;**](ReposGpgKeys.md) |  | [optional] 
**index_files** | **BOOLEAN** | If checked, files contained in packages will be indexed, which increase the synchronisation time required for packages. Note that it is recommended you keep this enabled unless the synchronisation time is significantly impacted. | [optional] 
**is_open_source** | **BOOLEAN** |  | [optional] 
**is_private** | **BOOLEAN** |  | [optional] 
**is_public** | **BOOLEAN** |  | [optional] 
**name** | **String** | A descriptive name for the repository. | 
**namespace** | **String** | Namespace to which this repository belongs. | [optional] 
**namespace_url** | **String** | API endpoint where data about this namespace can be retrieved. | [optional] 
**num_downloads** | **Integer** | The number of downloads for packages in the repository. | [optional] 
**package_count** | **Integer** | The number of packages in the repository. | [optional] 
**package_group_count** | **Integer** | The number of groups in the repository. | [optional] 
**repository_type** | **String** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Open-Source repositories are always visible to everyone and are restricted by licensing, but are free to use and come with generous bandwidth/storage. You can only select Open-Source at repository creation time. | [optional] 
**repository_type_str** | **String** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Public repositories are free to use on all plans and visible to all Cloudsmith users. | [optional] 
**self_html_url** | **String** | Website URL for this repository. | [optional] 
**self_url** | **String** | API endpoint where data about this repository can be retrieved. | [optional] 
**size** | **Integer** | The calculated size of the repository. | [optional] 
**size_str** | **String** | The calculated size of the repository (human readable). | [optional] 
**slug** | **String** | The slug identifies the repository in URIs. | [optional] 
**slug_perm** | **String** | The slug_perm immutably identifies the repository. It will never change once a repository has been created. | [optional] 
**storage_region** | **String** | The Cloudsmith region in which package files are stored. | [optional] 


