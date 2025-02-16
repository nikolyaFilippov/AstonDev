public class Main {
    public static void main(String[] args) {
        Airplane air = new Airplane("аэробус а330-300","белый");
        air.whoAmI();
        Helicopter hel = new Helicopter("ми 24","хаки");
        hel.whoAmI();
        Boat boa = new Boat("Sea Ray 190 SPX/489","красный");
        boa.whoAmI();
        Tanker tan = new Tanker("General Dynamics NASSCO","черный");
        tan.whoAmI();
        Truck tr = new Truck("Маз","Синий");
        tr.whoAmI();
        Taxi taxi = new Taxi("Mazda","Желтый");
        taxi.whoAmI();
    }
}
