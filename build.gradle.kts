plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.72"
    application
}

repositories {
    jcenter()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation("org.apache.hudi:hudi-spark-bundle_2.12:0.5.3")
    runtimeOnly("org.scala-lang:scala-library:2.12.12")
    runtimeOnly("org.apache.spark:spark-sql_2.12:2.4.6")
}

application {
    mainClassName = "com.ze.hudi.intellijbug.AppKt"
}
