# CloudsmithApi::PackagesUploadConan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conan_channel** | **String** | Conan channel. | [optional] 
**conan_prefix** | **String** | Conan prefix (User). | [optional] 
**info_file** | **String** | The info file is an python file containing the package metadata. | [optional] 
**manifest_file** | **String** | The info file is an python file containing the package metadata. | [optional] 
**metadata_file** | **String** | The conan file is an python file containing the package metadata. | [optional] 
**package_file** | **String** | The primary file for the package. | 
**republish** | **BOOLEAN** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 


