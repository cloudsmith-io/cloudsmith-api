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

type PackagesUploadNpm struct {

	// The default NPM dist-tag for this package/version - This will replace any other package/version if they are using the same tag.
	NpmDistTag string `json:"npm_dist_tag,omitempty"`

	// The primary file for the package.
	PackageFile string `json:"package_file"`
}