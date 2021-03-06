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

type PackageCopy struct {

	// 
	Architectures []PackagesownerrepoArchitectures `json:"architectures,omitempty"`

	// 
	CdnUrl string `json:"cdn_url,omitempty"`

	// 
	ChecksumMd5 string `json:"checksum_md5,omitempty"`

	// 
	ChecksumSha1 string `json:"checksum_sha1,omitempty"`

	// 
	ChecksumSha256 string `json:"checksum_sha256,omitempty"`

	// 
	ChecksumSha512 string `json:"checksum_sha512,omitempty"`

	// A checksum of all of the package's dependencies.
	DependenciesChecksumMd5 string `json:"dependencies_checksum_md5,omitempty"`

	// A textual description of this package.
	Description string `json:"description,omitempty"`

	// 
	Distro interface{} `json:"distro,omitempty"`

	// 
	DistroVersion interface{} `json:"distro_version,omitempty"`

	// 
	Downloads int32 `json:"downloads,omitempty"`

	// The epoch of the package version (if any).
	Epoch int32 `json:"epoch,omitempty"`

	// 
	Extension string `json:"extension,omitempty"`

	// 
	Filename string `json:"filename,omitempty"`

	// 
	Files []PackagesownerrepoFiles `json:"files,omitempty"`

	// 
	Format string `json:"format,omitempty"`

	// 
	FormatUrl string `json:"format_url,omitempty"`

	// Unique and permanent identifier for the package.
	IdentifierPerm string `json:"identifier_perm,omitempty"`

	// 
	Indexed bool `json:"indexed,omitempty"`

	// 
	IsSyncAwaiting bool `json:"is_sync_awaiting,omitempty"`

	// 
	IsSyncCompleted bool `json:"is_sync_completed,omitempty"`

	// 
	IsSyncFailed bool `json:"is_sync_failed,omitempty"`

	// 
	IsSyncInFlight bool `json:"is_sync_in_flight,omitempty"`

	// 
	IsSyncInProgress bool `json:"is_sync_in_progress,omitempty"`

	// The license of this package.
	License string `json:"license,omitempty"`

	// The name of this package.
	Name string `json:"name,omitempty"`

	// 
	Namespace string `json:"namespace,omitempty"`

	// 
	NamespaceUrl string `json:"namespace_url,omitempty"`

	// 
	NumFiles int32 `json:"num_files,omitempty"`

	// The type of package contents.
	PackageType string `json:"package_type,omitempty"`

	// The release of the package version (if any).
	Release string `json:"release,omitempty"`

	// The repository the package will be copied to.
	Repository string `json:"repository,omitempty"`

	// 
	RepositoryUrl string `json:"repository_url,omitempty"`

	// The datetime the security scanning was completed.
	SecurityScanCompletedAt string `json:"security_scan_completed_at,omitempty"`

	// The datetime the security scanning was started.
	SecurityScanStartedAt string `json:"security_scan_started_at,omitempty"`

	// 
	SecurityScanStatus string `json:"security_scan_status,omitempty"`

	// The datetime the security scanning status was updated.
	SecurityScanStatusUpdatedAt string `json:"security_scan_status_updated_at,omitempty"`

	// 
	SelfHtmlUrl string `json:"self_html_url,omitempty"`

	// 
	SelfUrl string `json:"self_url,omitempty"`

	// 
	SignatureUrl string `json:"signature_url,omitempty"`

	// The calculated size of the package.
	Size int32 `json:"size,omitempty"`

	// The public unique identifier for the package.
	Slug string `json:"slug,omitempty"`

	// 
	SlugPerm string `json:"slug_perm,omitempty"`

	// The synchronisation (in progress) stage of the package.
	Stage string `json:"stage,omitempty"`

	// 
	StageStr string `json:"stage_str,omitempty"`

	// The datetime the package stage was updated at.
	StageUpdatedAt string `json:"stage_updated_at,omitempty"`

	// The synchronisation status of the package.
	Status string `json:"status,omitempty"`

	// A textual description for the synchronous status reason (if any
	StatusReason string `json:"status_reason,omitempty"`

	// 
	StatusStr string `json:"status_str,omitempty"`

	// The datetime the package status was updated at.
	StatusUpdatedAt string `json:"status_updated_at,omitempty"`

	// 
	StatusUrl string `json:"status_url,omitempty"`

	// 
	Subtype string `json:"subtype,omitempty"`

	// A one-liner synopsis of this package.
	Summary string `json:"summary,omitempty"`

	// The datetime the package sync was finished at.
	SyncFinishedAt string `json:"sync_finished_at,omitempty"`

	// Synchronisation progress (from 0-100)
	SyncProgress int32 `json:"sync_progress,omitempty"`

	// All tags on the package, grouped by tag type. This includes immutable tags, but doesn't distinguish them from mutable. To see which tags are immutable specifically, see the tags_immutable field.
	Tags interface{} `json:"tags,omitempty"`

	// All immutable tags on the package, grouped by tag type. Immutable tags cannot be (easily) deleted.
	TagsImmutable interface{} `json:"tags_immutable,omitempty"`

	// 
	TypeDisplay string `json:"type_display,omitempty"`

	// The date this package was uploaded.
	UploadedAt string `json:"uploaded_at,omitempty"`

	// 
	Uploader string `json:"uploader,omitempty"`

	// 
	UploaderUrl string `json:"uploader_url,omitempty"`

	// The raw version for this package.
	Version string `json:"version,omitempty"`

	// 
	VersionOrig string `json:"version_orig,omitempty"`

	// 
	VulnerabilityScanResultsUrl string `json:"vulnerability_scan_results_url,omitempty"`
}
