package io.github.kjwenger;

public class TestJUnit4 {

    @org.junit.Test(expected = RuntimeException.class)
    // @org.junit.Ignore
    public void testForSupport() {
        throw new RuntimeException("JUnit4 works");
    }

}
