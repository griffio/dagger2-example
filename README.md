dagger2-example with Gradle build
=================================

* @Component
  * @Module
    * @Provides

The TerrestrialPlanetsModule, for example, provides a singleton named "Mercury" etc.

```java
@Module
public class TerrestrialPlanetsModule {

    @Provides
    @Singleton
    @Named("Mercury")
    Planet first() {
        return new Mercury();
    }

    @Provides
    @Singleton
    @Named("Venus")
    Planet second() {
        return new Venus();
    }

    @Provides
    @Singleton
    @Named("Earth")
    Planet third() {
        return new Earth();
    }

    @Provides
    @Singleton
    @Named("Mars")
    Planet forth() {
        return new Mars();
    }

}

```

* Outer Planets module
  * Jupiter
  * Saturn
  * Uranus
  * Neptune

---

**Gradle build**

* The dagger compiler (com.google.dagger:dagger-compiler) annotation processor is only added to the java compiler task classpath using the configuration "compileDagger".

* Application only runs with (com.google.dagger:dagger, javax.inject and com.google.guava as used in the application)

* The sourceSet for generated code is under 'src/dagger/java'


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
  description = "dagger annotation processor is loaded automatically from classpath"
  sourceSets.dagger.java.srcDirs*.mkdirs()
  classpath += configurations.compileDagger
  options.compilerArgs += [
      '-s', sourceSets.dagger.java.srcDirs.iterator().next()
  ]
}

mainClassName = "griffio.MainApplication"

clean {
  description = "delete files in generated source directory tree"
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
