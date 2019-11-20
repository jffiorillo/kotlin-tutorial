import org.gradle.api.Project

object Kotlin {
  const val version = "1.3.60"

  private const val group = "org.jetbrains.kotlin:"

  const val stdlib = "${group}kotlin-stdlib-jdk8:$version"

  object Jvm {
    const val plugin = "jvm"
  }
}
object KotlinX {
  private const val group = "org.jetbrains.kotlinx:"

  object Coroutines {
    const val version = "1.3.2"

    val core = "${group}kotlinx-coroutines-core:$version"
  }
}

object Ktlint {
  const val version = "2.1.1"
  const val plugin = "org.jmailen.kotlinter"
}

// Testing dependencies
object JUnit {
  const val version = "5.5.2"
  const val api = "org.junit.jupiter:junit-jupiter:$version"
}

object MockitoKotlin {
  const val version = "2.2.0"
  const val core = "com.nhaarman.mockitokotlin2:mockito-kotlin:$version"
}

object Jacoco {
  const val version = "0.8.4"
  const val plugin = "jacoco"
}
val Project.artifactoryUrl: String? get() = (findProperty("artifactory_url") as String?) ?: System.getenv("ARTIFACTORY_CONTEXT")
val Project.artifactoryUser: String get() = (findProperty("artifactory_user") as String?) ?: System.getenv("ARTIFACTORY_USER")
val Project.artifactoryPwd: String get() = (findProperty("artifactory_pwd") as String?) ?: System.getenv("ARTIFACTORY_PWD")