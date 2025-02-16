package Animals;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish("Лещ",2,4);
        fish.whoAmI();
        Whale whale = new Whale("Синий кит",15,"большой хвост");
        whale.whoAmI();
        Cat cat = new Cat("Мурзик", 4,"квартира");
        cat.whoAmI();
        Bear bear = new Bear("Бурый медведь",15,"тайга");
        bear.whoAmI();
    }

}
