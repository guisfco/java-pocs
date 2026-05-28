# Java 26 Mockito POC

This POC explores the Mockito framework, demonstrating how to create mocks, spies, and stubs to test business logic in isolation. It covers various features like dependency injection with annotations, static mocking, argument capturing, and verification techniques.

## Topics

- [Mockito JUnit 5 Extension (@ExtendWith)](https://github.com/guisfco/java-pocs/blob/main/java-26-mockito/src/test/java/com/guisfco/PaymentServiceTest.java#L28)
- [Mock Creation (@Mock)](https://github.com/guisfco/java-pocs/blob/main/java-26-mockito/src/test/java/com/guisfco/PaymentServiceTest.java#L35)
- [Mock Injection (@InjectMocks)](https://github.com/guisfco/java-pocs/blob/main/java-26-mockito/src/test/java/com/guisfco/PaymentServiceTest.java#L31)
- [Spying on Real Objects (@Spy)](https://github.com/guisfco/java-pocs/blob/main/java-26-mockito/src/test/java/com/guisfco/PaymentServiceTest.java#L38)
- [Stubbing Methods (when/thenReturn)](https://github.com/guisfco/java-pocs/blob/main/java-26-mockito/src/test/java/com/guisfco/PaymentServiceTest.java#L76)
- [Custom Stubbing (thenAnswer)](https://github.com/guisfco/java-pocs/blob/main/java-26-mockito/src/test/java/com/guisfco/PaymentServiceTest.java#L52)
- [Static Mocking (mockStatic)](https://github.com/guisfco/java-pocs/blob/main/java-26-mockito/src/test/java/com/guisfco/PaymentServiceTest.java#L103)
- [Verifying Behavior (verify)](https://github.com/guisfco/java-pocs/blob/main/java-26-mockito/src/test/java/com/guisfco/PaymentServiceTest.java#L59)
- [Argument Capturing (ArgumentCaptor)](https://github.com/guisfco/java-pocs/blob/main/java-26-mockito/src/test/java/com/guisfco/PaymentServiceTest.java#L56)
- [Verifying No Interactions](https://github.com/guisfco/java-pocs/blob/main/java-26-mockito/src/test/java/com/guisfco/PaymentServiceTest.java#L60)
- [Argument Matchers (any)](https://github.com/guisfco/java-pocs/blob/main/java-26-mockito/src/test/java/com/guisfco/PaymentServiceTest.java#L52)
