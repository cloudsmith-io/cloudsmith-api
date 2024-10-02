# DebUpstream

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auth_mode** | **str** | The authentication mode to use when accessing this upstream.  | [optional] [default to 'None']
**auth_secret** | **str** | Secret to provide with requests to upstream. | [optional] 
**auth_username** | **str** | Username to provide with requests to upstream. | [optional] 
**component** | **str** | The component to fetch from the upstream | [optional] 
**created_at** | **datetime** | The datetime the upstream source was created. | [optional] 
**disable_reason** | **str** |  | [optional] [default to 'N/A']
**distro_versions** | **list[str]** | The distribution version that packages found on this upstream could be associated with. | 
**extra_header_1** | **str** | The key for extra header #1 to send to upstream. | [optional] 
**extra_header_2** | **str** | The key for extra header #2 to send to upstream. | [optional] 
**extra_value_1** | **str** | The value for extra header #1 to send to upstream. This is stored as plaintext, and is NOT encrypted. | [optional] 
**extra_value_2** | **str** | The value for extra header #2 to send to upstream. This is stored as plaintext, and is NOT encrypted. | [optional] 
**gpg_key_inline** | **str** | A public GPG key to associate with packages found on this upstream. When using the Cloudsmith setup script, this GPG key will be automatically imported on your deployment machines to allow upstream packages to validate and install. | [optional] 
**gpg_key_url** | **str** | When provided, Cloudsmith will fetch, validate, and associate a public GPG key found at the provided URL. When using the Cloudsmith setup script, this GPG key will be automatically imported on your deployment machines to allow upstream packages to validate and install. | [optional] 
**gpg_verification** | **str** | The GPG signature verification mode for this upstream. | [optional] [default to 'Allow All']
**include_sources** | **bool** | When true, source packages will be available from this upstream. | [optional] 
**is_active** | **bool** | Whether or not this upstream is active and ready for requests. | [optional] 
**mode** | **str** | The mode that this upstream should operate in. Upstream sources can be used to proxy resolved packages, as well as operate in a proxy/cache or cache only mode. | [optional] [default to 'Proxy Only']
**name** | **str** | A descriptive name for this upstream source. A shortened version of this name will be used for tagging cached packages retrieved from this upstream. | 
**pending_validation** | **bool** | When true, this upstream source is pending validation. | [optional] 
**priority** | **int** | Upstream sources are selected for resolving requests by sequential order (1..n), followed by creation date. | [optional] 
**slug_perm** | **str** |  | [optional] 
**updated_at** | **datetime** |  | [optional] 
**upstream_distribution** | **str** | The distribution to fetch from the upstream | [optional] 
**upstream_url** | **str** | The URL for this upstream source. This must be a fully qualified URL including any path elements required to reach the root of the repository.  | 
**verification_status** | **str** | The signature verification status for this upstream. | [optional] [default to 'Unknown']
**verify_ssl** | **bool** | If enabled, SSL certificates are verified when requests are made to this upstream. It&#39;s recommended to leave this enabled for all public sources to help mitigate Man-In-The-Middle (MITM) attacks. Please note this only applies to HTTPS upstreams. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


