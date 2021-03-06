plugins {
    id("org.asciidoctor.convert") version "1.5.6" apply false
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "io.spring.dependency-management")

    dependencyManagement {
        dependencies {
            dependency("org.spockframework:spock-core:1.0-groovy-2.4"){
                exclude("org.codehaus.groovy:groovy-all")
            }
        }
    }
    version = "1.0"
}
