package org.itstep.datatypes;

//Задания взяты из w3resource.com
public class DataTypes {

    //Write a program that reads a number in inches, converts it to meters.
    public double inchToMeters(double inch){
        return inch * 0.0254;
    }

    //Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
    public int sumOfDigits3(int num){
        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        return sum;
    }

    //Write a program that reads a number and display the square, cube, and fourth power.
public double[] power2_3_4(double val){
       double[] result = new double[3];
       result[0] = val*val;
       result[1] = result[0]*val;
       result[2] = Math.pow(val, 4);
       return result;
}
}
