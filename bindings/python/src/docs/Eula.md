# Eula


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **str** | A unique identifier that you can use for your own EULA tracking purposes. This might be a date, or a semantic version, etc. The only requirement is that it is unique across multiple EULAs. | [optional] 
**number** | **int** | A sequential identifier that increments by one for each new commit in a repository. | [optional] 

## Example

```python
from cloudsmith_api.models.eula import Eula

# TODO update the JSON string below
json = "{}"
# create an instance of Eula from a JSON string
eula_instance = Eula.from_json(json)
# print the JSON string representation of the object
print(Eula.to_json())

# convert the object into a dict
eula_dict = eula_instance.to_dict()
# create an instance of Eula from a dict
eula_from_dict = Eula.from_dict(eula_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


