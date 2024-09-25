# Java Program: Remove Tens from Array

## Description

This Java program takes an array of integers as input and removes any occurrences of the number `10`. The program creates a new array of the same length and shifts all non-`10` values to the front, leaving the rest as zeroes. This is useful for filtering out unwanted values while preserving the length of the array.

## How It Works

1. The program begins by prompting the user to enter the size of the array.
2. The user is then asked to input the elements of the array.
3. It then calls the method `withoutTen(int[] nums)`, which:
   - Iterates over the input array.
   - Copies all elements except `10` into a new array.
   - The rest of the elements in the result array are set to `0` if they do not fill the entire array.
4. The final array is printed with `10` values removed.

## Example

### Input:
```
Enter the size of the array: 5
Enter the elements of the array:
10 1 10 2 3
```

### Output:
```
Array after removing 10's:
1 2 3 0 0 
```

## Key Points
- The method `withoutTen` ensures that the relative order of the numbers other than `10` is preserved.
- The length of the array remains unchanged, with `0` filling any gaps left by removed `10`s.

## Example of Usage

This program is useful in cases where you need to filter out specific numbers (in this case, `10`) while keeping the structure and length of the array intact.

