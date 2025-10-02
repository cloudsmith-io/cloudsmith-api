# ProviderSettingsWriteRequestPatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**claims** | **object** | The set of claims that any received tokens from the provider must contain to authenticate as the configured service account. | [optional] 
**dynamic_mappings** | [**list[DynamicMapping]**](DynamicMapping.md) | The dynamic mappings of &#x60;mapping_claim&#x60; values to service accounts. Cannot be provided if &#x60;service_accounts&#x60; is also set.  Note: This field and the dynamic mappings feature are still in early access. Breaking changes are possible as we receive feedback on this feature. | [optional] 
**enabled** | **bool** | Whether the provider settings should be used for incoming OIDC requests. | [optional] 
**mapping_claim** | **str** | The OIDC claim to use for mapping to service accounts in dynamic_mappings. Cannot be provided if &#x60;service_accounts&#x60; is also set.  Note: This field and the dynamic mappings feature are still in early access. Breaking changes are possible as we receive feedback on this feature. | [optional] 
**name** | **str** | The name of the provider settings are being configured for | [optional] 
**provider_url** | **str** | The URL from the provider that serves as the base for the OpenID configuration. For example, if the OpenID configuration is available at https://token.actions.githubusercontent.com/.well-known/openid-configuration, the provider URL would be https://token.actions.githubusercontent.com/ | [optional] 
**service_accounts** | **list[str]** | The service accounts associated with these provider settings. Cannot be provided if &#x60;mapping_claim&#x60; or &#x60;dynamic_mappings&#x60; are specified. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


