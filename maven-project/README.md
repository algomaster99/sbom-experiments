SBOM is generated using the following tools:

1.  [cyclonedx-maven-plugin](https://github.com/CycloneDX/cyclonedx-maven-plugin). As one can see in [bom.json](bom.json) file, the generated SBOM does not contain any information about the Spoon library.

2. [cdxgen](https://github.com/AppThreat/cdxgen) generates [bom.cdxgen.json](bom.cdxgen.json) which is similar to `bom.json` in terms of dependencies. It also seems that `cdxgen` uses `cyclonedx-maven-plugin` under thd hood.
