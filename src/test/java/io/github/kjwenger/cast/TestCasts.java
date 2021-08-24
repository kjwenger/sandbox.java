package io.github.kjwenger.cast;

import kjwenger.cast.DerivedClass;
import kjwenger.cast.Interface;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestCasts {

    @Test
    public void testCastDerivedToInterface()
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String canonicalName = DerivedClass.class.getCanonicalName();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?> loadedClass = classLoader.loadClass(canonicalName);
        assertNotNull(loadedClass);
        Object derived = loadedClass.newInstance();
        assertNotNull(derived);
        Interface cast = Interface.class.cast(derived);
        assertNotNull(cast);
    }
}
