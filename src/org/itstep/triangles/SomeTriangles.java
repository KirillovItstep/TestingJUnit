package org.itstep.triangles;

public class SomeTriangles {
    // Function to check if the triangle
    // is equilateral or isosceles or scalene
    public static void checkTriangle(int x, int y, int z)
    {
        if (!checkIsTriangleExists(x,y,z))
            System.err.println("Error, the triangle is not valid");
        // Check for equilateral triangle
        if (x == y && y == z )
            System.out.println("Equilateral triangle"); //Равносторонний

            // Check for isosceles triangle
        else if (x == y || y == z || z == x )
            System.out.println("Isosceles triangle"); //Равнобедренный

        else if (x*x+y*y==z*z)
            System.out.println("Rectangular triangle"); //Прямоугольный

            // Otherwise scalene triangle
        else
            System.out.println("Scalene triangle"); //Разносторонний
    }

    public static boolean checkIsTriangleExists(int x, int y, int z){
        if (x>=y+z||y>=x+z||z>=x+y) return false;
        return true;
    }

    // Driver Code
    public static void main(String[] args)
    {

        // 1. Данные для разностороннего треугольника не являются корректными, т.к. такого треугольника не существует
        int x = 1, y = 2, z = 3;
        // 2. Данные для равнобедренного треугольника не являются корректными, т.к. такого треугольника не существует
        x = 1; y=1; z=3;
        // 3. Валидные данные для определения равностороннего треугольника
        x = 1; y=1; z=1;
        // 4. Валидные данные для равнобедренного треугольника, которые представляют собой 3 перестановки
        x = 3; y = 3; z = 4;
        x = 4; y = 3; z = 3;
        x = 3; y = 4; z = 3;
        // 5. Одна из сторон равна 0
        x = 0; y=2; z = 3;
        // 6. Одна из сторон отрицательная
        x = -1; y =2; z = 3;
        // 7. Все положительные, но сумма двух сторон равна третьей
        x = 2; y = 3; z = 5;
        // 8. Три перестановки из 7-го случая
        x = 2; y = 5; z = 3;
        x = 3; y = 2; z = 5;
        x = 3; y = 5; z = 2;
        // 9. Все положительные, но сумма двух сторон меньше третьей
        x = 2; y = 3; z = 6;
        // 10. Три перестановки из предыдущего случая
        x = 2; y = 6; z = 3;
        x = 3; y = 2; z = 6;
        x = 3; y = 6; z = 2;
        // 11. Все стороны равны нулю
        x = 0; y = 0; z = 0;
        // 12. Три вещественных числа
        //x = 1.1; y = 2.2; z = 3.0;
        // 13. Неверное число параметров, например два вместо трех
        x = 1; y = 2;
        // 14. Кроме ввода, проверяется также ожидаемый результат вывода

        // Function call
        x = 1; y = 1; z = 1;
        checkTriangle(x, y, z);
    }
}

