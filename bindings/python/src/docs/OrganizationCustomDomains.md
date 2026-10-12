# OrganizationCustomDomains


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backend_kind** | **int** | The domain for a specific package format. | [optional] [readonly] 
**created_at** | **datetime** |  | [optional] [readonly] 
**created_by** | **int** |  | [optional] [readonly] 
**dns_alias_value** | **str** | The CNAME value to use to publish this domain publicly. | [optional] [readonly] 
**dns_cert_name** | **str** | The CNAME name to create to allow us to generate a TLS cert. | [optional] [readonly] 
**dns_cert_value** | **str** | The CNAME value to use to allow us to generate a TLS cert. | [optional] [readonly] 
**domain_type** | **int** | The type for the custom domain. | [optional] [readonly] 
**enabled** | **bool** | If checked, the domain is enabled. | [optional] [readonly] 
**host** | **str** |  | [optional] [readonly] 
**namespace** | **int** |  | [optional] [readonly] 
**primary** | **bool** | If checked, this domain is the preferred/primary domain in the case that there are other overlapping domains (e.g. for the same repository, package format, etc.) | [optional] [readonly] 
**redirect_root** | **bool** | If checked, the domain root redirects to the repository. | [optional] [readonly] 
**redirect_root_url** | **str** | Where root requests should be redirected to if redirect_root is enabled. | [optional] [readonly] 
**repository** | [**OrganizationCustomDomainNestedRepo**](OrganizationCustomDomainNestedRepo.md) |  | [optional] 
**repository_only** | **bool** | If checked, the domain applies to a specific repository only. | [optional] [readonly] 
**slug_perm** | **str** |  | [optional] [readonly] 
**validated** | **bool** | If validated, the domain is ready for requests. | [optional] [readonly] 
**validated_at** | **datetime** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.organization_custom_domains import OrganizationCustomDomains

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationCustomDomains from a JSON string
organization_custom_domains_instance = OrganizationCustomDomains.from_json(json)
# print the JSON string representation of the object
print(OrganizationCustomDomains.to_json())

# convert the object into a dict
organization_custom_domains_dict = organization_custom_domains_instance.to_dict()
# create an instance of OrganizationCustomDomains from a dict
organization_custom_domains_from_dict = OrganizationCustomDomains.from_dict(organization_custom_domains_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


