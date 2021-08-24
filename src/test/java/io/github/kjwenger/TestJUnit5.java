package io.github.kjwenger;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class TestJUnit5 {

    @org.junit.jupiter.api.Test
    // @org.junit.jupiter.api.Disabled
    public void testForSupport() {
        assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException("JUnit5 works");
        });
    }

}
