package Mechanisms;

public class Helicopter extends Vehicle implements CarriesCargo, Propeller, Wheels {
    private String color;


    public Helicopter(String name, String color){
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

    public void whoAmI(){
        carriesCargo();
        propeller();
        wheelsVehicle();
        System.out.println("Я "+ color+" "+getName()+" Вертолет");
    }
}
