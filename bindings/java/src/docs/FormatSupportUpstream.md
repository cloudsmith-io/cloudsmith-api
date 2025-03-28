
# FormatSupportUpstream

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authModes** | [**List&lt;AuthModesEnum&gt;**](#List&lt;AuthModesEnum&gt;) | The authentication modes supported by the upstream format | 
**caching** | **Boolean** | If true the upstream format supports caching | 
**indexing** | **Boolean** | If true the upstream format supports indexing | 
**indexingBehavior** | [**IndexingBehaviorEnum**](#IndexingBehaviorEnum) | The behavior of the upstream when indexing |  [optional]
**proxying** | **Boolean** | If true the upstream format supports proxying | 
**signatureVerification** | [**SignatureVerificationEnum**](#SignatureVerificationEnum) | The signature verification supported by the upstream format |  [optional]


<a name="List<AuthModesEnum>"></a>
## Enum: List&lt;AuthModesEnum&gt;
Name | Value
---- | -----
USERNAME_AND_PASSWORD | &quot;Username and Password&quot;
TOKEN | &quot;Token&quot;
CERTIFICATE_AND_KEY | &quot;Certificate and Key&quot;


<a name="IndexingBehaviorEnum"></a>
## Enum: IndexingBehaviorEnum
Name | Value
---- | -----
UNSUPPORTED | &quot;Unsupported&quot;
AHEAD_OF_TIME_STATIC_INDEXING | &quot;Ahead-of-time (static) indexing&quot;
JUST_IN_TIME_DYNAMIC_INDEXING | &quot;Just-in-time (dynamic) indexing&quot;


<a name="SignatureVerificationEnum"></a>
## Enum: SignatureVerificationEnum
Name | Value
---- | -----
UNSUPPORTED | &quot;Unsupported&quot;
REPOSITORY_METADATA | &quot;Repository Metadata&quot;
PACKAGES | &quot;Packages&quot;
REPOSITORY_METADATA_AND_PACKAGES | &quot;Repository Metadata and Packages&quot;



