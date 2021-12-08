package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String actual = "1,2";
        String[] result = actual.split(",");

        assertThat(actual).contains(result);
    }

    @Test
    void remove() {
        String actual = "(1,2)";
        String result = actual.substring(1, actual.length() - 1);

        assertThat(actual).contains(result);
    }

    @Test
    void getCharacter() {
        String actual = "abc";

        char a = actual.charAt(0);
        assertThat('a').isEqualTo(a);

        assertThatThrownBy(() -> {
            char c = actual.charAt(actual.length());
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");

        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    char c = actual.charAt(actual.length());
                }).withMessageContaining("String index out of range: 3");
    }
}
