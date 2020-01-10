import com.android.build.gradle.*
import org.gradle.api.*
import org.gradle.kotlin.dsl.*
import org.jetbrains.kotlin.gradle.dsl.*
import org.jetbrains.kotlin.gradle.plugin.*

fun Project.configureMultiplatform() {
    extensions.configure(LibraryExtension::default)
    extensions.configure(KotlinMultiplatformExtension::default)
}

fun KotlinJvmProjectExtension.default() {
    target {
        commonOptions(KotlinCommonOptions::default)
        options { default() }
    }
    sourceSets.all {
        languageSettings.apply(LanguageSettingsBuilder::default)
    }
}

fun KotlinMultiplatformExtension.default() {
    jvm {
        options { default() }
    }
    android {
        publishLibraryVariants("release")
    }

    sourceSets {
        val androidMain by getting
        val jvmMain by getting
        androidMain.dependsOn(jvmMain)
    }

    targets.first().project.run(Project::configurePublishing)
    defaultOptions()
}

val Project.apiVersion
    get() = name.substringAfterLast("v", "").takeIf(String::isNotBlank)?.takeIf { it.split('.').size == 3 }