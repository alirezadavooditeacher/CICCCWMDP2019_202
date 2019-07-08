package services.Problem2;

public class Table {
    // table doesn't care about Students information
    // just render the information of Students something

    private TableProvider delegate;

    public void setView(TableProvider view) {
        this.delegate = view;
    }

    public void renderStudentsTable() {
        int length = this.delegate.numberOfStudents();
        for (int i = 0; i < length; i++) {
            System.out.println("----------------------------");
//            int height = this.delegate.height(i);
            Student student = this.delegate.data(i);
            System.out.println(student.getFirstName() + " " + student.getLastName() + ", " + student.getGpa());
        }
        System.out.println("----------------------------");
    }
}
