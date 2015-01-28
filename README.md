dagger2-example
===============

dagger2 example

* Terrestrial Planets
  * Venus
  * Earth
  * Mars
  
Represented as singletons of type Planet to be injected qualified by a unique name.

* The dagger compiler (com.google.dagger:dagger-compiler) annotation processor is only added to the java compiler task classpath using the configuration "compileDagger".

* Application only runs with (com.google.dagger:dagger, javax.inject and com.google.guava as used in the application)

* The sourceSet for generated code is under 'src/dagger/java'

Execute gradle build
```
./gradlew run
```


Main part of build.gradle

```groovy
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
  sourceSets.dagger.java.srcDirs*.mkdirs()
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
```
