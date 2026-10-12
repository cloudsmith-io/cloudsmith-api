# CloudsmithApi::OrganizationCustomDomains

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **backend_kind** | **Integer** | The domain for a specific package format. | [optional][readonly] |
| **created_at** | **Time** |  | [optional][readonly] |
| **created_by** | **Integer** |  | [optional][readonly] |
| **dns_alias_value** | **String** | The CNAME value to use to publish this domain publicly. | [optional][readonly] |
| **dns_cert_name** | **String** | The CNAME name to create to allow us to generate a TLS cert. | [optional][readonly] |
| **dns_cert_value** | **String** | The CNAME value to use to allow us to generate a TLS cert. | [optional][readonly] |
| **domain_type** | **Integer** | The type for the custom domain. | [optional][readonly] |
| **enabled** | **Boolean** | If checked, the domain is enabled. | [optional][readonly] |
| **host** | **String** |  | [optional][readonly] |
| **namespace** | **Integer** |  | [optional][readonly] |
| **primary** | **Boolean** | If checked, this domain is the preferred/primary domain in the case that there are other overlapping domains (e.g. for the same repository, package format, etc.) | [optional][readonly][default to true] |
| **redirect_root** | **Boolean** | If checked, the domain root redirects to the repository. | [optional][readonly] |
| **redirect_root_url** | **String** | Where root requests should be redirected to if redirect_root is enabled. | [optional][readonly] |
| **repository** | [**OrganizationCustomDomainNestedRepo**](OrganizationCustomDomainNestedRepo.md) |  |  |
| **repository_only** | **Boolean** | If checked, the domain applies to a specific repository only. | [optional][readonly] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **validated** | **Boolean** | If validated, the domain is ready for requests. | [optional][readonly] |
| **validated_at** | **Time** |  | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OrganizationCustomDomains.new(
  backend_kind: null,
  created_at: null,
  created_by: null,
  dns_alias_value: null,
  dns_cert_name: null,
  dns_cert_value: null,
  domain_type: null,
  enabled: null,
  host: null,
  namespace: null,
  primary: null,
  redirect_root: null,
  redirect_root_url: null,
  repository: null,
  repository_only: null,
  slug_perm: null,
  validated: null,
  validated_at: null
)
```

