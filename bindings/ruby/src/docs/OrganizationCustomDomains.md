# CloudsmithApi::OrganizationCustomDomains

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backend_kind** | **Integer** | The domain for a specific package format. | [optional] 
**created_at** | **DateTime** |  | [optional] 
**created_by** | **Integer** |  | [optional] 
**dns_alias_value** | **String** | The CNAME value to use to publish this domain publicly. | [optional] 
**dns_cert_name** | **String** | The CNAME name to create to allow us to generate a TLS cert. | [optional] 
**dns_cert_value** | **String** | The CNAME value to use to allow us to generate a TLS cert. | [optional] 
**domain_type** | **Integer** | The type for the custom domain. | [optional] 
**enabled** | **BOOLEAN** | If checked, the domain is enabled. | [optional] 
**host** | **String** |  | [optional] 
**namespace** | **Integer** |  | [optional] 
**primary** | **BOOLEAN** | If checked, this domain is the preferred/primary domain in the case that there are other overlapping domains (e.g. for the same repository, package format, etc.) | [optional] [default to true]
**redirect_root** | **BOOLEAN** | If checked, the domain root redirects to the repository. | [optional] 
**redirect_root_url** | **String** | Where root requests should be redirected to if redirect_root is enabled. | [optional] 
**repository** | [**OrganizationCustomDomainNestedRepo**](OrganizationCustomDomainNestedRepo.md) |  | 
**repository_only** | **BOOLEAN** | If checked, the domain applies to a specific repository only. | [optional] 
**slug_perm** | **String** |  | [optional] 
**validated** | **BOOLEAN** | If validated, the domain is ready for requests. | [optional] 
**validated_at** | **DateTime** |  | [optional] 


