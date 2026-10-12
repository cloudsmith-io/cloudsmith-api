# CloudsmithApi::GenericPackageUploadRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **filepath** | **String** | The full filepath of the package including filename. | [optional] |
| **name** | **String** | The name of this package. | [optional] |
| **package_file** | **String** | The primary file for the package. | [optional] |
| **republish** | **Boolean** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] |
| **tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] |
| **version** | **String** | The raw version for this package. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::GenericPackageUploadRequest.new(
  filepath: null,
  name: null,
  package_file: null,
  republish: null,
  tags: null,
  version: null
)
```

