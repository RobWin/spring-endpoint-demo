This demo shows that Spring Boot 2 custom actuator endpoints require the `-parameters` compiler option to work when compiled with Gradle.

The Spring Boot Gradle Plugin configures the compiler option automatically, but when you are a framework developer and don't use the Spring Boot Gradle
Plugin you have to add the option yourself. 

The test fails, but when you uncomment `options.compilerArgs += ["-parameters"]` in the `build.gradle` file, the test is successful.