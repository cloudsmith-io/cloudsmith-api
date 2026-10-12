# CloudsmithApi::PackageFileUpload

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **identifier** | **String** | The identifier for the file to use when creating packages | [optional][readonly] |
| **upload_fields** | **Object** | The dictionary of fields that must be sent with POST uploads | [optional][readonly] |
| **upload_headers** | **Object** | The dictionary of headers that must be sent with uploads | [optional][readonly] |
| **upload_querystring** | **String** | The querystring to use for the next-step POST or PUT upload | [optional][readonly] |
| **upload_url** | **String** | The URL to use for the next-step POST or PUT upload | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::PackageFileUpload.new(
  identifier: null,
  upload_fields: null,
  upload_headers: null,
  upload_querystring: null,
  upload_url: null
)
```

