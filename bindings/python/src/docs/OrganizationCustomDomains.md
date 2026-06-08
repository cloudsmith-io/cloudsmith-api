# OrganizationCustomDomains

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backend_kind** | **int** | The domain for a specific package format. | [optional] 
**created_at** | **datetime** |  | [optional] 
**created_by** | **int** |  | [optional] 
**dns_alias_value** | **str** | The CNAME value to use to publish this domain publicly. | [optional] 
**dns_cert_name** | **str** | The CNAME name to create to allow us to generate a TLS cert. | [optional] 
**dns_cert_value** | **str** | The CNAME value to use to allow us to generate a TLS cert. | [optional] 
**domain_type** | **int** | The type for the custom domain. | [optional] 
**enabled** | **bool** | If checked, the domain is enabled. | [optional] 
**host** | **str** |  | [optional] 
**namespace** | **int** |  | [optional] 
**primary** | **bool** | If checked, this domain is the preferred/primary domain in the case that there are other overlapping domains (e.g. for the same repository, package format, etc.) | [optional] [default to True]
**redirect_root** | **bool** | If checked, the domain root redirects to the repository. | [optional] 
**redirect_root_url** | **str** | Where root requests should be redirected to if redirect_root is enabled. | [optional] 
**repository** | [**OrganizationCustomDomainNestedRepo**](OrganizationCustomDomainNestedRepo.md) |  | 
**repository_only** | **bool** | If checked, the domain applies to a specific repository only. | [optional] 
**slug_perm** | **str** |  | [optional] 
**validated** | **bool** | If validated, the domain is ready for requests. | [optional] 
**validated_at** | **datetime** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


