# Toast Library

Creating gradle plugin dependency: **Libs on Gradle**.

## Steps

- Gradle app:
    - apply plugin: 'com.android.libray'
    - apply plugin : 'maven'
    - uploadArchives
    - implement **gradle properties**
        - **GROUP** is your package name, such as `com.fiap.appname`
    - terminal and `gradlew install`

## Errors

- add version 23 instead of 24 into build.gradle app at compileSdkVersion field
- remove from styles.xml the content
- remove from manifest the call of the theme