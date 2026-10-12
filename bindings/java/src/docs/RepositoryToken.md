

# RepositoryToken


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessPrivateBroadcasts** | **Boolean** | If enabled, this token can be used for private broadcasts |  [optional] [readonly] |
|**clients** | **java.math.BigInteger** |  |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | The datetime the token was updated at. |  [optional] [readonly] |
|**createdBy** | **String** |  |  [optional] [readonly] |
|**createdByUrl** | **URI** |  |  [optional] [readonly] |
|**_default** | **Boolean** | If selected this is the default token for this repository. |  [optional] [readonly] |
|**disableUrl** | **URI** |  |  [optional] [readonly] |
|**downloads** | **java.math.BigInteger** |  |  [optional] [readonly] |
|**enableUrl** | **URI** |  |  [optional] [readonly] |
|**eulaAccepted** | [**Eula**](Eula.md) |  |  [optional] |
|**eulaAcceptedAt** | **OffsetDateTime** | The datetime the EULA was accepted at. |  [optional] [readonly] |
|**eulaAcceptedFrom** | **String** |  |  [optional] [readonly] |
|**eulaRequired** | **Boolean** | If checked, a EULA acceptance is required for this token. |  [optional] |
|**hasLimits** | **Boolean** |  |  [optional] [readonly] |
|**identifier** | **java.math.BigInteger** | Deprecated (23-05-15): Please use &#39;slug_perm&#39; instead. Previously: A monotonically increasing number that identified an entitlement within a repository. |  [optional] [readonly] |
|**isActive** | **Boolean** | If enabled, the token will allow downloads based on configured restrictions (if any). |  [optional] |
|**isLimited** | **Boolean** |  |  [optional] [readonly] |
|**limitBandwidth** | **java.math.BigInteger** | The maximum download bandwidth allowed for the token. Values are expressed as the selected unit of bandwidth. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.  |  [optional] |
|**limitBandwidthUnit** | **String** |  |  [optional] |
|**limitDateRangeFrom** | **OffsetDateTime** | The starting date/time the token is allowed to be used from. |  [optional] |
|**limitDateRangeTo** | **OffsetDateTime** | The ending date/time the token is allowed to be used until. |  [optional] |
|**limitNumClients** | **java.math.BigInteger** | The maximum number of unique clients allowed for the token. Please note that since clients are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. |  [optional] |
|**limitNumDownloads** | **java.math.BigInteger** | The maximum number of downloads allowed for the token. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. |  [optional] |
|**limitPackageQuery** | **String** | The package-based search query to apply to restrict downloads to. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. This will still allow access to non-package files, such as metadata. |  [optional] |
|**limitPathQuery** | **String** | THIS WILL SOON BE DEPRECATED, please use limit_package_query instead. The path-based search query to apply to restrict downloads to. This supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. The path evaluated does not include the domain name, the namespace, the entitlement code used, the package format, etc. and it always starts with a forward slash. |  [optional] |
|**metadata** | **Object** |  |  [optional] |
|**name** | **String** |  |  |
|**refreshUrl** | **URI** |  |  [optional] [readonly] |
|**resetUrl** | **URI** |  |  [optional] [readonly] |
|**scheduledResetAt** | **OffsetDateTime** | The time at which the scheduled reset period has elapsed and the token limits were automatically reset to zero. |  [optional] |
|**scheduledResetPeriod** | **String** |  |  [optional] |
|**selfUrl** | **URI** |  |  [optional] [readonly] |
|**slugPerm** | **String** |  |  [optional] [readonly] |
|**token** | **String** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** | The datetime the token was updated at. |  [optional] [readonly] |
|**updatedBy** | **String** |  |  [optional] [readonly] |
|**updatedByUrl** | **URI** |  |  [optional] [readonly] |
|**usage** | **String** |  |  [optional] [readonly] |
|**user** | **String** |  |  [optional] [readonly] |
|**userUrl** | **URI** |  |  [optional] [readonly] |


## Implemented Interfaces

* Serializable


