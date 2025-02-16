package Animals;

 public class Mammal extends Spine{
    private String name;


    public Mammal(String name, int age){
        super(age);
        this.name = name;
    }

     public String getName() {
         return name;
     }
 }
