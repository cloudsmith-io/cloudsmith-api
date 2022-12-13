
# RepositoryPrivilegeDict

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**privilege** | [**PrivilegeEnum**](#PrivilegeEnum) | The level of privilege that the user or team should be granted to the specified repository. | 
**service** | **String** | The service identifier (slug). |  [optional]
**team** | **String** | The team identifier (slug). |  [optional]
**user** | **String** | The user identifier (slug). |  [optional]


<a name="PrivilegeEnum"></a>
## Enum: PrivilegeEnum
Name | Value
---- | -----
ADMIN | &quot;Admin&quot;
WRITE | &quot;Write&quot;
READ | &quot;Read&quot;



