package numbers.caseResult;

public class Gapful implements CaseResult {
    public boolean result(long nextInteger) {
        if (nextInteger < 100) {
            return false;
        }
        String stringInteger = String.valueOf(nextInteger);
        char start = stringInteger.charAt(0);
        char end = stringInteger.charAt(stringInteger.length() - 1);
        String numberString = "" + start + end;
        long number = Long.parseLong(numberString);
        return nextInteger % number == 0;
    }
}
