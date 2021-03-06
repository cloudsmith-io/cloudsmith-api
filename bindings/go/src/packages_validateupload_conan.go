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

type PackagesValidateuploadConan struct {

	// Conan channel.
	ConanChannel string `json:"conan_channel,omitempty"`

	// Conan prefix (User).
	ConanPrefix string `json:"conan_prefix,omitempty"`

	// The info file is an python file containing the package metadata.
	InfoFile string `json:"info_file"`

	// The info file is an python file containing the package metadata.
	ManifestFile string `json:"manifest_file"`

	// The conan file is an python file containing the package metadata.
	MetadataFile string `json:"metadata_file"`

	// The name of this package.
	Name string `json:"name,omitempty"`

	// The primary file for the package.
	PackageFile string `json:"package_file"`

	// If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate.
	Republish bool `json:"republish,omitempty"`

	// A comma-separated values list of tags to add to the package.
	Tags string `json:"tags,omitempty"`

	// The raw version for this package.
	Version string `json:"version,omitempty"`
}
