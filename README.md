# ParingIntegersToSum

A simple Java application that returns pairs of integers whose sum is 13 from a given list of integers.
## Task description

The input is a long list of integers. Provide a working code that will find all the pairs (in this integer list) that sum up to 13. Each pair in the output should have first number not greater than the second one and lines should be sorted in an ascending order.

## How it works?

Run the application in console.

For example:
```
java <path>\ParingIntegersToSum.java 3 10 5 8 999
```

In the return you receive pair of integers.
```
3 10
5 8
```
### Exceptions
When you pass a non-integer argument in return you recive
```
ERROR: At least one of the argument is not an Integer (min=-2147483648, max=2147483647)
```
