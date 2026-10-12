# CloudsmithApi::FormatSupport

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **dependencies** | **Boolean** | If true the package format supports dependencies |  |
| **distributions** | **Boolean** | If true the package format supports distributions |  |
| **file_lists** | **Boolean** | If true the package format supports file lists |  |
| **filepaths** | **Boolean** | If true the package format supports filepaths |  |
| **metadata** | **Boolean** | If true the package format supports metadata |  |
| **upstreams** | [**FormatSupportUpstream**](FormatSupportUpstream.md) |  |  |
| **versioning** | **Boolean** | If true the package format supports versioning |  |

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

