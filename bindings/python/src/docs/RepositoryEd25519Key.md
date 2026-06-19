# RepositoryEd25519Key

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** | If selected this is the active key for this repository. | [optional] 
**created_at** | **datetime** |  | [optional] 
**default** | **bool** | If selected this is the default key for this repository. | [optional] 
**fingerprint** | **str** | Uppercase hex-encoded SHA-256 fingerprint of the public key. | [optional] 
**fingerprint_short** | **str** |  | [optional] 
**public_key** | **str** | The public key given to repository users. | [optional] 
**public_key_wire** | **str** | The public key in &#x60;&lt;name&gt;:&lt;base64&gt;&#x60; wire format, ready to paste into Nix &#x60;trusted-public-keys&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


