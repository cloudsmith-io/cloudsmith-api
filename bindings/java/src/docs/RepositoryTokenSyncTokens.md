
# RepositoryTokenSyncTokens

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clients** | **Integer** |  |  [optional]
**createdAt** | **String** | The datetime the token was updated at. |  [optional]
**createdBy** | **String** |  |  [optional]
**createdByUrl** | **String** |  |  [optional]
**_default** | **Boolean** | If selected this is the default token for this repository. |  [optional]
**disableUrl** | **String** |  |  [optional]
**downloads** | **Integer** |  |  [optional]
**enableUrl** | **String** |  |  [optional]
**hasLimits** | **Boolean** |  |  [optional]
**identifier** | **Integer** |  |  [optional]
**isActive** | **Boolean** | If enabled, the token will allow downloads based on configured restrictions (if any). |  [optional]
**isLimited** | **Boolean** |  |  [optional]
**limitBandwidth** | **Integer** | The maximum download bandwidth allowed for the token. Values are expressed as the selected unit of bandwidth. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.  |  [optional]
**limitBandwidthUnit** | **String** |  |  [optional]
**limitDateRangeFrom** | **String** | The starting date/time the token is allowed to be used from. |  [optional]
**limitDateRangeTo** | **String** | The ending date/time the token is allowed to be used until. |  [optional]
**limitNumClients** | **Integer** | The maximum number of unique clients allowed for the token. Please note that since clients are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. |  [optional]
**limitNumDownloads** | **Integer** | The maximum number of downloads allowed for the token. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. |  [optional]
**limitPackageQuery** | **String** | The package-based search query to apply to restrict downloads to. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. This will still allow access to non-package files, such as metadata. |  [optional]
**limitPathQuery** | **String** | The path-based search query to apply to restrict downloads to. This supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. The path evaluated does not include the domain name, the namespace, the entitlement code used, the package format, etc. and it always starts with a forward slash. |  [optional]
**metadata** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**refreshUrl** | **String** |  |  [optional]
**resetUrl** | **String** |  |  [optional]
**scheduledResetAt** | **String** | The time at which the scheduled reset period has elapsed and the token limits were automatically reset to zero. |  [optional]
**scheduledResetPeriod** | **String** |  |  [optional]
**selfUrl** | **String** |  |  [optional]
**slugPerm** | **String** |  |  [optional]
**token** | **String** |  |  [optional]
**updatedAt** | **String** | The datetime the token was updated at. |  [optional]
**updatedBy** | **String** |  |  [optional]
**updatedByUrl** | **String** |  |  [optional]
**usage** | **String** |  |  [optional]
**user** | **String** |  |  [optional]
**userUrl** | **String** |  |  [optional]



