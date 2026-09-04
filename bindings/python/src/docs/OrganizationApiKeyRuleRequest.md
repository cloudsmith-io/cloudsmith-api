# OrganizationApiKeyRuleRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enforce_refresh** | **bool** | When enabled, API&#39;s keys that violate the organization&#39;s policy will be replaced automatically. | [optional] 
**is_enabled** | **bool** | Whether this policy is currently active and enforced. | [optional] 
**max_age_hours** | **int** | The maximum permitted age of an API key for use in the organization. API keys older than this will no longer have access until they are refreshed. To disable the policy unset this value. | [optional] 
**refresh_immediately** | **bool** | If set to True, API keys that violate this rule will be replaced immediately after the request is made. There is no way to undo this. | [optional] 
**rule_type** | **str** | Specify which account types this rule applies to: all accounts (deprecated — prefer separate service/user rules), service accounts only, or user accounts only. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


