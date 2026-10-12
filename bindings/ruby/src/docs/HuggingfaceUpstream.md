# CloudsmithApi::HuggingfaceUpstream

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **auth_mode** | **String** | The authentication mode to use when accessing this upstream.  | [optional][default to &#39;None&#39;] |
| **auth_secret** | **String** | Secret to provide with requests to upstream. | [optional] |
| **auth_username** | **String** | Username to provide with requests to upstream. | [optional] |
| **available** | **Boolean** | Whether the upstream is available for use. | [optional][readonly] |
| **can_reindex** | **Boolean** | Whether the upstream can be reindexed. | [optional][readonly] |
| **created_at** | **Time** | The datetime the upstream source was created. | [optional][readonly] |
| **disable_reason** | **String** |  | [optional][readonly][default to &#39;N/A&#39;] |
| **disable_reason_text** | **String** | Human-readable explanation of why this upstream is disabled | [optional][readonly] |
| **extra_header_1** | **String** | The key for extra header #1 to send to upstream. | [optional] |
| **extra_header_2** | **String** | The key for extra header #2 to send to upstream. | [optional] |
| **extra_value_1** | **String** | The value for extra header #1 to send to upstream. This is stored as plaintext, and is NOT encrypted. | [optional] |
| **extra_value_2** | **String** | The value for extra header #2 to send to upstream. This is stored as plaintext, and is NOT encrypted. | [optional] |
| **has_failed_signature_verification** | **Boolean** | Whether the upstream has failed signature verification. | [optional][readonly] |
| **index_package_count** | **Integer** | The number of packages available in this upstream source | [optional][readonly] |
| **index_status** | **String** | The current indexing status of this upstream source | [optional][readonly] |
| **is_active** | **Boolean** | Whether or not this upstream is active and ready for requests. | [optional] |
| **last_indexed** | **String** | The last time this upstream source was indexed | [optional][readonly] |
| **mode** | **String** | The mode that this upstream should operate in. Upstream sources can be used to proxy resolved packages, as well as operate in a proxy/cache or cache only mode. | [optional][default to &#39;Proxy Only&#39;] |
| **name** | **String** | A descriptive name for this upstream source. A shortened version of this name will be used for tagging cached packages retrieved from this upstream. |  |
| **pending_validation** | **Boolean** | When true, this upstream source is pending validation. | [optional][readonly] |
| **priority** | **Integer** | Upstream sources are selected for resolving requests by sequential order (1..n), followed by creation date. | [optional] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **updated_at** | **Time** |  | [optional][readonly] |
| **upstream_url** | **String** | The URL for this upstream source. This must be a fully qualified URL including any path elements required to reach the root of the repository.  |  |
| **verify_ssl** | **Boolean** | If enabled, SSL certificates are verified when requests are made to this upstream. It&#39;s recommended to leave this enabled for all public sources to help mitigate Man-In-The-Middle (MITM) attacks. Please note this only applies to HTTPS upstreams. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::HuggingfaceUpstream.new(
  auth_mode: null,
  auth_secret: null,
  auth_username: null,
  available: null,
  can_reindex: null,
  created_at: null,
  disable_reason: null,
  disable_reason_text: null,
  extra_header_1: null,
  extra_header_2: null,
  extra_value_1: null,
  extra_value_2: null,
  has_failed_signature_verification: null,
  index_package_count: null,
  index_status: null,
  is_active: null,
  last_indexed: null,
  mode: null,
  name: null,
  pending_validation: null,
  priority: null,
  slug_perm: null,
  updated_at: null,
  upstream_url: null,
  verify_ssl: null
)
```

