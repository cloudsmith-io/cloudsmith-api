

# SwiftUpstreamRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authMode** | **String** | The authentication mode to use when accessing this upstream.  |  [optional] |
|**authSecret** | **String** | Secret to provide with requests to upstream. |  [optional] |
|**authUsername** | **String** | Username to provide with requests to upstream. |  [optional] |
|**extraHeader1** | **String** | The key for extra header #1 to send to upstream. |  [optional] |
|**extraHeader2** | **String** | The key for extra header #2 to send to upstream. |  [optional] |
|**extraValue1** | **String** | The value for extra header #1 to send to upstream. This is stored as plaintext, and is NOT encrypted. |  [optional] |
|**extraValue2** | **String** | The value for extra header #2 to send to upstream. This is stored as plaintext, and is NOT encrypted. |  [optional] |
|**isActive** | **Boolean** | Whether or not this upstream is active and ready for requests. |  [optional] |
|**mode** | **String** | The mode that this upstream should operate in. Upstream sources can be used to proxy resolved packages, as well as operate in a proxy/cache or cache only mode. |  [optional] |
|**name** | **String** | A descriptive name for this upstream source. A shortened version of this name will be used for tagging cached packages retrieved from this upstream. |  |
|**priority** | **java.math.BigInteger** | Upstream sources are selected for resolving requests by sequential order (1..n), followed by creation date. |  [optional] |
|**upstreamUrl** | **URI** | The URL for this upstream source. This must be a fully qualified URL including any path elements required to reach the root of the repository.  |  |
|**verifySsl** | **Boolean** | If enabled, SSL certificates are verified when requests are made to this upstream. It&#39;s recommended to leave this enabled for all public sources to help mitigate Man-In-The-Middle (MITM) attacks. Please note this only applies to HTTPS upstreams. |  [optional] |


## Implemented Interfaces

* Serializable


