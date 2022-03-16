
# Repository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cdnUrl** | **String** | Base URL from which packages and other artifacts are downloaded. |  [optional]
**createdAt** | **String** |  |  [optional]
**deletedAt** | **String** |  |  [optional]
**description** | **String** | A description of the repository&#39;s purpose/contents. |  [optional]
**gpgKeys** | [**List&lt;ReposGpgKeys&gt;**](ReposGpgKeys.md) |  |  [optional]
**indexFiles** | **Boolean** | If checked, files contained in packages will be indexed, which increase the synchronisation time required for packages. Note that it is recommended you keep this enabled unless the synchronisation time is significantly impacted. |  [optional]
**isOpenSource** | **Boolean** |  |  [optional]
**isPrivate** | **Boolean** |  |  [optional]
**isPublic** | **Boolean** |  |  [optional]
**name** | **String** | A descriptive name for the repository. | 
**namespace** | **String** | Namespace to which this repository belongs. |  [optional]
**namespaceUrl** | **String** | API endpoint where data about this namespace can be retrieved. |  [optional]
**numDownloads** | **Integer** | The number of downloads for packages in the repository. |  [optional]
**packageCount** | **Integer** | The number of packages in the repository. |  [optional]
**packageGroupCount** | **Integer** | The number of groups in the repository. |  [optional]
**repositoryType** | **Integer** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Open-Source repositories are always visible to everyone and are restricted by licensing, but are free to use and come with generous bandwidth/storage. You can only select Open-Source at repository creation time. |  [optional]
**repositoryTypeStr** | **String** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Public repositories are free to use on all plans and visible to all Cloudsmith users. |  [optional]
**selfHtmlUrl** | **String** | Website URL for this repository. |  [optional]
**selfUrl** | **String** | API endpoint where data about this repository can be retrieved. |  [optional]
**size** | **Integer** | The calculated size of the repository. |  [optional]
**sizeStr** | **String** | The calculated size of the repository (human readable). |  [optional]
**slug** | **String** | The slug identifies the repository in URIs. |  [optional]
**slugPerm** | **String** | The slug_perm immutably identifies the repository. It will never change once a repository has been created. |  [optional]
**storageRegion** | **String** | The Cloudsmith region in which package files are stored. |  [optional]



