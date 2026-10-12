# RepositoryPrivilegeDict


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**privilege** | **str** | The level of privilege that the user or team should be granted to the specified repository. | 
**service** | **str** | The service identifier (slug). | [optional] 
**team** | **str** | The team identifier (slug). | [optional] 
**user** | **str** | The user identifier (slug). | [optional] 

## Example

```python
from cloudsmith_api.models.repository_privilege_dict import RepositoryPrivilegeDict

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryPrivilegeDict from a JSON string
repository_privilege_dict_instance = RepositoryPrivilegeDict.from_json(json)
# print the JSON string representation of the object
print(RepositoryPrivilegeDict.to_json())

# convert the object into a dict
repository_privilege_dict_dict = repository_privilege_dict_instance.to_dict()
# create an instance of RepositoryPrivilegeDict from a dict
repository_privilege_dict_from_dict = RepositoryPrivilegeDict.from_dict(repository_privilege_dict_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


