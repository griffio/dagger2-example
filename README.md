dagger2-example
===============

dagger2 example

* Terrestrial Planets
  * Venus
  * Earth
  * Mars
  
Represented as singletons of type Planet to be injected qualified by a unique name.

* The dagger (com.google.dagger:dagger-compiler) annotation processor is only added to the the java compiler task classpath
using the configuration defined compileDagger.

* Application only runs (com.google.dagger:dagger, javax.inject and guava as its used in the application)

* The sourceSet for generated code is under 'src/dagger/java'

Gradle build
```
./gradlew run
```

```groovy
plugins {
  id 'java'
  id 'application'
  id "com.github.johnrengelman.shadow" version "1.2.1"
}

project.ext.sourceCompatibility = JavaVersion.VERSION_1_8
project.ext.targetCompatibility = JavaVersion.VERSION_1_8

repositories {
  jcenter()
  maven {
    url "https://oss.sonatype.org/content/repositories/snapshots"
  }
}

sourceSets {
  dagger {
    java {
      srcDirs = ['src/dagger/java']
    }
  }
}

configurations {
  compileDagger
}

compileJava {
  classpath += configurations.compileDagger
  options.compilerArgs += [
      '-s', sourceSets.dagger.java.srcDirs.iterator().next()
  ]
}

mainClassName = "griffio.MainApplication"

clean {
  delete fileTree(dir: sourceSets.dagger.java.srcDirs.iterator().next())
}

dependencies {

  compile(
      "com.google.dagger:dagger:2.0-SNAPSHOT",
      "com.google.guava:guava:18.0")

  compileDagger(
      "com.google.dagger:dagger-compiler:2.0-SNAPSHOT")

  testCompile(
      "junit:junit:4.11"
  )

}

task wrapper(type: Wrapper) {
  gradleVersion = '2.2.1'
}
```