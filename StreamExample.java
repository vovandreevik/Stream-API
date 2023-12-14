import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static double average(List<Integer> numbers) {
        return numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
    }

    public static List<String> upperCaseAndAddPrefix(List<String> strings) {
        return strings.stream()
                .map(s -> "_new_" + s.toUpperCase())
                .collect(Collectors.toList());
    }

    public static List<Integer> uniqueSquares(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> Collections.frequency(numbers, n) == 1)
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static List<String> filterAndSortByLetter(Collection<String> strings, char letter) {
        return strings.stream()
                .filter(s -> s.startsWith(String.valueOf(letter)))
                .sorted()
                .collect(Collectors.toList());
    }

    public static <T> T getLastElementOrThrowException(Collection<T> collection) {
        return collection.stream()
                .reduce((first, second) -> second)
                .orElseThrow(() -> new IllegalArgumentException("Collection is empty"));
    }

    public static <T> Optional<T> getLastElement(Collection<T> collection) {
        return collection.stream()
                .reduce((first, second) -> second);

    }

    public static int sumOfEvenNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sum();
    }

    public static Map<Character, String> convertToMap(List<String> strings) {
        return strings.stream()
                .collect(Collectors.toMap(
                        s -> s.charAt(0),
                        s -> s.substring(1),
                        (existing, replacement) -> existing));
    }
}
