package Exercise1;

public class Exercise1Driver{
    public static void main(String[] args) {
        //Objects in the Exercise1.Car class
        Car Lamborghini = new Car ("Lamborghini", "Miura", 2450,4900);
        Car Mazda = new Car ("Mazda", "5", 500, 60000);
        Car Ford = new Car ("Ford", "Explorer", 35200, 70400);
        Car Infinity = new Car ("Infinity", "Q50", 37500, 75000);
        Car BMW = new Car ("BMW", "I8", 21000, 42000);
        Lamborghini.drive(20);
        Lamborghini.gasUp();
        //Objects in the Exercise1.House class
        House House1 = new House (123, "Sesame", "Toronto", "Ontario", "M6M 9L4",50000, false, 1);
        House Home = new House (39, "Touchstone", "Toronto", "Ontario", "M6M 5L1",35000, true, 3);
        House Neighbour = new House (41, "Touchstone", "Toronto", "Ontario", "M6M 5L1",30000, true, 3);
        House House2 = new House (41, "Keele", "Toronto", "Ontario", "M6M 5L1",20000, true, 2);
        House1.displayAddress();
        //Objects in the Exercise1.Animal class
        //Objects in the Exercise1.Student class
    }
}
