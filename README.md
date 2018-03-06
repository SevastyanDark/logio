# logio
Simple and lightweight logger for Java/Kotlin/Scala ...
## Getting started
To link logio to your project, use:
```groovy
dependencies
{
  compile 'com.github.sevastyandark:logio:0.1.0'
}
```
or, using Maven:
```xml
<dependency>
  <groupId>com.github.sevastyandark</groupId>
  <artifactId>logio</artifactId>
  <version>0.1.0</version>
</dependency>
```
## Examples

```kotlin
import com.github.sevastyandark.logio.*

fun main(args: Array<String>)
{
    var log = LoggerFactory.getLog("main")
    log.log(true)
    log.log("Hello, world!!!!!")
}
```
