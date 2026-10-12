# CloudsmithApi::HelmPackageUploadRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **package_file** | **String** | The primary file for the package. |  |
| **provenance_file** | **String** | The provenance file containing the signature for the chart. If one is not provided, it will be generated automatically. | [optional] |
| **republish** | **Boolean** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] |
| **tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::HelmPackageUploadRequest.new(
  package_file: null,
  provenance_file: null,
  republish: null,
  tags: null
)
```

