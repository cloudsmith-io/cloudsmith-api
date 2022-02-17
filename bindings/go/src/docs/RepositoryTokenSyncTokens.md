# RepositoryTokenSyncTokens

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Clients** | **int32** |  | [optional] [default to null]
**CreatedAt** | **string** | The datetime the token was updated at. | [optional] [default to null]
**CreatedBy** | **string** |  | [optional] [default to null]
**CreatedByUrl** | **string** |  | [optional] [default to null]
**Default_** | **bool** | If selected this is the default token for this repository. | [optional] [default to null]
**DisableUrl** | **string** |  | [optional] [default to null]
**Downloads** | **int32** |  | [optional] [default to null]
**EnableUrl** | **string** |  | [optional] [default to null]
**EulaAccepted** | [**interface{}**](interface{}.md) |  | [optional] [default to null]
**EulaAcceptedAt** | **string** | The datetime the EULA was accepted at. | [optional] [default to null]
**EulaAcceptedFrom** | **string** |  | [optional] [default to null]
**EulaRequired** | **bool** | If checked, a EULA acceptance is required for this token. | [optional] [default to null]
**HasLimits** | **bool** |  | [optional] [default to null]
**Identifier** | **int32** |  | [optional] [default to null]
**IsActive** | **bool** | If enabled, the token will allow downloads based on configured restrictions (if any). | [optional] [default to null]
**IsLimited** | **bool** |  | [optional] [default to null]
**LimitBandwidth** | **int32** | The maximum download bandwidth allowed for the token. Values are expressed as the selected unit of bandwidth. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.  | [optional] [default to null]
**LimitBandwidthUnit** | **string** |  | [optional] [default to null]
**LimitDateRangeFrom** | **string** | The starting date/time the token is allowed to be used from. | [optional] [default to null]
**LimitDateRangeTo** | **string** | The ending date/time the token is allowed to be used until. | [optional] [default to null]
**LimitNumClients** | **int32** | The maximum number of unique clients allowed for the token. Please note that since clients are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. | [optional] [default to null]
**LimitNumDownloads** | **int32** | The maximum number of downloads allowed for the token. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. | [optional] [default to null]
**LimitPackageQuery** | **string** | The package-based search query to apply to restrict downloads to. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. This will still allow access to non-package files, such as metadata. | [optional] [default to null]
**LimitPathQuery** | **string** | The path-based search query to apply to restrict downloads to. This supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. The path evaluated does not include the domain name, the namespace, the entitlement code used, the package format, etc. and it always starts with a forward slash. | [optional] [default to null]
**Metadata** | **string** |  | [optional] [default to null]
**Name** | **string** |  | [optional] [default to null]
**RefreshUrl** | **string** |  | [optional] [default to null]
**ResetUrl** | **string** |  | [optional] [default to null]
**ScheduledResetAt** | **string** | The time at which the scheduled reset period has elapsed and the token limits were automatically reset to zero. | [optional] [default to null]
**ScheduledResetPeriod** | **string** |  | [optional] [default to null]
**SelfUrl** | **string** |  | [optional] [default to null]
**SlugPerm** | **string** |  | [optional] [default to null]
**Token** | **string** |  | [optional] [default to null]
**UpdatedAt** | **string** | The datetime the token was updated at. | [optional] [default to null]
**UpdatedBy** | **string** |  | [optional] [default to null]
**UpdatedByUrl** | **string** |  | [optional] [default to null]
**Usage** | **string** |  | [optional] [default to null]
**User** | **string** |  | [optional] [default to null]
**UserUrl** | **string** |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


