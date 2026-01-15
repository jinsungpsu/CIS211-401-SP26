public class Pokemon {
    private int attack, defense;
    private String name;

    public Pokemon() {

    }

    public Pokemon(int attack, int defense, String name) {
        this.attack = attack;
        this.defense = defense;
        this.name = name;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class PokemonBattle {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();

        p1.setName("Pikachu");
        p1.setAttack(100);
        p1.setDefense(50);

        Pokemon p2 = new Pokemon(200, 500, "Raichu");

    }
}
