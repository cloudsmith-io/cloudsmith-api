# CloudsmithApi::RepositoryEd25519Key

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **BOOLEAN** | If selected this is the active key for this repository. | [optional] 
**created_at** | **DateTime** |  | [optional] 
**default** | **BOOLEAN** | If selected this is the default key for this repository. | [optional] 
**fingerprint** | **String** | Uppercase hex-encoded SHA-256 fingerprint of the public key. | [optional] 
**fingerprint_short** | **String** |  | [optional] 
**public_key** | **String** | The public key given to repository users. | [optional] 
**public_key_wire** | **String** | The public key in &#x60;&lt;name&gt;:&lt;base64&gt;&#x60; wire format, ready to paste into Nix &#x60;trusted-public-keys&#x60;. | [optional] 


