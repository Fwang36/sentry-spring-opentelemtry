plugins {
  id("java")
  id("org.springframework.boot") version "3.0.6"
  id("io.spring.dependency-management") version "1.1.0"
}

sourceSets {
  main {
    java.setSrcDirs(setOf("."))
  }
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation ("io.sentry:sentry-spring-boot-starter-jakarta:8.0.0-beta.3")
  implementation ("io.sentry:sentry-opentelemetry-core:8.0.0-beta.3")
}