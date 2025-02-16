package Animals;

public class Cat extends Mammal implements Wool{
    private String house;

    public Cat(String name, int age, String house){
        super(name,age);
        this.house = house;
    }

    @Override
    public void wool() {
        System.out.println("есть шерсть");
    }
    public void whoAmI(){
        System.out.println("Я "+getName()+" мне "+getAge()+" лет, я живу в "+house+" у меня ");
        wool();
    }
}
