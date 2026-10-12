# OrganizationApiKeyRuleRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enforce_refresh** | **bool** | When enabled, API keys that violate the organization&#39;s rule will be replaced automatically. | [optional] 
**is_enabled** | **bool** | Whether this rule is currently active and enforced. | [optional] 
**max_age_hours** | **int** | The maximum permitted age of an API key for use in the organization. API keys older than this will no longer have access until they are refreshed. To disable the rule unset this value. | [optional] 
**refresh_immediately** | **bool** | If set to True, API keys that violate this rule will be replaced immediately after the request is made. There is no way to undo this. | [optional] 
**rule_type** | **str** | Specify which account types this rule applies to: all accounts (deprecated — prefer separate service/user rules), service accounts only, or user accounts only. | [optional] 

## Example

```python
from cloudsmith_api.models.organization_api_key_rule_request import OrganizationApiKeyRuleRequest

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationApiKeyRuleRequest from a JSON string
organization_api_key_rule_request_instance = OrganizationApiKeyRuleRequest.from_json(json)
# print the JSON string representation of the object
print(OrganizationApiKeyRuleRequest.to_json())

# convert the object into a dict
organization_api_key_rule_request_dict = organization_api_key_rule_request_instance.to_dict()
# create an instance of OrganizationApiKeyRuleRequest from a dict
organization_api_key_rule_request_from_dict = OrganizationApiKeyRuleRequest.from_dict(organization_api_key_rule_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


