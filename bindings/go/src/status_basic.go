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

type StatusBasic struct {

	// The message describing the state of the API.
	Detail string `json:"detail,omitempty"`

	// The current version for the Cloudsmith service.
	Version string `json:"version,omitempty"`
}
