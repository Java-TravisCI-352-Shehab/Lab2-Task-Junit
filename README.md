# Lab2-Task-Junit
## Mohammed A. Shehab

It would be best if you cloned the code repository.
### Task 1 (Check prime for large numbers)
In this task, you have to write a correct and efficient algorithm to check large numbers as prime or not.
The test cases will measure your system time clocks and try to categorize the code efficiency level approximately.

The excellent is the best level, while bad is the worst one.
You can do a google search to see the best mathematical solution for this problem, but please do NOT search for implementation. Try to convert that mathematical answer to Java code.

### Task 2 (3n + 1 problem)
Consider the following algorithm to generate a sequence of numbers.

Start with an integer n. If n is even, divide by 2. If n is odd, multiply by 3 and add 1. Repeat this process with the new value of n, terminating when `n = 1`.

For example, the following sequence of numbers will be generated for `n = 22`:

`22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1`

It is conjectured (but not yet proven) that this algorithm will terminate at n = 1 for every integer n. Still, the conjecture holds for all integers up to at least 1,000,000. For an input n, the cycle-length of n is the number of numbers generated up to and including the 1.

In the example above, the cycle length of 22 is 16.

Given an integer i determine the cycle length .

Input Format:

*An integer n*

Output Format:

*An integer : array*