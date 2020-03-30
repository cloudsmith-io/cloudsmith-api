
# Repository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cdnUrl** | **String** |  |  [optional]
**createdAt** | **String** |  |  [optional]
**deletedAt** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**gpgKeys** | [**List&lt;ReposGpgKeys&gt;**](ReposGpgKeys.md) |  |  [optional]
**indexFiles** | **Boolean** | If checked, files contained in packages will be indexed, which increase the synchronisation time required for packages. Note that it is recommended you keep this enabled unless the synchronisation time is significantly impacted. |  [optional]
**isOpenSource** | **Boolean** |  |  [optional]
**isPrivate** | **Boolean** |  |  [optional]
**isPublic** | **Boolean** |  |  [optional]
**name** | **String** | A descriptive name for the repository. | 
**namespace** | **String** |  | 
**namespaceUrl** | **String** |  |  [optional]
**numDownloads** | **Integer** | The number of downloads for packages in the repository. |  [optional]
**packageCount** | **Integer** | The number of packages in the repository. |  [optional]
**packageGroupCount** | **Integer** | The number of groups in the repository. |  [optional]
**repositoryType** | **String** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Open-Source repositories are always visible to everyone and are restricted by licensing, but are free to use and come with generous bandwidth/storage. You can only select Open-Source at repository creation time. |  [optional]
**repositoryTypeStr** | **String** |  |  [optional]
**selfHtmlUrl** | **String** |  |  [optional]
**selfUrl** | **String** |  |  [optional]
**size** | **Integer** | The calculated size of the repository. |  [optional]
**sizeStr** | **String** |  |  [optional]
**slug** | **String** |  | 
**slugPerm** | **String** |  |  [optional]



