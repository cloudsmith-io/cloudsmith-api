# CloudsmithApi::PackageFile

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cdn_url** | **String** |  | [optional][readonly] |
| **checksum_md5** | **String** |  | [optional][readonly] |
| **checksum_sha1** | **String** |  | [optional][readonly] |
| **checksum_sha256** | **String** |  | [optional][readonly] |
| **checksum_sha512** | **String** |  | [optional][readonly] |
| **downloads** | **Integer** |  | [optional][readonly] |
| **filename** | **String** |  | [optional][readonly] |
| **is_downloadable** | **Boolean** |  | [optional][readonly] |
| **is_primary** | **Boolean** |  | [optional][readonly] |
| **is_synchronised** | **Boolean** |  | [optional][readonly] |
| **signature_url** | **String** |  | [optional][readonly] |
| **size** | **Integer** | The calculated size of the file. | [optional][readonly] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **tag** | **String** | Freeform descriptor that describes what the file is. | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::PackageFile.new(
  cdn_url: null,
  checksum_md5: null,
  checksum_sha1: null,
  checksum_sha256: null,
  checksum_sha512: null,
  downloads: null,
  filename: null,
  is_downloadable: null,
  is_primary: null,
  is_synchronised: null,
  signature_url: null,
  size: null,
  slug_perm: null,
  tag: null
)
```

