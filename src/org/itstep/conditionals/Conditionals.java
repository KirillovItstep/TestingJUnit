package org.itstep.conditionals;

public class Conditionals {

    //Write a Java program to solve quadratic equations (use if, else if and else).
    public double[] solveQuadraticEquation(double a, double b, double c){
        double[] result = new double[0];
        double discr = b * b - 4.0 * a * c;
        if (discr > 0.0) {
            double r1 = (-b + Math.pow(discr, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(discr, 0.5)) / (2.0 * a);
            result = new double[2];
           result[0] = r1; result[1] = r2;
        } else if (discr == 0.0) {
            double r1 = -b / (2.0 * a);
            result = new double[1];
            result[0] = r1;
        }
        return result;
    }

    /*
    Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant,
    depending on the user input.
    If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
     */
    public String vowelOrConsonant(String c) throws WrongCharException {
        boolean uppercase = c.charAt(0) >= 65 && c.charAt(0) <= 90;
        boolean lowercase = c.charAt(0) >= 97 && c.charAt(0) <= 122;
        boolean vowels = c.equals("a") || c.equals("e") || c.equals("i")
                || c.equals("o") || c.equals("u");

        if (c.length() > 1){
            throw new WrongCharException("Error. Not a single character.");
        }
        else if (!(uppercase || lowercase)){
            throw new WrongCharException("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels){
            return "Input letter is Vowel";
        }
        else{
            return "Input letter is Consonant";
        }
    }

    //Write a program in Java to print such pattern like a pyramid with a number which will repeat the number in the same row.
    public String printPattern(int n){
        StringBuilder sb = new StringBuilder();
    int i,j,s,x;
    s=n+4-1;
    for(i=1;i<=n;i++){
        for(x=s;x!=0;x--)
            sb.append(" ");
        for(j=1;j<=i;j++)
            sb.append(i+" ");
        sb.append("\n");
        s--;
    }
    return sb.toString();
}
}



