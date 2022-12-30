package numbers.process;

import numbers.caseType.CaseType;

import java.util.HashMap;
import java.util.Map;

public class SingleInputProcess implements Process {

    public static void singleInputProcess(long nextInteger) {
        Map<String,Boolean> propertyMap = new HashMap<>();
        for(CaseType caseType : CaseType.values()){
                propertyMap.put(caseType.name().toLowerCase(),caseType.getCaseResult().result(nextInteger));
        }
        System.out.println("Properties of " + format.format(nextInteger));
        propertyMap.forEach((k,v)->{
            System.out.println(k + ": " + v);
        });

//        boolean isBuzz = new Buzz().result(nextInteger);
//        boolean isOdd = !new Even().result(nextInteger);
//        boolean isDuck = new Duck().result(nextInteger);
//        boolean isEven = new Even().result(nextInteger);
//        boolean isPalindromic = new Palindromic().result(nextInteger);
//        boolean isGapFul = new Gapful().result(nextInteger);
//        boolean isSpy = new Spy().result(nextInteger);
//        boolean isSunny = new Sunny().result(nextInteger);
//        boolean isSquare = new Square().result(nextInteger);
//        System.out.println("Properties of " + format.format(nextInteger));
//        System.out.println("        buzz: " + isBuzz);
//        System.out.println("        duck: " + isDuck);
//        System.out.println(" palindromic: " + isPalindromic);
//        System.out.println("      gapful: " + isGapFul);
//        System.out.println("         spy: " + isSpy);
//        System.out.println("        even: " + isEven);
//        System.out.println("         odd: " + isOdd);
//        System.out.println("       sunny: " + isSunny);
//        System.out.println("      square: " + isSquare);
    }
}
