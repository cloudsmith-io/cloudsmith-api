# OrganizationApiKeyRule


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | [optional] [readonly] 
**enforce_refresh** | **bool** | When enabled, API keys that violate the organization&#39;s rule will be replaced automatically. | [optional] 
**is_enabled** | **bool** | Whether this rule is currently active and enforced. | [optional] 
**last_applied_at** | **datetime** | The last time this rule was evaluated and applied by the expiry task. | [optional] [readonly] 
**max_age_hours** | **int** | The maximum permitted age of an API key for use in the organization. API keys older than this will no longer have access until they are refreshed. To disable the rule unset this value. | [optional] 
**rule_type** | **str** | Specify which account types this rule applies to: all accounts (deprecated — prefer separate service/user rules), service accounts only, or user accounts only. | [optional] 
**slug** | **str** | Human-readable identifier for the rule type. Automatically generated based on the rule type. | [optional] [readonly] 
**slug_perm** | **str** | An auto-generated id that uniquely identifies the API key policy. | [optional] [readonly] 
**updated_at** | **datetime** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.organization_api_key_rule import OrganizationApiKeyRule

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationApiKeyRule from a JSON string
organization_api_key_rule_instance = OrganizationApiKeyRule.from_json(json)
# print the JSON string representation of the object
print(OrganizationApiKeyRule.to_json())

# convert the object into a dict
organization_api_key_rule_dict = organization_api_key_rule_instance.to_dict()
# create an instance of OrganizationApiKeyRule from a dict
organization_api_key_rule_from_dict = OrganizationApiKeyRule.from_dict(organization_api_key_rule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


