import java.io.ByteArrayOutputStream

plugins {
    id("com.android.library") version "8.8.1" apply false
}

val commitHash: String by extra {
    val result = providers.exec {
        commandLine("git", "rev-parse", "--verify", "--short", "HEAD")
    }
    result.standardOutput.asText.get().trim()
}

val moduleId by extra("zygisk_hideroot")
val moduleName by extra("Zygisk HideRoot")
val verName by extra("modified")
val verCode by extra(1)
