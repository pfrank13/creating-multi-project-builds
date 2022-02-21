plugins {
    id("groovy")
    id("application")
}

application{
    mainClass.set("greeter.Greeter")
}

dependencies {
    implementation(project(":greeting-library"))
    implementation("org.codehaus.groovy:groovy:2.4.10")
    testImplementation("org.spockframework:spock-core")
}

tasks{
    "distZip"(Zip::class) {
        from(project(":docs").tasks.named("asciidoctor")) {
            into("${project.name}-${version}")
        }
    }

    "distTar"(Tar::class) {
        from(project(":docs").tasks.named("asciidoctor")) {
            into("${project.name}-${version}")
        }
    }
}
