# CloudsmithApi::EntitlementsPartialUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_active** | **BOOLEAN** | If enabled, the token will allow downloads based on configured restrictions (if any). | [optional] 
**limit_bandwidth** | **Integer** | The maximum download bandwidth allowed for the token. Values are expressed as the selected unit of bandwidth. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.  | [optional] 
**limit_bandwidth_unit** | **String** | None | [optional] 
**limit_date_range_from** | **String** | The starting date/time the token is allowed to be used from. | [optional] 
**limit_date_range_to** | **String** | The ending date/time the token is allowed to be used until. | [optional] 
**limit_num_clients** | **Integer** | The maximum number of unique clients allowed for the token. Please note that since clients are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. | [optional] 
**limit_num_downloads** | **Integer** | The maximum number of downloads allowed for the token. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. | [optional] 
**limit_package_query** | **String** | The package-based search query to apply to restrict downloads to. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. This will still allow access to non-package files, such as metadata. | [optional] 
**limit_path_query** | **String** | The path-based search query to apply to restrict downloads to. This supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. The path evaluated does not include the domain name, the namespace, the entitlement code used, the package format, etc. and it always starts with a forward slash. | [optional] 
**metadata** | **Object** | None | [optional] 
**name** | **String** | None | [optional] 
**scheduled_reset_at** | **String** | The time at which the scheduled reset period has elapsed and the token limits were automatically reset to zero. | [optional] 
**scheduled_reset_period** | **String** | None | [optional] 
**token** | **String** | None | [optional] 


