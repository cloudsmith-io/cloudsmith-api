# OrganizationCustomDomainNestedRepo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | A descriptive name for the repository. | [optional] [readonly] 
**slug** | **str** | The slug identifies the repository in URIs. | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.organization_custom_domain_nested_repo import OrganizationCustomDomainNestedRepo

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationCustomDomainNestedRepo from a JSON string
organization_custom_domain_nested_repo_instance = OrganizationCustomDomainNestedRepo.from_json(json)
# print the JSON string representation of the object
print(OrganizationCustomDomainNestedRepo.to_json())

# convert the object into a dict
organization_custom_domain_nested_repo_dict = organization_custom_domain_nested_repo_instance.to_dict()
# create an instance of OrganizationCustomDomainNestedRepo from a dict
organization_custom_domain_nested_repo_from_dict = OrganizationCustomDomainNestedRepo.from_dict(organization_custom_domain_nested_repo_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


