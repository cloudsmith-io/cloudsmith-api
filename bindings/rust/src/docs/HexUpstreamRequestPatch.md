# HexUpstreamRequestPatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auth_mode** | **String** | The authentication mode to use when accessing this upstream.  | [optional] [default to null]
**auth_secret** | **String** | Secret to provide with requests to upstream. | [optional] [default to null]
**auth_username** | **String** | Username to provide with requests to upstream. | [optional] [default to null]
**extra_header_1** | **String** | The key for extra header #1 to send to upstream. | [optional] [default to null]
**extra_header_2** | **String** | The key for extra header #2 to send to upstream. | [optional] [default to null]
**extra_value_1** | **String** | The value for extra header #1 to send to upstream. This is stored as plaintext, and is NOT encrypted. | [optional] [default to null]
**extra_value_2** | **String** | The value for extra header #2 to send to upstream. This is stored as plaintext, and is NOT encrypted. | [optional] [default to null]
**is_active** | **bool** | Whether or not this upstream is active and ready for requests. | [optional] [default to null]
**mode** | **String** | The mode that this upstream should operate in. Upstream sources can be used to proxy resolved packages, as well as operate in a proxy/cache or cache only mode. | [optional] [default to null]
**name** | **String** | A descriptive name for this upstream source. A shortened version of this name will be used for tagging cached packages retrieved from this upstream. | [optional] [default to null]
**priority** | **i32** | Upstream sources are selected for resolving requests by sequential order (1..n), followed by creation date. | [optional] [default to null]
**upstream_url** | **String** | The URL for this upstream source. This must be a fully qualified URL including any path elements required to reach the root of the repository.  | [optional] [default to null]
**verify_ssl** | **bool** | If enabled, SSL certificates are verified when requests are made to this upstream. It&#39;s recommended to leave this enabled for all public sources to help mitigate Man-In-The-Middle (MITM) attacks. Please note this only applies to HTTPS upstreams. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


