import java.util.ArrayList;
import java.util.List;

// ******************
// FizzBuzz Problem
// ******************
// You are given an integer, n, where 1 <= n
// For every integer i <= n, do the following:
// - If i is a multiple of 3 and 5, print "FizzBuzz"
// - If i is a multiple of 3 but not 5, print "Fizz"
// - If i is a multiple of 5 but not 3, print "Buzz"

import java.util.ArrayList;

// *******************
// About My Solution
// *******************
// I created two functions, fizzBuzzPrintSingleLineValues and fizzBuzzReturnValuesArray.
// - The fizzBuzzPrintSingleLineValues function will print a single value on a single line.
// - The fizzBuzzReturnValuesArray function will return an array of string values.

public class FizzBuzz {
    public static void fizzBuzzPrintSingleLineValues(int n) {
        // n is >= 1
        for (int i = 1; i <= n; i++) {
            // First, handle case resulting in "FizzBuzz".
            // Do this because there may be situations where i might be a multiple of both
            // 3 and 5.
            // If this case was handled last, the wrong word will be printed.

            // Example: If case i % 3 == 0 were to be handled first, and i = 15, the
            // word "Fizz" would be printed out.
            // - This would be incorrect because 15 is a multiple of both 3 and 5, so
            //   the word "FizzBuzz" should be printed out instead.
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    public static List<String> fizzBuzzReturnValuesArray(int n) {
        // Initialize an array that can hold string values.
        List<String> valuesArray = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                valuesArray.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                valuesArray.add("Fizz");
            }
            else if (i % 5 == 0) {
                valuesArray.add("Buzz");
            }
            else {
                // - i has is of type int, so we convert it to a string first.
                // - We do this because valuesArray was initialized as an array that can only hold
                //   string values.
                valuesArray.add(Integer.toString(i));
            }
        }
        // Return array of values once for loop is completed.
        return valuesArray;
    }

    public static void main(String[] args) {
        // Test first function fizzBuzzPrintSingleLineValues
        // - Will print a single value on a single line.
        fizzBuzzPrintSingleLineValues(30);

        // Test second function fizzBuzzReturnValuesArray.
        // - Will print all values inside arrayOfStrings on a single line.
        List<String> arrayOfStrings = fizzBuzzReturnValuesArray(30);
        for (String string : arrayOfStrings) {
            System.out.print(string + " ");
        }
    }
}
