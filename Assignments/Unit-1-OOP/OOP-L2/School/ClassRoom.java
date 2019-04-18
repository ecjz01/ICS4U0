public class ClassRoom {
    String course;
    String teacher;

    ClassRoom(String course, String teacher){
        this.course = course;
        this.teacher = teacher;
    }

    public boolean enter (Student me){
        if (me.myLocker == null)
            me.sendToOffice("does not have a locker");

        return true;
    }
}
