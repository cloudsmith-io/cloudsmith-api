# CloudsmithApi::RepositoryTokenRefresh

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **access_private_broadcasts** | **Boolean** | If enabled, this token can be used for private broadcasts | [optional][readonly] |
| **clients** | **Integer** |  | [optional][readonly] |
| **created_at** | **Time** | The datetime the token was updated at. | [optional][readonly] |
| **created_by** | **String** |  | [optional][readonly] |
| **created_by_url** | **String** |  | [optional][readonly] |
| **default** | **Boolean** | If selected this is the default token for this repository. | [optional][readonly] |
| **disable_url** | **String** |  | [optional][readonly] |
| **downloads** | **Integer** |  | [optional][readonly] |
| **enable_url** | **String** |  | [optional][readonly] |
| **eula_accepted** | [**Eula**](Eula.md) |  | [optional] |
| **eula_accepted_at** | **Time** | The datetime the EULA was accepted at. | [optional][readonly] |
| **eula_accepted_from** | **String** |  | [optional][readonly] |
| **eula_required** | **Boolean** | If checked, a EULA acceptance is required for this token. | [optional] |
| **has_limits** | **Boolean** |  | [optional][readonly] |
| **identifier** | **Integer** | Deprecated (23-05-15): Please use &#39;slug_perm&#39; instead. Previously: A monotonically increasing number that identified an entitlement within a repository. | [optional][readonly] |
| **is_active** | **Boolean** | If enabled, the token will allow downloads based on configured restrictions (if any). | [optional] |
| **is_limited** | **Boolean** |  | [optional][readonly] |
| **limit_bandwidth** | **Integer** | The maximum download bandwidth allowed for the token. Values are expressed as the selected unit of bandwidth. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.  | [optional] |
| **limit_bandwidth_unit** | **String** |  | [optional] |
| **limit_date_range_from** | **Time** | The starting date/time the token is allowed to be used from. | [optional] |
| **limit_date_range_to** | **Time** | The ending date/time the token is allowed to be used until. | [optional] |
| **limit_num_clients** | **Integer** | The maximum number of unique clients allowed for the token. Please note that since clients are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. | [optional] |
| **limit_num_downloads** | **Integer** | The maximum number of downloads allowed for the token. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. | [optional] |
| **limit_package_query** | **String** | The package-based search query to apply to restrict downloads to. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. This will still allow access to non-package files, such as metadata. | [optional] |
| **limit_path_query** | **String** | THIS WILL SOON BE DEPRECATED, please use limit_package_query instead. The path-based search query to apply to restrict downloads to. This supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. The path evaluated does not include the domain name, the namespace, the entitlement code used, the package format, etc. and it always starts with a forward slash. | [optional] |
| **metadata** | **Object** |  | [optional] |
| **name** | **String** |  | [optional][readonly] |
| **refresh_url** | **String** |  | [optional][readonly] |
| **reset_url** | **String** |  | [optional][readonly] |
| **scheduled_reset_at** | **Time** | The time at which the scheduled reset period has elapsed and the token limits were automatically reset to zero. | [optional] |
| **scheduled_reset_period** | **String** |  | [optional] |
| **self_url** | **String** |  | [optional][readonly] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **token** | **String** |  | [optional] |
| **updated_at** | **Time** | The datetime the token was updated at. | [optional][readonly] |
| **updated_by** | **String** |  | [optional][readonly] |
| **updated_by_url** | **String** |  | [optional][readonly] |
| **usage** | **String** |  | [optional][readonly] |
| **user** | **String** |  | [optional][readonly] |
| **user_url** | **String** |  | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryTokenRefresh.new(
  access_private_broadcasts: null,
  clients: null,
  created_at: null,
  created_by: null,
  created_by_url: null,
  default: null,
  disable_url: null,
  downloads: null,
  enable_url: null,
  eula_accepted: null,
  eula_accepted_at: null,
  eula_accepted_from: null,
  eula_required: null,
  has_limits: null,
  identifier: null,
  is_active: null,
  is_limited: null,
  limit_bandwidth: null,
  limit_bandwidth_unit: null,
  limit_date_range_from: null,
  limit_date_range_to: null,
  limit_num_clients: null,
  limit_num_downloads: null,
  limit_package_query: null,
  limit_path_query: null,
  metadata: null,
  name: null,
  refresh_url: null,
  reset_url: null,
  scheduled_reset_at: null,
  scheduled_reset_period: null,
  self_url: null,
  slug_perm: null,
  token: null,
  updated_at: null,
  updated_by: null,
  updated_by_url: null,
  usage: null,
  user: null,
  user_url: null
)
```

