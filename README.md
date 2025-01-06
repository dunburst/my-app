# Calculator Project

This project is a simple Java-based calculator application that provides basic arithmetic operations. It includes the implementation of the calculator logic and unit tests to ensure proper functionality.

## Features

- **Addition**: Add two integers.
- **Subtraction**: Subtract one integer from another.
- **Multiplication**: Multiply two integers.
- **Division**: Divide one integer by another (throws an exception if dividing by 0).

---

## Getting Started

### Requirements

To run this project, you need:

- Java 8 or later
- A build tool like Maven 
- Visual Studio Code (VSCode) with the **Java Extension Pack** installed



### Running the Application

You can directly use the `Calculator` class in your project by instantiating it and calling its methods:

![image](https://github.com/user-attachments/assets/52ada4f4-55bb-43bf-8b24-03061a65ba08)


### Running Tests

This project includes unit tests written using **JUnit 5**. To run the tests:

1. Ensure JUnit 5 is configured in your project (e.g., via Maven or Gradle).

   - Maven dependency:
     ```xml
     <dependency>
         <groupId>org.junit.jupiter</groupId>
         <artifactId>junit-jupiter</artifactId>
         <version>5.10.0</version>
         <scope>test</scope>
     </dependency>
     ```

2. Use the built-in test runner in Visual Studio Code:

   - Open the `CalculatorTest` class.
   - Click the "Run Test" or "Debug Test" buttons next to each test method or run all tests using the testing interface.

3. Alternatively, you can run the tests via the terminal:

   ```bash
   mvn test
   ```

### Sample Test Output

- **Success Case:**
  ```
  BUILD SUCCESSFUL
  Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
  ```
- **Failure Case:**
  ```
  BUILD FAILED
  Tests run: 4, Failures: 1, Errors: 0, Skipped: 0
  ```

---

## Project Structure

```
calculator-project/
|-- src/
|   |-- main/
|   |   |-- java/
|   |   |   |-- Calculator.java
|   |-- test/
|       |-- java/
|           |-- CalculatorTest.java
|-- pom.xml (if using Maven)
```

