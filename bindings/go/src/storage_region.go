/* 
 * Cloudsmith API
 *
 * The API to the Cloudsmith Service
 *
 * OpenAPI spec version: v1
 * Contact: support@cloudsmith.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package cloudsmith_api

type StorageRegion struct {

	// Name of the storage region
	Label string `json:"label"`

	// Slug for the storage region
	Slug string `json:"slug"`
}
