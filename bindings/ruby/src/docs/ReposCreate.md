# CloudsmithApi::ReposCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | A description of the repository&#39;s purpose/contents. | [optional] 
**index_files** | **BOOLEAN** | If checked, files contained in packages will be indexed, which increase the synchronisation time required for packages. Note that it is recommended you keep this enabled unless the synchronisation time is significantly impacted. | [optional] 
**name** | **String** | A descriptive name for the repository. | 
**repository_type_str** | **String** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Public repositories are free to use on all plans and visible to all Cloudsmith users. | [optional] 
**slug** | **String** | The slug identifies the repository in URIs. | [optional] 
**storage_region** | **String** | The Cloudsmith region in which package files are stored. | [optional] 


