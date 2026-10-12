# CloudsmithApi::ConanPackageUploadRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **conan_channel** | **String** | Conan channel. | [optional] |
| **conan_prefix** | **String** | Conan prefix (User). | [optional] |
| **info_file** | **String** | The info file is an python file containing the package metadata. | [optional] |
| **manifest_file** | **String** | The info file is an python file containing the package metadata. | [optional] |
| **metadata_file** | **String** | The conan file is an python file containing the package metadata. | [optional] |
| **name** | **String** | The name of this package. | [optional] |
| **package_file** | **String** | The primary file for the package. | [optional] |
| **republish** | **Boolean** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] |
| **tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] |
| **version** | **String** | The raw version for this package. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::ConanPackageUploadRequest.new(
  conan_channel: null,
  conan_prefix: null,
  info_file: null,
  manifest_file: null,
  metadata_file: null,
  name: null,
  package_file: null,
  republish: null,
  tags: null,
  version: null
)
```

