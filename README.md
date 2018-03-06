# logio ![Maven Central](https://img.shields.io/maven-central/v/com.github.sevastyandark/logio.svg)
Simple and lightweight logger for Java/Kotlin/Scala ...
## Getting started
To link logio to your project, use:
```gradle
dependencies
{
    compile 'com.github.sevastyandark:logio:0.2.0'
}
```
or, using Maven:
```xml
    <dependency>
      <groupId>com.github.sevastyandark</groupId>
      <artifactId>logio</artifactId>
      <version>0.2.0</version>
    </dependency>
```
If you want to compile the source, run
```cmd
gradlew build
```
## Examples

```kotlin
import com.github.sevastyandark.logio.*

fun main(args: Array<String>)
{
    var log = LoggerFactory.getLog("main") // Name is required

    log.info("Hello, world!")
    log.warn("Something look like to be wrong")
    log.error("Something wrong")
}
```
## Contributions
Contributions are always welcome. Please read [Contributing](https://github.com/SevastyanDark/logio/blob/master/CONTRIBUTING.md) to get more details.
