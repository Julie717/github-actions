package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @ParameterizedTest
    @MethodSource("data")
    void getLength(String str, int expected) {
        var actual = StringUtils.getLength(str);

        assertEquals(expected, actual);
    }

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("Hello world!", 12),
                Arguments.of("", 0),
                Arguments.of(null, 0));
    }

}
