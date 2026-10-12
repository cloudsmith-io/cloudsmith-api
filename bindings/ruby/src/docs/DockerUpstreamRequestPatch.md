# CloudsmithApi::DockerUpstreamRequestPatch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **auth_certificate** | **String** | X.509 Certificate to use for mTLS authentication against the upstream | [optional] |
| **auth_certificate_key** | **String** | Certificate key to use for mTLS authentication against the upstream | [optional] |
| **auth_mode** | **String** | The authentication mode to use when accessing this upstream.  | [optional][default to &#39;None&#39;] |
| **auth_secret** | **String** | Secret to provide with requests to upstream. | [optional] |
| **auth_username** | **String** | Username to provide with requests to upstream. | [optional] |
| **extra_header_1** | **String** | The key for extra header #1 to send to upstream. | [optional] |
| **extra_header_2** | **String** | The key for extra header #2 to send to upstream. | [optional] |
| **extra_value_1** | **String** | The value for extra header #1 to send to upstream. This is stored as plaintext, and is NOT encrypted. | [optional] |
| **extra_value_2** | **String** | The value for extra header #2 to send to upstream. This is stored as plaintext, and is NOT encrypted. | [optional] |
| **is_active** | **Boolean** | Whether or not this upstream is active and ready for requests. | [optional] |
| **mode** | **String** | The mode that this upstream should operate in. Upstream sources can be used to proxy resolved packages, as well as operate in a proxy/cache or cache only mode. | [optional][default to &#39;Proxy Only&#39;] |
| **name** | **String** | A descriptive name for this upstream source. A shortened version of this name will be used for tagging cached packages retrieved from this upstream. | [optional] |
| **priority** | **Integer** | Upstream sources are selected for resolving requests by sequential order (1..n), followed by creation date. | [optional] |
| **upstream_url** | **String** | The URL for this upstream source. This must be a fully qualified URL including any path elements required to reach the root of the repository.  | [optional] |
| **verify_ssl** | **Boolean** | If enabled, SSL certificates are verified when requests are made to this upstream. It&#39;s recommended to leave this enabled for all public sources to help mitigate Man-In-The-Middle (MITM) attacks. Please note this only applies to HTTPS upstreams. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::DockerUpstreamRequestPatch.new(
  auth_certificate: null,
  auth_certificate_key: null,
  auth_mode: null,
  auth_secret: null,
  auth_username: null,
  extra_header_1: null,
  extra_header_2: null,
  extra_value_1: null,
  extra_value_2: null,
  is_active: null,
  mode: null,
  name: null,
  priority: null,
  upstream_url: null,
  verify_ssl: null
)
```

