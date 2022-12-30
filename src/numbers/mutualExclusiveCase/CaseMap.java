package numbers.mutualExclusiveCase;

import java.util.HashMap;
import java.util.Map;

public class CaseMap {

    private static Map<String, String> map = new HashMap<>();


    static {
        map.putIfAbsent("odd","even");
        map.putIfAbsent("even","odd");
        map.putIfAbsent("duck","spy");
        map.putIfAbsent("spy","duck");
        map.putIfAbsent("sunny","square");
        map.putIfAbsent("square","sunny");
        map.putIfAbsent("sad","happy");
        map.putIfAbsent("happy","sad");
        map.putIfAbsent("-odd","-even");
    }

    public static Map<String,String> getExclusiveMap(){
        return map;
    }









}
