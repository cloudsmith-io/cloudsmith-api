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

type RepositoryToken struct {

	// 
	CreatedByUrl string `json:"created_by_url,omitempty"`

	// 
	SelfUrl string `json:"self_url,omitempty"`

	// 
	Name string `json:"name"`

	// 
	UserUrl string `json:"user_url,omitempty"`

	// If selected this is the default token for this repository.
	Default_ bool `json:"default,omitempty"`

	// 
	CreatedAt string `json:"created_at,omitempty"`

	// 
	RefreshUrl string `json:"refresh_url,omitempty"`

	// 
	UpdatedAt string `json:"updated_at,omitempty"`

	// 
	CreatedBy string `json:"created_by,omitempty"`

	// 
	Token string `json:"token,omitempty"`

	// 
	UpdatedByUrl string `json:"updated_by_url,omitempty"`

	// 
	User string `json:"user,omitempty"`

	// 
	SlugPerm string `json:"slug_perm,omitempty"`

	// 
	UpdatedBy string `json:"updated_by,omitempty"`
}