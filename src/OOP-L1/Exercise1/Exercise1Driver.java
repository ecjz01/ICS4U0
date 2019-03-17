/**
 * Enfei Zhang
 * Ms. Krasteva
 * February 12, 2018
 * This is a program that creates objects using the House, Car1, Animal and Student class
 *
 * Variable Dictionary
 * Name         Type       Purpose
 * Lamborghini  Car1        Car1 object
 * Mazda        Car1        Car1 object
 * Ford         Car1        Car1 object
 * Infinity     Car1        Car1 object
 * BMW          Car1        Car1 object
 * House1       House      House object
 * Home         House      House object
 * Neighbour    House      House object
 * House2       House      House object
 * House3       House      House object
 * Dog          Animal     Animal object
 * Cat          Animal     Animal object
 * Horse        Animal     Animal object
 * Elephant     Animal     Animal object
 * Mouse        Animal     Animal object
 * Children     Student[]  Student object
 * Class        Student[]  Student object
 * totAvg       double     variable to store the total averages of the students
 */
public class Exercise1Driver{
    /**
     * The first for loop sets the marks for the first 5 students
     * The second for loop moves the students from the Children array to the Class array
     * The third for loop Goes through the Class array
     * The if statement checks if there is a student in that spot in the array
     */
    public static void main(String[] args) {
        //Objects in the Exercise1.Car1 class
        Car1 Lamborghini = new Car1("Lamborghini", "Miura", 2450,4900);
        Car1 Mazda = new Car1("Mazda", "5", 500, 60000);
        Car1 Ford = new Car1("Ford", "Explorer", 35200, 70400);
        Car1 Infinity = new Car1("Infinity", "Q50", 37500, 75000);
        Car1 BMW = new Car1("BMW", "I8", 21000, 42000);
        Lamborghini.drive(20);
        Lamborghini.gasUp();
        //Objects in the Exercise1.House class
        House House1 = new House (123, "Sesame", "Toronto", "Ontario", "M6M 9L4",50000, false, 1);
        House Home = new House (39, "Touchstone", "Toronto", "Ontario", "M6M 5L1",35000, true, 3);
        House Neighbour = new House (41, "Touchstone", "Toronto", "Ontario", "M6M 5L1",30000, true, 3);
        House House2 = new House (41, "Keele", "Toronto", "Ontario", "M6M 5L1",20000, true, 2);
        House House3 = new House (20, "Tillpain", "Toronto", "Ontario", "M3H 5R2", 100000, true, 2);
        House1.displayAddress();
        //Objects in the Exercise1.Animal class
        Animal Dog = new Animal ("Dog", 60);
        Animal Cat = new Animal ("Cat", 40);
        Animal Horse = new Animal ("Horse", 100);
        Animal Elephant = new Animal ("Elephant", 5000);
        Animal Mouse = new Animal("Mouse", 5);
        Cat.feed("meat");
        Dog.sleep();
        //Objects in the Student class
        Student Children[] = new Student [5];
        Children[0]= new Student("Steve");
        Children[1]= new Student("Bob");
        Children[2]= new Student("Jim");
        Children[3]= new Student("Jeff");
        Children[4]= new Student("Po");
        for (int x = 0; x < Children.length; x++){
            Children [x].setMarks((int)(Math.random()*100), (int)(Math.random()*100));
        }
        Student Class [] = new Student [10];
        for (int x = 0; x < Children.length; x++){
            Class[x] = Children[x];
        }
        Class [8] = new Student ("John");
        Class [8].setMarks((int)(Math.random()*100), (int)(Math.random()*100));
        double totAvg = 0.0;
        for (int x = 0; x < Class.length; x++){
            if (Class[x] != null) {
                Class[x].calcAverage();
                System.out.println(Class [x].message());
                totAvg = totAvg + Class[x].average;
            }
        }
        System.out.println("The average of all the students is " + totAvg/6 +"!");
    }
}
