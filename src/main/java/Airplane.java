public class Airplane extends Vehicle implements CarriesCargo,Propeller,Wheels,Wings {
    private String color;


    public Airplane(String name, String color){
        super(name);
        this.color = color;
    }

    @Override
    public void carriesCargo(){
        System.out.println("Вожу грузы");
    }
    @Override
    public void propeller(){
        System.out.println("Есть винт");
    }
    @Override
    public void wheelsVehicle(){
        System.out.println("Есть колеса");
    }
    @Override
    public void wings(){
        System.out.println("Есть крылья");
    }
    public void whoAmI(){
        carriesCargo();
        propeller();
        wheelsVehicle();
        wings();
        System.out.println("Я "+ color+" "+getName()+" Самолет");
    }
}
