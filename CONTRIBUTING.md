# Contributing

Please refer to Cloudsmith's standard guide on [Open-Source Contributing](https://help.cloudsmith.io/docs/contributing).

## Updating bindings

### Manual approach

* Update `package_version` in `scripts/common.sh`
* Run `./scripts/build.sh` to generate bindings
* Create a PR specifing API and binding version

### Automated approach

* Run `./scripts/update-bindings.sh` to automatically update the bindings.
* This will then provide you with the URL for the PR to release the updated bindings.
* Preferred usage: `./scripts/update-bindings.sh`
* For full options and usage examples, run: `./scripts/update-bindings.sh --help`

## Contributor License Agreement

By making any contributions to Cloudsmith Ltd projects you agree to be bound by the terms of the Cloudsmith Ltd [Contributor License Agreement](https://help.cloudsmith.io/docs/contributor-license-agreement).

## Coding Conventions

Follow existing structure and style of the build and release scripts. Languages bindings are generated automatically.

## Need Help?

See the section for raising a question in the [Contributing Guide](https://help.cloudsmith.io/docs/contributing).
