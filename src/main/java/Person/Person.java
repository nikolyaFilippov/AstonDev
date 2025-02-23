package Person;

 public class Person {

    private String name;

    public String getName() { return name; }

    public Person(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

     public void display() {

     }

     static class Student extends Person {
        private final String universityName;

        public Student(String name, String universityName) {
            super(name);
            this.universityName = universityName;
        }

        public Student(String name) {
            super(name);
            this.universityName = "СПБУ";
        }

        @Override
        public void display(){
            System.out.printf("Person.Student Name: %s \t University: %s \n", super.getName(), universityName);
        }
    }
}