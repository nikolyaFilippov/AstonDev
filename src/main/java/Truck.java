public class Truck extends Vehicle implements CarriesCargo,Wheels {
    private String color;


    public Truck(String name, String color){
        super(name);
        this.color = color;
    }

    @Override
    public void carriesCargo(){
        System.out.println("Вожу грузы");
    }
    @Override
    public void wheelsVehicle(){
        System.out.println("Есть колеса");
    }
    public void whoAmI(){
        carriesCargo();
        wheelsVehicle();
        System.out.println("Я "+ color+" "+getName()+" Грузовик");
    }
}
