public class Jacket {
    Student owner;

    Jacket (Student me){
        owner = me;
    }

    public String toString(){
        return owner.toString();
    }
}
