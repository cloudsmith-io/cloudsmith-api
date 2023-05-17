# RepositoryToken

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clients** | **int** |  | [optional] 
**created_at** | **datetime** | The datetime the token was updated at. | [optional] 
**created_by** | **str** |  | [optional] 
**created_by_url** | **str** |  | [optional] 
**default** | **bool** | If selected this is the default token for this repository. | [optional] 
**disable_url** | **str** |  | [optional] 
**downloads** | **int** |  | [optional] 
**enable_url** | **str** |  | [optional] 
**eula_accepted** | [**Eula**](Eula.md) |  | [optional] 
**eula_accepted_at** | **datetime** | The datetime the EULA was accepted at. | [optional] 
**eula_accepted_from** | **str** |  | [optional] 
**eula_required** | **bool** | If checked, a EULA acceptance is required for this token. | [optional] 
**has_limits** | **bool** |  | [optional] 
**identifier** | **int** | Deprecated (23-05-15): Please use &#39;slug_perm&#39; instead. Previously: A monotonically increasing number that identified an entitlement within a repository. | [optional] 
**is_active** | **bool** | If enabled, the token will allow downloads based on configured restrictions (if any). | [optional] 
**is_limited** | **bool** |  | [optional] 
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
**refresh_url** | **str** |  | [optional] 
**reset_url** | **str** |  | [optional] 
**scheduled_reset_at** | **datetime** | The time at which the scheduled reset period has elapsed and the token limits were automatically reset to zero. | [optional] 
**scheduled_reset_period** | **str** |  | [optional] [default to 'Never Reset']
**self_url** | **str** |  | [optional] 
**slug_perm** | **str** |  | [optional] 
**token** | **str** |  | [optional] 
**updated_at** | **datetime** | The datetime the token was updated at. | [optional] 
**updated_by** | **str** |  | [optional] 
**updated_by_url** | **str** |  | [optional] 
**usage** | **str** |  | [optional] 
**user** | **str** |  | [optional] 
**user_url** | **str** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


