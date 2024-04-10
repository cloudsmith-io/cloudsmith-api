# CloudsmithApi::ProviderSettingsRequestPatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**claims** | **Object** | The set of claims that any received tokens from the provider must contain to authenticate as the configured service account. | [optional] 
**enabled** | **BOOLEAN** | Whether the provider settings should be used for incoming OIDC requests. | [optional] 
**name** | **String** | The name of the provider settings are being configured for | [optional] 
**provider_url** | **String** | The URL from the provider that serves as the base for the OpenID configuration. For example, if the OpenID configuration is available at https://token.actions.githubusercontent.com/.well-known/openid-configuration, the provider URL would be https://token.actions.githubusercontent.com/ | [optional] 
**service_accounts** | **Array&lt;String&gt;** | The service accounts associated with these provider settings | [optional] 


