/*global module:false*/

const _ = require("lodash");
const fs = require("fs");
const path = require("path");

module.exports = function(grunt) {
  require("load-grunt-tasks")(grunt);
  
  const SWAGGER_SRC = "https://search.maven.org/remotecontent?filepath=io/swagger/codegen/v3/swagger-codegen-cli/3.0.1/swagger-codegen-cli-3.0.1.jar";
  const SPEC_URL = "https://raw.githubusercontent.com/Fiware/specifications/master/OpenAPI/ngsiv2/ngsiv2-openapi.json";
 
  grunt.initConfig({
    "curl": {
      "swagger-codegen":  {
        src: SWAGGER_SRC,
        dest: "swagger-codegen-cli.jar"
      }
    },
    "clean": {
      "jaxrs-spec-cruft": [
        "jaxrs-spec-generated/src/main/java/fi/metatavu/netcdf/ngsi/api/RestApplication.java",
        "jaxrs-spec-generated/.settings"
      ],
      "jaxrs-spec-sources": ["jaxrs-spec-generated/src"]
    },
    "shell": {
      "jaxrs-spec-generate": {
        command : "mv jaxrs-spec-generated/pom.xml jaxrs-spec-generated/pom.xml.before && " +
          "java -jar swagger-codegen-cli.jar generate " +
          `-i ${SPEC_URL} ` +
          "-l jaxrs-spec " +
          "--api-package fi.metatavu.ngsi.netcdf.api " +
          "--model-package fi.metatavu.ngsi.netcdf.api.model " +
          "--group-id fi.metatavu.enfuser-ngsi " +
          "--artifact-id enfuser-ngsi-api-spec " +
          "--artifact-version `cat jaxrs-spec-generated/pom.xml.before|grep version -m 1|sed -e \"s/.*<version>//\"|sed -e \"s/<.*//\"` " +
          "--template-dir jaxrs-spec-templates " +
          "--additional-properties java8=true,dateLibrary=java8,useBeanValidation=true,sourceFolder=src/main/java,interfaceOnly=true " +
          "-o jaxrs-spec-generated/"
      },
      "jaxrs-spec-install": {
        command : "mvn install",
        options: {
          execOptions: {
            cwd: "jaxrs-spec-generated"
          }
        }
      },
      "jaxrs-spec-release": {
        command : "git add src pom.xml swagger.json && git commit -m 'Generated source' && git push && mvn -B release:clean release:prepare release:perform",
        options: {
          execOptions: {
            cwd: "jaxrs-spec-generated"
          }
        }
      }
    }
  });
  
  grunt.registerTask("download-dependencies", "if-missing:curl:swagger-codegen");
  grunt.registerTask("jaxrs-gen", [ "download-dependencies", "clean:jaxrs-spec-sources", "shell:jaxrs-spec-generate", "clean:jaxrs-spec-cruft", "shell:jaxrs-spec-install" ]);
  grunt.registerTask("jaxrs-spec", [ "jaxrs-gen", "shell:jaxrs-spec-release" ]);

  grunt.registerTask("default", [ "jaxrs-spec" ]);

};
