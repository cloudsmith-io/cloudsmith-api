
# ProviderSettingsWriteRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**claims** | **Object** | The set of claims that any received tokens from the provider must contain to authenticate as the configured service account. | 
**dynamicMappings** | [**List&lt;DynamicMapping&gt;**](DynamicMapping.md) | The dynamic mappings of &#x60;mapping_claim&#x60; values to service accounts. Cannot be provided if &#x60;service_accounts&#x60; is also set.  Note: This field and the dynamic mappings feature are still in early access. Breaking changes are possible as we receive feedback on this feature. |  [optional]
**enabled** | **Boolean** | Whether the provider settings should be used for incoming OIDC requests. | 
**mappingClaim** | **String** | The OIDC claim to use for mapping to service accounts in dynamic_mappings. Cannot be provided if &#x60;service_accounts&#x60; is also set.  Note: This field and the dynamic mappings feature are still in early access. Breaking changes are possible as we receive feedback on this feature. |  [optional]
**name** | **String** | The name of the provider settings are being configured for | 
**providerUrl** | **String** | The URL from the provider that serves as the base for the OpenID configuration. For example, if the OpenID configuration is available at https://token.actions.githubusercontent.com/.well-known/openid-configuration, the provider URL would be https://token.actions.githubusercontent.com/ | 
**serviceAccounts** | **List&lt;String&gt;** | The service accounts associated with these provider settings. Cannot be provided if &#x60;mapping_claim&#x60; or &#x60;dynamic_mappings&#x60; are specified. |  [optional]



