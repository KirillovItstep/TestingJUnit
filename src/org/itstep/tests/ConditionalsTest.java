package org.itstep.tests;

import org.itstep.conditionals.Conditionals;
import org.itstep.conditionals.WrongCharException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConditionalsTest {
        public static Conditionals conditionals;

        @BeforeAll
        public static void before(){
            conditionals = new Conditionals();
        }

        @Test
        public void solveQuadraticEquation() {
            assertArrayEquals(new double[]{3,-1}, conditionals.solveQuadraticEquation(1,-2,-3));
            assertArrayEquals(new double[]{-6}, conditionals.solveQuadraticEquation(1,12,36));
            assertArrayEquals(new double[]{}, conditionals.solveQuadraticEquation(1,1,2));
        }

    @Test
    public void vowelOrConsonant() throws WrongCharException {
        assertEquals("Input letter is Vowel", conditionals.vowelOrConsonant("a"));
        assertEquals("Input letter is Consonant", conditionals.vowelOrConsonant("b"));
        Exception exception = assertThrows(WrongCharException.class, () ->
                conditionals.vowelOrConsonant("ab"));
        assertEquals("Error. Not a single character.", exception.getMessage());
        exception = assertThrows(WrongCharException.class, () ->
                conditionals.vowelOrConsonant("1"));
        assertEquals("Error. Not a letter. Enter uppercase or lowercase letter.", exception.getMessage());
        }

    @Test
    public void printPattern(){
        assertEquals("       1 \n" +
                "      2 2 \n" +
                "     3 3 3 \n" +
                "    4 4 4 4 \n", conditionals.printPattern(4));
    }
    }
