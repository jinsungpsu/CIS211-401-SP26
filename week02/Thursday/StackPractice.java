import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<Pokemon> pokemonStack = new Stack<>();
        pokemonStack.push(new Pokemon("Pikachu"));
        pokemonStack.push(new Pokemon("Raichu"));
        System.out.println(pokemonStack);

        System.out.println("We popped: " + pokemonStack.pop());

        System.out.println(pokemonStack);
    }


}
class Pokemon {
    private String name;

    public Pokemon(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                '}';
    }
}
