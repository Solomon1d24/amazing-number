package numbers.process;

import numbers.caseType.CaseType;
import numbers.mutualExclusiveCase.CaseMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MultipleInputProcess implements Process {
    public static void multipleInputProcess(long firstInteger, long secondInteger) {
        for (long i = firstInteger; i < firstInteger + secondInteger; i++) {
            List<String> resultList = new ArrayList<>();
            for (CaseType caseType : CaseType.values()) {
                if (caseType.getCaseResult().result(i)) {
                    resultList.add(caseType.name().toLowerCase());
                }
            }
            StringBuilder comment = new StringBuilder(format.format(i) + " is ");
            resultList.forEach(result -> {
                comment.append(result);
                comment.append(", ");
            });
            String returnString = comment.toString();
            returnString = returnString.substring(0, returnString.length() - 2);
            System.out.println(returnString);
        }
    }

    public static void multipleInputAndPropertyProcess(long firstInteger, long secondInteger, Set<String> properties) {
        List<Long> integerList;
        boolean input = true;
        for (String property : properties) {
            if (property.startsWith("-") && properties.contains(property.substring(1))) {
                System.out.println("The request contains mutually exclusive properties: [" + property.toUpperCase()
                        + ", " + property.substring(1).toUpperCase() + "]");
                System.out.println("There are no numbers with these properties.");
                input = false;
                properties.clear();
                break;
            }

            if (properties.contains(CaseMap.getExclusiveMap().get(property.toLowerCase()))) {
                String key = property;
                String value = CaseMap.getExclusiveMap().get(property.toLowerCase());
                System.out.println("The request contains mutually exclusive properties: [" + key.toUpperCase() + ", "
                        + value.toUpperCase() + "]");
                System.out.println("There are no numbers with these properties.");
                input = false;
                properties.clear();
                break;
            }
        }

        if (input) {
            integerList = formIntegerArray(firstInteger, secondInteger, properties);
            properties.clear();
            integerList.forEach(integer -> {
                multipleInputProcess(integer, 1);
            });
        }
    }

    private static List<Long> formIntegerArray(Long firstInteger, Long secondInteger, Set<String> properties) {
        int i = 0;
        List<Long> integerList = new ArrayList<>();
        List<String> invalidProperties = new ArrayList<>();
        for (String property : properties) {
            if (property.startsWith("-")) {
                try {
                    CaseType.valueOf(property.substring(1).toUpperCase());
                } catch (IllegalArgumentException illegalArgumentException) {
                    invalidProperties.add(property);
                }
            } else {
                try {
                    CaseType.valueOf(property.toUpperCase());
                } catch (IllegalArgumentException illegalArgumentException) {
                    invalidProperties.add(property);
                }
            }
        }
        if (invalidProperties.size() == 1) {
            String property = invalidProperties.get(0);
            System.out.println("The property [" + property.toUpperCase() + "] is wrong.");
            System.out.println(
                    "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD, JUMPING, HAPPY, SAD]");
            return integerList;
        } else if (invalidProperties.size() > 1) {
            StringBuilder stringBuilder = new StringBuilder("The properties [");
            for (String invalidProperty : invalidProperties) {
                stringBuilder.append(invalidProperty);
                stringBuilder.append(", ");
            }
            stringBuilder.setLength(stringBuilder.length() - 2);
            stringBuilder.append("] are wrong.");
            System.out.println(stringBuilder);
            System.out.println(
                    "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD, JUMPING, HAPPY, SAD]");
            return integerList;
        }
        OUTERLOOP:
        while (secondInteger > 0) {
            for (String property : properties) {
                if (property.startsWith("-")
                        && CaseType.valueOf(property.substring(1).toUpperCase())
                                .getCaseResult()
                                .result(firstInteger + i)) {
                    i++;
                    continue OUTERLOOP;
                } else if (!property.startsWith("-")
                        && !CaseType.valueOf(property.toUpperCase())
                                .getCaseResult()
                                .result(firstInteger + i)) {
                    i++;
                    continue OUTERLOOP;
                }
            }
            integerList.add(firstInteger + i);
            i++;
            secondInteger--;
        }
        return integerList;
    }
}
