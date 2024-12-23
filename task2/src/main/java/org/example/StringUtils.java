package org.example;

import static java.util.Optional.ofNullable;

public class StringUtils {

    public static int getLength(String str) {
        return ofNullable(str)
                .map(String::length)
                .orElse(0);
    }

    private StringUtils() {
    }

}
