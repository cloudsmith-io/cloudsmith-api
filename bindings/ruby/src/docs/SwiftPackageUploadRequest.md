# CloudsmithApi::SwiftPackageUploadRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **author_name** | **String** | The name of the author of the package. | [optional] |
| **author_org** | **String** | The organization of the author. | [optional] |
| **license_url** | **String** | The license URL of this package. | [optional] |
| **name** | **String** | The name of this package. |  |
| **package_file** | **String** | The primary file for the package. |  |
| **readme_url** | **String** | The URL of the readme for the package. | [optional] |
| **repository_url** | **String** | The URL of the SCM repository for the package. | [optional] |
| **republish** | **Boolean** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] |
| **scope** | **String** | A scope provides a namespace for related packages within the package registry. |  |
| **tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] |
| **version** | **String** | The raw version for this package. |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::SwiftPackageUploadRequest.new(
  author_name: null,
  author_org: null,
  license_url: null,
  name: null,
  package_file: null,
  readme_url: null,
  repository_url: null,
  republish: null,
  scope: null,
  tags: null,
  version: null
)
```

