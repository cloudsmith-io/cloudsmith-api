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

type PackagesUploadDeb struct {
	// The changes archive containing the changes made to the source and debian packaging files
	ChangesFile string `json:"changes_file,omitempty"`
	// The distribution to store the package for.
	Distribution string `json:"distribution"`
	// The primary file for the package.
	PackageFile string `json:"package_file"`
	// If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate.
	Republish bool `json:"republish,omitempty"`
	// The sources archive containing the source code for the binary
	SourcesFile string `json:"sources_file,omitempty"`
	// A comma-separated values list of tags to add to the package.
	Tags string `json:"tags,omitempty"`
}