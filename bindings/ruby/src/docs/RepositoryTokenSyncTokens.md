# CloudsmithApi::RepositoryTokenSyncTokens

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **String** |  | [optional] 
**created_by** | **String** |  | [optional] 
**created_by_url** | **String** |  | [optional] 
**default** | **BOOLEAN** | If selected this is the default token for this repository. | [optional] 
**has_limits** | **String** |  | [optional] 
**identifier** | **Integer** |  | [optional] 
**is_active** | **BOOLEAN** | If enabled, the token will allow downloads based on configured restrictions (if any). | [optional] 
**is_limited** | **String** |  | [optional] 
**limit_date_range_from** | **String** | The starting date/time the token is allowed to be used from. | [optional] 
**limit_date_range_to** | **String** | The ending date/time the token is allowed to be used until. | [optional] 
**limit_num_clients** | **Integer** | The maximum number of unique clients allowed for the token. Please note that since clients are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. | [optional] 
**limit_num_downloads** | **Integer** | The maximum number of downloads allowed for the token. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. | [optional] 
**limit_package_query** | **String** | The package-based search query to apply to restrict downloads to. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. This will still allow access to non-package files, such as metadata. For package formats that support dynamic metadata indexes, the contents of the metadata will also be filtered. | [optional] 
**limit_path_query** | **String** | The path-based search query to apply to restrict downloads to. This supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. The path evaluated does not include the domain name, the namespace, the entitlement code used, the package format, etc. and it always starts with a forward slash. | [optional] 
**metadata** | **String** |  | [optional] 
**name** | **String** |  | [optional] 
**refresh_url** | **String** |  | [optional] 
**self_url** | **String** |  | [optional] 
**slug_perm** | **String** |  | [optional] 
**token** | **String** |  | [optional] 
**updated_at** | **String** |  | [optional] 
**updated_by** | **String** |  | [optional] 
**updated_by_url** | **String** |  | [optional] 
**user** | **String** |  | [optional] 
**user_url** | **String** |  | [optional] 

