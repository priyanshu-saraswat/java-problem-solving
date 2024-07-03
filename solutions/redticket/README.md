### Java Program: Red Lottery Ticket

## Description

This Java program, named "Red Lottery Ticket", calculates the outcome of a red lottery ticket based on three integer inputs: `a`, `b`, and `c`. Each integer can be `0`, `1`, or `2`. The program applies specific rules to determine the result, which can be `10`, `5`, `1`, or `0` based on the values of `a`, `b`, and `c`.

## How It Works

The program begins by prompting the user to input three integer values:
- `a`: The first integer value (0, 1, or 2).
- `b`: The second integer value (0, 1, or 2).
- `c`: The third integer value (0, 1, or 2).

Using these inputs, the program calls a method `lotteryResult(int a, int b, int c)` to calculate the result of the red lottery ticket. The method evaluates the following conditions:

1. If all three values (`a`, `b`, and `c`) are `2`, the result is `10`.
2. If all three values (`a`, `b`, and `c`) are the same and not all `2`, the result is `5`.
3. If values `b` and `c` are different from `a`, the result is `1`.
4. Otherwise, the result is `0`.

Finally, the program outputs the calculated result to the console, based on the provided inputs.

## Example

### Input:
```java
Enter value for a (0, 1, or 2): 1
Enter value for b (0, 1, or 2): 1
Enter value for c (0, 1, or 2): 2
```

### Output:
```
Result for (1, 1, 2): 0
```

This program provides a clear example of using conditional statements in Java to determine outcomes based on multiple input values, simulating a simple lottery ticket scenario.

