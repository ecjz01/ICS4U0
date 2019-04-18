public class Student {
    String number;
    String name;
    Locker myLocker;
    Jacket myJacket;
    Book books[];

    Student(String name){
        this.name = name;
        myJacket = new Jacket(this);
        myLocker = new Locker(this);
        books = new Book[4];
    }

    public void sendToOffice(String reason){
        System.out.println(name + "was sent to the office because he/she" + reason);
    }

    public String toString(){
        return name;
    }
}
