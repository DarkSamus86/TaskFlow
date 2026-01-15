rootProject.name = "TaskFlow"

include("AuthService", "TaskService", "Gateway")

dependencyResolutionManagement {
    versionCatalogs {
        create("springboot") {
            library("bom", "org.springframework.boot", "spring-boot-dependencies")
                .version("4.0.1")
        }
    }
}
