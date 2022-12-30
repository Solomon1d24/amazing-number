package numbers.caseResult;

public class Happy implements CaseResult {
    @Override
    public boolean result(long nextInteger) {
        while (nextInteger != 1 && nextInteger != 4) {
            nextInteger = this.isHappyNumber(nextInteger);
        }
        return nextInteger == 1;
    }

    private long isHappyNumber(long num) {
        long rem = 0;
        long sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum += (rem * rem);
            num /= 10;
        }
        return sum;
    }
}
