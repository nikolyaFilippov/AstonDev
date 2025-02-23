package Mechanisms;

public class Tanker extends Vehicle implements CarriesCargo, Propeller {
    private String color;


    public Tanker(String name, String color){
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
        System.out.println("Я "+ color+" "+getName()+" Танкер");
    }
}