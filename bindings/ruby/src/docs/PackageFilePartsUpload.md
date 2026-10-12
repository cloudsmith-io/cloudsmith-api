# CloudsmithApi::PackageFilePartsUpload

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **identifier** | **String** | The identifier for the file to use uploading parts. | [optional][readonly] |
| **upload_querystring** | **String** | The querystring to use for the next-step PUT upload. | [optional][readonly] |
| **upload_url** | **String** | The URL to use for the next-step PUT upload | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::PackageFilePartsUpload.new(
  identifier: null,
  upload_querystring: null,
  upload_url: null
)
```

