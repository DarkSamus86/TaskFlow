rootProject.name = "TaskFlow"

include("AuthService")
include("TaskService")
include("NotificationService")
include("Gateway")

dependencyResolutionManagement {
    versionCatalogs {
        create("spring-boot") {
            library("bom", "org.springframework.boot:spring-boot-dependencies:4.0.1")
        }
    }
}