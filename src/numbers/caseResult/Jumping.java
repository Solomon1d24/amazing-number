package numbers.caseResult;

public class Jumping implements CaseResult {

    @Override
    public boolean result(long nextInteger) {
        if (nextInteger < 10) {
            return true;
        }
        String integerString = String.valueOf(nextInteger);
        for (int i = 0; i < integerString.length() - 1; i++) {
            int firstDigit = Integer.parseInt(String.valueOf(integerString.charAt(i)));
            int secondDigit = Integer.parseInt(String.valueOf(integerString.charAt(i + 1)));
            int difference = Math.abs(firstDigit - secondDigit);
            if (difference != 1) {
                return false;
            }
        }
        return true;
    }
}
