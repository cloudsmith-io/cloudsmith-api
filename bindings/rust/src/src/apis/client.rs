use std::rc::Rc;

use hyper;
use super::configuration::Configuration;

pub struct APIClient<C: hyper::client::Connect> {
  configuration: Rc<Configuration<C>>,
  audit_log_api: Box<::apis::AuditLogApi>,
  badges_api: Box<::apis::BadgesApi>,
  distros_api: Box<::apis::DistrosApi>,
  entitlements_api: Box<::apis::EntitlementsApi>,
  files_api: Box<::apis::FilesApi>,
  formats_api: Box<::apis::FormatsApi>,
  metrics_api: Box<::apis::MetricsApi>,
  namespaces_api: Box<::apis::NamespacesApi>,
  orgs_api: Box<::apis::OrgsApi>,
  packages_api: Box<::apis::PackagesApi>,
  quota_api: Box<::apis::QuotaApi>,
  rates_api: Box<::apis::RatesApi>,
  repos_api: Box<::apis::ReposApi>,
  status_api: Box<::apis::StatusApi>,
  storage_regions_api: Box<::apis::StorageRegionsApi>,
  user_api: Box<::apis::UserApi>,
  users_api: Box<::apis::UsersApi>,
  vulnerabilities_api: Box<::apis::VulnerabilitiesApi>,
  webhooks_api: Box<::apis::WebhooksApi>,
}

impl<C: hyper::client::Connect> APIClient<C> {
  pub fn new(configuration: Configuration<C>) -> APIClient<C> {
    let rc = Rc::new(configuration);

    APIClient {
      configuration: rc.clone(),
      audit_log_api: Box::new(::apis::AuditLogApiClient::new(rc.clone())),
      badges_api: Box::new(::apis::BadgesApiClient::new(rc.clone())),
      distros_api: Box::new(::apis::DistrosApiClient::new(rc.clone())),
      entitlements_api: Box::new(::apis::EntitlementsApiClient::new(rc.clone())),
      files_api: Box::new(::apis::FilesApiClient::new(rc.clone())),
      formats_api: Box::new(::apis::FormatsApiClient::new(rc.clone())),
      metrics_api: Box::new(::apis::MetricsApiClient::new(rc.clone())),
      namespaces_api: Box::new(::apis::NamespacesApiClient::new(rc.clone())),
      orgs_api: Box::new(::apis::OrgsApiClient::new(rc.clone())),
      packages_api: Box::new(::apis::PackagesApiClient::new(rc.clone())),
      quota_api: Box::new(::apis::QuotaApiClient::new(rc.clone())),
      rates_api: Box::new(::apis::RatesApiClient::new(rc.clone())),
      repos_api: Box::new(::apis::ReposApiClient::new(rc.clone())),
      status_api: Box::new(::apis::StatusApiClient::new(rc.clone())),
      storage_regions_api: Box::new(::apis::StorageRegionsApiClient::new(rc.clone())),
      user_api: Box::new(::apis::UserApiClient::new(rc.clone())),
      users_api: Box::new(::apis::UsersApiClient::new(rc.clone())),
      vulnerabilities_api: Box::new(::apis::VulnerabilitiesApiClient::new(rc.clone())),
      webhooks_api: Box::new(::apis::WebhooksApiClient::new(rc.clone())),
    }
  }

  pub fn audit_log_api(&self) -> &::apis::AuditLogApi{
    self.audit_log_api.as_ref()
  }

  pub fn badges_api(&self) -> &::apis::BadgesApi{
    self.badges_api.as_ref()
  }

  pub fn distros_api(&self) -> &::apis::DistrosApi{
    self.distros_api.as_ref()
  }

  pub fn entitlements_api(&self) -> &::apis::EntitlementsApi{
    self.entitlements_api.as_ref()
  }

  pub fn files_api(&self) -> &::apis::FilesApi{
    self.files_api.as_ref()
  }

  pub fn formats_api(&self) -> &::apis::FormatsApi{
    self.formats_api.as_ref()
  }

  pub fn metrics_api(&self) -> &::apis::MetricsApi{
    self.metrics_api.as_ref()
  }

  pub fn namespaces_api(&self) -> &::apis::NamespacesApi{
    self.namespaces_api.as_ref()
  }

  pub fn orgs_api(&self) -> &::apis::OrgsApi{
    self.orgs_api.as_ref()
  }

  pub fn packages_api(&self) -> &::apis::PackagesApi{
    self.packages_api.as_ref()
  }

  pub fn quota_api(&self) -> &::apis::QuotaApi{
    self.quota_api.as_ref()
  }

  pub fn rates_api(&self) -> &::apis::RatesApi{
    self.rates_api.as_ref()
  }

  pub fn repos_api(&self) -> &::apis::ReposApi{
    self.repos_api.as_ref()
  }

  pub fn status_api(&self) -> &::apis::StatusApi{
    self.status_api.as_ref()
  }

  pub fn storage_regions_api(&self) -> &::apis::StorageRegionsApi{
    self.storage_regions_api.as_ref()
  }

  pub fn user_api(&self) -> &::apis::UserApi{
    self.user_api.as_ref()
  }

  pub fn users_api(&self) -> &::apis::UsersApi{
    self.users_api.as_ref()
  }

  pub fn vulnerabilities_api(&self) -> &::apis::VulnerabilitiesApi{
    self.vulnerabilities_api.as_ref()
  }

  pub fn webhooks_api(&self) -> &::apis::WebhooksApi{
    self.webhooks_api.as_ref()
  }


}
