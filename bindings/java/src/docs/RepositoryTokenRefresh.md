
# RepositoryTokenRefresh

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clients** | **java.math.BigInteger** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime the token was updated at. |  [optional]
**createdBy** | **String** |  |  [optional]
**createdByUrl** | **String** |  |  [optional]
**_default** | **Boolean** | If selected this is the default token for this repository. |  [optional]
**disableUrl** | **String** |  |  [optional]
**downloads** | **java.math.BigInteger** |  |  [optional]
**enableUrl** | **String** |  |  [optional]
**eulaAccepted** | [**Eula**](Eula.md) |  |  [optional]
**eulaAcceptedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime the EULA was accepted at. |  [optional]
**eulaAcceptedFrom** | **String** |  |  [optional]
**eulaRequired** | **Boolean** | If checked, a EULA acceptance is required for this token. |  [optional]
**hasLimits** | **Boolean** |  |  [optional]
**identifier** | **java.math.BigInteger** | Deprecated (23-05-15): Please use &#39;slug_perm&#39; instead. Previously: A monotonically increasing number that identified an entitlement within a repository. |  [optional]
**isActive** | **Boolean** | If enabled, the token will allow downloads based on configured restrictions (if any). |  [optional]
**isLimited** | **Boolean** |  |  [optional]
**limitBandwidth** | **java.math.BigInteger** | The maximum download bandwidth allowed for the token. Values are expressed as the selected unit of bandwidth. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.  |  [optional]
**limitBandwidthUnit** | [**LimitBandwidthUnitEnum**](#LimitBandwidthUnitEnum) |  |  [optional]
**limitDateRangeFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The starting date/time the token is allowed to be used from. |  [optional]
**limitDateRangeTo** | [**OffsetDateTime**](OffsetDateTime.md) | The ending date/time the token is allowed to be used until. |  [optional]
**limitNumClients** | **java.math.BigInteger** | The maximum number of unique clients allowed for the token. Please note that since clients are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. |  [optional]
**limitNumDownloads** | **java.math.BigInteger** | The maximum number of downloads allowed for the token. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. |  [optional]
**limitPackageQuery** | **String** | The package-based search query to apply to restrict downloads to. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. This will still allow access to non-package files, such as metadata. |  [optional]
**limitPathQuery** | **String** | THIS WILL SOON BE DEPRECATED, please use limit_package_query instead. The path-based search query to apply to restrict downloads to. This supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. The path evaluated does not include the domain name, the namespace, the entitlement code used, the package format, etc. and it always starts with a forward slash. |  [optional]
**metadata** | **Object** |  |  [optional]
**name** | **String** |  |  [optional]
**refreshUrl** | **String** |  |  [optional]
**resetUrl** | **String** |  |  [optional]
**scheduledResetAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the scheduled reset period has elapsed and the token limits were automatically reset to zero. |  [optional]
**scheduledResetPeriod** | [**ScheduledResetPeriodEnum**](#ScheduledResetPeriodEnum) |  |  [optional]
**selfUrl** | **String** |  |  [optional]
**slugPerm** | **String** |  |  [optional]
**token** | **String** |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime the token was updated at. |  [optional]
**updatedBy** | **String** |  |  [optional]
**updatedByUrl** | **String** |  |  [optional]
**usage** | **String** |  |  [optional]
**user** | **String** |  |  [optional]
**userUrl** | **String** |  |  [optional]


<a name="LimitBandwidthUnitEnum"></a>
## Enum: LimitBandwidthUnitEnum
Name | Value
---- | -----
BYTE | &quot;Byte&quot;
KILOBYTE | &quot;Kilobyte&quot;
MEGABYTE | &quot;Megabyte&quot;
GIGABYTE | &quot;Gigabyte&quot;
TERABYTE | &quot;Terabyte&quot;
PETABYTE | &quot;Petabyte&quot;
EXABYTE | &quot;Exabyte&quot;
ZETTABYTE | &quot;Zettabyte&quot;
YOTTABYTE | &quot;Yottabyte&quot;


<a name="ScheduledResetPeriodEnum"></a>
## Enum: ScheduledResetPeriodEnum
Name | Value
---- | -----
NEVER_RESET | &quot;Never Reset&quot;
DAILY | &quot;Daily&quot;
WEEKLY | &quot;Weekly&quot;
FORTNIGHTLY | &quot;Fortnightly&quot;
MONTHLY | &quot;Monthly&quot;
BI_MONTHLY | &quot;Bi-Monthly&quot;
QUARTERLY | &quot;Quarterly&quot;
EVERY_6_MONTHS | &quot;Every 6 months&quot;
ANNUAL | &quot;Annual&quot;



