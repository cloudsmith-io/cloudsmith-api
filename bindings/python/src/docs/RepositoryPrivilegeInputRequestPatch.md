# RepositoryPrivilegeInputRequestPatch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**privileges** | [**List[RepositoryPrivilegeDict]**](RepositoryPrivilegeDict.md) | List of objects with explicit privileges to the repository. | [optional] 

## Example

```python
from cloudsmith_api.models.repository_privilege_input_request_patch import RepositoryPrivilegeInputRequestPatch

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryPrivilegeInputRequestPatch from a JSON string
repository_privilege_input_request_patch_instance = RepositoryPrivilegeInputRequestPatch.from_json(json)
# print the JSON string representation of the object
print(RepositoryPrivilegeInputRequestPatch.to_json())

# convert the object into a dict
repository_privilege_input_request_patch_dict = repository_privilege_input_request_patch_instance.to_dict()
# create an instance of RepositoryPrivilegeInputRequestPatch from a dict
repository_privilege_input_request_patch_from_dict = RepositoryPrivilegeInputRequestPatch.from_dict(repository_privilege_input_request_patch_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


