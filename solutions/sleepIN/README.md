# Java Program: Sleep In

## Description

This Java program, named "Sleep In", determines whether you can sleep in based on two boolean inputs: `weekday` and `vacation`. It provides a simple decision-making process using conditional logic to decide the output.

## How It Works

The program begins by prompting the user to input two boolean values:
- `weekday`: Indicates whether it is a weekday (`true` or `false`).
- `vacation`: Indicates whether the user is on vacation (`true` or `false`).

Using these inputs, the program calls a method `sleepIn(boolean weekday, boolean vacation)` to determine if the user can sleep in. The method evaluates the conditions:
- If it's not a weekday (`!weekday`) or the user is on vacation (`vacation`), it returns `true`, indicating that the user can sleep in.
- Otherwise, it returns `false`, indicating that the user cannot sleep in.

Finally, the program outputs the result to the console, informing the user whether they can sleep in or not based on the provided inputs.

## Example

### Input:
```java
Is it weekday? true
Are you on vacation? false
```

### Output:
```
Can you sleep in? false
```

