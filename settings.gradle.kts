import org.gradle.kotlin.dsl.internal.relocated.kotlin.metadata.internal.metadata.deserialization.VersionRequirementTable.Companion.create

rootProject.name = "TaskFlow"

include("AuthService")
include("TaskService")
include("NotificationService")
include("Gateway")

dependencyResolutionManagement {
    versionCatalogs {
        create("springboot") {
            library("bom", "org.springframework.boot:spring-boot-dependencies:4.0.1")
        }
    }
}