# Java Program: Move Zeros to Front

## Description

This Java program takes an array of integers as input and moves all `0`s to the front of the array. The program rearranges the elements such that all zeros are positioned at the beginning, while maintaining the relative order of non-zero elements. The length of the array remains unchanged.

## How It Works

1. The program prompts the user to enter the size of the array.
2. The user then inputs the elements of the array.
3. It calls the method `zeroFront(int[] nums)`, which:
   - Iterates through the input array.
   - Places all `0` values at the beginning of the new array.
   - Moves all non-zero values to the end of the array.
4. The final array is printed with zeros moved to the front.

## Example

### Input:
```
Enter the size of the array: 5
Enter the elements of the array:
1 0 2 0 3
```

### Output:
```
Array after moving zeros to the front:
0 0 3 2 1 
```

## Key Points
- The method `zeroFront` ensures that all `0`s are moved to the front, while the non-zero elements are shifted to the back in reverse order.
- The total length of the array remains the same, ensuring no loss of data.
  
## Example of Usage

This program is useful for cases where data filtering is required, and zeros need to be prioritized at the front of an array without losing any information from the original array.

