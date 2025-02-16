package Animals;

public class Whale extends Mammal implements Water{
    private String tail;

    public Whale(String name, int age, String tail){
        super(name,age);
        this.tail = tail;
    }

    @Override
    public void water() {
        System.out.println("Плаваею в воде");
    }
    public void whoAmI(){
        System.out.println("Я "+getName()+" мне "+getAge()+" лет, у меня есть "+tail+", я ");
        water();
    }
}
