//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args) {



        // primitive types
        int num = 5;
        int num2 = num;

        // reference types
        Pokemon p1;
        p1 = new Pokemon();
        new Pokemon();
        Pokemon p2 = p1;

    }
}

class Person {
    int age;
    String name;
    Person mom;
}

class Pokemon {
    int hp, attack, defense;
    Pokemon poke; // ref vars are 4 or 8 bytes depending on JVM (according to gemini)

    public Pokemon() {
        System.out.println("A pokemon is born!!!");
    }

}
