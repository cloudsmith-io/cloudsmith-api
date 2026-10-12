# CloudsmithApi::ConnectedRepositoryTargetSummary

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **is_private** | **Boolean** |  | [optional][readonly] |
| **is_public** | **Boolean** |  | [optional][readonly] |
| **package_count** | **Integer** |  | [optional][readonly] |
| **size** | **Integer** |  | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::ConnectedRepositoryTargetSummary.new(
  is_private: null,
  is_public: null,
  package_count: null,
  size: null
)
```

