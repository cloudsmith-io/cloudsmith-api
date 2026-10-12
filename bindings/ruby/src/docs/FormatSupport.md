# CloudsmithApi::FormatSupport

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **dependencies** | **Boolean** | If true the package format supports dependencies | [optional] |
| **distributions** | **Boolean** | If true the package format supports distributions | [optional] |
| **file_lists** | **Boolean** | If true the package format supports file lists | [optional] |
| **filepaths** | **Boolean** | If true the package format supports filepaths | [optional] |
| **metadata** | **Boolean** | If true the package format supports metadata | [optional] |
| **upstreams** | [**FormatSupportUpstream**](FormatSupportUpstream.md) |  | [optional] |
| **versioning** | **Boolean** | If true the package format supports versioning | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::FormatSupport.new(
  dependencies: null,
  distributions: null,
  file_lists: null,
  filepaths: null,
  metadata: null,
  upstreams: null,
  versioning: null
)
```

