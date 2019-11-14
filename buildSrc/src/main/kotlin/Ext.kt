import dev.whyoleg.kamp.*
import dev.whyoleg.kamp.configuration.*
import dev.whyoleg.kamp.ext.*
import dev.whyoleg.kamp.publishing.*
import dev.whyoleg.kamp.settings.*
import org.gradle.api.*
import org.gradle.api.tasks.bundling.*

private const val jdk = "1.6"

private val defaultConfiguration = ProjectConfiguration("dev.whyoleg.ktd", "", "0.3.1")

private val defaultPublication = Publication(
    name = "ktd",
    description = "Kotlin wrapper on TDLib",
    licenses = listOf(License("Apache-2.0", "http://www.apache.org/licenses/LICENSE-2.0.txt", "repo")),
    developers = listOf(Developer("whyoleg", "Oleg", "whyoleg@gmail.com")),
    labels = listOf("Kotlin", "Telegram"),
    scmConnections = "scm:git:git@github.com:whyoleg/ktd.git",
    vcsUrl = "git@github.com:whyoleg/ktd.git",
    websiteUrl = "https://github.com/whyoleg/ktd",
    githubUrl = "https://github.com/whyoleg/ktd"
)

@KampDSL
fun Project.configure(configuration: ProjectConfiguration? = null, block: KampJvmExtension.() -> Unit) = kampJvm(configuration) {
    options {
        jvmTarget = jdk
        sourceCompatibility = jdk
        targetCompatibility = jdk
    }
    languageSettings {
        progressiveMode = true
        languageFeatures += LanguageFeature.values()
        experimentalAnnotations += ExperimentalAnnotation.values()
    }
    apply(block)
}

@KampDSL
fun Project.configure(artifact: String, block: KampJvmExtension.() -> Unit) =
    configure(defaultConfiguration.copy(artifact = artifact)) {
        apply(block)
        publishing {
            bintray(artifact)
        }
    }

fun PublishersBuilder.bintray(artifact: String) {
    bintray(defaultPublication.copy(name = artifact)) {
        repo = "ktd"
    }
}

fun Project.configureApi(version: String) {
    configure("ktd-v$version") {
        source {
            main {
                api {
                    +Dependencies.kotlin.stdlib
                    +Dependencies.coroutines.core
                    +Dependencies.tdlib
                    +Modules.client
                }
                compileOnly(Modules.Api.stub)
            }
        }
        if (version == Versions.latestTdVersion) publishing {
            bintray("ktd")
        }
    }
    //TODO move it to kamp
    tasks.named("jar", Jar::class.java) {
        from("src/main/libs") {
            include("**/**/libtdjni.so")
        }
    }
}
