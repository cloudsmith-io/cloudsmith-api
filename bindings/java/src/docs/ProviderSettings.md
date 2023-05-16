
# ProviderSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**claims** | **Object** | The set of claims that any received tokens from the provider must contain to authenticate as the configured service account. | 
**enabled** | **Boolean** | Whether the provider settings should be used for incoming OIDC requests. | 
**name** | **String** | The name of the provider settings are being configured for | 
**providerUrl** | **String** | The URL from the provider that serves as the base for the OpenID configuration. For example, if the OpenID configuration is available at https://token.actions.githubusercontent.com/.well-known/openid-configuration, the provider URL would be https://token.actions.githubusercontent.com/ | 
**serviceAccounts** | **List&lt;String&gt;** | The service accounts associated with these provider settings | 
**slug** | **String** | The slug of the provider settings |  [optional]
**slugPerm** | **String** | The unique, immutable identifier of the provider settings. |  [optional]



