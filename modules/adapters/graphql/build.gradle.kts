plugins {
    java
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

group = "com.noxinfinity.gcgv"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-graphql")

}
