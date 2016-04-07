/**
 * Problem 3.	Assign Variables
 Find suitable types for variables. You are given the following types: byte, short, int, long, char,
 boolean, float, double, and String. Assign the following values to them false,
 “Palo Alto, CA”, 32767, 2000000000, 0.1234567891011, 0.5f, 919827112351L, 127, ‘c’.
 Try to assign 32768 to short and see what happens.

 */
public class AssignVariables {
    public static void main(String[] args) {
        byte byteVariable  = 127;
        short shortVariable = 32767;
        int tryToShortVariable = 32768;
        long longVariable = 919827112351L;
        int anotherIntVariable = 2000000000;
        char charVariable = 'c';
        boolean booleanVariable = false;
        float floatVariable = 0.5f;
        double doubleVariable = 0.1234567891011;
        String stringVariable = "Palo Alto, CA";

        String newLine = System.getProperty("line.separator");

        System.out.print(byteVariable + newLine);
        System.out.print(shortVariable + newLine);
        System.out.print(tryToShortVariable + newLine);
        System.out.print(longVariable + newLine);
        System.out.print(anotherIntVariable + newLine);
        System.out.print(charVariable + newLine);
        System.out.print(booleanVariable + newLine);
        System.out.print(floatVariable + newLine);
        System.out.print(doubleVariable + newLine);
        System.out.print(stringVariable + newLine);

    }
}