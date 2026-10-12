# RepositoryPrivilegeInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**privileges** | [**List[RepositoryPrivilegeDict]**](RepositoryPrivilegeDict.md) | List of objects with explicit privileges to the repository. | 

## Example

```python
from cloudsmith_api.models.repository_privilege_input import RepositoryPrivilegeInput

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryPrivilegeInput from a JSON string
repository_privilege_input_instance = RepositoryPrivilegeInput.from_json(json)
# print the JSON string representation of the object
print(RepositoryPrivilegeInput.to_json())

# convert the object into a dict
repository_privilege_input_dict = repository_privilege_input_instance.to_dict()
# create an instance of RepositoryPrivilegeInput from a dict
repository_privilege_input_from_dict = RepositoryPrivilegeInput.from_dict(repository_privilege_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


