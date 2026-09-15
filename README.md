OOP Innovative Assignment 1

Student Details:

Name: Bhuvaneshwari
GitHub Username: vh15213-cloud
Language: Java
JDK: 26.0.2.1
IDE: IntelliJ IDEA

Problem A – Electronics Device:

Problem Statement:

Write a Java program to create a class for an electronics scenario. The Device class contains brand and price with a constructor. The subclass SmartDevice adds the attribute connectivityType. The super() keyword is used for constructor chaining.

OOP Concepts Used:

1. Class and Object
2. Inheritance
3. Constructor
4. Constructor Chaining
5. super() keyword

Assigned Data:

Brand: Samsung
Price: 25000
Connectivity Type: Wi-Fi

Sample Output:

Brand: Samsung
Price: 25000.0
Connectivity Type: Wi-Fi


Problem B – Extended Warranty:

Problem Statement:

Define an abstract class Warranty with the abstract method claimWarranty(). Extend it with a class ExtendedWarranty and implement the abstract method.

OOP Concepts Used:

1. Abstract Class
2. Abstraction
3. Inheritance
4. Abstract Method
5. Method Overriding
6. Constructor

Assigned Data:

Warranty Period: 3 years

Sample Output:

Extended warranty claimed for 3 years.


Problem C – Invalid Warranty Period Exception:

Problem Statement:

Create a custom exception InvalidWarrantyPeriodException, which is thrown when the warranty period is entered as negative.

Concepts Used:

1. Custom Exception
2. Exception Handling
3. try-catch
4. throw
5. throws
6. Inheritance

Test Data:

Warranty Period: -2 years

Sample Output:

InvalidWarrantyPeriodException handled: Warranty period cannot be negative.


Project Structure:

bhuvi-oops-IA1/
|
|-- src/
|   |-- ProblemA.java
|   |-- ProblemB.java
|   |-- ProblemC.java
|
|-- .gitignore
|-- README.md


How to Run:

1. Open the project in IntelliJ IDEA.
2. Make sure JDK 26.0.2.1 is selected.
3. Open ProblemA.java, ProblemB.java, or ProblemC.java.
4. Run the main() method using the green Run button.
5. View the output in the Run console.


Conclusion:

This assignment demonstrates important Java Object-Oriented Programming concepts including inheritance, constructors, constructor chaining, the super() keyword, abstraction, abstract classes, method overriding, custom exceptions, and exception handling.