package cz.fel.cvut.ts1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static cz.fel.cvut.ts1.Maksidan.factorial;

class MaksidanTest {
    @Test
    public void factorialTest() {
        assertEquals(factorial(3), 6);
    }
}