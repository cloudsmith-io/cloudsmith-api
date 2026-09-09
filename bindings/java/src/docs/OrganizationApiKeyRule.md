
# OrganizationApiKeyRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**enforceRefresh** | **Boolean** | When enabled, API keys that violate the organization&#39;s rule will be replaced automatically. |  [optional]
**isEnabled** | **Boolean** | Whether this rule is currently active and enforced. |  [optional]
**lastAppliedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The last time this rule was evaluated and applied by the expiry task. |  [optional]
**maxAgeHours** | **java.math.BigInteger** | The maximum permitted age of an API key for use in the organization. API keys older than this will no longer have access until they are refreshed. To disable the rule unset this value. |  [optional]
**ruleType** | [**RuleTypeEnum**](#RuleTypeEnum) | Specify which account types this rule applies to: all accounts (deprecated — prefer separate service/user rules), service accounts only, or user accounts only. | 
**slug** | **String** | Human-readable identifier for the rule type. Automatically generated based on the rule type. |  [optional]
**slugPerm** | **String** | An auto-generated id that uniquely identifies the API key policy. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="RuleTypeEnum"></a>
## Enum: RuleTypeEnum
Name | Value
---- | -----
ALL_ACCOUNTS | &quot;All Accounts&quot;
SERVICE_ACCOUNTS | &quot;Service Accounts&quot;
USER_ACCOUNTS | &quot;User Accounts&quot;



