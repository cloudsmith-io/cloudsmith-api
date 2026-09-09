# OrganizationApiKeyRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | [optional] 
**enforce_refresh** | **bool** | When enabled, API keys that violate the organization&#39;s rule will be replaced automatically. | [optional] 
**is_enabled** | **bool** | Whether this rule is currently active and enforced. | [optional] 
**last_applied_at** | **datetime** | The last time this rule was evaluated and applied by the expiry task. | [optional] 
**max_age_hours** | **int** | The maximum permitted age of an API key for use in the organization. API keys older than this will no longer have access until they are refreshed. To disable the rule unset this value. | [optional] 
**rule_type** | **str** | Specify which account types this rule applies to: all accounts (deprecated — prefer separate service/user rules), service accounts only, or user accounts only. | 
**slug** | **str** | Human-readable identifier for the rule type. Automatically generated based on the rule type. | [optional] 
**slug_perm** | **str** | An auto-generated id that uniquely identifies the API key policy. | [optional] 
**updated_at** | **datetime** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


