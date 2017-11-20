# Cloudsmith API Bindings

The [Cloudsmith](https://cloudsmith.io) API (Application Programmatic Interface) bindings provide libraries in different languages for accessing the service programmatically. The API is fully compliant with the [OpenAPI 2.0 Specification](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md) and the clients are *generated* using [swagger-codegen-cli](https://github.com/swagger-api/swagger-codegen/tree/master/modules/swagger-codegen-cli) from the [Swagger Project](https://swagger.io/).

**Please note** that the generated client APIs are intended for developers, and are subject to change as the upstream API evolves over time (especially pre-1.0 releases). If you're looking for something a little more user-friendly, please see the [Cloudsmith CLI](https://github.com/cloudsmith-io/cloudsmith-cli/) application for something that comes pre-baked.

## Release Repository

Releases for each language (where supported) are uploaded to the [Cloudsmith API repository](https://cloudsmith.io/package/ns/cloudsmith/repos/cli/packages/). Support currently exists for the following languages:

- Go
- Java (maven, sbt, gradle, ivy, ant, etc.)
- Python
- Ruby

If you need a different binding, [contact us](https://help.cloudsmith.io/docs/contact-us)!

## Getting Started

TODO - We'll explain how the bindings are generated, and how they work.

## Contributing

Yes! Please do contribute, this is why we love open source.  Please see `CONTRIBUTING.md` for contribution guidelines when making code changes or raising issues for bug reports, ideas, discussions and/or questions (i.e. help required).

## Releasing

The client APIs are automatically released as part of the build and release process. See the [travis configuration file](https://github.com/cloudsmith-io/cloudsmith-api/blob/master/.travis.yml) for more details.

## License

Copyright 2017 Cloudsmith Ltd

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


## EOF

This quality product was brought to you by [Cloudsmith](https://cloudsmith.io) and the [fine folks who have contributed](https://github.com/cloudsmith-io/cloudsmith-cli/blob/master/CONTRIBUTORS.md).
