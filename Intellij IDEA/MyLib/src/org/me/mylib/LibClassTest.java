package org.me.mylib;

import static org.junit.jupiter.api.Assertions.*;

class LibClassTest {

    @org.junit.jupiter.api.Test
    void acrostic() {
        System.out.println("Running testAcrostic...");
        String result = LibClass.acrostic(new String[] {"fnord", "polly", "tropism"});
        assertEquals("foo", result);
    }
}