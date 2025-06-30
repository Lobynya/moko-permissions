plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

repositories {
    mavenLocal()
    mavenCentral()
    google()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {

    jvm()

    sourceSets {
        val commonMain by getting{
            dependencies {
                implementation("dev.icerock.moko:permissions:0.19.1"){
                    exclude(group = "dev.icerock.moko", module = "permissions-jvm")
                }
            }
        }
        val jvmMain by getting {
            dependsOn(commonMain)
            dependencies {
                implementation(compose.desktop.currentOs)
                implementation("dev.icerock.moko:permissions-jvm:0.19.1")
            }
        }
    }

}


