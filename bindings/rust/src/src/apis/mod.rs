use hyper;
use serde;
use serde_json;

#[derive(Debug)]
pub enum Error<T> {
    Hyper(hyper::Error),
    Serde(serde_json::Error),
    ApiError(ApiError<T>),
}

#[derive(Debug)]
pub struct ApiError<T> {
    pub code: hyper::StatusCode,
    pub content: Option<T>,
}

impl<'de, T> From<(hyper::StatusCode, &'de [u8])> for Error<T> 
    where T: serde::Deserialize<'de> {
    fn from(e: (hyper::StatusCode, &'de [u8])) -> Self {
        if e.1.len() == 0 {
            return Error::ApiError(ApiError{
                code: e.0,
                content: None,
            });
        }
        match serde_json::from_slice::<T>(e.1) {
            Ok(t) => Error::ApiError(ApiError{
                code: e.0,
                content: Some(t),
            }),
            Err(e) => {
                Error::from(e)
            }
        }
    }
}

impl<T> From<hyper::Error> for Error<T> {
    fn from(e: hyper::Error) -> Self {
        return Error::Hyper(e)
    }
}

impl<T> From<serde_json::Error> for Error<T> {
    fn from(e: serde_json::Error) -> Self {
        return Error::Serde(e)
    }
}

use super::models::*;

mod audit_log_api;
pub use self::audit_log_api::{ AuditLogApi, AuditLogApiClient };
mod badges_api;
pub use self::badges_api::{ BadgesApi, BadgesApiClient };
mod distros_api;
pub use self::distros_api::{ DistrosApi, DistrosApiClient };
mod entitlements_api;
pub use self::entitlements_api::{ EntitlementsApi, EntitlementsApiClient };
mod files_api;
pub use self::files_api::{ FilesApi, FilesApiClient };
mod formats_api;
pub use self::formats_api::{ FormatsApi, FormatsApiClient };
mod metrics_api;
pub use self::metrics_api::{ MetricsApi, MetricsApiClient };
mod namespaces_api;
pub use self::namespaces_api::{ NamespacesApi, NamespacesApiClient };
mod orgs_api;
pub use self::orgs_api::{ OrgsApi, OrgsApiClient };
mod packages_api;
pub use self::packages_api::{ PackagesApi, PackagesApiClient };
mod quota_api;
pub use self::quota_api::{ QuotaApi, QuotaApiClient };
mod rates_api;
pub use self::rates_api::{ RatesApi, RatesApiClient };
mod repos_api;
pub use self::repos_api::{ ReposApi, ReposApiClient };
mod status_api;
pub use self::status_api::{ StatusApi, StatusApiClient };
mod storage_regions_api;
pub use self::storage_regions_api::{ StorageRegionsApi, StorageRegionsApiClient };
mod user_api;
pub use self::user_api::{ UserApi, UserApiClient };
mod users_api;
pub use self::users_api::{ UsersApi, UsersApiClient };
mod vulnerabilities_api;
pub use self::vulnerabilities_api::{ VulnerabilitiesApi, VulnerabilitiesApiClient };
mod webhooks_api;
pub use self::webhooks_api::{ WebhooksApi, WebhooksApiClient };

pub mod configuration;
pub mod client;
