plugins {
    id("groovy")
}

dependencies {
    implementation("org.codehaus.groovy:groovy:2.4.10")
    testImplementation("org.spockframework:spock-core")
    runtimeOnly("org.codehaus.groovy:groovy:2.4.10")
}
