
# RpmUpstreamRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authMode** | [**AuthModeEnum**](#AuthModeEnum) | The authentication mode to use when accessing this upstream.  |  [optional]
**authSecret** | **String** | Secret to provide with requests to upstream. |  [optional]
**authUsername** | **String** | Username to provide with requests to upstream. |  [optional]
**distroVersion** | **String** | The distribution version that packages found on this upstream will be associated with. | 
**extraHeader1** | **String** | The key for extra header #1 to send to upstream. |  [optional]
**extraHeader2** | **String** | The key for extra header #2 to send to upstream. |  [optional]
**extraValue1** | **String** | The value for extra header #1 to send to upstream. This is stored as plaintext, and is NOT encrypted. |  [optional]
**extraValue2** | **String** | The value for extra header #2 to send to upstream. This is stored as plaintext, and is NOT encrypted. |  [optional]
**gpgKeyInline** | **String** | A public GPG key to associate with packages found on this upstream. When using the Cloudsmith setup script, this GPG key will be automatically imported on your deployment machines to allow upstream packages to validate and install. |  [optional]
**gpgKeyUrl** | **String** | When provided, Cloudsmith will fetch, validate, and associate a public GPG key found at the provided URL. When using the Cloudsmith setup script, this GPG key will be automatically imported on your deployment machines to allow upstream packages to validate and install. |  [optional]
**gpgVerification** | [**GpgVerificationEnum**](#GpgVerificationEnum) | The GPG signature verification mode for this upstream. |  [optional]
**includeSources** | **Boolean** | When checked, source packages will be available from this upstream. |  [optional]
**isActive** | **Boolean** | Whether or not this upstream is active and ready for requests. |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) | The mode that this upstream should operate in. Upstream sources can be used to proxy resolved packages, as well as operate in a proxy/cache or cache only mode. |  [optional]
**name** | **String** | A descriptive name for this upstream source. A shortened version of this name will be used for tagging cached packages retrieved from this upstream. | 
**priority** | **java.math.BigInteger** | Upstream sources are selected for resolving requests by sequential order (1..n), followed by creation date. |  [optional]
**upstreamUrl** | **String** | The URL for this upstream source. This must be a fully qualified URL including any path elements required to reach the root of the repository.  | 
**verifySsl** | **Boolean** | If enabled, SSL certificates are verified when requests are made to this upstream. It&#39;s recommended to leave this enabled for all public sources to help mitigate Man-In-The-Middle (MITM) attacks. Please note this only applies to HTTPS upstreams. |  [optional]


<a name="AuthModeEnum"></a>
## Enum: AuthModeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
USERNAME_AND_PASSWORD | &quot;Username and Password&quot;


<a name="GpgVerificationEnum"></a>
## Enum: GpgVerificationEnum
Name | Value
---- | -----
ALLOW_ALL | &quot;Allow All&quot;
WARN_ON_INVALID | &quot;Warn on Invalid&quot;
REJECT_INVALID | &quot;Reject Invalid&quot;


<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
PROXY_ONLY | &quot;Proxy Only&quot;
CACHE_AND_PROXY | &quot;Cache and Proxy&quot;



