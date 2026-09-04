# CloudsmithApi::OrganizationApiKeyRuleRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enforce_refresh** | **BOOLEAN** | When enabled, API&#39;s keys that violate the organization&#39;s policy will be replaced automatically. | [optional] 
**is_enabled** | **BOOLEAN** | Whether this policy is currently active and enforced. | [optional] 
**max_age_hours** | **Integer** | The maximum permitted age of an API key for use in the organization. API keys older than this will no longer have access until they are refreshed. To disable the policy unset this value. | [optional] 
**refresh_immediately** | **BOOLEAN** | If set to True, API keys that violate this rule will be replaced immediately after the request is made. There is no way to undo this. | [optional] 
**rule_type** | **String** | Specify which account types this rule applies to: all accounts (deprecated — prefer separate service/user rules), service accounts only, or user accounts only. | 


