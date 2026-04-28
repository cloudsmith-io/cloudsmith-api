# Format

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description of the package format | [default to null]
**distributions** | [**Vec<::models::Distribution>**](Distribution.md) | The distributions supported by this package format | [optional] [default to null]
**extensions** | **Vec<String>** | A non-exhaustive list of extensions supported | [default to null]
**name** | **String** | Name for the package format | [default to null]
**premium** | **bool** | If true the package format is a premium-only feature | [default to null]
**premium_plan_id** | **String** | The minimum plan id required for this package format | [optional] [default to null]
**premium_plan_name** | **String** | The minimum plan name required for this package format | [optional] [default to null]
**slug** | **String** | Slug for the package format | [default to null]
**supports** | [***::models::FormatSupport**](FormatSupport.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


