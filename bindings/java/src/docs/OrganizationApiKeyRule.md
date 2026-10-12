

# OrganizationApiKeyRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**enforceRefresh** | **Boolean** | When enabled, API keys that violate the organization&#39;s rule will be replaced automatically. |  [optional] |
|**isEnabled** | **Boolean** | Whether this rule is currently active and enforced. |  [optional] |
|**lastAppliedAt** | **OffsetDateTime** | The last time this rule was evaluated and applied by the expiry task. |  [optional] [readonly] |
|**maxAgeHours** | **java.math.BigInteger** | The maximum permitted age of an API key for use in the organization. API keys older than this will no longer have access until they are refreshed. To disable the rule unset this value. |  [optional] |
|**ruleType** | **String** | Specify which account types this rule applies to: all accounts (deprecated — prefer separate service/user rules), service accounts only, or user accounts only. |  |
|**slug** | **String** | Human-readable identifier for the rule type. Automatically generated based on the rule type. |  [optional] [readonly] |
|**slugPerm** | **String** | An auto-generated id that uniquely identifies the API key policy. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |


## Implemented Interfaces

* Serializable


