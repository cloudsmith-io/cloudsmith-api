# Contributing

Please refer to Cloudsmith's standard guide on [Open-Source Contributing](https://docs.cloudsmith.com/contributing).

## Updating bindings

The host toolchain is managed with [mise](https://mise.jdx.dev/) via the top-level `.mise.toml`, so local and CI environments use the same tools. Run `mise install` once to get them. You also need [Docker](https://www.docker.com/) running, as generation happens inside the pinned `swagger-codegen-cli` image (see `scripts/common.sh`). Linting (`ruff`) runs automatically as part of the build.

### Manual approach

* Update `package_version` in `scripts/common.sh`
* Run `mise run build` to generate the bindings (ruff autofixes are applied as part of the build)
* Create a PR specifying the API and binding version

### Automated approach

* Run `mise run update-bindings` to automatically update the bindings.
* This will then provide you with the URL for the PR to release the updated bindings.
* For full options and usage examples, run: `./scripts/update-bindings.sh --help`

### Scheduled / on-demand automation

* The `Update API bindings` GitHub Actions workflow regenerates the bindings and opens a PR — daily on a schedule, or on demand via **Run workflow** (optionally with a specific version).
* It only opens a PR when the regenerated bindings actually change.

## Contributor License Agreement

By making any contributions to Cloudsmith Ltd projects you agree to be bound by the terms of the Cloudsmith Ltd [Contributor License Agreement](https://docs.cloudsmith.com/contributor-license-agreement).

## Coding Conventions

Follow existing structure and style of the build and release scripts. Languages bindings are generated automatically.

## Need Help?

See the section for raising a question in the [Contributing Guide](https://docs.cloudsmith.com/contributing).
