package study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void getSize() {
        System.out.println("numbers.size = " + numbers.size());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void isContain_ShouldReturnTrueForOneOrTwoOrThreeInts(Integer number) {
        Assertions.assertTrue(numbers.contains(number));
    }

    @ParameterizedTest
    @CsvSource({"1, true", "2, true", "3, true", "4, false", "5, false"})
    void contains_ShouldReturnTrue(Integer number, boolean result) {
        number = 1;
        result = true;
        Assertions.assertEquals(true, result);

        number = 4;
        result = false;
        Assertions.assertEquals(false, result);
    }
}
