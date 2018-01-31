# Repository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CdnUrl** | **string** |  | [optional] [default to null]
**SelfUrl** | **string** |  | [optional] [default to null]
**RepositoryTypeStr** | **string** |  | [optional] [default to null]
**Description** | **string** |  | [default to null]
**Name** | **string** | A descriptive name for the repository. | [optional] [default to null]
**IndexFiles** | **bool** | If checked, files contained in packages will be indexed, which increase the synchronisation time required for packages. Note that it is recommended you keep this enabled unless the synchronisation time is significantly impacted. | [optional] [default to null]
**CreatedAt** | **string** |  | [optional] [default to null]
**IsOpenSource** | **bool** |  | [default to null]
**Namespace** | **string** |  | [default to null]
**SelfHtmlUrl** | **string** |  | [optional] [default to null]
**SlugPerm** | **string** |  | [optional] [default to null]
**NamespaceUrl** | **string** |  | [optional] [default to null]
**GpgKeys** | [**[]ReposownerGpgKeys**](reposowner_gpg_keys.md) |  | [optional] [default to null]
**IsPublic** | **bool** |  | [default to null]
**DeletedAt** | **string** |  | [optional] [default to null]
**RepositoryType** | **string** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Open-Source repositories are always visible to everyone and are restricted by licensing, but are free to use and come with generous bandwidth/storage. You can only select Open-Source at repository creation time. | [optional] [default to null]
**Slug** | **string** | The slug identifies the repository in URIs. | [optional] [default to null]
**IsPrivate** | **bool** |  | [default to null]
**Size** | **int32** | The calculated size of the repository. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


