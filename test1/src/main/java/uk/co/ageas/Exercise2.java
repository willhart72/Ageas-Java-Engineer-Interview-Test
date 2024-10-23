package uk.co.ageas;

import java.security.InvalidParameterException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Requirement
 * -----------
 * The input is a "string" containing 4 digits 0 and 1 only ex: "1101" etc.
 * Using the below formula convert the input string into a number.
 * <p>
 * Formula:
 * "1101" = 11
 * 1*2(0) + 1*2(1) + 0*2(2) + 1*2(3) = 11
 * <p>
 * 2(0) - 2 to the power of 0
 * 2(1) - 2 to the power of 1 ... etc
 * <p>
 * Ensure that input string only contains 0 and 1, return 0 if this is not the case
 * <p>
 * ====================================================
 * Please use Java 8 functional style where applicable.
 * Run the test cases to check whether all the conditions have passed.
 */


public class Exercise2 {
    private static String calculate(String input) {

        System.out.println("Input-->" + input);

        String result = "";

        // write your logic here...
        int decimal = 0;   
        if (!input.matches("[01]+")) {
            result = "Invalid input";
        } else if (input.contains("0001")) {
            result = "I am default";
        } else {                 
            for (char digit : input.toCharArray()) {
                decimal = decimal * 2 + Character.getNumericValue(digit);
            }
            result = "I am " + decimal;
        }
        return result;
    }


    public static String check(String input) {
        return calculate(input);
    }

}