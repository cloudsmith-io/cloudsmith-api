# DockerUpstreamRequestPatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auth_certificate** | **str** | X.509 Certificate to use for mTLS authentication against the upstream | [optional] 
**auth_certificate_key** | **str** | Certificate key to use for mTLS authentication against the upstream | [optional] 
**auth_mode** | **str** | The authentication mode to use when accessing this upstream.  | [optional] [default to 'None']
**auth_secret** | **str** | Secret to provide with requests to upstream. | [optional] 
**auth_username** | **str** | Username to provide with requests to upstream. | [optional] 
**extra_header_1** | **str** | The key for extra header #1 to send to upstream. | [optional] 
**extra_header_2** | **str** | The key for extra header #2 to send to upstream. | [optional] 
**extra_value_1** | **str** | The value for extra header #1 to send to upstream. This is stored as plaintext, and is NOT encrypted. | [optional] 
**extra_value_2** | **str** | The value for extra header #2 to send to upstream. This is stored as plaintext, and is NOT encrypted. | [optional] 
**is_active** | **bool** | Whether or not this upstream is active and ready for requests. | [optional] 
**mode** | **str** | The mode that this upstream should operate in. Upstream sources can be used to proxy resolved packages, as well as operate in a proxy/cache or cache only mode. | [optional] [default to 'Proxy Only']
**name** | **str** | A descriptive name for this upstream source. A shortened version of this name will be used for tagging cached packages retrieved from this upstream. | [optional] 
**priority** | **int** | Upstream sources are selected for resolving requests by sequential order (1..n), followed by creation date. | [optional] 
**upstream_url** | **str** | The URL for this upstream source. This must be a fully qualified URL including any path elements required to reach the root of the repository.  | [optional] 
**verify_ssl** | **bool** | If enabled, SSL certificates are verified when requests are made to this upstream. It&#39;s recommended to leave this enabled for all public sources to help mitigate Man-In-The-Middle (MITM) attacks. Please note this only applies to HTTPS upstreams. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


