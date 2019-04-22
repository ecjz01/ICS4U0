public class Locker {
    int number;
    Student owner;
    private Jacket studentJacket;
    private Book books[];

    Locker(Student me){
        owner = me;
        number = (int)Math.random() * 1000 + 1;
        books = new Book[4];
    }

    public Book getABook (String course){

        return books[0];
    }

    public void putABook (Book book){

    }

    public Jacket getJacket(){
        return studentJacket;
    }

    public Jacket checkJacket(){
        return studentJacket;
    }

    public void putJacket(Jacket thisJacket){
        studentJacket = thisJacket;
    }

    public String toString(){
        return number + " belongs to " + owner.toString();
    }
}
