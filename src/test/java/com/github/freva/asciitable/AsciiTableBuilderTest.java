package com.github.freva.asciitable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AsciiTableBuilderTest {

    @Test
    public void doesNotAllowHeaderWithColumns() {
        assertThrows(IllegalArgumentException.class,
                () -> AsciiTable.builder().header("header").data(new Column[0], new Object[0][0]).asString());
    }
    @Test
    public void doesNotAllowFooterWithColumns() {
        assertThrows(IllegalArgumentException.class,
                () -> AsciiTable.builder().footer("footer").data(new Column[0], new Object[0][0]).asString());
    }
}
