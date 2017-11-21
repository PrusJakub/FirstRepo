package Package;

import java.util.HashSet;
import java.util.Set;

public class HashSetExercises {
    final Set<String> mySet = new HashSet<>();
    final Set<String> secondSet = new HashSet<>();
    void ex2() {
        int i = 1;
        for (String wlk : mySet) {
            System.out.println("Iteracja " + i++ + " Element: " + wlk);
        }
    }

    void ex3(){
        System.out.println(mySet.size());
    }

    void ex6(){
        secondSet.addAll(mySet);
        System.out.println(secondSet);
    }

    void ex10(){
        boolean ifContains = secondSet.containsAll(mySet);
        System.out.println(ifContains);
    }
}
