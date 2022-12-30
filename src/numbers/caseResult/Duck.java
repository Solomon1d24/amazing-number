package numbers.caseResult;

public class Duck implements CaseResult {
    public  boolean result(long nextInteger) {
        while (nextInteger > 0) {
            if (nextInteger % 10 == 0) {
                return true;
            }
            nextInteger /= 10;
        }
        return false;
    }
}
