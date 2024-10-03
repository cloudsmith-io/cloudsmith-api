# CloudsmithApi::RpmUpstreamRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auth_mode** | **String** | The authentication mode to use when accessing this upstream.  | [optional] [default to &#39;None&#39;]
**auth_secret** | **String** | Secret to provide with requests to upstream. | [optional] 
**auth_username** | **String** | Username to provide with requests to upstream. | [optional] 
**distro_version** | **String** | The distribution version that packages found on this upstream will be associated with. | 
**extra_header_1** | **String** | The key for extra header #1 to send to upstream. | [optional] 
**extra_header_2** | **String** | The key for extra header #2 to send to upstream. | [optional] 
**extra_value_1** | **String** | The value for extra header #1 to send to upstream. This is stored as plaintext, and is NOT encrypted. | [optional] 
**extra_value_2** | **String** | The value for extra header #2 to send to upstream. This is stored as plaintext, and is NOT encrypted. | [optional] 
**gpg_key_inline** | **String** | A public GPG key to associate with packages found on this upstream. When using the Cloudsmith setup script, this GPG key will be automatically imported on your deployment machines to allow upstream packages to validate and install. | [optional] 
**gpg_key_url** | **String** | When provided, Cloudsmith will fetch, validate, and associate a public GPG key found at the provided URL. When using the Cloudsmith setup script, this GPG key will be automatically imported on your deployment machines to allow upstream packages to validate and install. | [optional] 
**gpg_verification** | **String** | The GPG signature verification mode for this upstream. | [optional] [default to &#39;Allow All&#39;]
**include_sources** | **BOOLEAN** | When checked, source packages will be available from this upstream. | [optional] 
**is_active** | **BOOLEAN** | Whether or not this upstream is active and ready for requests. | [optional] 
**mode** | **String** | The mode that this upstream should operate in. Upstream sources can be used to proxy resolved packages, as well as operate in a proxy/cache or cache only mode. | [optional] [default to &#39;Proxy Only&#39;]
**name** | **String** | A descriptive name for this upstream source. A shortened version of this name will be used for tagging cached packages retrieved from this upstream. | 
**priority** | **Integer** | Upstream sources are selected for resolving requests by sequential order (1..n), followed by creation date. | [optional] 
**upstream_url** | **String** | The URL for this upstream source. This must be a fully qualified URL including any path elements required to reach the root of the repository.  | 
**verify_ssl** | **BOOLEAN** | If enabled, SSL certificates are verified when requests are made to this upstream. It&#39;s recommended to leave this enabled for all public sources to help mitigate Man-In-The-Middle (MITM) attacks. Please note this only applies to HTTPS upstreams. | [optional] 


