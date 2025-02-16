public class Taxi extends Vehicle implements Wheels {
    private String color;


    public Taxi(String name, String color){
        super(name);
        this.color = color;
    }

    @Override
    public void wheelsVehicle(){
        System.out.println("Есть колеса");
    }
    public void whoAmI(){
        wheelsVehicle();
        System.out.println("Я "+ color+" "+getName()+" Грузовик");
    }
}
