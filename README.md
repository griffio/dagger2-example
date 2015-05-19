dagger2-example with Gradle build
=================================

[Dagger2 site ](http://google.github.io/dagger/)

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

---

**Gradle build**

* Uses Gradle plugin [com.ewerk.gradle.plugins.dagger] (https://github.com/ewerk/gradle-plugins/tree/master/dagger-plugin)

* Dagger destination directory default "src/dagger/java"

```
./gradlew run
```

```groovy
plugins {
  id 'java'
  id 'application'
  id "com.github.johnrengelman.shadow" version "1.2.1"
  id "com.ewerk.gradle.plugins.dagger" version "1.0.0"
}

project.ext.sourceCompatibility = JavaVersion.VERSION_1_8
project.ext.targetCompatibility = JavaVersion.VERSION_1_8

repositories {
  jcenter()
  maven {
    url "https://oss.sonatype.org/content/repositories/snapshots"
  }
}

mainClassName = "griffio.MainApplication"

dependencies {

  compile(
      "com.google.guava:guava:18.0")

  testCompile(
      "junit:junit:4.12",
      "com.google.truth:truth:1.0-SNAPSHOT"
  )

}

task wrapper(type: Wrapper) {
  gradleVersion = '2.4'
}
```
