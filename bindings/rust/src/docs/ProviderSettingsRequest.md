# ProviderSettingsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**claims** | [***Value**](Value.md) | The set of claims that any received tokens from the provider must contain to authenticate as the configured service account. | [default to null]
**enabled** | **bool** | Whether the provider settings should be used for incoming OIDC requests. | [default to null]
**name** | **String** | The name of the provider settings are being configured for | [default to null]
**provider_url** | **String** | The URL from the provider that serves as the base for the OpenID configuration. For example, if the OpenID configuration is available at https://token.actions.githubusercontent.com/.well-known/openid-configuration, the provider URL would be https://token.actions.githubusercontent.com/ | [default to null]
**service_accounts** | **Vec<String>** | The service accounts associated with these provider settings | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


