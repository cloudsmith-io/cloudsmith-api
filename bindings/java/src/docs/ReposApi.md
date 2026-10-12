# ReposApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiReposGeoipStatus**](ReposApi.md#apiReposGeoipStatus) | **GET** /repos/{owner}/{identifier}/geoip/status/ | Retrieve the GeoIP status for this repository. |
| [**repoRetentionPartialUpdate**](ReposApi.md#repoRetentionPartialUpdate) | **PATCH** /repos/{owner}/{repo}/retention/ | Update the retention rules for the repository. |
| [**repoRetentionRead**](ReposApi.md#repoRetentionRead) | **GET** /repos/{owner}/{repo}/retention/ | Retrieve the retention rules for the repository. |
| [**reposConnectedCreate**](ReposApi.md#reposConnectedCreate) | **POST** /repos/{owner}/{identifier}/connected/ | Create a connected repository for this repository. |
| [**reposConnectedDelete**](ReposApi.md#reposConnectedDelete) | **DELETE** /repos/{owner}/{identifier}/connected/{slug_perm}/ | Delete a connected repository for this repository. |
| [**reposConnectedList**](ReposApi.md#reposConnectedList) | **GET** /repos/{owner}/{identifier}/connected/ | List connected repositories for this repository. |
| [**reposConnectedPartialUpdate**](ReposApi.md#reposConnectedPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/connected/{slug_perm}/ | Partially update a connected repository for this repository. |
| [**reposConnectedRead**](ReposApi.md#reposConnectedRead) | **GET** /repos/{owner}/{identifier}/connected/{slug_perm}/ | Retrieve a connected repository for this repository. |
| [**reposConnectedUpdate**](ReposApi.md#reposConnectedUpdate) | **PUT** /repos/{owner}/{identifier}/connected/{slug_perm}/ | Update a connected repository for this repository. |
| [**reposCreate**](ReposApi.md#reposCreate) | **POST** /repos/{owner}/ | Create a new repository in a given namespace. |
| [**reposDelete**](ReposApi.md#reposDelete) | **DELETE** /repos/{owner}/{identifier}/ |  |
| [**reposEcdsaCreate**](ReposApi.md#reposEcdsaCreate) | **POST** /repos/{owner}/{identifier}/ecdsa/ | Set the active ECDSA key for the Repository. |
| [**reposEcdsaList**](ReposApi.md#reposEcdsaList) | **GET** /repos/{owner}/{identifier}/ecdsa/ | Retrieve the active ECDSA key for the Repository. |
| [**reposEcdsaRegenerate**](ReposApi.md#reposEcdsaRegenerate) | **POST** /repos/{owner}/{identifier}/ecdsa/regenerate/ | Regenerate ECDSA Key for the Repository. |
| [**reposEd25519Create**](ReposApi.md#reposEd25519Create) | **POST** /repos/{owner}/{identifier}/ed25519/ | Set the active Ed25519 key for the Repository. |
| [**reposEd25519List**](ReposApi.md#reposEd25519List) | **GET** /repos/{owner}/{identifier}/ed25519/ | Retrieve the active Ed25519 key for the Repository. |
| [**reposEd25519Regenerate**](ReposApi.md#reposEd25519Regenerate) | **POST** /repos/{owner}/{identifier}/ed25519/regenerate/ | Regenerate Ed25519 Key for the Repository. |
| [**reposGeoipDisable**](ReposApi.md#reposGeoipDisable) | **POST** /repos/{owner}/{identifier}/geoip/disable/ | Disable GeoIP for this repository. |
| [**reposGeoipEnable**](ReposApi.md#reposGeoipEnable) | **POST** /repos/{owner}/{identifier}/geoip/enable/ | Enable GeoIP for this repository. |
| [**reposGeoipPartialUpdate**](ReposApi.md#reposGeoipPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/geoip | Partially update repository geoip rules. |
| [**reposGeoipRead**](ReposApi.md#reposGeoipRead) | **GET** /repos/{owner}/{identifier}/geoip | List all repository geoip rules. |
| [**reposGeoipTest**](ReposApi.md#reposGeoipTest) | **POST** /repos/{owner}/{identifier}/geoip/test/ | Test a list of IP addresses against the repository&#39;s current GeoIP rules. |
| [**reposGeoipUpdate**](ReposApi.md#reposGeoipUpdate) | **PUT** /repos/{owner}/{identifier}/geoip | Replace repository geoip rules. |
| [**reposGpgCreate**](ReposApi.md#reposGpgCreate) | **POST** /repos/{owner}/{identifier}/gpg/ | Set the active GPG key for the Repository. |
| [**reposGpgList**](ReposApi.md#reposGpgList) | **GET** /repos/{owner}/{identifier}/gpg/ | Retrieve the active GPG key for the Repository. |
| [**reposGpgRegenerate**](ReposApi.md#reposGpgRegenerate) | **POST** /repos/{owner}/{identifier}/gpg/regenerate/ | Regenerate GPG Key for the Repository. |
| [**reposNamespaceList**](ReposApi.md#reposNamespaceList) | **GET** /repos/{owner}/ | Get a list of all repositories within a namespace. |
| [**reposPartialUpdate**](ReposApi.md#reposPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/ | Update details about a repository in a given namespace. |
| [**reposPrivilegesList**](ReposApi.md#reposPrivilegesList) | **GET** /repos/{owner}/{identifier}/privileges | List all explicity created privileges for the repository. |
| [**reposPrivilegesPartialUpdate**](ReposApi.md#reposPrivilegesPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/privileges | Modify privileges for the repository. |
| [**reposPrivilegesUpdate**](ReposApi.md#reposPrivilegesUpdate) | **PUT** /repos/{owner}/{identifier}/privileges | Replace all existing repository privileges with those specified. |
| [**reposRead**](ReposApi.md#reposRead) | **GET** /repos/{owner}/{identifier}/ | Get a specific repository. |
| [**reposRsaCreate**](ReposApi.md#reposRsaCreate) | **POST** /repos/{owner}/{identifier}/rsa/ | Set the active RSA key for the Repository. |
| [**reposRsaList**](ReposApi.md#reposRsaList) | **GET** /repos/{owner}/{identifier}/rsa/ | Retrieve the active RSA key for the Repository. |
| [**reposRsaRegenerate**](ReposApi.md#reposRsaRegenerate) | **POST** /repos/{owner}/{identifier}/rsa/regenerate/ | Regenerate RSA Key for the Repository. |
| [**reposTransferRegion**](ReposApi.md#reposTransferRegion) | **POST** /repos/{owner}/{repo}/transfer-region/ | Transfer a repository to a different region. |
| [**reposUpstreamAlpineCreate**](ReposApi.md#reposUpstreamAlpineCreate) | **POST** /repos/{owner}/{identifier}/upstream/alpine/ | Create an Alpine upstream config for this repository. |
| [**reposUpstreamAlpineDelete**](ReposApi.md#reposUpstreamAlpineDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/alpine/{slug_perm}/ | Delete an Alpine upstream config for this repository. |
| [**reposUpstreamAlpineList**](ReposApi.md#reposUpstreamAlpineList) | **GET** /repos/{owner}/{identifier}/upstream/alpine/ | List Alpine upstream configs for this repository. |
| [**reposUpstreamAlpinePartialUpdate**](ReposApi.md#reposUpstreamAlpinePartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/alpine/{slug_perm}/ | Partially update an Alpine upstream config for this repository. |
| [**reposUpstreamAlpineRead**](ReposApi.md#reposUpstreamAlpineRead) | **GET** /repos/{owner}/{identifier}/upstream/alpine/{slug_perm}/ | Retrieve an Alpine upstream config for this repository. |
| [**reposUpstreamAlpineUpdate**](ReposApi.md#reposUpstreamAlpineUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/alpine/{slug_perm}/ | Update an Alpine upstream config for this repository. |
| [**reposUpstreamCargoCreate**](ReposApi.md#reposUpstreamCargoCreate) | **POST** /repos/{owner}/{identifier}/upstream/cargo/ | Create a Cargo upstream config for this repository. |
| [**reposUpstreamCargoDelete**](ReposApi.md#reposUpstreamCargoDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/cargo/{slug_perm}/ | Delete a Cargo upstream config for this repository. |
| [**reposUpstreamCargoList**](ReposApi.md#reposUpstreamCargoList) | **GET** /repos/{owner}/{identifier}/upstream/cargo/ | List Cargo upstream configs for this repository. |
| [**reposUpstreamCargoPartialUpdate**](ReposApi.md#reposUpstreamCargoPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/cargo/{slug_perm}/ | Partially update a Cargo upstream config for this repository. |
| [**reposUpstreamCargoRead**](ReposApi.md#reposUpstreamCargoRead) | **GET** /repos/{owner}/{identifier}/upstream/cargo/{slug_perm}/ | Retrieve a Cargo upstream config for this repository. |
| [**reposUpstreamCargoUpdate**](ReposApi.md#reposUpstreamCargoUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/cargo/{slug_perm}/ | Update a Cargo upstream config for this repository. |
| [**reposUpstreamComposerCreate**](ReposApi.md#reposUpstreamComposerCreate) | **POST** /repos/{owner}/{identifier}/upstream/composer/ | Create a Composer upstream config for this repository. |
| [**reposUpstreamComposerDelete**](ReposApi.md#reposUpstreamComposerDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/composer/{slug_perm}/ | Delete a Composer upstream config for this repository. |
| [**reposUpstreamComposerList**](ReposApi.md#reposUpstreamComposerList) | **GET** /repos/{owner}/{identifier}/upstream/composer/ | List Composer upstream configs for this repository. |
| [**reposUpstreamComposerPartialUpdate**](ReposApi.md#reposUpstreamComposerPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/composer/{slug_perm}/ | Partially update a Composer upstream config for this repository. |
| [**reposUpstreamComposerRead**](ReposApi.md#reposUpstreamComposerRead) | **GET** /repos/{owner}/{identifier}/upstream/composer/{slug_perm}/ | Retrieve a Composer upstream config for this repository. |
| [**reposUpstreamComposerUpdate**](ReposApi.md#reposUpstreamComposerUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/composer/{slug_perm}/ | Update a Composer upstream config for this repository. |
| [**reposUpstreamCondaCreate**](ReposApi.md#reposUpstreamCondaCreate) | **POST** /repos/{owner}/{identifier}/upstream/conda/ | Create a Conda upstream config for this repository. |
| [**reposUpstreamCondaDelete**](ReposApi.md#reposUpstreamCondaDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/conda/{slug_perm}/ | Delete a Conda upstream config for this repository. |
| [**reposUpstreamCondaList**](ReposApi.md#reposUpstreamCondaList) | **GET** /repos/{owner}/{identifier}/upstream/conda/ | List Conda upstream configs for this repository. |
| [**reposUpstreamCondaPartialUpdate**](ReposApi.md#reposUpstreamCondaPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/conda/{slug_perm}/ | Partially update a Conda upstream config for this repository. |
| [**reposUpstreamCondaRead**](ReposApi.md#reposUpstreamCondaRead) | **GET** /repos/{owner}/{identifier}/upstream/conda/{slug_perm}/ | Retrieve a Conda upstream config for this repository. |
| [**reposUpstreamCondaUpdate**](ReposApi.md#reposUpstreamCondaUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/conda/{slug_perm}/ | Update a Conda upstream config for this repository. |
| [**reposUpstreamCranCreate**](ReposApi.md#reposUpstreamCranCreate) | **POST** /repos/{owner}/{identifier}/upstream/cran/ | Create a CRAN upstream config for this repository. |
| [**reposUpstreamCranDelete**](ReposApi.md#reposUpstreamCranDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Delete a CRAN upstream config for this repository. |
| [**reposUpstreamCranList**](ReposApi.md#reposUpstreamCranList) | **GET** /repos/{owner}/{identifier}/upstream/cran/ | List CRAN upstream configs for this repository. |
| [**reposUpstreamCranPartialUpdate**](ReposApi.md#reposUpstreamCranPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Partially update a CRAN upstream config for this repository. |
| [**reposUpstreamCranRead**](ReposApi.md#reposUpstreamCranRead) | **GET** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Retrieve a CRAN upstream config for this repository. |
| [**reposUpstreamCranUpdate**](ReposApi.md#reposUpstreamCranUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Update a CRAN upstream config for this repository. |
| [**reposUpstreamDartCreate**](ReposApi.md#reposUpstreamDartCreate) | **POST** /repos/{owner}/{identifier}/upstream/dart/ | Create a Dart upstream config for this repository. |
| [**reposUpstreamDartDelete**](ReposApi.md#reposUpstreamDartDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Delete a Dart upstream config for this repository. |
| [**reposUpstreamDartList**](ReposApi.md#reposUpstreamDartList) | **GET** /repos/{owner}/{identifier}/upstream/dart/ | List Dart upstream configs for this repository. |
| [**reposUpstreamDartPartialUpdate**](ReposApi.md#reposUpstreamDartPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Partially update a Dart upstream config for this repository. |
| [**reposUpstreamDartRead**](ReposApi.md#reposUpstreamDartRead) | **GET** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Retrieve a Dart upstream config for this repository. |
| [**reposUpstreamDartUpdate**](ReposApi.md#reposUpstreamDartUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Update a Dart upstream config for this repository. |
| [**reposUpstreamDebCreate**](ReposApi.md#reposUpstreamDebCreate) | **POST** /repos/{owner}/{identifier}/upstream/deb/ | Create a Debian upstream config for this repository. |
| [**reposUpstreamDebDelete**](ReposApi.md#reposUpstreamDebDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Delete a Debian upstream config for this repository. |
| [**reposUpstreamDebList**](ReposApi.md#reposUpstreamDebList) | **GET** /repos/{owner}/{identifier}/upstream/deb/ | List Debian upstream configs for this repository. |
| [**reposUpstreamDebPartialUpdate**](ReposApi.md#reposUpstreamDebPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Partially update a Debian upstream config for this repository. |
| [**reposUpstreamDebRead**](ReposApi.md#reposUpstreamDebRead) | **GET** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Retrieve a Debian upstream config for this repository. |
| [**reposUpstreamDebUpdate**](ReposApi.md#reposUpstreamDebUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Update a Debian upstream config for this repository. |
| [**reposUpstreamDockerCreate**](ReposApi.md#reposUpstreamDockerCreate) | **POST** /repos/{owner}/{identifier}/upstream/docker/ | Create a Docker upstream config for this repository. |
| [**reposUpstreamDockerDelete**](ReposApi.md#reposUpstreamDockerDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Delete a Docker upstream config for this repository. |
| [**reposUpstreamDockerList**](ReposApi.md#reposUpstreamDockerList) | **GET** /repos/{owner}/{identifier}/upstream/docker/ | List Docker upstream configs for this repository. |
| [**reposUpstreamDockerPartialUpdate**](ReposApi.md#reposUpstreamDockerPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Partially update a Docker upstream config for this repository. |
| [**reposUpstreamDockerRead**](ReposApi.md#reposUpstreamDockerRead) | **GET** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Retrieve a Docker upstream config for this repository. |
| [**reposUpstreamDockerUpdate**](ReposApi.md#reposUpstreamDockerUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Update a Docker upstream config for this repository. |
| [**reposUpstreamGenericCreate**](ReposApi.md#reposUpstreamGenericCreate) | **POST** /repos/{owner}/{identifier}/upstream/generic/ | Create a Generic upstream config for this repository. |
| [**reposUpstreamGenericDelete**](ReposApi.md#reposUpstreamGenericDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/generic/{slug_perm}/ | Delete a Generic upstream config for this repository. |
| [**reposUpstreamGenericList**](ReposApi.md#reposUpstreamGenericList) | **GET** /repos/{owner}/{identifier}/upstream/generic/ | List Generic upstream configs for this repository. |
| [**reposUpstreamGenericPartialUpdate**](ReposApi.md#reposUpstreamGenericPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/generic/{slug_perm}/ | Partially update a Generic upstream config for this repository. |
| [**reposUpstreamGenericRead**](ReposApi.md#reposUpstreamGenericRead) | **GET** /repos/{owner}/{identifier}/upstream/generic/{slug_perm}/ | Retrieve a Generic upstream config for this repository. |
| [**reposUpstreamGenericUpdate**](ReposApi.md#reposUpstreamGenericUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/generic/{slug_perm}/ | Update a Generic upstream config for this repository. |
| [**reposUpstreamGoCreate**](ReposApi.md#reposUpstreamGoCreate) | **POST** /repos/{owner}/{identifier}/upstream/go/ | Create a Go upstream config for this repository. |
| [**reposUpstreamGoDelete**](ReposApi.md#reposUpstreamGoDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/go/{slug_perm}/ | Delete a Go upstream config for this repository. |
| [**reposUpstreamGoList**](ReposApi.md#reposUpstreamGoList) | **GET** /repos/{owner}/{identifier}/upstream/go/ | List Go upstream configs for this repository. |
| [**reposUpstreamGoPartialUpdate**](ReposApi.md#reposUpstreamGoPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/go/{slug_perm}/ | Partially update a Go upstream config for this repository. |
| [**reposUpstreamGoRead**](ReposApi.md#reposUpstreamGoRead) | **GET** /repos/{owner}/{identifier}/upstream/go/{slug_perm}/ | Retrieve a Go upstream config for this repository. |
| [**reposUpstreamGoUpdate**](ReposApi.md#reposUpstreamGoUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/go/{slug_perm}/ | Update a Go upstream config for this repository. |
| [**reposUpstreamHelmCreate**](ReposApi.md#reposUpstreamHelmCreate) | **POST** /repos/{owner}/{identifier}/upstream/helm/ | Create a Helm upstream config for this repository. |
| [**reposUpstreamHelmDelete**](ReposApi.md#reposUpstreamHelmDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Delete a Helm upstream config for this repository. |
| [**reposUpstreamHelmList**](ReposApi.md#reposUpstreamHelmList) | **GET** /repos/{owner}/{identifier}/upstream/helm/ | List Helm upstream configs for this repository. |
| [**reposUpstreamHelmPartialUpdate**](ReposApi.md#reposUpstreamHelmPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Partially update a Helm upstream config for this repository. |
| [**reposUpstreamHelmRead**](ReposApi.md#reposUpstreamHelmRead) | **GET** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Retrieve a Helm upstream config for this repository. |
| [**reposUpstreamHelmUpdate**](ReposApi.md#reposUpstreamHelmUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Update a Helm upstream config for this repository. |
| [**reposUpstreamHexCreate**](ReposApi.md#reposUpstreamHexCreate) | **POST** /repos/{owner}/{identifier}/upstream/hex/ | Create a Hex upstream config for this repository. |
| [**reposUpstreamHexDelete**](ReposApi.md#reposUpstreamHexDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/hex/{slug_perm}/ | Delete a Hex upstream config for this repository. |
| [**reposUpstreamHexList**](ReposApi.md#reposUpstreamHexList) | **GET** /repos/{owner}/{identifier}/upstream/hex/ | List Hex upstream configs for this repository. |
| [**reposUpstreamHexPartialUpdate**](ReposApi.md#reposUpstreamHexPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/hex/{slug_perm}/ | Partially update a Hex upstream config for this repository. |
| [**reposUpstreamHexRead**](ReposApi.md#reposUpstreamHexRead) | **GET** /repos/{owner}/{identifier}/upstream/hex/{slug_perm}/ | Retrieve a Hex upstream config for this repository. |
| [**reposUpstreamHexUpdate**](ReposApi.md#reposUpstreamHexUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/hex/{slug_perm}/ | Update a Hex upstream config for this repository. |
| [**reposUpstreamHuggingfaceCreate**](ReposApi.md#reposUpstreamHuggingfaceCreate) | **POST** /repos/{owner}/{identifier}/upstream/huggingface/ | Create a HuggingFace upstream config for this repository. |
| [**reposUpstreamHuggingfaceDelete**](ReposApi.md#reposUpstreamHuggingfaceDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/huggingface/{slug_perm}/ | Delete a HuggingFace upstream config for this repository. |
| [**reposUpstreamHuggingfaceList**](ReposApi.md#reposUpstreamHuggingfaceList) | **GET** /repos/{owner}/{identifier}/upstream/huggingface/ | List HuggingFace upstream configs for this repository. |
| [**reposUpstreamHuggingfacePartialUpdate**](ReposApi.md#reposUpstreamHuggingfacePartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/huggingface/{slug_perm}/ | Partially update a HuggingFace upstream config for this repository. |
| [**reposUpstreamHuggingfaceRead**](ReposApi.md#reposUpstreamHuggingfaceRead) | **GET** /repos/{owner}/{identifier}/upstream/huggingface/{slug_perm}/ | Retrieve a HuggingFace upstream config for this repository. |
| [**reposUpstreamHuggingfaceUpdate**](ReposApi.md#reposUpstreamHuggingfaceUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/huggingface/{slug_perm}/ | Update a HuggingFace upstream config for this repository. |
| [**reposUpstreamMavenCreate**](ReposApi.md#reposUpstreamMavenCreate) | **POST** /repos/{owner}/{identifier}/upstream/maven/ | Create a Maven upstream config for this repository. |
| [**reposUpstreamMavenDelete**](ReposApi.md#reposUpstreamMavenDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Delete a Maven upstream config for this repository. |
| [**reposUpstreamMavenList**](ReposApi.md#reposUpstreamMavenList) | **GET** /repos/{owner}/{identifier}/upstream/maven/ | List Maven upstream configs for this repository. |
| [**reposUpstreamMavenPartialUpdate**](ReposApi.md#reposUpstreamMavenPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Partially update a Maven upstream config for this repository. |
| [**reposUpstreamMavenRead**](ReposApi.md#reposUpstreamMavenRead) | **GET** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Retrieve a Maven upstream config for this repository. |
| [**reposUpstreamMavenUpdate**](ReposApi.md#reposUpstreamMavenUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Update a Maven upstream config for this repository. |
| [**reposUpstreamNixCreate**](ReposApi.md#reposUpstreamNixCreate) | **POST** /repos/{owner}/{identifier}/upstream/nix/ | Create a Nix upstream config for this repository. |
| [**reposUpstreamNixDelete**](ReposApi.md#reposUpstreamNixDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/nix/{slug_perm}/ | Delete a Nix upstream config for this repository. |
| [**reposUpstreamNixList**](ReposApi.md#reposUpstreamNixList) | **GET** /repos/{owner}/{identifier}/upstream/nix/ | List Nix upstream configs for this repository. |
| [**reposUpstreamNixPartialUpdate**](ReposApi.md#reposUpstreamNixPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/nix/{slug_perm}/ | Partially update a Nix upstream config for this repository. |
| [**reposUpstreamNixRead**](ReposApi.md#reposUpstreamNixRead) | **GET** /repos/{owner}/{identifier}/upstream/nix/{slug_perm}/ | Retrieve a Nix upstream config for this repository. |
| [**reposUpstreamNixUpdate**](ReposApi.md#reposUpstreamNixUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/nix/{slug_perm}/ | Update a Nix upstream config for this repository. |
| [**reposUpstreamNpmCreate**](ReposApi.md#reposUpstreamNpmCreate) | **POST** /repos/{owner}/{identifier}/upstream/npm/ | Create a npm upstream config for this repository. |
| [**reposUpstreamNpmDelete**](ReposApi.md#reposUpstreamNpmDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Delete a npm upstream config for this repository. |
| [**reposUpstreamNpmList**](ReposApi.md#reposUpstreamNpmList) | **GET** /repos/{owner}/{identifier}/upstream/npm/ | List npm upstream configs for this repository. |
| [**reposUpstreamNpmPartialUpdate**](ReposApi.md#reposUpstreamNpmPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Partially update a npm upstream config for this repository. |
| [**reposUpstreamNpmRead**](ReposApi.md#reposUpstreamNpmRead) | **GET** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Retrieve a npm upstream config for this repository. |
| [**reposUpstreamNpmUpdate**](ReposApi.md#reposUpstreamNpmUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Update a npm upstream config for this repository. |
| [**reposUpstreamNugetCreate**](ReposApi.md#reposUpstreamNugetCreate) | **POST** /repos/{owner}/{identifier}/upstream/nuget/ | Create a NuGet upstream config for this repository. |
| [**reposUpstreamNugetDelete**](ReposApi.md#reposUpstreamNugetDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Delete a NuGet upstream config for this repository. |
| [**reposUpstreamNugetList**](ReposApi.md#reposUpstreamNugetList) | **GET** /repos/{owner}/{identifier}/upstream/nuget/ | List NuGet upstream configs for this repository. |
| [**reposUpstreamNugetPartialUpdate**](ReposApi.md#reposUpstreamNugetPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Partially update a NuGet upstream config for this repository. |
| [**reposUpstreamNugetRead**](ReposApi.md#reposUpstreamNugetRead) | **GET** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Retrieve a NuGet upstream config for this repository. |
| [**reposUpstreamNugetUpdate**](ReposApi.md#reposUpstreamNugetUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Update a NuGet upstream config for this repository. |
| [**reposUpstreamPythonCreate**](ReposApi.md#reposUpstreamPythonCreate) | **POST** /repos/{owner}/{identifier}/upstream/python/ | Create a Python upstream config for this repository. |
| [**reposUpstreamPythonDelete**](ReposApi.md#reposUpstreamPythonDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Delete a Python upstream config for this repository. |
| [**reposUpstreamPythonList**](ReposApi.md#reposUpstreamPythonList) | **GET** /repos/{owner}/{identifier}/upstream/python/ | List Python upstream configs for this repository. |
| [**reposUpstreamPythonPartialUpdate**](ReposApi.md#reposUpstreamPythonPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Partially update a Python upstream config for this repository. |
| [**reposUpstreamPythonRead**](ReposApi.md#reposUpstreamPythonRead) | **GET** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Retrieve a Python upstream config for this repository. |
| [**reposUpstreamPythonUpdate**](ReposApi.md#reposUpstreamPythonUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Update a Python upstream config for this repository. |
| [**reposUpstreamRpmCreate**](ReposApi.md#reposUpstreamRpmCreate) | **POST** /repos/{owner}/{identifier}/upstream/rpm/ | Create a RedHat upstream config for this repository. |
| [**reposUpstreamRpmDelete**](ReposApi.md#reposUpstreamRpmDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Delete a RedHat upstream config for this repository. |
| [**reposUpstreamRpmList**](ReposApi.md#reposUpstreamRpmList) | **GET** /repos/{owner}/{identifier}/upstream/rpm/ | List RedHat upstream configs for this repository. |
| [**reposUpstreamRpmPartialUpdate**](ReposApi.md#reposUpstreamRpmPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Partially update a RedHat upstream config for this repository. |
| [**reposUpstreamRpmRead**](ReposApi.md#reposUpstreamRpmRead) | **GET** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Retrieve a RedHat upstream config for this repository. |
| [**reposUpstreamRpmUpdate**](ReposApi.md#reposUpstreamRpmUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Update a RedHat upstream config for this repository. |
| [**reposUpstreamRubyCreate**](ReposApi.md#reposUpstreamRubyCreate) | **POST** /repos/{owner}/{identifier}/upstream/ruby/ | Create a Ruby upstream config for this repository. |
| [**reposUpstreamRubyDelete**](ReposApi.md#reposUpstreamRubyDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Delete a Ruby upstream config for this repository. |
| [**reposUpstreamRubyList**](ReposApi.md#reposUpstreamRubyList) | **GET** /repos/{owner}/{identifier}/upstream/ruby/ | List Ruby upstream configs for this repository. |
| [**reposUpstreamRubyPartialUpdate**](ReposApi.md#reposUpstreamRubyPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Partially update a Ruby upstream config for this repository. |
| [**reposUpstreamRubyRead**](ReposApi.md#reposUpstreamRubyRead) | **GET** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Retrieve a Ruby upstream config for this repository. |
| [**reposUpstreamRubyUpdate**](ReposApi.md#reposUpstreamRubyUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Update a Ruby upstream config for this repository. |
| [**reposUpstreamSwiftCreate**](ReposApi.md#reposUpstreamSwiftCreate) | **POST** /repos/{owner}/{identifier}/upstream/swift/ | Create a Swift upstream config for this repository. |
| [**reposUpstreamSwiftDelete**](ReposApi.md#reposUpstreamSwiftDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Delete a Swift upstream config for this repository. |
| [**reposUpstreamSwiftList**](ReposApi.md#reposUpstreamSwiftList) | **GET** /repos/{owner}/{identifier}/upstream/swift/ | List Swift upstream configs for this repository. |
| [**reposUpstreamSwiftPartialUpdate**](ReposApi.md#reposUpstreamSwiftPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Partially update a Swift upstream config for this repository. |
| [**reposUpstreamSwiftRead**](ReposApi.md#reposUpstreamSwiftRead) | **GET** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Retrieve a Swift upstream config for this repository. |
| [**reposUpstreamSwiftUpdate**](ReposApi.md#reposUpstreamSwiftUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Update a Swift upstream config for this repository. |
| [**reposUserList**](ReposApi.md#reposUserList) | **GET** /repos/ | Get a list of all repositories associated with current user. |
| [**reposX509EcdsaList**](ReposApi.md#reposX509EcdsaList) | **GET** /repos/{owner}/{identifier}/x509-ecdsa/ | Retrieve the active X.509 ECDSA certificate for the Repository. |
| [**reposX509RsaList**](ReposApi.md#reposX509RsaList) | **GET** /repos/{owner}/{identifier}/x509-rsa/ | Retrieve the active X.509 RSA certificate for the Repository. |


<a id="apiReposGeoipStatus"></a>
# **apiReposGeoipStatus**
> RepositoryGeoIpStatus apiReposGeoipStatus(owner, identifier)

Retrieve the GeoIP status for this repository.

Retrieve the GeoIP status for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      RepositoryGeoIpStatus result = apiInstance.apiReposGeoipStatus(owner, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#apiReposGeoipStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**RepositoryGeoIpStatus**](RepositoryGeoIpStatus.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the GeoIP status for this repository. |  -  |
| **402** | Geo/IP restrictions are not available; upgrade your account! |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="repoRetentionPartialUpdate"></a>
# **repoRetentionPartialUpdate**
> RepositoryRetentionRules repoRetentionPartialUpdate(owner, repo, data)

Update the retention rules for the repository.

Update the retention rules for the repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    RepositoryRetentionRulesRequestPatch data = new RepositoryRetentionRulesRequestPatch(); // RepositoryRetentionRulesRequestPatch | 
    try {
      RepositoryRetentionRules result = apiInstance.repoRetentionPartialUpdate(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#repoRetentionPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **repo** | **String**|  | |
| **data** | [**RepositoryRetentionRulesRequestPatch**](RepositoryRetentionRulesRequestPatch.md)|  | [optional] |

### Return type

[**RepositoryRetentionRules**](RepositoryRetentionRules.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated the retention rules for the repository. |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="repoRetentionRead"></a>
# **repoRetentionRead**
> RepositoryRetentionRules repoRetentionRead(owner, repo)

Retrieve the retention rules for the repository.

Retrieve the retention rules for the repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    try {
      RepositoryRetentionRules result = apiInstance.repoRetentionRead(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#repoRetentionRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **repo** | **String**|  | |

### Return type

[**RepositoryRetentionRules**](RepositoryRetentionRules.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the retention rules for the repository. |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposConnectedCreate"></a>
# **reposConnectedCreate**
> ConnectedRepository reposConnectedCreate(owner, identifier, data)

Create a connected repository for this repository.

Create a connected repository for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    ConnectedRepositoryRequest data = new ConnectedRepositoryRequest(); // ConnectedRepositoryRequest | 
    try {
      ConnectedRepository result = apiInstance.reposConnectedCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposConnectedCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**ConnectedRepositoryRequest**](ConnectedRepositoryRequest.md)|  | [optional] |

### Return type

[**ConnectedRepository**](ConnectedRepository.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The connected repository was created. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposConnectedDelete"></a>
# **reposConnectedDelete**
> reposConnectedDelete(owner, identifier, slugPerm)

Delete a connected repository for this repository.

Delete a connected repository for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposConnectedDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposConnectedDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The connected repository was deleted. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposConnectedList"></a>
# **reposConnectedList**
> ReposConnectedList200Response reposConnectedList(owner, identifier, page, pageSize)

List connected repositories for this repository.

List connected repositories for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      ReposConnectedList200Response result = apiInstance.reposConnectedList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposConnectedList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**ReposConnectedList200Response**](ReposConnectedList200Response.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the list of connected repositories. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposConnectedPartialUpdate"></a>
# **reposConnectedPartialUpdate**
> ConnectedRepository reposConnectedPartialUpdate(owner, identifier, slugPerm, data)

Partially update a connected repository for this repository.

Partially update a connected repository for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    ConnectedRepositoryRequestPatch data = new ConnectedRepositoryRequestPatch(); // ConnectedRepositoryRequestPatch | 
    try {
      ConnectedRepository result = apiInstance.reposConnectedPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposConnectedPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**ConnectedRepositoryRequestPatch**](ConnectedRepositoryRequestPatch.md)|  | [optional] |

### Return type

[**ConnectedRepository**](ConnectedRepository.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The connected repository was partially updated. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposConnectedRead"></a>
# **reposConnectedRead**
> ConnectedRepository reposConnectedRead(owner, identifier, slugPerm)

Retrieve a connected repository for this repository.

Retrieve a connected repository for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      ConnectedRepository result = apiInstance.reposConnectedRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposConnectedRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**ConnectedRepository**](ConnectedRepository.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the connected repository. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposConnectedUpdate"></a>
# **reposConnectedUpdate**
> ConnectedRepository reposConnectedUpdate(owner, identifier, slugPerm, data)

Update a connected repository for this repository.

Update a connected repository for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    ConnectedRepositoryRequest data = new ConnectedRepositoryRequest(); // ConnectedRepositoryRequest | 
    try {
      ConnectedRepository result = apiInstance.reposConnectedUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposConnectedUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**ConnectedRepositoryRequest**](ConnectedRepositoryRequest.md)|  | [optional] |

### Return type

[**ConnectedRepository**](ConnectedRepository.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The connected repository was updated. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposCreate"></a>
# **reposCreate**
> RepositoryCreate reposCreate(owner, data)

Create a new repository in a given namespace.

Create a new repository in a given namespace.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    RepositoryCreateRequest data = new RepositoryCreateRequest(); // RepositoryCreateRequest | 
    try {
      RepositoryCreate result = apiInstance.reposCreate(owner, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **data** | [**RepositoryCreateRequest**](RepositoryCreateRequest.md)|  | [optional] |

### Return type

[**RepositoryCreate**](RepositoryCreate.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The repository was created. |  -  |
| **404** | Owner namespace not found. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposDelete"></a>
# **reposDelete**
> reposDelete(owner, identifier)



Delete a repository in a given namespace.  Note: Repositories are soft-deleted and can be restored within a retention period. During this time, the repository&#39;s slug remains reserved and cannot be reused for new repositories.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      apiInstance.reposDelete(owner, identifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The repository has been scheduled for deletion. |  -  |
| **404** | Unable to find repository with that name in the provided namespace. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposEcdsaCreate"></a>
# **reposEcdsaCreate**
> RepositoryEcdsaKey reposEcdsaCreate(owner, identifier, data)

Set the active ECDSA key for the Repository.

Set the active ECDSA key for the Repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    RepositoryEcdsaKeyCreate data = new RepositoryEcdsaKeyCreate(); // RepositoryEcdsaKeyCreate | 
    try {
      RepositoryEcdsaKey result = apiInstance.reposEcdsaCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposEcdsaCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**RepositoryEcdsaKeyCreate**](RepositoryEcdsaKeyCreate.md)|  | [optional] |

### Return type

[**RepositoryEcdsaKey**](RepositoryEcdsaKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The provided ECDSA key is the same as the current ECDSA key. |  -  |
| **201** | The provided ECDSA key was assigned to the Repository. |  -  |
| **400** | The provided ECDSA key is not valid |  -  |
| **402** | Custom ECDSA keys are not active; upgrade your account! |  -  |
| **404** | Organization/Repository does not exist, or you do not have permissions. |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposEcdsaList"></a>
# **reposEcdsaList**
> RepositoryEcdsaKey reposEcdsaList(owner, identifier)

Retrieve the active ECDSA key for the Repository.

Retrieve the active ECDSA key for the Repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      RepositoryEcdsaKey result = apiInstance.reposEcdsaList(owner, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposEcdsaList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**RepositoryEcdsaKey**](RepositoryEcdsaKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the active ECDSA key. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposEcdsaRegenerate"></a>
# **reposEcdsaRegenerate**
> RepositoryEcdsaKey reposEcdsaRegenerate(owner, identifier)

Regenerate ECDSA Key for the Repository.

Regenerate ECDSA Key for the Repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      RepositoryEcdsaKey result = apiInstance.reposEcdsaRegenerate(owner, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposEcdsaRegenerate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**RepositoryEcdsaKey**](RepositoryEcdsaKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An ECDSA key was generated for the Repository. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposEd25519Create"></a>
# **reposEd25519Create**
> RepositoryEd25519Key reposEd25519Create(owner, identifier, data)

Set the active Ed25519 key for the Repository.

Set the active Ed25519 key for the Repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    RepositoryEd25519KeyCreate data = new RepositoryEd25519KeyCreate(); // RepositoryEd25519KeyCreate | 
    try {
      RepositoryEd25519Key result = apiInstance.reposEd25519Create(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposEd25519Create");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**RepositoryEd25519KeyCreate**](RepositoryEd25519KeyCreate.md)|  | [optional] |

### Return type

[**RepositoryEd25519Key**](RepositoryEd25519Key.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The provided Ed25519 key is the same as the current Ed25519 key. |  -  |
| **201** | The provided Ed25519 key was assigned to the Repository. |  -  |
| **400** | The provided Ed25519 key is not valid |  -  |
| **402** | Custom Ed25519 keys are not active; upgrade your account! |  -  |
| **404** | Organization/Repository does not exist, or you do not have permissions. |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposEd25519List"></a>
# **reposEd25519List**
> RepositoryEd25519Key reposEd25519List(owner, identifier)

Retrieve the active Ed25519 key for the Repository.

Retrieve the active Ed25519 key for the Repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      RepositoryEd25519Key result = apiInstance.reposEd25519List(owner, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposEd25519List");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**RepositoryEd25519Key**](RepositoryEd25519Key.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the active Ed25519 key. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposEd25519Regenerate"></a>
# **reposEd25519Regenerate**
> RepositoryEd25519Key reposEd25519Regenerate(owner, identifier)

Regenerate Ed25519 Key for the Repository.

Regenerate Ed25519 Key for the Repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      RepositoryEd25519Key result = apiInstance.reposEd25519Regenerate(owner, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposEd25519Regenerate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**RepositoryEd25519Key**](RepositoryEd25519Key.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Ed25519 key was generated for the Repository. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposGeoipDisable"></a>
# **reposGeoipDisable**
> reposGeoipDisable(owner, identifier, data)

Disable GeoIP for this repository.

Disable GeoIP for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    Object data = null; // Object | 
    try {
      apiInstance.reposGeoipDisable(owner, identifier, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGeoipDisable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | **Object**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | GeoIP has been disabled for this repository. |  -  |
| **402** | Geo/IP restrictions are not available; upgrade your account! |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposGeoipEnable"></a>
# **reposGeoipEnable**
> reposGeoipEnable(owner, identifier, data)

Enable GeoIP for this repository.

Enable GeoIP for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    Object data = null; // Object | 
    try {
      apiInstance.reposGeoipEnable(owner, identifier, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGeoipEnable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | **Object**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | GeoIP has been enabled for this repository. |  -  |
| **402** | Geo/IP restrictions are not available; upgrade your account! |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposGeoipPartialUpdate"></a>
# **reposGeoipPartialUpdate**
> RepositoryGeoIpRules reposGeoipPartialUpdate(owner, identifier, data)

Partially update repository geoip rules.

Partially update repository geoip rules.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    RepositoryGeoIpRulesRequestPatch data = new RepositoryGeoIpRulesRequestPatch(); // RepositoryGeoIpRulesRequestPatch | 
    try {
      RepositoryGeoIpRules result = apiInstance.reposGeoipPartialUpdate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGeoipPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**RepositoryGeoIpRulesRequestPatch**](RepositoryGeoIpRulesRequestPatch.md)|  | [optional] |

### Return type

[**RepositoryGeoIpRules**](RepositoryGeoIpRules.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **402** | Geo/IP restrictions are not available; upgrade your account! |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposGeoipRead"></a>
# **reposGeoipRead**
> RepositoryGeoIpRules reposGeoipRead(owner, identifier)

List all repository geoip rules.

List all repository geoip rules.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      RepositoryGeoIpRules result = apiInstance.reposGeoipRead(owner, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGeoipRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**RepositoryGeoIpRules**](RepositoryGeoIpRules.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **402** | Geo/IP restrictions are not available; upgrade your account! |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposGeoipTest"></a>
# **reposGeoipTest**
> RepositoryGeoIpTestAddressResponse reposGeoipTest(owner, identifier, data)

Test a list of IP addresses against the repository&#39;s current GeoIP rules.

Test a list of IP addresses against the repository&#39;s current GeoIP rules.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    RepositoryGeoIpTestAddress data = new RepositoryGeoIpTestAddress(); // RepositoryGeoIpTestAddress | 
    try {
      RepositoryGeoIpTestAddressResponse result = apiInstance.reposGeoipTest(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGeoipTest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**RepositoryGeoIpTestAddress**](RepositoryGeoIpTestAddress.md)|  | [optional] |

### Return type

[**RepositoryGeoIpTestAddressResponse**](RepositoryGeoIpTestAddressResponse.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfuly tested addresses against the repository&#39;s GeoIP rules |  -  |
| **402** | Geo/IP restrictions are not available; upgrade your account! |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposGeoipUpdate"></a>
# **reposGeoipUpdate**
> RepositoryGeoIpRules reposGeoipUpdate(owner, identifier, data)

Replace repository geoip rules.

Replace repository geoip rules.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    RepositoryGeoIpRulesRequest data = new RepositoryGeoIpRulesRequest(); // RepositoryGeoIpRulesRequest | 
    try {
      RepositoryGeoIpRules result = apiInstance.reposGeoipUpdate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGeoipUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**RepositoryGeoIpRulesRequest**](RepositoryGeoIpRulesRequest.md)|  | [optional] |

### Return type

[**RepositoryGeoIpRules**](RepositoryGeoIpRules.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **402** | Geo/IP restrictions are not available; upgrade your account! |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposGpgCreate"></a>
# **reposGpgCreate**
> RepositoryGpgKey reposGpgCreate(owner, identifier, data)

Set the active GPG key for the Repository.

Set the active GPG key for the Repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    RepositoryGpgKeyCreate data = new RepositoryGpgKeyCreate(); // RepositoryGpgKeyCreate | 
    try {
      RepositoryGpgKey result = apiInstance.reposGpgCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGpgCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**RepositoryGpgKeyCreate**](RepositoryGpgKeyCreate.md)|  | [optional] |

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The provided GPG key is the same as the current GPG key. |  -  |
| **201** | The provided GPG key was assigned to the Repository. |  -  |
| **400** | The provided GPG key is not valid |  -  |
| **402** | Custom GPG keys are not active; upgrade your account! |  -  |
| **404** | Organization/Repository does not exist, or you do not have permissions. |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposGpgList"></a>
# **reposGpgList**
> RepositoryGpgKey reposGpgList(owner, identifier)

Retrieve the active GPG key for the Repository.

Retrieve the active GPG key for the Repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      RepositoryGpgKey result = apiInstance.reposGpgList(owner, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGpgList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the active GPG key. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposGpgRegenerate"></a>
# **reposGpgRegenerate**
> RepositoryGpgKey reposGpgRegenerate(owner, identifier)

Regenerate GPG Key for the Repository.

Regenerate GPG Key for the Repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      RepositoryGpgKey result = apiInstance.reposGpgRegenerate(owner, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGpgRegenerate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A GPG key was generated for the Repository. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposNamespaceList"></a>
# **reposNamespaceList**
> List&lt;Repository&gt; reposNamespaceList(owner, page, pageSize, query, sort)

Get a list of all repositories within a namespace.

Get a list of all repositories within a namespace.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    String query = "query_example"; // String | A search term for querying repositories. Available options are: name, slug. Explicit filters: broadcast_state, repository_type.
    String sort = "-created_at"; // String | A field for sorting objects in ascending or descending order. Available options are: created_at, downloads, favorites, name, package_count, size.
    try {
      List<Repository> result = apiInstance.reposNamespaceList(owner, page, pageSize, query, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposNamespaceList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |
| **query** | **String**| A search term for querying repositories. Available options are: name, slug. Explicit filters: broadcast_state, repository_type. | [optional] |
| **sort** | **String**| A field for sorting objects in ascending or descending order. Available options are: created_at, downloads, favorites, name, package_count, size. | [optional] [default to -created_at] |

### Return type

[**List&lt;Repository&gt;**](Repository.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the list of repositories |  -  |
| **404** | Owner namespace not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposPartialUpdate"></a>
# **reposPartialUpdate**
> Repository reposPartialUpdate(owner, identifier, data)

Update details about a repository in a given namespace.

Update details about a repository in a given namespace.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    RepositoryRequestPatch data = new RepositoryRequestPatch(); // RepositoryRequestPatch | 
    try {
      Repository result = apiInstance.reposPartialUpdate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**RepositoryRequestPatch**](RepositoryRequestPatch.md)|  | [optional] |

### Return type

[**Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The repository was updated. |  -  |
| **404** | Unable to find repository with that name in the provided namespace. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposPrivilegesList"></a>
# **reposPrivilegesList**
> RepositoryPrivilegeInput reposPrivilegesList(owner, identifier, page, pageSize)

List all explicity created privileges for the repository.

List all explicity created privileges for the repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      RepositoryPrivilegeInput result = apiInstance.reposPrivilegesList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposPrivilegesList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**RepositoryPrivilegeInput**](RepositoryPrivilegeInput.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved privileges for the specified repository |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposPrivilegesPartialUpdate"></a>
# **reposPrivilegesPartialUpdate**
> reposPrivilegesPartialUpdate(owner, identifier, data)

Modify privileges for the repository.

Modify privileges for the repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    RepositoryPrivilegeInputRequestPatch data = new RepositoryPrivilegeInputRequestPatch(); // RepositoryPrivilegeInputRequestPatch | 
    try {
      apiInstance.reposPrivilegesPartialUpdate(owner, identifier, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposPrivilegesPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**RepositoryPrivilegeInputRequestPatch**](RepositoryPrivilegeInputRequestPatch.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Repository privileges updated |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposPrivilegesUpdate"></a>
# **reposPrivilegesUpdate**
> reposPrivilegesUpdate(owner, identifier, data)

Replace all existing repository privileges with those specified.

Replace all existing repository privileges with those specified.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    RepositoryPrivilegeInputRequest data = new RepositoryPrivilegeInputRequest(); // RepositoryPrivilegeInputRequest | 
    try {
      apiInstance.reposPrivilegesUpdate(owner, identifier, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposPrivilegesUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**RepositoryPrivilegeInputRequest**](RepositoryPrivilegeInputRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Repository privileges replaced |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposRead"></a>
# **reposRead**
> Repository reposRead(owner, identifier)

Get a specific repository.

Get a specific repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      Repository result = apiInstance.reposRead(owner, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the specified repository |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposRsaCreate"></a>
# **reposRsaCreate**
> RepositoryRsaKey reposRsaCreate(owner, identifier, data)

Set the active RSA key for the Repository.

Set the active RSA key for the Repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    RepositoryRsaKeyCreate data = new RepositoryRsaKeyCreate(); // RepositoryRsaKeyCreate | 
    try {
      RepositoryRsaKey result = apiInstance.reposRsaCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposRsaCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**RepositoryRsaKeyCreate**](RepositoryRsaKeyCreate.md)|  | [optional] |

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The provided RSA key is the same as the current RSA key. |  -  |
| **201** | The provided RSA key was assigned to the Repository. |  -  |
| **400** | The provided RSA key is not valid |  -  |
| **402** | Custom RSA keys are not active; upgrade your account! |  -  |
| **404** | Organization/Repository does not exist, or you do not have permissions. |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposRsaList"></a>
# **reposRsaList**
> RepositoryRsaKey reposRsaList(owner, identifier)

Retrieve the active RSA key for the Repository.

Retrieve the active RSA key for the Repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      RepositoryRsaKey result = apiInstance.reposRsaList(owner, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposRsaList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the active RSA key. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposRsaRegenerate"></a>
# **reposRsaRegenerate**
> RepositoryRsaKey reposRsaRegenerate(owner, identifier)

Regenerate RSA Key for the Repository.

Regenerate RSA Key for the Repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      RepositoryRsaKey result = apiInstance.reposRsaRegenerate(owner, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposRsaRegenerate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An RSA key was generated for the Repository. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposTransferRegion"></a>
# **reposTransferRegion**
> reposTransferRegion(owner, repo, data)

Transfer a repository to a different region.

Transfer a repository to a different region.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    RepositoryTransferRegionRequest data = new RepositoryTransferRegionRequest(); // RepositoryTransferRegionRequest | 
    try {
      apiInstance.reposTransferRegion(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposTransferRegion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **repo** | **String**|  | |
| **data** | [**RepositoryTransferRegionRequest**](RepositoryTransferRegionRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Repository region transfer initiated. |  -  |
| **404** | Owner, namespace or repository not found. |  -  |
| **402** | Custom storage regions not available on plan; upgrade your account! |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamAlpineCreate"></a>
# **reposUpstreamAlpineCreate**
> AlpineUpstream reposUpstreamAlpineCreate(owner, identifier, data)

Create an Alpine upstream config for this repository.

Create an Alpine upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    AlpineUpstreamRequest data = new AlpineUpstreamRequest(); // AlpineUpstreamRequest | 
    try {
      AlpineUpstream result = apiInstance.reposUpstreamAlpineCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamAlpineCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**AlpineUpstreamRequest**](AlpineUpstreamRequest.md)|  | [optional] |

### Return type

[**AlpineUpstream**](AlpineUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamAlpineDelete"></a>
# **reposUpstreamAlpineDelete**
> reposUpstreamAlpineDelete(owner, identifier, slugPerm)

Delete an Alpine upstream config for this repository.

Delete an Alpine upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamAlpineDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamAlpineDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamAlpineList"></a>
# **reposUpstreamAlpineList**
> List&lt;AlpineUpstream&gt; reposUpstreamAlpineList(owner, identifier, page, pageSize)

List Alpine upstream configs for this repository.

List Alpine upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<AlpineUpstream> result = apiInstance.reposUpstreamAlpineList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamAlpineList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;AlpineUpstream&gt;**](AlpineUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamAlpinePartialUpdate"></a>
# **reposUpstreamAlpinePartialUpdate**
> AlpineUpstream reposUpstreamAlpinePartialUpdate(owner, identifier, slugPerm, data)

Partially update an Alpine upstream config for this repository.

Partially update an Alpine upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    AlpineUpstreamRequestPatch data = new AlpineUpstreamRequestPatch(); // AlpineUpstreamRequestPatch | 
    try {
      AlpineUpstream result = apiInstance.reposUpstreamAlpinePartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamAlpinePartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**AlpineUpstreamRequestPatch**](AlpineUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**AlpineUpstream**](AlpineUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamAlpineRead"></a>
# **reposUpstreamAlpineRead**
> AlpineUpstream reposUpstreamAlpineRead(owner, identifier, slugPerm)

Retrieve an Alpine upstream config for this repository.

Retrieve an Alpine upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      AlpineUpstream result = apiInstance.reposUpstreamAlpineRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamAlpineRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**AlpineUpstream**](AlpineUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamAlpineUpdate"></a>
# **reposUpstreamAlpineUpdate**
> AlpineUpstream reposUpstreamAlpineUpdate(owner, identifier, slugPerm, data)

Update an Alpine upstream config for this repository.

Update an Alpine upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    AlpineUpstreamRequest data = new AlpineUpstreamRequest(); // AlpineUpstreamRequest | 
    try {
      AlpineUpstream result = apiInstance.reposUpstreamAlpineUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamAlpineUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**AlpineUpstreamRequest**](AlpineUpstreamRequest.md)|  | [optional] |

### Return type

[**AlpineUpstream**](AlpineUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCargoCreate"></a>
# **reposUpstreamCargoCreate**
> CargoUpstream reposUpstreamCargoCreate(owner, identifier, data)

Create a Cargo upstream config for this repository.

Create a Cargo upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    CargoUpstreamRequest data = new CargoUpstreamRequest(); // CargoUpstreamRequest | 
    try {
      CargoUpstream result = apiInstance.reposUpstreamCargoCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCargoCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**CargoUpstreamRequest**](CargoUpstreamRequest.md)|  | [optional] |

### Return type

[**CargoUpstream**](CargoUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCargoDelete"></a>
# **reposUpstreamCargoDelete**
> reposUpstreamCargoDelete(owner, identifier, slugPerm)

Delete a Cargo upstream config for this repository.

Delete a Cargo upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamCargoDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCargoDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCargoList"></a>
# **reposUpstreamCargoList**
> List&lt;CargoUpstream&gt; reposUpstreamCargoList(owner, identifier, page, pageSize)

List Cargo upstream configs for this repository.

List Cargo upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<CargoUpstream> result = apiInstance.reposUpstreamCargoList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCargoList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;CargoUpstream&gt;**](CargoUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCargoPartialUpdate"></a>
# **reposUpstreamCargoPartialUpdate**
> CargoUpstream reposUpstreamCargoPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Cargo upstream config for this repository.

Partially update a Cargo upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    CargoUpstreamRequestPatch data = new CargoUpstreamRequestPatch(); // CargoUpstreamRequestPatch | 
    try {
      CargoUpstream result = apiInstance.reposUpstreamCargoPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCargoPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**CargoUpstreamRequestPatch**](CargoUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**CargoUpstream**](CargoUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCargoRead"></a>
# **reposUpstreamCargoRead**
> CargoUpstream reposUpstreamCargoRead(owner, identifier, slugPerm)

Retrieve a Cargo upstream config for this repository.

Retrieve a Cargo upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      CargoUpstream result = apiInstance.reposUpstreamCargoRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCargoRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**CargoUpstream**](CargoUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCargoUpdate"></a>
# **reposUpstreamCargoUpdate**
> CargoUpstream reposUpstreamCargoUpdate(owner, identifier, slugPerm, data)

Update a Cargo upstream config for this repository.

Update a Cargo upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    CargoUpstreamRequest data = new CargoUpstreamRequest(); // CargoUpstreamRequest | 
    try {
      CargoUpstream result = apiInstance.reposUpstreamCargoUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCargoUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**CargoUpstreamRequest**](CargoUpstreamRequest.md)|  | [optional] |

### Return type

[**CargoUpstream**](CargoUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamComposerCreate"></a>
# **reposUpstreamComposerCreate**
> ComposerUpstream reposUpstreamComposerCreate(owner, identifier, data)

Create a Composer upstream config for this repository.

Create a Composer upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    ComposerUpstreamRequest data = new ComposerUpstreamRequest(); // ComposerUpstreamRequest | 
    try {
      ComposerUpstream result = apiInstance.reposUpstreamComposerCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamComposerCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**ComposerUpstreamRequest**](ComposerUpstreamRequest.md)|  | [optional] |

### Return type

[**ComposerUpstream**](ComposerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamComposerDelete"></a>
# **reposUpstreamComposerDelete**
> reposUpstreamComposerDelete(owner, identifier, slugPerm)

Delete a Composer upstream config for this repository.

Delete a Composer upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamComposerDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamComposerDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamComposerList"></a>
# **reposUpstreamComposerList**
> List&lt;ComposerUpstream&gt; reposUpstreamComposerList(owner, identifier, page, pageSize)

List Composer upstream configs for this repository.

List Composer upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<ComposerUpstream> result = apiInstance.reposUpstreamComposerList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamComposerList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;ComposerUpstream&gt;**](ComposerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamComposerPartialUpdate"></a>
# **reposUpstreamComposerPartialUpdate**
> ComposerUpstream reposUpstreamComposerPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Composer upstream config for this repository.

Partially update a Composer upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    ComposerUpstreamRequestPatch data = new ComposerUpstreamRequestPatch(); // ComposerUpstreamRequestPatch | 
    try {
      ComposerUpstream result = apiInstance.reposUpstreamComposerPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamComposerPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**ComposerUpstreamRequestPatch**](ComposerUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**ComposerUpstream**](ComposerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamComposerRead"></a>
# **reposUpstreamComposerRead**
> ComposerUpstream reposUpstreamComposerRead(owner, identifier, slugPerm)

Retrieve a Composer upstream config for this repository.

Retrieve a Composer upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      ComposerUpstream result = apiInstance.reposUpstreamComposerRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamComposerRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**ComposerUpstream**](ComposerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamComposerUpdate"></a>
# **reposUpstreamComposerUpdate**
> ComposerUpstream reposUpstreamComposerUpdate(owner, identifier, slugPerm, data)

Update a Composer upstream config for this repository.

Update a Composer upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    ComposerUpstreamRequest data = new ComposerUpstreamRequest(); // ComposerUpstreamRequest | 
    try {
      ComposerUpstream result = apiInstance.reposUpstreamComposerUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamComposerUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**ComposerUpstreamRequest**](ComposerUpstreamRequest.md)|  | [optional] |

### Return type

[**ComposerUpstream**](ComposerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCondaCreate"></a>
# **reposUpstreamCondaCreate**
> CondaUpstream reposUpstreamCondaCreate(owner, identifier, data)

Create a Conda upstream config for this repository.

Create a Conda upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    CondaUpstreamRequest data = new CondaUpstreamRequest(); // CondaUpstreamRequest | 
    try {
      CondaUpstream result = apiInstance.reposUpstreamCondaCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCondaCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**CondaUpstreamRequest**](CondaUpstreamRequest.md)|  | [optional] |

### Return type

[**CondaUpstream**](CondaUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCondaDelete"></a>
# **reposUpstreamCondaDelete**
> reposUpstreamCondaDelete(owner, identifier, slugPerm)

Delete a Conda upstream config for this repository.

Delete a Conda upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamCondaDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCondaDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCondaList"></a>
# **reposUpstreamCondaList**
> List&lt;CondaUpstream&gt; reposUpstreamCondaList(owner, identifier, page, pageSize)

List Conda upstream configs for this repository.

List Conda upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<CondaUpstream> result = apiInstance.reposUpstreamCondaList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCondaList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;CondaUpstream&gt;**](CondaUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCondaPartialUpdate"></a>
# **reposUpstreamCondaPartialUpdate**
> CondaUpstream reposUpstreamCondaPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Conda upstream config for this repository.

Partially update a Conda upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    CondaUpstreamRequestPatch data = new CondaUpstreamRequestPatch(); // CondaUpstreamRequestPatch | 
    try {
      CondaUpstream result = apiInstance.reposUpstreamCondaPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCondaPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**CondaUpstreamRequestPatch**](CondaUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**CondaUpstream**](CondaUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCondaRead"></a>
# **reposUpstreamCondaRead**
> CondaUpstream reposUpstreamCondaRead(owner, identifier, slugPerm)

Retrieve a Conda upstream config for this repository.

Retrieve a Conda upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      CondaUpstream result = apiInstance.reposUpstreamCondaRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCondaRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**CondaUpstream**](CondaUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCondaUpdate"></a>
# **reposUpstreamCondaUpdate**
> CondaUpstream reposUpstreamCondaUpdate(owner, identifier, slugPerm, data)

Update a Conda upstream config for this repository.

Update a Conda upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    CondaUpstreamRequest data = new CondaUpstreamRequest(); // CondaUpstreamRequest | 
    try {
      CondaUpstream result = apiInstance.reposUpstreamCondaUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCondaUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**CondaUpstreamRequest**](CondaUpstreamRequest.md)|  | [optional] |

### Return type

[**CondaUpstream**](CondaUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCranCreate"></a>
# **reposUpstreamCranCreate**
> CranUpstream reposUpstreamCranCreate(owner, identifier, data)

Create a CRAN upstream config for this repository.

Create a CRAN upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    CranUpstreamRequest data = new CranUpstreamRequest(); // CranUpstreamRequest | 
    try {
      CranUpstream result = apiInstance.reposUpstreamCranCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCranCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**CranUpstreamRequest**](CranUpstreamRequest.md)|  | [optional] |

### Return type

[**CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCranDelete"></a>
# **reposUpstreamCranDelete**
> reposUpstreamCranDelete(owner, identifier, slugPerm)

Delete a CRAN upstream config for this repository.

Delete a CRAN upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamCranDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCranDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCranList"></a>
# **reposUpstreamCranList**
> List&lt;CranUpstream&gt; reposUpstreamCranList(owner, identifier, page, pageSize)

List CRAN upstream configs for this repository.

List CRAN upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<CranUpstream> result = apiInstance.reposUpstreamCranList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCranList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;CranUpstream&gt;**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCranPartialUpdate"></a>
# **reposUpstreamCranPartialUpdate**
> CranUpstream reposUpstreamCranPartialUpdate(owner, identifier, slugPerm, data)

Partially update a CRAN upstream config for this repository.

Partially update a CRAN upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    CranUpstreamRequestPatch data = new CranUpstreamRequestPatch(); // CranUpstreamRequestPatch | 
    try {
      CranUpstream result = apiInstance.reposUpstreamCranPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCranPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**CranUpstreamRequestPatch**](CranUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCranRead"></a>
# **reposUpstreamCranRead**
> CranUpstream reposUpstreamCranRead(owner, identifier, slugPerm)

Retrieve a CRAN upstream config for this repository.

Retrieve a CRAN upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      CranUpstream result = apiInstance.reposUpstreamCranRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCranRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamCranUpdate"></a>
# **reposUpstreamCranUpdate**
> CranUpstream reposUpstreamCranUpdate(owner, identifier, slugPerm, data)

Update a CRAN upstream config for this repository.

Update a CRAN upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    CranUpstreamRequest data = new CranUpstreamRequest(); // CranUpstreamRequest | 
    try {
      CranUpstream result = apiInstance.reposUpstreamCranUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamCranUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**CranUpstreamRequest**](CranUpstreamRequest.md)|  | [optional] |

### Return type

[**CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDartCreate"></a>
# **reposUpstreamDartCreate**
> DartUpstream reposUpstreamDartCreate(owner, identifier, data)

Create a Dart upstream config for this repository.

Create a Dart upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    DartUpstreamRequest data = new DartUpstreamRequest(); // DartUpstreamRequest | 
    try {
      DartUpstream result = apiInstance.reposUpstreamDartCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDartCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**DartUpstreamRequest**](DartUpstreamRequest.md)|  | [optional] |

### Return type

[**DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDartDelete"></a>
# **reposUpstreamDartDelete**
> reposUpstreamDartDelete(owner, identifier, slugPerm)

Delete a Dart upstream config for this repository.

Delete a Dart upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamDartDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDartDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDartList"></a>
# **reposUpstreamDartList**
> List&lt;DartUpstream&gt; reposUpstreamDartList(owner, identifier, page, pageSize)

List Dart upstream configs for this repository.

List Dart upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<DartUpstream> result = apiInstance.reposUpstreamDartList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDartList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;DartUpstream&gt;**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDartPartialUpdate"></a>
# **reposUpstreamDartPartialUpdate**
> DartUpstream reposUpstreamDartPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Dart upstream config for this repository.

Partially update a Dart upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    DartUpstreamRequestPatch data = new DartUpstreamRequestPatch(); // DartUpstreamRequestPatch | 
    try {
      DartUpstream result = apiInstance.reposUpstreamDartPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDartPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**DartUpstreamRequestPatch**](DartUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDartRead"></a>
# **reposUpstreamDartRead**
> DartUpstream reposUpstreamDartRead(owner, identifier, slugPerm)

Retrieve a Dart upstream config for this repository.

Retrieve a Dart upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      DartUpstream result = apiInstance.reposUpstreamDartRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDartRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDartUpdate"></a>
# **reposUpstreamDartUpdate**
> DartUpstream reposUpstreamDartUpdate(owner, identifier, slugPerm, data)

Update a Dart upstream config for this repository.

Update a Dart upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    DartUpstreamRequest data = new DartUpstreamRequest(); // DartUpstreamRequest | 
    try {
      DartUpstream result = apiInstance.reposUpstreamDartUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDartUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**DartUpstreamRequest**](DartUpstreamRequest.md)|  | [optional] |

### Return type

[**DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDebCreate"></a>
# **reposUpstreamDebCreate**
> DebUpstream reposUpstreamDebCreate(owner, identifier, data)

Create a Debian upstream config for this repository.

Create a Debian upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    DebUpstreamRequest data = new DebUpstreamRequest(); // DebUpstreamRequest | 
    try {
      DebUpstream result = apiInstance.reposUpstreamDebCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDebCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**DebUpstreamRequest**](DebUpstreamRequest.md)|  | [optional] |

### Return type

[**DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDebDelete"></a>
# **reposUpstreamDebDelete**
> reposUpstreamDebDelete(owner, identifier, slugPerm)

Delete a Debian upstream config for this repository.

Delete a Debian upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamDebDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDebDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDebList"></a>
# **reposUpstreamDebList**
> List&lt;DebUpstream&gt; reposUpstreamDebList(owner, identifier, page, pageSize)

List Debian upstream configs for this repository.

List Debian upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<DebUpstream> result = apiInstance.reposUpstreamDebList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDebList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;DebUpstream&gt;**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDebPartialUpdate"></a>
# **reposUpstreamDebPartialUpdate**
> DebUpstream reposUpstreamDebPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Debian upstream config for this repository.

Partially update a Debian upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    DebUpstreamRequestPatch data = new DebUpstreamRequestPatch(); // DebUpstreamRequestPatch | 
    try {
      DebUpstream result = apiInstance.reposUpstreamDebPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDebPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**DebUpstreamRequestPatch**](DebUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDebRead"></a>
# **reposUpstreamDebRead**
> DebUpstream reposUpstreamDebRead(owner, identifier, slugPerm)

Retrieve a Debian upstream config for this repository.

Retrieve a Debian upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      DebUpstream result = apiInstance.reposUpstreamDebRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDebRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDebUpdate"></a>
# **reposUpstreamDebUpdate**
> DebUpstream reposUpstreamDebUpdate(owner, identifier, slugPerm, data)

Update a Debian upstream config for this repository.

Update a Debian upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    DebUpstreamRequest data = new DebUpstreamRequest(); // DebUpstreamRequest | 
    try {
      DebUpstream result = apiInstance.reposUpstreamDebUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDebUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**DebUpstreamRequest**](DebUpstreamRequest.md)|  | [optional] |

### Return type

[**DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDockerCreate"></a>
# **reposUpstreamDockerCreate**
> DockerUpstream reposUpstreamDockerCreate(owner, identifier, data)

Create a Docker upstream config for this repository.

Create a Docker upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    DockerUpstreamRequest data = new DockerUpstreamRequest(); // DockerUpstreamRequest | 
    try {
      DockerUpstream result = apiInstance.reposUpstreamDockerCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDockerCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**DockerUpstreamRequest**](DockerUpstreamRequest.md)|  | [optional] |

### Return type

[**DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDockerDelete"></a>
# **reposUpstreamDockerDelete**
> reposUpstreamDockerDelete(owner, identifier, slugPerm)

Delete a Docker upstream config for this repository.

Delete a Docker upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamDockerDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDockerDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDockerList"></a>
# **reposUpstreamDockerList**
> List&lt;DockerUpstream&gt; reposUpstreamDockerList(owner, identifier, page, pageSize)

List Docker upstream configs for this repository.

List Docker upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<DockerUpstream> result = apiInstance.reposUpstreamDockerList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDockerList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;DockerUpstream&gt;**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDockerPartialUpdate"></a>
# **reposUpstreamDockerPartialUpdate**
> DockerUpstream reposUpstreamDockerPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Docker upstream config for this repository.

Partially update a Docker upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    DockerUpstreamRequestPatch data = new DockerUpstreamRequestPatch(); // DockerUpstreamRequestPatch | 
    try {
      DockerUpstream result = apiInstance.reposUpstreamDockerPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDockerPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**DockerUpstreamRequestPatch**](DockerUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDockerRead"></a>
# **reposUpstreamDockerRead**
> DockerUpstream reposUpstreamDockerRead(owner, identifier, slugPerm)

Retrieve a Docker upstream config for this repository.

Retrieve a Docker upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      DockerUpstream result = apiInstance.reposUpstreamDockerRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDockerRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamDockerUpdate"></a>
# **reposUpstreamDockerUpdate**
> DockerUpstream reposUpstreamDockerUpdate(owner, identifier, slugPerm, data)

Update a Docker upstream config for this repository.

Update a Docker upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    DockerUpstreamRequest data = new DockerUpstreamRequest(); // DockerUpstreamRequest | 
    try {
      DockerUpstream result = apiInstance.reposUpstreamDockerUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamDockerUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**DockerUpstreamRequest**](DockerUpstreamRequest.md)|  | [optional] |

### Return type

[**DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamGenericCreate"></a>
# **reposUpstreamGenericCreate**
> GenericUpstream reposUpstreamGenericCreate(owner, identifier, data)

Create a Generic upstream config for this repository.

Create a Generic upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    GenericUpstreamRequest data = new GenericUpstreamRequest(); // GenericUpstreamRequest | 
    try {
      GenericUpstream result = apiInstance.reposUpstreamGenericCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamGenericCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**GenericUpstreamRequest**](GenericUpstreamRequest.md)|  | [optional] |

### Return type

[**GenericUpstream**](GenericUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamGenericDelete"></a>
# **reposUpstreamGenericDelete**
> reposUpstreamGenericDelete(owner, identifier, slugPerm)

Delete a Generic upstream config for this repository.

Delete a Generic upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamGenericDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamGenericDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamGenericList"></a>
# **reposUpstreamGenericList**
> List&lt;GenericUpstream&gt; reposUpstreamGenericList(owner, identifier, page, pageSize)

List Generic upstream configs for this repository.

List Generic upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<GenericUpstream> result = apiInstance.reposUpstreamGenericList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamGenericList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;GenericUpstream&gt;**](GenericUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamGenericPartialUpdate"></a>
# **reposUpstreamGenericPartialUpdate**
> GenericUpstream reposUpstreamGenericPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Generic upstream config for this repository.

Partially update a Generic upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    GenericUpstreamRequestPatch data = new GenericUpstreamRequestPatch(); // GenericUpstreamRequestPatch | 
    try {
      GenericUpstream result = apiInstance.reposUpstreamGenericPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamGenericPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**GenericUpstreamRequestPatch**](GenericUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**GenericUpstream**](GenericUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamGenericRead"></a>
# **reposUpstreamGenericRead**
> GenericUpstream reposUpstreamGenericRead(owner, identifier, slugPerm)

Retrieve a Generic upstream config for this repository.

Retrieve a Generic upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      GenericUpstream result = apiInstance.reposUpstreamGenericRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamGenericRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**GenericUpstream**](GenericUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamGenericUpdate"></a>
# **reposUpstreamGenericUpdate**
> GenericUpstream reposUpstreamGenericUpdate(owner, identifier, slugPerm, data)

Update a Generic upstream config for this repository.

Update a Generic upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    GenericUpstreamRequest data = new GenericUpstreamRequest(); // GenericUpstreamRequest | 
    try {
      GenericUpstream result = apiInstance.reposUpstreamGenericUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamGenericUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**GenericUpstreamRequest**](GenericUpstreamRequest.md)|  | [optional] |

### Return type

[**GenericUpstream**](GenericUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamGoCreate"></a>
# **reposUpstreamGoCreate**
> GoUpstream reposUpstreamGoCreate(owner, identifier, data)

Create a Go upstream config for this repository.

Create a Go upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    GoUpstreamRequest data = new GoUpstreamRequest(); // GoUpstreamRequest | 
    try {
      GoUpstream result = apiInstance.reposUpstreamGoCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamGoCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**GoUpstreamRequest**](GoUpstreamRequest.md)|  | [optional] |

### Return type

[**GoUpstream**](GoUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamGoDelete"></a>
# **reposUpstreamGoDelete**
> reposUpstreamGoDelete(owner, identifier, slugPerm)

Delete a Go upstream config for this repository.

Delete a Go upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamGoDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamGoDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamGoList"></a>
# **reposUpstreamGoList**
> List&lt;GoUpstream&gt; reposUpstreamGoList(owner, identifier, page, pageSize)

List Go upstream configs for this repository.

List Go upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<GoUpstream> result = apiInstance.reposUpstreamGoList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamGoList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;GoUpstream&gt;**](GoUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamGoPartialUpdate"></a>
# **reposUpstreamGoPartialUpdate**
> GoUpstream reposUpstreamGoPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Go upstream config for this repository.

Partially update a Go upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    GoUpstreamRequestPatch data = new GoUpstreamRequestPatch(); // GoUpstreamRequestPatch | 
    try {
      GoUpstream result = apiInstance.reposUpstreamGoPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamGoPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**GoUpstreamRequestPatch**](GoUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**GoUpstream**](GoUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamGoRead"></a>
# **reposUpstreamGoRead**
> GoUpstream reposUpstreamGoRead(owner, identifier, slugPerm)

Retrieve a Go upstream config for this repository.

Retrieve a Go upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      GoUpstream result = apiInstance.reposUpstreamGoRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamGoRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**GoUpstream**](GoUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamGoUpdate"></a>
# **reposUpstreamGoUpdate**
> GoUpstream reposUpstreamGoUpdate(owner, identifier, slugPerm, data)

Update a Go upstream config for this repository.

Update a Go upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    GoUpstreamRequest data = new GoUpstreamRequest(); // GoUpstreamRequest | 
    try {
      GoUpstream result = apiInstance.reposUpstreamGoUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamGoUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**GoUpstreamRequest**](GoUpstreamRequest.md)|  | [optional] |

### Return type

[**GoUpstream**](GoUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHelmCreate"></a>
# **reposUpstreamHelmCreate**
> HelmUpstream reposUpstreamHelmCreate(owner, identifier, data)

Create a Helm upstream config for this repository.

Create a Helm upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    HelmUpstreamRequest data = new HelmUpstreamRequest(); // HelmUpstreamRequest | 
    try {
      HelmUpstream result = apiInstance.reposUpstreamHelmCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHelmCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**HelmUpstreamRequest**](HelmUpstreamRequest.md)|  | [optional] |

### Return type

[**HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHelmDelete"></a>
# **reposUpstreamHelmDelete**
> reposUpstreamHelmDelete(owner, identifier, slugPerm)

Delete a Helm upstream config for this repository.

Delete a Helm upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamHelmDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHelmDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHelmList"></a>
# **reposUpstreamHelmList**
> List&lt;HelmUpstream&gt; reposUpstreamHelmList(owner, identifier, page, pageSize)

List Helm upstream configs for this repository.

List Helm upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<HelmUpstream> result = apiInstance.reposUpstreamHelmList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHelmList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;HelmUpstream&gt;**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHelmPartialUpdate"></a>
# **reposUpstreamHelmPartialUpdate**
> HelmUpstream reposUpstreamHelmPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Helm upstream config for this repository.

Partially update a Helm upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    HelmUpstreamRequestPatch data = new HelmUpstreamRequestPatch(); // HelmUpstreamRequestPatch | 
    try {
      HelmUpstream result = apiInstance.reposUpstreamHelmPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHelmPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**HelmUpstreamRequestPatch**](HelmUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHelmRead"></a>
# **reposUpstreamHelmRead**
> HelmUpstream reposUpstreamHelmRead(owner, identifier, slugPerm)

Retrieve a Helm upstream config for this repository.

Retrieve a Helm upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      HelmUpstream result = apiInstance.reposUpstreamHelmRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHelmRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHelmUpdate"></a>
# **reposUpstreamHelmUpdate**
> HelmUpstream reposUpstreamHelmUpdate(owner, identifier, slugPerm, data)

Update a Helm upstream config for this repository.

Update a Helm upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    HelmUpstreamRequest data = new HelmUpstreamRequest(); // HelmUpstreamRequest | 
    try {
      HelmUpstream result = apiInstance.reposUpstreamHelmUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHelmUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**HelmUpstreamRequest**](HelmUpstreamRequest.md)|  | [optional] |

### Return type

[**HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHexCreate"></a>
# **reposUpstreamHexCreate**
> HexUpstream reposUpstreamHexCreate(owner, identifier, data)

Create a Hex upstream config for this repository.

Create a Hex upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    HexUpstreamRequest data = new HexUpstreamRequest(); // HexUpstreamRequest | 
    try {
      HexUpstream result = apiInstance.reposUpstreamHexCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHexCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**HexUpstreamRequest**](HexUpstreamRequest.md)|  | [optional] |

### Return type

[**HexUpstream**](HexUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHexDelete"></a>
# **reposUpstreamHexDelete**
> reposUpstreamHexDelete(owner, identifier, slugPerm)

Delete a Hex upstream config for this repository.

Delete a Hex upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamHexDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHexDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHexList"></a>
# **reposUpstreamHexList**
> List&lt;HexUpstream&gt; reposUpstreamHexList(owner, identifier, page, pageSize)

List Hex upstream configs for this repository.

List Hex upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<HexUpstream> result = apiInstance.reposUpstreamHexList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHexList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;HexUpstream&gt;**](HexUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHexPartialUpdate"></a>
# **reposUpstreamHexPartialUpdate**
> HexUpstream reposUpstreamHexPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Hex upstream config for this repository.

Partially update a Hex upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    HexUpstreamRequestPatch data = new HexUpstreamRequestPatch(); // HexUpstreamRequestPatch | 
    try {
      HexUpstream result = apiInstance.reposUpstreamHexPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHexPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**HexUpstreamRequestPatch**](HexUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**HexUpstream**](HexUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHexRead"></a>
# **reposUpstreamHexRead**
> HexUpstream reposUpstreamHexRead(owner, identifier, slugPerm)

Retrieve a Hex upstream config for this repository.

Retrieve a Hex upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      HexUpstream result = apiInstance.reposUpstreamHexRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHexRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**HexUpstream**](HexUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHexUpdate"></a>
# **reposUpstreamHexUpdate**
> HexUpstream reposUpstreamHexUpdate(owner, identifier, slugPerm, data)

Update a Hex upstream config for this repository.

Update a Hex upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    HexUpstreamRequest data = new HexUpstreamRequest(); // HexUpstreamRequest | 
    try {
      HexUpstream result = apiInstance.reposUpstreamHexUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHexUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**HexUpstreamRequest**](HexUpstreamRequest.md)|  | [optional] |

### Return type

[**HexUpstream**](HexUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHuggingfaceCreate"></a>
# **reposUpstreamHuggingfaceCreate**
> HuggingfaceUpstream reposUpstreamHuggingfaceCreate(owner, identifier, data)

Create a HuggingFace upstream config for this repository.

Create a HuggingFace upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    HuggingfaceUpstreamRequest data = new HuggingfaceUpstreamRequest(); // HuggingfaceUpstreamRequest | 
    try {
      HuggingfaceUpstream result = apiInstance.reposUpstreamHuggingfaceCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHuggingfaceCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**HuggingfaceUpstreamRequest**](HuggingfaceUpstreamRequest.md)|  | [optional] |

### Return type

[**HuggingfaceUpstream**](HuggingfaceUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHuggingfaceDelete"></a>
# **reposUpstreamHuggingfaceDelete**
> reposUpstreamHuggingfaceDelete(owner, identifier, slugPerm)

Delete a HuggingFace upstream config for this repository.

Delete a HuggingFace upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamHuggingfaceDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHuggingfaceDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHuggingfaceList"></a>
# **reposUpstreamHuggingfaceList**
> List&lt;HuggingfaceUpstream&gt; reposUpstreamHuggingfaceList(owner, identifier, page, pageSize)

List HuggingFace upstream configs for this repository.

List HuggingFace upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<HuggingfaceUpstream> result = apiInstance.reposUpstreamHuggingfaceList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHuggingfaceList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;HuggingfaceUpstream&gt;**](HuggingfaceUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHuggingfacePartialUpdate"></a>
# **reposUpstreamHuggingfacePartialUpdate**
> HuggingfaceUpstream reposUpstreamHuggingfacePartialUpdate(owner, identifier, slugPerm, data)

Partially update a HuggingFace upstream config for this repository.

Partially update a HuggingFace upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    HuggingfaceUpstreamRequestPatch data = new HuggingfaceUpstreamRequestPatch(); // HuggingfaceUpstreamRequestPatch | 
    try {
      HuggingfaceUpstream result = apiInstance.reposUpstreamHuggingfacePartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHuggingfacePartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**HuggingfaceUpstreamRequestPatch**](HuggingfaceUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**HuggingfaceUpstream**](HuggingfaceUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHuggingfaceRead"></a>
# **reposUpstreamHuggingfaceRead**
> HuggingfaceUpstream reposUpstreamHuggingfaceRead(owner, identifier, slugPerm)

Retrieve a HuggingFace upstream config for this repository.

Retrieve a HuggingFace upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      HuggingfaceUpstream result = apiInstance.reposUpstreamHuggingfaceRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHuggingfaceRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**HuggingfaceUpstream**](HuggingfaceUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamHuggingfaceUpdate"></a>
# **reposUpstreamHuggingfaceUpdate**
> HuggingfaceUpstream reposUpstreamHuggingfaceUpdate(owner, identifier, slugPerm, data)

Update a HuggingFace upstream config for this repository.

Update a HuggingFace upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    HuggingfaceUpstreamRequest data = new HuggingfaceUpstreamRequest(); // HuggingfaceUpstreamRequest | 
    try {
      HuggingfaceUpstream result = apiInstance.reposUpstreamHuggingfaceUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamHuggingfaceUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**HuggingfaceUpstreamRequest**](HuggingfaceUpstreamRequest.md)|  | [optional] |

### Return type

[**HuggingfaceUpstream**](HuggingfaceUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamMavenCreate"></a>
# **reposUpstreamMavenCreate**
> MavenUpstream reposUpstreamMavenCreate(owner, identifier, data)

Create a Maven upstream config for this repository.

Create a Maven upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    MavenUpstreamRequest data = new MavenUpstreamRequest(); // MavenUpstreamRequest | 
    try {
      MavenUpstream result = apiInstance.reposUpstreamMavenCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamMavenCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**MavenUpstreamRequest**](MavenUpstreamRequest.md)|  | [optional] |

### Return type

[**MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamMavenDelete"></a>
# **reposUpstreamMavenDelete**
> reposUpstreamMavenDelete(owner, identifier, slugPerm)

Delete a Maven upstream config for this repository.

Delete a Maven upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamMavenDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamMavenDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamMavenList"></a>
# **reposUpstreamMavenList**
> List&lt;MavenUpstream&gt; reposUpstreamMavenList(owner, identifier, page, pageSize)

List Maven upstream configs for this repository.

List Maven upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<MavenUpstream> result = apiInstance.reposUpstreamMavenList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamMavenList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;MavenUpstream&gt;**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamMavenPartialUpdate"></a>
# **reposUpstreamMavenPartialUpdate**
> MavenUpstream reposUpstreamMavenPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Maven upstream config for this repository.

Partially update a Maven upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    MavenUpstreamRequestPatch data = new MavenUpstreamRequestPatch(); // MavenUpstreamRequestPatch | 
    try {
      MavenUpstream result = apiInstance.reposUpstreamMavenPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamMavenPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**MavenUpstreamRequestPatch**](MavenUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamMavenRead"></a>
# **reposUpstreamMavenRead**
> MavenUpstream reposUpstreamMavenRead(owner, identifier, slugPerm)

Retrieve a Maven upstream config for this repository.

Retrieve a Maven upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      MavenUpstream result = apiInstance.reposUpstreamMavenRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamMavenRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamMavenUpdate"></a>
# **reposUpstreamMavenUpdate**
> MavenUpstream reposUpstreamMavenUpdate(owner, identifier, slugPerm, data)

Update a Maven upstream config for this repository.

Update a Maven upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    MavenUpstreamRequest data = new MavenUpstreamRequest(); // MavenUpstreamRequest | 
    try {
      MavenUpstream result = apiInstance.reposUpstreamMavenUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamMavenUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**MavenUpstreamRequest**](MavenUpstreamRequest.md)|  | [optional] |

### Return type

[**MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNixCreate"></a>
# **reposUpstreamNixCreate**
> NixUpstream reposUpstreamNixCreate(owner, identifier, data)

Create a Nix upstream config for this repository.

Create a Nix upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    NixUpstreamRequest data = new NixUpstreamRequest(); // NixUpstreamRequest | 
    try {
      NixUpstream result = apiInstance.reposUpstreamNixCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNixCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**NixUpstreamRequest**](NixUpstreamRequest.md)|  | [optional] |

### Return type

[**NixUpstream**](NixUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNixDelete"></a>
# **reposUpstreamNixDelete**
> reposUpstreamNixDelete(owner, identifier, slugPerm)

Delete a Nix upstream config for this repository.

Delete a Nix upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamNixDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNixDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNixList"></a>
# **reposUpstreamNixList**
> List&lt;NixUpstream&gt; reposUpstreamNixList(owner, identifier, page, pageSize)

List Nix upstream configs for this repository.

List Nix upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<NixUpstream> result = apiInstance.reposUpstreamNixList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNixList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;NixUpstream&gt;**](NixUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNixPartialUpdate"></a>
# **reposUpstreamNixPartialUpdate**
> NixUpstream reposUpstreamNixPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Nix upstream config for this repository.

Partially update a Nix upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    NixUpstreamRequestPatch data = new NixUpstreamRequestPatch(); // NixUpstreamRequestPatch | 
    try {
      NixUpstream result = apiInstance.reposUpstreamNixPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNixPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**NixUpstreamRequestPatch**](NixUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**NixUpstream**](NixUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNixRead"></a>
# **reposUpstreamNixRead**
> NixUpstream reposUpstreamNixRead(owner, identifier, slugPerm)

Retrieve a Nix upstream config for this repository.

Retrieve a Nix upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      NixUpstream result = apiInstance.reposUpstreamNixRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNixRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**NixUpstream**](NixUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNixUpdate"></a>
# **reposUpstreamNixUpdate**
> NixUpstream reposUpstreamNixUpdate(owner, identifier, slugPerm, data)

Update a Nix upstream config for this repository.

Update a Nix upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    NixUpstreamRequest data = new NixUpstreamRequest(); // NixUpstreamRequest | 
    try {
      NixUpstream result = apiInstance.reposUpstreamNixUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNixUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**NixUpstreamRequest**](NixUpstreamRequest.md)|  | [optional] |

### Return type

[**NixUpstream**](NixUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNpmCreate"></a>
# **reposUpstreamNpmCreate**
> NpmUpstream reposUpstreamNpmCreate(owner, identifier, data)

Create a npm upstream config for this repository.

Create a npm upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    NpmUpstreamRequest data = new NpmUpstreamRequest(); // NpmUpstreamRequest | 
    try {
      NpmUpstream result = apiInstance.reposUpstreamNpmCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNpmCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**NpmUpstreamRequest**](NpmUpstreamRequest.md)|  | [optional] |

### Return type

[**NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNpmDelete"></a>
# **reposUpstreamNpmDelete**
> reposUpstreamNpmDelete(owner, identifier, slugPerm)

Delete a npm upstream config for this repository.

Delete a npm upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamNpmDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNpmDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNpmList"></a>
# **reposUpstreamNpmList**
> List&lt;NpmUpstream&gt; reposUpstreamNpmList(owner, identifier, page, pageSize)

List npm upstream configs for this repository.

List npm upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<NpmUpstream> result = apiInstance.reposUpstreamNpmList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNpmList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;NpmUpstream&gt;**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNpmPartialUpdate"></a>
# **reposUpstreamNpmPartialUpdate**
> NpmUpstream reposUpstreamNpmPartialUpdate(owner, identifier, slugPerm, data)

Partially update a npm upstream config for this repository.

Partially update a npm upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    NpmUpstreamRequestPatch data = new NpmUpstreamRequestPatch(); // NpmUpstreamRequestPatch | 
    try {
      NpmUpstream result = apiInstance.reposUpstreamNpmPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNpmPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**NpmUpstreamRequestPatch**](NpmUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNpmRead"></a>
# **reposUpstreamNpmRead**
> NpmUpstream reposUpstreamNpmRead(owner, identifier, slugPerm)

Retrieve a npm upstream config for this repository.

Retrieve a npm upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      NpmUpstream result = apiInstance.reposUpstreamNpmRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNpmRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNpmUpdate"></a>
# **reposUpstreamNpmUpdate**
> NpmUpstream reposUpstreamNpmUpdate(owner, identifier, slugPerm, data)

Update a npm upstream config for this repository.

Update a npm upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    NpmUpstreamRequest data = new NpmUpstreamRequest(); // NpmUpstreamRequest | 
    try {
      NpmUpstream result = apiInstance.reposUpstreamNpmUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNpmUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**NpmUpstreamRequest**](NpmUpstreamRequest.md)|  | [optional] |

### Return type

[**NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNugetCreate"></a>
# **reposUpstreamNugetCreate**
> NugetUpstream reposUpstreamNugetCreate(owner, identifier, data)

Create a NuGet upstream config for this repository.

Create a NuGet upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    NugetUpstreamRequest data = new NugetUpstreamRequest(); // NugetUpstreamRequest | 
    try {
      NugetUpstream result = apiInstance.reposUpstreamNugetCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNugetCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**NugetUpstreamRequest**](NugetUpstreamRequest.md)|  | [optional] |

### Return type

[**NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNugetDelete"></a>
# **reposUpstreamNugetDelete**
> reposUpstreamNugetDelete(owner, identifier, slugPerm)

Delete a NuGet upstream config for this repository.

Delete a NuGet upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamNugetDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNugetDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNugetList"></a>
# **reposUpstreamNugetList**
> List&lt;NugetUpstream&gt; reposUpstreamNugetList(owner, identifier, page, pageSize)

List NuGet upstream configs for this repository.

List NuGet upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<NugetUpstream> result = apiInstance.reposUpstreamNugetList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNugetList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;NugetUpstream&gt;**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNugetPartialUpdate"></a>
# **reposUpstreamNugetPartialUpdate**
> NugetUpstream reposUpstreamNugetPartialUpdate(owner, identifier, slugPerm, data)

Partially update a NuGet upstream config for this repository.

Partially update a NuGet upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    NugetUpstreamRequestPatch data = new NugetUpstreamRequestPatch(); // NugetUpstreamRequestPatch | 
    try {
      NugetUpstream result = apiInstance.reposUpstreamNugetPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNugetPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**NugetUpstreamRequestPatch**](NugetUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNugetRead"></a>
# **reposUpstreamNugetRead**
> NugetUpstream reposUpstreamNugetRead(owner, identifier, slugPerm)

Retrieve a NuGet upstream config for this repository.

Retrieve a NuGet upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      NugetUpstream result = apiInstance.reposUpstreamNugetRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNugetRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamNugetUpdate"></a>
# **reposUpstreamNugetUpdate**
> NugetUpstream reposUpstreamNugetUpdate(owner, identifier, slugPerm, data)

Update a NuGet upstream config for this repository.

Update a NuGet upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    NugetUpstreamRequest data = new NugetUpstreamRequest(); // NugetUpstreamRequest | 
    try {
      NugetUpstream result = apiInstance.reposUpstreamNugetUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamNugetUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**NugetUpstreamRequest**](NugetUpstreamRequest.md)|  | [optional] |

### Return type

[**NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamPythonCreate"></a>
# **reposUpstreamPythonCreate**
> PythonUpstream reposUpstreamPythonCreate(owner, identifier, data)

Create a Python upstream config for this repository.

Create a Python upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    PythonUpstreamRequest data = new PythonUpstreamRequest(); // PythonUpstreamRequest | 
    try {
      PythonUpstream result = apiInstance.reposUpstreamPythonCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamPythonCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**PythonUpstreamRequest**](PythonUpstreamRequest.md)|  | [optional] |

### Return type

[**PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamPythonDelete"></a>
# **reposUpstreamPythonDelete**
> reposUpstreamPythonDelete(owner, identifier, slugPerm)

Delete a Python upstream config for this repository.

Delete a Python upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamPythonDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamPythonDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamPythonList"></a>
# **reposUpstreamPythonList**
> List&lt;PythonUpstream&gt; reposUpstreamPythonList(owner, identifier, page, pageSize)

List Python upstream configs for this repository.

List Python upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<PythonUpstream> result = apiInstance.reposUpstreamPythonList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamPythonList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;PythonUpstream&gt;**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamPythonPartialUpdate"></a>
# **reposUpstreamPythonPartialUpdate**
> PythonUpstream reposUpstreamPythonPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Python upstream config for this repository.

Partially update a Python upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    PythonUpstreamRequestPatch data = new PythonUpstreamRequestPatch(); // PythonUpstreamRequestPatch | 
    try {
      PythonUpstream result = apiInstance.reposUpstreamPythonPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamPythonPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**PythonUpstreamRequestPatch**](PythonUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamPythonRead"></a>
# **reposUpstreamPythonRead**
> PythonUpstream reposUpstreamPythonRead(owner, identifier, slugPerm)

Retrieve a Python upstream config for this repository.

Retrieve a Python upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      PythonUpstream result = apiInstance.reposUpstreamPythonRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamPythonRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamPythonUpdate"></a>
# **reposUpstreamPythonUpdate**
> PythonUpstream reposUpstreamPythonUpdate(owner, identifier, slugPerm, data)

Update a Python upstream config for this repository.

Update a Python upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    PythonUpstreamRequest data = new PythonUpstreamRequest(); // PythonUpstreamRequest | 
    try {
      PythonUpstream result = apiInstance.reposUpstreamPythonUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamPythonUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**PythonUpstreamRequest**](PythonUpstreamRequest.md)|  | [optional] |

### Return type

[**PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamRpmCreate"></a>
# **reposUpstreamRpmCreate**
> RpmUpstream reposUpstreamRpmCreate(owner, identifier, data)

Create a RedHat upstream config for this repository.

Create a RedHat upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    RpmUpstreamRequest data = new RpmUpstreamRequest(); // RpmUpstreamRequest | 
    try {
      RpmUpstream result = apiInstance.reposUpstreamRpmCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamRpmCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**RpmUpstreamRequest**](RpmUpstreamRequest.md)|  | [optional] |

### Return type

[**RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamRpmDelete"></a>
# **reposUpstreamRpmDelete**
> reposUpstreamRpmDelete(owner, identifier, slugPerm)

Delete a RedHat upstream config for this repository.

Delete a RedHat upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamRpmDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamRpmDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamRpmList"></a>
# **reposUpstreamRpmList**
> List&lt;RpmUpstream&gt; reposUpstreamRpmList(owner, identifier, page, pageSize)

List RedHat upstream configs for this repository.

List RedHat upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<RpmUpstream> result = apiInstance.reposUpstreamRpmList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamRpmList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;RpmUpstream&gt;**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamRpmPartialUpdate"></a>
# **reposUpstreamRpmPartialUpdate**
> RpmUpstream reposUpstreamRpmPartialUpdate(owner, identifier, slugPerm, data)

Partially update a RedHat upstream config for this repository.

Partially update a RedHat upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    RpmUpstreamRequestPatch data = new RpmUpstreamRequestPatch(); // RpmUpstreamRequestPatch | 
    try {
      RpmUpstream result = apiInstance.reposUpstreamRpmPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamRpmPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**RpmUpstreamRequestPatch**](RpmUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamRpmRead"></a>
# **reposUpstreamRpmRead**
> RpmUpstream reposUpstreamRpmRead(owner, identifier, slugPerm)

Retrieve a RedHat upstream config for this repository.

Retrieve a RedHat upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      RpmUpstream result = apiInstance.reposUpstreamRpmRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamRpmRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamRpmUpdate"></a>
# **reposUpstreamRpmUpdate**
> RpmUpstream reposUpstreamRpmUpdate(owner, identifier, slugPerm, data)

Update a RedHat upstream config for this repository.

Update a RedHat upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    RpmUpstreamRequest data = new RpmUpstreamRequest(); // RpmUpstreamRequest | 
    try {
      RpmUpstream result = apiInstance.reposUpstreamRpmUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamRpmUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**RpmUpstreamRequest**](RpmUpstreamRequest.md)|  | [optional] |

### Return type

[**RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamRubyCreate"></a>
# **reposUpstreamRubyCreate**
> RubyUpstream reposUpstreamRubyCreate(owner, identifier, data)

Create a Ruby upstream config for this repository.

Create a Ruby upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    RubyUpstreamRequest data = new RubyUpstreamRequest(); // RubyUpstreamRequest | 
    try {
      RubyUpstream result = apiInstance.reposUpstreamRubyCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamRubyCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**RubyUpstreamRequest**](RubyUpstreamRequest.md)|  | [optional] |

### Return type

[**RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamRubyDelete"></a>
# **reposUpstreamRubyDelete**
> reposUpstreamRubyDelete(owner, identifier, slugPerm)

Delete a Ruby upstream config for this repository.

Delete a Ruby upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamRubyDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamRubyDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamRubyList"></a>
# **reposUpstreamRubyList**
> List&lt;RubyUpstream&gt; reposUpstreamRubyList(owner, identifier, page, pageSize)

List Ruby upstream configs for this repository.

List Ruby upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<RubyUpstream> result = apiInstance.reposUpstreamRubyList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamRubyList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;RubyUpstream&gt;**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamRubyPartialUpdate"></a>
# **reposUpstreamRubyPartialUpdate**
> RubyUpstream reposUpstreamRubyPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Ruby upstream config for this repository.

Partially update a Ruby upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    RubyUpstreamRequestPatch data = new RubyUpstreamRequestPatch(); // RubyUpstreamRequestPatch | 
    try {
      RubyUpstream result = apiInstance.reposUpstreamRubyPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamRubyPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**RubyUpstreamRequestPatch**](RubyUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamRubyRead"></a>
# **reposUpstreamRubyRead**
> RubyUpstream reposUpstreamRubyRead(owner, identifier, slugPerm)

Retrieve a Ruby upstream config for this repository.

Retrieve a Ruby upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      RubyUpstream result = apiInstance.reposUpstreamRubyRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamRubyRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamRubyUpdate"></a>
# **reposUpstreamRubyUpdate**
> RubyUpstream reposUpstreamRubyUpdate(owner, identifier, slugPerm, data)

Update a Ruby upstream config for this repository.

Update a Ruby upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    RubyUpstreamRequest data = new RubyUpstreamRequest(); // RubyUpstreamRequest | 
    try {
      RubyUpstream result = apiInstance.reposUpstreamRubyUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamRubyUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**RubyUpstreamRequest**](RubyUpstreamRequest.md)|  | [optional] |

### Return type

[**RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamSwiftCreate"></a>
# **reposUpstreamSwiftCreate**
> SwiftUpstream reposUpstreamSwiftCreate(owner, identifier, data)

Create a Swift upstream config for this repository.

Create a Swift upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    SwiftUpstreamRequest data = new SwiftUpstreamRequest(); // SwiftUpstreamRequest | 
    try {
      SwiftUpstream result = apiInstance.reposUpstreamSwiftCreate(owner, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamSwiftCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**SwiftUpstreamRequest**](SwiftUpstreamRequest.md)|  | [optional] |

### Return type

[**SwiftUpstream**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamSwiftDelete"></a>
# **reposUpstreamSwiftDelete**
> reposUpstreamSwiftDelete(owner, identifier, slugPerm)

Delete a Swift upstream config for this repository.

Delete a Swift upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      apiInstance.reposUpstreamSwiftDelete(owner, identifier, slugPerm);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamSwiftDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamSwiftList"></a>
# **reposUpstreamSwiftList**
> List&lt;SwiftUpstream&gt; reposUpstreamSwiftList(owner, identifier, page, pageSize)

List Swift upstream configs for this repository.

List Swift upstream configs for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<SwiftUpstream> result = apiInstance.reposUpstreamSwiftList(owner, identifier, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamSwiftList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;SwiftUpstream&gt;**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamSwiftPartialUpdate"></a>
# **reposUpstreamSwiftPartialUpdate**
> SwiftUpstream reposUpstreamSwiftPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Swift upstream config for this repository.

Partially update a Swift upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    SwiftUpstreamRequestPatch data = new SwiftUpstreamRequestPatch(); // SwiftUpstreamRequestPatch | 
    try {
      SwiftUpstream result = apiInstance.reposUpstreamSwiftPartialUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamSwiftPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**SwiftUpstreamRequestPatch**](SwiftUpstreamRequestPatch.md)|  | [optional] |

### Return type

[**SwiftUpstream**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamSwiftRead"></a>
# **reposUpstreamSwiftRead**
> SwiftUpstream reposUpstreamSwiftRead(owner, identifier, slugPerm)

Retrieve a Swift upstream config for this repository.

Retrieve a Swift upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    try {
      SwiftUpstream result = apiInstance.reposUpstreamSwiftRead(owner, identifier, slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamSwiftRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |

### Return type

[**SwiftUpstream**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUpstreamSwiftUpdate"></a>
# **reposUpstreamSwiftUpdate**
> SwiftUpstream reposUpstreamSwiftUpdate(owner, identifier, slugPerm, data)

Update a Swift upstream config for this repository.

Update a Swift upstream config for this repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String slugPerm = "slugPerm_example"; // String | 
    SwiftUpstreamRequest data = new SwiftUpstreamRequest(); // SwiftUpstreamRequest | 
    try {
      SwiftUpstream result = apiInstance.reposUpstreamSwiftUpdate(owner, identifier, slugPerm, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpstreamSwiftUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |
| **slugPerm** | **String**|  | |
| **data** | [**SwiftUpstreamRequest**](SwiftUpstreamRequest.md)|  | [optional] |

### Return type

[**SwiftUpstream**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposUserList"></a>
# **reposUserList**
> List&lt;Repository&gt; reposUserList(page, pageSize)

Get a list of all repositories associated with current user.

Get a list of all repositories associated with current user.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<Repository> result = apiInstance.reposUserList(page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUserList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**List&lt;Repository&gt;**](Repository.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the list of repositories |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposX509EcdsaList"></a>
# **reposX509EcdsaList**
> RepositoryX509EcdsaCertificate reposX509EcdsaList(owner, identifier)

Retrieve the active X.509 ECDSA certificate for the Repository.

Retrieve the active X.509 ECDSA certificate for the Repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      RepositoryX509EcdsaCertificate result = apiInstance.reposX509EcdsaList(owner, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposX509EcdsaList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**RepositoryX509EcdsaCertificate**](RepositoryX509EcdsaCertificate.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the active X.509 ECDSA Certificate. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="reposX509RsaList"></a>
# **reposX509RsaList**
> RepositoryX509RsaCertificate reposX509RsaList(owner, identifier)

Retrieve the active X.509 RSA certificate for the Repository.

Retrieve the active X.509 RSA certificate for the Repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      RepositoryX509RsaCertificate result = apiInstance.reposX509RsaList(owner, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposX509RsaList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**RepositoryX509RsaCertificate**](RepositoryX509RsaCertificate.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the active X.509 RSA Certificate. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

