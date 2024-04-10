# ProviderSettingsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**claims** | **object** | The set of claims that any received tokens from the provider must contain to authenticate as the configured service account. | 
**enabled** | **bool** | Whether the provider settings should be used for incoming OIDC requests. | 
**name** | **str** | The name of the provider settings are being configured for | 
**provider_url** | **str** | The URL from the provider that serves as the base for the OpenID configuration. For example, if the OpenID configuration is available at https://token.actions.githubusercontent.com/.well-known/openid-configuration, the provider URL would be https://token.actions.githubusercontent.com/ | 
**service_accounts** | **list[str]** | The service accounts associated with these provider settings | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


