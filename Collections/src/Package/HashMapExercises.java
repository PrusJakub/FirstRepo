package Package;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HashMapExercises {
    final Map<Integer, String> firstMap = new HashMap<>();
    private final Map<Integer, String> secondMap = new HashMap<>();


    //HashMap zadanie nr 3
    void ex3() {
        System.out.println(firstMap);
        System.out.println(secondMap);
        secondMap.putAll(firstMap);
        System.out.println("Druga mapa po kopii pierwszej: " + secondMap);
    }

    //HashMap zadanie nr 7
    void ex7()
    {
        boolean ifContainsKey;
        int key = 2;
        ifContainsKey = firstMap.containsKey(key);
        System.out.println("Czy mapa zawiera element o wskazanym kluczu? " + ifContainsKey);
    }

    //HashMap zadanie nr 8
    void ex8() {
        boolean ifContainsValue;
        String value = "Ania";
        ifContainsValue = firstMap.containsValue(value);
        System.out.println("Czy mapa zawiera wskazany element? " + ifContainsValue);
    }

    //HashMap zadanie nr 11
    void ex11() {
        Set<Integer> set = firstMap.keySet();
        System.out.println(set);
    }

    //HashMap zadanie nr 12
    void ex12() {
        Collection<String> coll = firstMap.values();
        System.out.println(coll);
    }
}
