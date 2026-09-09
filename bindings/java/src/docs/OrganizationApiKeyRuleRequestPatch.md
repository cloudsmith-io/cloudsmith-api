
# OrganizationApiKeyRuleRequestPatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enforceRefresh** | **Boolean** | When enabled, API keys that violate the organization&#39;s rule will be replaced automatically. |  [optional]
**isEnabled** | **Boolean** | Whether this rule is currently active and enforced. |  [optional]
**maxAgeHours** | **java.math.BigInteger** | The maximum permitted age of an API key for use in the organization. API keys older than this will no longer have access until they are refreshed. To disable the rule unset this value. |  [optional]
**refreshImmediately** | **Boolean** | If set to True, API keys that violate this rule will be replaced immediately after the request is made. There is no way to undo this. |  [optional]
**ruleType** | [**RuleTypeEnum**](#RuleTypeEnum) | Specify which account types this rule applies to: all accounts (deprecated — prefer separate service/user rules), service accounts only, or user accounts only. |  [optional]


<a name="RuleTypeEnum"></a>
## Enum: RuleTypeEnum
Name | Value
---- | -----
ALL_ACCOUNTS | &quot;All Accounts&quot;
SERVICE_ACCOUNTS | &quot;Service Accounts&quot;
USER_ACCOUNTS | &quot;User Accounts&quot;



