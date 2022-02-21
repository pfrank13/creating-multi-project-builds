plugins {
    id("org.asciidoctor.convert")
}

tasks {
    "asciidoctor"(org.asciidoctor.gradle.AsciidoctorTask::class) {
        sourceDir = file("docs")
        sources(delegateClosureOf<PatternSet> {
            include("greeter.adoc")
        })
        outputDir = file("build/docs")
    }
}

tasks.named("build"){
    dependsOn("asciidoctor")
}
