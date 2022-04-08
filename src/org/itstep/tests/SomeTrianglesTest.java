package org.itstep.tests;

import org.itstep.triangles.SomeTriangles;
import org.junit.jupiter.api.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Check some triangles")
class SomeTrianglesTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalErr = System.err;

    @Test
    @DisplayName("Check if triangle exists")
    public void checkIsTriangleExists() {
        //Positive test
        assertTrue(SomeTriangles.checkIsTriangleExists(1,1,1), () -> "Equilateral");
        assertTrue(SomeTriangles.checkIsTriangleExists(2,2,3), () -> "Isosceles");
        assertTrue(SomeTriangles.checkIsTriangleExists(3,4,5), () -> "Прямоугольный");

        assertFalse(SomeTriangles.checkIsTriangleExists(1,2,3), () -> "The result for a not valid triangle must be false");
        assertFalse(SomeTriangles.checkIsTriangleExists(0,0,0), () -> "The result for zero lengths must be false");
        assertFalse(SomeTriangles.checkIsTriangleExists(1,2,-1), () -> "The result for negative length must be false");
    }

    @BeforeEach
    public void setUpStream() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStream() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    @DisplayName("Check an equilateral triangle")
    void checkTriangleEquilateral() throws IOException {
         /*
        System.out.print("hello");
         assertEquals("hello", outContent.toString());
         */
         //Positive

        SomeTriangles.checkTriangle(1,1,1);
        //Попробовать без разделителя строки, а также с разделителем "\n"
        assertEquals("Equilateral triangle\r\n", outContent.toString());
        outContent.reset(); //Очистить консоль, попробовать без очистки
    }

    @Test
    @DisplayName("Check an isosceles triangle")
    void checkTriangleIsosceles() throws IOException {
        SomeTriangles.checkTriangle(2,2,3);
        assertEquals("Isosceles triangle\r\n", outContent.toString());
        outContent.reset();
    }

    @Test
    @DisplayName("Check a rectangular triangle")
    void checkTriangleRectangular() throws IOException {
        SomeTriangles.checkTriangle(2,2,3);
        assertEquals("Isosceles triangle\r\n", outContent.toString());
        outContent.reset();
    }

    @Test
    @DisplayName("Check a scalene triangle")
    void checkTriangleScalene() throws IOException {
        SomeTriangles.checkTriangle(3,4,6);
        assertEquals("Scalene triangle\r\n", outContent.toString());
        outContent.reset();
    }

    @Test
    @DisplayName("Check an invalid triangle")
    void checkTriangleInvalid() throws IOException {
        SomeTriangles.checkTriangle(0,4,6);
        assertEquals("Error, the triangle is not valid\r\n", errContent.toString());
        errContent.reset();
    }

}