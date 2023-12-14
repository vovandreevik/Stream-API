import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class StreamExampleTest {

    @Test
    public void testAverage() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double result = StreamExample.average(numbers);
        assertEquals(3.0, result, 0.01);
    }

    @Test
    public void testUpperCaseAndAddPrefix() {
        List<String> strings = Arrays.asList("abc", "def", "ghi");
        List<String> result = StreamExample.upperCaseAndAddPrefix(strings);
        assertEquals(Arrays.asList("_new_ABC", "_new_DEF", "_new_GHI"), result);
    }

    @Test
    public void testUniqueSquares() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 5);
        List<Integer> result = StreamExample.uniqueSquares(numbers);
        assertEquals(Arrays.asList(1, 4, 16, 25), result);
    }

    @Test
    public void testFilterAndSortByLetter() {
        List<String> strings = Arrays.asList("apple", "banana", "avocado", "orange");
        List<String> result = StreamExample.filterAndSortByLetter(strings, 'a');
        assertEquals(Arrays.asList("apple", "avocado"), result);
    }

    @Test
    public void testGetLastElementOrThrowException() {
        List<String> strings = Arrays.asList("one", "two", "three");
        String result = StreamExample.getLastElementOrThrowException(strings);
        assertEquals("three", result);

        assertThrows(IllegalArgumentException.class, () -> StreamExample.getLastElementOrThrowException(List.of()));
    }

    @Test
    public void testSumOfEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = StreamExample.sumOfEvenNumbers(numbers);
        assertEquals(6, result);
    }

    @Test
    public void testConvertToMap() {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        Map<Character, String> result = StreamExample.convertToMap(strings);
        assertEquals(Map.of('a', "pple", 'b', "anana", 'c', "herry"), result);
    }

    @Test
    void getLastElement() {
        List<String> strings = Collections.emptyList();
        Optional<String> optional = StreamExample.getLastElement(strings);
        assertEquals(Optional.empty(), optional);
    }
}
