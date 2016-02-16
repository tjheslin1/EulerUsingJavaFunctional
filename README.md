# EulerUsingJavaFunctional
Test driven project to learn and practice functional programming in Java 8.

Warning! Answers to the [Project Euler](https://projecteuler.net) are contained within this project.
Test classes reference the enum in `tom.euler.Answers` so as to avoid exposing the answers in the tests.

# Process

First I write a test for the example in the question and make it pass. Next I write a test to solve the
answer using regular Java, refactoring for readability and cleanliness.

Finally I write a test to solve it functionally and then implement a functional approach, reusing some
functionality from the regular approach where appropriate.