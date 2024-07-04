### Java Program: SumLimit

## Description

This Java program, named "SumLimit", calculates a result based on two non-negative integer inputs: `a` and `b`. The program adds the two integers and checks the number of digits in the sum. If the number of digits in the sum is the same as the number of digits in `a`, it returns the sum; otherwise, it returns `a`.

## How It Works

The program prompts the user to input two non-negative integer values:
- `a`: The first non-negative integer.
- `b`: The second non-negative integer.

Using these inputs, the program calls a method `sumLimit(int a, int b)` to compute the result. The method performs the following steps:
1. Calculates the sum of `a` and `b`.
2. Determines the number of digits in `a`.
3. Determines the number of digits in the sum.
4. If the number of digits in the sum is equal to the number of digits in `a`, it returns the sum.
5. Otherwise, it returns `a`.

The program then displays the computed result to the user based on the provided inputs.

## Example

### Input:
```java
Enter the first non-negative integer (a): 123
Enter the second non-negative integer (b): 45
```

### Output:
```
The result is: 123
```

This program demonstrates the use of integer manipulation and conditional logic in Java to solve a simple numerical problem based on digit length comparison.
