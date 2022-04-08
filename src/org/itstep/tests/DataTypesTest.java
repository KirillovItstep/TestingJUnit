package org.itstep.tests;

import org.itstep.datatypes.DataTypes;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataTypesTest {
    public static DataTypes dataTypes;

    @BeforeAll
    public static void before(){
        dataTypes = new DataTypes();
    }

    @Test
    void inchToMeters() {
        //Positive test
        assertEquals(dataTypes.inchToMeters(1),0.0254);
    }

    @Test
    void sumOfDigits3() {
        //Positive test
        assertEquals(dataTypes.sumOfDigits3(123),6);
    }

    @Test
    void power2_3_4() {
        //Вначале погрешность равна 0
        assertArrayEquals(dataTypes.power2_3_4(2.),new double[]{4,8,16});
        //Погрешность можно
        assertArrayEquals(dataTypes.power2_3_4(2.),new double[]{4,8,16},1e-10);
    }

}