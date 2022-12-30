package numbers;

import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import static numbers.Verification.ifValid;
import static numbers.process.MultipleInputProcess.multipleInputAndPropertyProcess;
import static numbers.process.MultipleInputProcess.multipleInputProcess;
import static numbers.process.SingleInputProcess.singleInputProcess;

public class Main {

    private static final NumberFormat format = NumberFormat.getInstance(new Locale("en", "US"));

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println();
        printInstructions();
        Set<String> properties = new HashSet<>();

        while (true) {
            boolean isValid;
            System.out.print("Enter a request: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            System.out.println();
            if (input.trim().equals("")) {
                printInstructions();
                continue;
            }
            String[] inputArray = input.split(" ");
            isValid = ifValid(inputArray);
            if (!isValid) {
                continue;
            }
            long firstInteger = 0;
            long secondInteger;
            firstInteger = Long.parseLong(inputArray[0]);
            try {
                secondInteger = Long.parseLong(inputArray[1]);
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                secondInteger = 0;
            }
            try {
                for(int i =2;i<inputArray.length;i++){
                    properties.add(inputArray[i]);
                }
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

            }
            if (firstInteger == 0) {
                System.out.println("Goodbye!");
                System.exit(0);
            }
            if (secondInteger != 0 && properties.size() != 0) {
                multipleInputAndPropertyProcess(firstInteger, secondInteger, properties);
                System.out.println();
            } else if (secondInteger != 0) {
                multipleInputProcess(firstInteger, secondInteger);
                System.out.println();
            } else {
                singleInputProcess(firstInteger);
                System.out.println();
            }
        }
    }

    private static void printInstructions() {
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter two natural numbers to obtain the properties of the list:");
        System.out.println("  * the first parameter represents a starting number;");
        System.out.println("  * the second parameter shows how many consecutive numbers are to be processed;");
        System.out.println("- two natural numbers and properties to search for;");
        System.out.println("- a property preceded by minus must not be present in numbers;");
        System.out.println("- separate the parameters with one space;");
        System.out.println("- enter 0 to exit.");
        System.out.println();
    }
}
