/*
 * Cloudsmith API
 *
 * The API to the Cloudsmith Service
 *
 * API version: v1
 * Contact: support@cloudsmith.io
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package cloudsmith_api

type Namespace struct {
	// 
	Name string `json:"name,omitempty"`
	// 
	Slug string `json:"slug,omitempty"`
	// 
	SlugPerm string `json:"slug_perm,omitempty"`
	// 
	TypeName string `json:"type_name,omitempty"`
}