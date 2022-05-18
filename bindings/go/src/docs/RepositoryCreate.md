# RepositoryCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CdnUrl** | **string** | Base URL from which packages and other artifacts are downloaded. | [optional] [default to null]
**CreatedAt** | **string** |  | [optional] [default to null]
**DeletedAt** | **string** |  | [optional] [default to null]
**Description** | **string** | A description of the repository&#39;s purpose/contents. | [optional] [default to null]
**GpgKeys** | [**[]ReposGpgKeys**](repos_gpg_keys.md) |  | [optional] [default to null]
**IndexFiles** | **bool** | If checked, files contained in packages will be indexed, which increase the synchronisation time required for packages. Note that it is recommended you keep this enabled unless the synchronisation time is significantly impacted. | [optional] [default to null]
**IsOpenSource** | **bool** |  | [optional] [default to null]
**IsPrivate** | **bool** |  | [optional] [default to null]
**IsPublic** | **bool** |  | [optional] [default to null]
**Name** | **string** | A descriptive name for the repository. | [default to null]
**Namespace** | **string** | Namespace to which this repository belongs. | [optional] [default to null]
**NamespaceUrl** | **string** | API endpoint where data about this namespace can be retrieved. | [optional] [default to null]
**NumDownloads** | **int32** | The number of downloads for packages in the repository. | [optional] [default to null]
**PackageCount** | **int32** | The number of packages in the repository. | [optional] [default to null]
**PackageGroupCount** | **int32** | The number of groups in the repository. | [optional] [default to null]
**RepositoryType** | **int32** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Open-Source repositories are always visible to everyone and are restricted by licensing, but are free to use and come with generous bandwidth/storage. You can only select Open-Source at repository creation time. | [optional] [default to null]
**RepositoryTypeStr** | **string** |          The repository type changes how it is accessed and billed.         Private repositories can only be used on paid plans, but are visible         only to you or authorised delegates. Public repositories are free to         use on all plans and visible to all Cloudsmith users.          | [optional] [default to null]
**SelfHtmlUrl** | **string** | Website URL for this repository. | [optional] [default to null]
**SelfUrl** | **string** | API endpoint where data about this repository can be retrieved. | [optional] [default to null]
**Size** | **int32** | The calculated size of the repository. | [optional] [default to null]
**SizeStr** | **string** | The calculated size of the repository (human readable). | [optional] [default to null]
**Slug** | **string** | The slug identifies the repository in URIs. | [optional] [default to null]
**SlugPerm** | **string** | The slug_perm immutably identifies the repository. It will never change once a repository has been created. | [optional] [default to null]
**StorageRegion** | **string** | The Cloudsmith region in which package files are stored. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


