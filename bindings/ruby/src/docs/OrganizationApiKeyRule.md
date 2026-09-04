# CloudsmithApi::OrganizationApiKeyRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **DateTime** |  | [optional] 
**enforce_refresh** | **BOOLEAN** | When enabled, API&#39;s keys that violate the organization&#39;s policy will be replaced automatically. | [optional] 
**is_enabled** | **BOOLEAN** | Whether this policy is currently active and enforced. | [optional] 
**last_applied_at** | **DateTime** | The last time this policy was evaluated and applied by the expiry task. | [optional] 
**max_age_hours** | **Integer** | The maximum permitted age of an API key for use in the organization. API keys older than this will no longer have access until they are refreshed. To disable the policy unset this value. | [optional] 
**rule_type** | **String** | Specify which account types this rule applies to: all accounts (deprecated — prefer separate service/user rules), service accounts only, or user accounts only. | 
**slug** | **String** | Human-readable identifier for the policy type. Automatically generated based on policy_type. | [optional] 
**slug_perm** | **String** | An auto-generated id that uniquely identifies the API key policy. | [optional] 
**updated_at** | **DateTime** |  | [optional] 


