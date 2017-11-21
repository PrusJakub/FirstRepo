package Package;

class Main {
    public static void main(String[] args) {
       HashMapExercises HMexercise = new HashMapExercises();
        HashSetExercises HSset = new HashSetExercises();
        HMexercise.firstMap.put(1,"Ania");
        HMexercise.firstMap.put(2,"Kamil");
        HMexercise.firstMap.put(3,"Andrzej");
        HSset.mySet.add("Amadeusz");
        HSset.mySet.add("Arkadiusz");
        HSset.mySet.add("Wojciech");
        HSset.mySet.add("Tomasz");

        HMexercise.ex3();
        HMexercise.ex7();
        HMexercise.ex8();
        HMexercise.ex11();
        HMexercise.ex12();

        HSset.ex2();
        HSset.ex3();
        HSset.ex6();
        HSset.mySet.add("Krzysztof");
        HSset.ex10();

    }


}
