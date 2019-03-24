/**
 * Enfei Zhang
 * Ms. Krasteva
 * February 12, 2018
 * This is a program that creates objects using the Bank_Account and Car1 classes
 *
 * Variable Dictionary
 * Name         Type            Purpose
 * John         Bank_Account    Bank_Account object
 * Jeff         Bank_Account    Bank_Account object
 * Mazda        Car1             Car1 object
 * BMW          Car1             Car1 object
 */
public class EvaluationDriver {
    public static void main(String[] args) {
        //Objects from Bank_Account class
        Bank_Account John = new Bank_Account(123456789, 90000.55, "savings", 0.04F);
        Bank_Account Jeff = new Bank_Account (987654321, 10000000000.99, "chequing", 0.06F);
        System.out.println(John.getType());
        John.deposit(20000.54);
        John.applyInterest();
        John.withdrawal(25000.90);
        System.out.println(John.getBalance());
        //Objects from Car1 class
        Car1 Mazda = new Car1("Mazda", "5", 500, 60000);
        Car1 BMW = new Car1("BMW", "I8", 21000, 42000);
        Mazda.drive(20);
        System.out.println(Mazda.getInfo());
        Mazda.gasUp();
    }
}
