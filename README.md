dagger2-example with Gradle build
=================================

[Dagger2 site ](http://google.github.io/dagger/)

[See branch for ewerk plugin version](https://github.com/griffio/dagger2-example/tree/plugin)

Since 2.0 release:- Dagger generates components prefixed with just "Dagger" instead of "_"

[Truth Assert](http://google.github.io/truth/)

Currently uses Truth.assertThat(...)

---

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

* Dwarf Planets module
  * Ceres
  * Pluto
  * Haumea
  * MakeMake
  * Eris
  
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
  id "com.github.johnrengelman.shadow" version "1.2.3"
}

project.ext.sourceCompatibility = JavaVersion.VERSION_1_8
project.ext.targetCompatibility = JavaVersion.VERSION_1_8

repositories {
  jcenter()
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
      "com.google.dagger:dagger:2.8",
      "com.google.guava:guava:20.0")

  compileDagger(
      "com.google.dagger:dagger-compiler:2.8")

  testCompile(
      "junit:junit:4.12",
      "com.google.truth:truth:0.30"
  )

}

task wrapper(type: Wrapper) {
  gradleVersion = '2.3.1'
}
```
