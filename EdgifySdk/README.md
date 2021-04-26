# edgify-agent-sdk-java

### Steps to generate the Edgify SDK file java source from `.proto` file

- Remove the source code from `src/main/java`, keep only the EdgifySdk.java file
- Update the proto file accordingly - place the proto files in 'src\main\resources'
- If Change the version in the `pom.xml` file (major.minor.patch)
- Run `$ mvn clean install` or `$ mvn clean package`
- It will generate the source code and compile and build the SDK jar

