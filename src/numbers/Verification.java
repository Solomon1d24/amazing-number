package numbers;

public class Verification {
    public static boolean ifValid(String[] inputString) {
        try {
            long firstInteger = Long.parseLong(inputString[0]);
            if (firstInteger < 0) {
                System.out.println("The first parameter should be a natural number or zero.");
                System.out.println();
                return false;
            }
        } catch (NumberFormatException numberFormatException) {
            System.out.println("The first parameter should be a natural number or zero.");
            System.out.println();
            return false;
        }
        try {
            long secondNumber = Long.parseLong(inputString[1]);
            if (secondNumber <= 0) {
                System.out.println("The second parameter should be a natural number.");
                System.out.println();
                return false;
            }
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            return true;
        }
        return true;
    }
}
