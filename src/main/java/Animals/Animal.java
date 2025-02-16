package Animals;

public class Animal extends Mammal{
        private int weight;

    public Animal(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;

    }

    public int getWeight() {
        return weight;
    }

}
