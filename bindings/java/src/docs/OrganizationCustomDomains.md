
# OrganizationCustomDomains

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backendKind** | **java.math.BigInteger** | The domain for a specific package format. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdBy** | **java.math.BigInteger** |  |  [optional]
**dnsAliasValue** | **String** | The CNAME value to use to publish this domain publicly. |  [optional]
**dnsCertName** | **String** | The CNAME name to create to allow us to generate a TLS cert. |  [optional]
**dnsCertValue** | **String** | The CNAME value to use to allow us to generate a TLS cert. |  [optional]
**domainType** | **java.math.BigInteger** | The type for the custom domain. |  [optional]
**enabled** | **Boolean** | If checked, the domain is enabled. |  [optional]
**host** | **String** |  |  [optional]
**namespace** | **java.math.BigInteger** |  |  [optional]
**primary** | **Boolean** | If checked, this domain is the preferred/primary domain in the case that there are other overlapping domains (e.g. for the same repository, package format, etc.) |  [optional]
**redirectRoot** | **Boolean** | If checked, the domain root redirects to the repository. |  [optional]
**redirectRootUrl** | **String** | Where root requests should be redirected to if redirect_root is enabled. |  [optional]
**repository** | [**OrganizationCustomDomainNestedRepo**](OrganizationCustomDomainNestedRepo.md) |  | 
**repositoryOnly** | **Boolean** | If checked, the domain applies to a specific repository only. |  [optional]
**slugPerm** | **String** |  |  [optional]
**validated** | **Boolean** | If validated, the domain is ready for requests. |  [optional]
**validatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]



