```
➜ lomboktest git:(broken_3.6.1) ✗ ./gradlew clean testDebug

> Task :app:kaptDebugKotlin
warning: You aren't using a compiler supported by lombok, so lombok will not work and has been disabled.
  Your processor is: org.jetbrains.kotlin.kapt3.base.incremental.IncrementalProcessingEnvironment
  Lombok supports: OpenJDK javac, ECJ
> Task :app:compileDebugUnitTestKotlin FAILED
e: /Users/dariusz/Downloads/kotlin-coroutines-master/MyApplication/app/src/test/java/com/example/lomboktest/KotlinAccess.kt: (12, 42): Unresolved reference: getTest

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':app:compileDebugUnitTestKotlin'.
> Compilation error. See log for more details

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 3s
18 actionable tasks: 17 executed, 1 up-to-date
```
