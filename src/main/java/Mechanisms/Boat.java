package Mechanisms;

public class Boat extends Vehicle implements CarriesCargo, Propeller {
    private String color;


    public Boat(String name, String color){
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

    public void whoAmI(){
        carriesCargo();
        propeller();
        System.out.println("Я "+ color+" "+getName()+" Катер");
    }
}
