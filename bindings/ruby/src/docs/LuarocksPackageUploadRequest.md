# CloudsmithApi::LuarocksPackageUploadRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **package_file** | **String** | The primary file for the package. | [optional] |
| **republish** | **Boolean** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] |
| **tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::LuarocksPackageUploadRequest.new(
  package_file: null,
  republish: null,
  tags: null
)
```

