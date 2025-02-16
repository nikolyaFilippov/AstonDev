package Animals;

public class Bear extends Mammal implements Wool {
    private String forest;

    public Bear(String name, int age, String forest){
        super(name, age);
        this.forest = forest;
    }

    @Override
    public void wool() {
        System.out.println("Есть шерсть");
    }
    public void whoAmI(){
        System.out.println("Я "+getName()+" мне "+getAge()+" лет, мой дом "+forest+" у меня ");
        wool();
    }
}
