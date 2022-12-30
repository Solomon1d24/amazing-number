package numbers.caseResult;

public class Spy implements CaseResult {
    public  boolean result(long nextInteger) {
        int sumResult = 0;
        int productResult = 1;
        String integerString = String.valueOf(nextInteger);
        for (int i = 0; i < integerString.length(); i++) {
            long number = Long.parseLong(String.valueOf(integerString.charAt(i)));
            sumResult += number;
            productResult *= number;
        }
        return sumResult == productResult;
    }
}
