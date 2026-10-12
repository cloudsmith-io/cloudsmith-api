# Oidc1


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **str** | Serialized JWT to be used for authentication. | [optional] 

## Example

```python
from cloudsmith_api.models.oidc1 import Oidc1

# TODO update the JSON string below
json = "{}"
# create an instance of Oidc1 from a JSON string
oidc1_instance = Oidc1.from_json(json)
# print the JSON string representation of the object
print(Oidc1.to_json())

# convert the object into a dict
oidc1_dict = oidc1_instance.to_dict()
# create an instance of Oidc1 from a dict
oidc1_from_dict = Oidc1.from_dict(oidc1_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


