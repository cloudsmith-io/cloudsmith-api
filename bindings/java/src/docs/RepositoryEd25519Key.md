
# RepositoryEd25519Key

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | If selected this is the active key for this repository. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**_default** | **Boolean** | If selected this is the default key for this repository. |  [optional]
**fingerprint** | **String** | Uppercase hex-encoded SHA-256 fingerprint of the public key. |  [optional]
**fingerprintShort** | **String** |  |  [optional]
**publicKey** | **String** | The public key given to repository users. |  [optional]
**publicKeyWire** | **String** | The public key in &#x60;&lt;name&gt;:&lt;base64&gt;&#x60; wire format, ready to paste into Nix &#x60;trusted-public-keys&#x60;. |  [optional]



