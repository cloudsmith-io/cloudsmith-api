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

type PackageUsageMetric struct {

	// 
	ActivePackages []MetricsownerrepopackagesusageActivePackages `json:"active_packages"`

	// 
	DownloadsPerPackage interface{} `json:"downloads_per_package"`

	// 
	InactivePackages []MetricsownerrepopackagesusageActivePackages `json:"inactive_packages"`

	// 
	Totals interface{} `json:"totals"`
}