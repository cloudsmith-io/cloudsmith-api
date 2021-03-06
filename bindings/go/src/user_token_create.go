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

type UserTokenCreate struct {

	// Email address to authenticate with
	Email string `json:"email,omitempty"`

	// Password to authenticate with
	Password string `json:"password,omitempty"`
}
