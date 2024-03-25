# StreamExample

StreamExample is a Java project that demonstrates various stream operations using Java 8 Streams and provides corresponding test cases.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Methods](#methods)
- [Tests](#tests)

## Installation

To use StreamExample in your project, you can follow these steps:

1. Clone this repository:

    ```bash
    git clone https://github.com/your_username/StreamExample.git
    ```

2. Import the project into your preferred Java IDE.

## Usage

The StreamExample project provides several utility methods for working with streams and collections in Java. You can use these methods in your own Java projects by importing the `StreamExample` class and calling the desired methods.

Example usage:

```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double average = StreamExample.average(numbers);
        System.out.println("Average: " + average);
    }
}
```

## Methods
`average(List<Integer> numbers)`
Calculates the average of a list of integers.

`upperCaseAndAddPrefix(List<String> strings)`
Converts a list of strings to uppercase and adds a prefix to each string.

`uniqueSquares(List<Integer> numbers)`
Filters unique integers from a list, squares them, and returns a list of unique squares.

`filterAndSortByLetter(Collection<String> strings, char letter)`
Filters and sorts strings from a collection based on a specified letter.

`getLastElementOrThrowException(Collection<T> collection)`
Gets the last element from a collection or throws an exception if the collection is empty.

`getLastElement(Collection<T> collection)`
Gets the last element from a collection as an optional.

`sumOfEvenNumbers(int[] numbers)`
Calculates the sum of even numbers in an array.

`convertToMap(List<String> strings)`
Converts a list of strings to a map where the first character of each string is the key and the remaining characters are the value.

## Tests
The project includes JUnit tests to verify the functionality of each method. You can run these tests to ensure that the methods work as expected.
