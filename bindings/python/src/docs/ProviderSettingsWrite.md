# ProviderSettingsWrite


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**claims** | **object** | The set of claims that any received tokens from the provider must contain to authenticate as the configured service account. | 
**dynamic_mappings** | [**List[DynamicMapping]**](DynamicMapping.md) | The dynamic mappings of &#x60;mapping_claim&#x60; values to service accounts. Cannot be provided if &#x60;service_accounts&#x60; is also set.  Note: This field and the dynamic mappings feature are still in early access. Breaking changes are possible as we receive feedback on this feature. | [optional] 
**enabled** | **bool** | Whether the provider settings should be used for incoming OIDC requests. | 
**mapping_claim** | **str** | The OIDC claim to use for mapping to service accounts in dynamic_mappings. Cannot be provided if &#x60;service_accounts&#x60; is also set.  Note: This field and the dynamic mappings feature are still in early access. Breaking changes are possible as we receive feedback on this feature. | [optional] 
**name** | **str** | The name of the provider settings are being configured for | 
**provider_url** | **str** | The URL from the provider that serves as the base for the OpenID configuration. For example, if the OpenID configuration is available at https://token.actions.githubusercontent.com/.well-known/openid-configuration, the provider URL would be https://token.actions.githubusercontent.com/ | 
**service_accounts** | **List[str]** | The service accounts associated with these provider settings. Cannot be provided if &#x60;mapping_claim&#x60; or &#x60;dynamic_mappings&#x60; are specified. | [optional] 
**slug** | **str** | The slug of the provider settings | [optional] [readonly] 
**slug_perm** | **str** | The unique, immutable identifier of the provider settings. | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.provider_settings_write import ProviderSettingsWrite

# TODO update the JSON string below
json = "{}"
# create an instance of ProviderSettingsWrite from a JSON string
provider_settings_write_instance = ProviderSettingsWrite.from_json(json)
# print the JSON string representation of the object
print(ProviderSettingsWrite.to_json())

# convert the object into a dict
provider_settings_write_dict = provider_settings_write_instance.to_dict()
# create an instance of ProviderSettingsWrite from a dict
provider_settings_write_from_dict = ProviderSettingsWrite.from_dict(provider_settings_write_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


