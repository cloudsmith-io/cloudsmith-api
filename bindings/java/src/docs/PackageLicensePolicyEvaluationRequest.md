
# PackageLicensePolicyEvaluationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**evaluationCount** | **java.math.BigInteger** |  |  [optional]
**policy** | [**NestedLicensePolicy**](NestedLicensePolicy.md) |  |  [optional]
**slugPerm** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**violationCount** | **java.math.BigInteger** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;Pending&quot;
IN_PROGRESS | &quot;In Progress&quot;
COMPLETE | &quot;Complete&quot;
CANCELLED | &quot;Cancelled&quot;
ERRORED | &quot;Errored&quot;



