This application reproduces Maven Surefire Plugin 3.0.0-M4 not detecting a test fail. It outputs 0 tests run and a build success:
```
Tests run: 0, Failures: 0, Errors: 0, Skipped: 0
```
Note that the prior release, 2.22.2, correctly fails this build.

The original scenario discovering this problem is with Spring MockMVC tests.

To reproduce, this app configuration uses the same configuration and deliberately does not have Spring find AutowiredClass, causing:
```
java.lang.IllegalStateException: Failed to load ApplicationContext
...
org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.jeffjensen.notseen.AutowiredClass' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
```
