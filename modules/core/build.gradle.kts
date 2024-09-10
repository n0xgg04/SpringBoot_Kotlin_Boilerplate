plugins {
    java
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

}
