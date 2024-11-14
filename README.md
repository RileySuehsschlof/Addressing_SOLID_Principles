#SOLID Principles

##Overview
The goal of this project was to become more familiar with the SOLID principles. The SOLID principles are a set of five object-oriented design (OOD) principles by Robert C. Martin.
In this assignment, we were to develop situations for three out of the five principles, where the principle was violated, and to then provide a solution to it.

#SRP

##Violation:
-The Icecream class contains attributes related to buying an icecream, as well as a method for calculating a discount.
-This violates SRP as a class should only have one responsibility.

##Solution:
-Move the method for calculating the discount to a seperate class, and added a method in icecream for applying a discount.
-This adheres to SRP as the logic for calculating the discount is different from the qualities of buying an icecream.

##Importance:
The Single Responsibility Principle is important for making code more reusable, readable, testable and scalable.


#OCP

##Violation:
-The StatsCalculator class would not still work for new types of players without changing the source code.
-This violates OCP as the method should be open for extension and closed for modification

##Solution:
-The solution was to add a player interface that has a method to calculatestats.
-This way, all types of players have to implement that interface and method, ensuring they can all do the things required for the calculator to be more open.

##Importance:
The Open Closed Principle is important for allowing you to add more flexibility without changing your code.

#ISP

##Violation:

##Solution:

##Importance:
