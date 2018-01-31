
# Repository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cdnUrl** | **String** |  |  [optional]
**selfUrl** | **String** |  |  [optional]
**repositoryTypeStr** | **String** |  |  [optional]
**description** | **String** |  | 
**name** | **String** | A descriptive name for the repository. |  [optional]
**indexFiles** | **Boolean** | If checked, files contained in packages will be indexed, which increase the synchronisation time required for packages. Note that it is recommended you keep this enabled unless the synchronisation time is significantly impacted. |  [optional]
**createdAt** | **String** |  |  [optional]
**isOpenSource** | **Boolean** |  | 
**namespace** | **String** |  | 
**selfHtmlUrl** | **String** |  |  [optional]
**slugPerm** | **String** |  |  [optional]
**namespaceUrl** | **String** |  |  [optional]
**gpgKeys** | [**List&lt;ReposownerGpgKeys&gt;**](ReposownerGpgKeys.md) |  |  [optional]
**isPublic** | **Boolean** |  | 
**deletedAt** | **String** |  |  [optional]
**repositoryType** | **String** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Open-Source repositories are always visible to everyone and are restricted by licensing, but are free to use and come with generous bandwidth/storage. You can only select Open-Source at repository creation time. |  [optional]
**slug** | **String** | The slug identifies the repository in URIs. |  [optional]
**isPrivate** | **Boolean** |  | 
**size** | **Integer** | The calculated size of the repository. |  [optional]



