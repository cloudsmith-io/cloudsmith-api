
# PackageFileUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filename** | **String** | Filename for the package file upload. | 
**md5Checksum** | **String** | MD5 checksum for a POST-based package file upload. |  [optional]
**method** | [**MethodEnum**](#MethodEnum) | The method to use for package file upload. |  [optional]
**sha256Checksum** | **String** | SHA256 checksum for a PUT-based package file upload. |  [optional]


<a name="MethodEnum"></a>
## Enum: MethodEnum
Name | Value
---- | -----
PUT_PARTS | &quot;put_parts&quot;
PUT | &quot;put&quot;
POST | &quot;post&quot;
PRESIGNED | &quot;presigned&quot;
UNSIGNED_PUT | &quot;unsigned_put&quot;



