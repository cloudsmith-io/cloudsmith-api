# CloudsmithApi::CranPackageUploadRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **architecture** | **String** | Binary package uploads for macOS should specify the architecture they were built for. | [optional] |
| **package_file** | **String** | The primary file for the package. | [optional] |
| **r_version** | **String** | Binary package uploads should specify the version of R they were built for. | [optional] |
| **republish** | **Boolean** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] |
| **tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::CranPackageUploadRequest.new(
  architecture: null,
  package_file: null,
  r_version: null,
  republish: null,
  tags: null
)
```

