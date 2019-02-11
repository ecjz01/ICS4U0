package Evaluation;

public class EvaluationDriver {
    public static void main(String[] args) {
        //Objects from Bank_Account class
        Bank_Account John = new Bank_Account(123456789, 90000.55, "savings", 0.04F);
        John.getType();
        John.deposit(20000.54);
        John.applyInterest();
        John.withdrawal(25000.90);
        John.getBalance();
        //Objects from Car class
        Car Mazda = new Car("Mazda", "5", 500, 60000);
        Mazda.drive(20);
        Mazda.getInfo();
        Mazda.gasUp();
    }
}
