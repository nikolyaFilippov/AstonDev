package Animals;

public class Fish extends Animal implements Water{

    public Fish(String name, int age, int weight) {
        super(name, age,weight);
        }

    @Override
    public void water() {
        System.out.println("Плавю и дышу в воде");
    }
    public void whoAmI(){
        System.out.println("Я "+getName()+" мне "+getAge()+" лет, мой вес "+getWeight()+", я ");
        water();
    }
}
