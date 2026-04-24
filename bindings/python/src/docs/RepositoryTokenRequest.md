# RepositoryTokenRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eula_required** | **bool** | If checked, a EULA acceptance is required for this token. | [optional] 
**is_active** | **bool** | If enabled, the token will allow downloads based on configured restrictions (if any). | [optional] 
**limit_bandwidth** | **int** | The maximum download bandwidth allowed for the token. Values are expressed as the selected unit of bandwidth. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.  | [optional] 
**limit_bandwidth_unit** | **str** |  | [optional] [default to 'Byte']
**limit_date_range_from** | **datetime** | The starting date/time the token is allowed to be used from. | [optional] 
**limit_date_range_to** | **datetime** | The ending date/time the token is allowed to be used until. | [optional] 
**limit_num_clients** | **int** | The maximum number of unique clients allowed for the token. Please note that since clients are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. | [optional] 
**limit_num_downloads** | **int** | The maximum number of downloads allowed for the token. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. | [optional] 
**limit_package_query** | **str** | The package-based search query to apply to restrict downloads to. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. This will still allow access to non-package files, such as metadata. | [optional] 
**limit_path_query** | **str** | THIS WILL SOON BE DEPRECATED, please use limit_package_query instead. The path-based search query to apply to restrict downloads to. This supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. The path evaluated does not include the domain name, the namespace, the entitlement code used, the package format, etc. and it always starts with a forward slash. | [optional] 
**metadata** | **object** |  | [optional] 
**name** | **str** |  | 
**scheduled_reset_at** | **datetime** | The time at which the scheduled reset period has elapsed and the token limits were automatically reset to zero. | [optional] 
**scheduled_reset_period** | **str** |  | [optional] [default to 'Never Reset']
**token** | **str** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


