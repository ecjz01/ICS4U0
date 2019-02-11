package Evaluation;

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
        //Objects from Car class
        Car Mazda = new Car("Mazda", "5", 500, 60000);
        Car BMW = new Car ("BMW", "I8", 21000, 42000);
        Mazda.drive(20);
        System.out.println(Mazda.getInfo());
        Mazda.gasUp();
    }
}
