package numbers.caseResult;

public class Palindromic implements CaseResult {
    public boolean result(long nextInteger) {
        String stringInteger = String.valueOf(nextInteger);
        for (int i = 0; i < stringInteger.length() / 2; i++) {
            if (stringInteger.charAt(i) != stringInteger.charAt(stringInteger.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
