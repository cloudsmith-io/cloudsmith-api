# CloudsmithApi::PackageBulkActionResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **action** | **String** | The action that was performed. | [optional][readonly] |
| **packages_actioned** | **Array&lt;String&gt;** | List of package identifiers that were successfully actioned. | [optional][readonly] |
| **packages_failed_to_action** | **Hash&lt;String, Hash&lt;String, String&gt;&gt;** | Dictionary of package identifiers that failed with their error details. | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::PackageBulkActionResponse.new(
  action: null,
  packages_actioned: null,
  packages_failed_to_action: null
)
```

