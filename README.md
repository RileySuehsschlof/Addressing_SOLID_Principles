# SOLID Principles

## Overview
The goal of this project was to become more familiar with the SOLID principles. The SOLID principles are a set of five object-oriented design (OOD) principles introduced by Robert C. Martin.

In this assignment, I developed situations demonstrating violations of three out of the five principles and then provided solutions to adhere to each principle.

---

### Single Responsibility Principle (SRP)

#### Violation
- The `Icecream` class contains attributes related to buying an ice cream, as well as a method for calculating a discount.
- This violates SRP, as a class should only have **one responsibility**.

#### Solution
- Moved the discount calculation method to a separate class.
- Added a method in the `Icecream` class for applying a discount.
- This change adheres to SRP since the logic for calculating a discount is now separated from the core functionality of the `Icecream` class.

#### Importance
The Single Responsibility Principle is essential for making code more **reusable, readable, testable, and scalable**.

---

### Open-Closed Principle (OCP)

#### Violation
- The `StatsCalculator` class could not accommodate new types of players without modifying its source code.
- This violates OCP because the class should be **open for extension and closed for modification**.

#### Solution
- Created a `Player` interface with a `calculateStats` method.
- Each type of player implements this interface and method, allowing `StatsCalculator` to handle new player types without modification.

#### Importance
The Open-Closed Principle is vital for allowing flexibility without modifying existing code.

---

### Interface Segregation Principle (ISP)

#### Violation
- Both `NPC` and `Player` classes implemented a `Character` interface, but `NPC` does not need all of its methods.
- This violates ISP, as classes should **only implement methods they need**.

#### Solution
- Split the `Character` interface into multiple smaller interfaces, so `NPC` and `Player` only implement what they actually use.

#### Importance
The Interface Segregation Principle keeps code **simple and clean** by ensuring classes do not have to implement unnecessary methods.

---

## Conclusion
By following these SOLID principles, we achieve code that is more modular, easier to maintain, and adaptable to future changes.
