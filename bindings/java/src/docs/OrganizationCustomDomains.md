

# OrganizationCustomDomains


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**backendKind** | **java.math.BigInteger** | The domain for a specific package format. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**createdBy** | **java.math.BigInteger** |  |  [optional] [readonly] |
|**dnsAliasValue** | **String** | The CNAME value to use to publish this domain publicly. |  [optional] [readonly] |
|**dnsCertName** | **String** | The CNAME name to create to allow us to generate a TLS cert. |  [optional] [readonly] |
|**dnsCertValue** | **String** | The CNAME value to use to allow us to generate a TLS cert. |  [optional] [readonly] |
|**domainType** | **java.math.BigInteger** | The type for the custom domain. |  [optional] [readonly] |
|**enabled** | **Boolean** | If checked, the domain is enabled. |  [optional] [readonly] |
|**host** | **String** |  |  [optional] [readonly] |
|**namespace** | **java.math.BigInteger** |  |  [optional] [readonly] |
|**primary** | **Boolean** | If checked, this domain is the preferred/primary domain in the case that there are other overlapping domains (e.g. for the same repository, package format, etc.) |  [optional] [readonly] |
|**redirectRoot** | **Boolean** | If checked, the domain root redirects to the repository. |  [optional] [readonly] |
|**redirectRootUrl** | **URI** | Where root requests should be redirected to if redirect_root is enabled. |  [optional] [readonly] |
|**repository** | [**OrganizationCustomDomainNestedRepo**](OrganizationCustomDomainNestedRepo.md) |  |  [optional] |
|**repositoryOnly** | **Boolean** | If checked, the domain applies to a specific repository only. |  [optional] [readonly] |
|**slugPerm** | **String** |  |  [optional] [readonly] |
|**validated** | **Boolean** | If validated, the domain is ready for requests. |  [optional] [readonly] |
|**validatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |


## Implemented Interfaces

* Serializable


