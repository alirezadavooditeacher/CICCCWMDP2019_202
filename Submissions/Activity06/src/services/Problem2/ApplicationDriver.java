package services.Problem2;

public class ApplicationDriver {
    public static void main(String[] args) {
        Student s1 = new Student("Marcus", "Araki", "89");
        Student s2 = new Student("Chris", "Frank", "76");
        Student s3 = new Student("Marvin", "Gay", "70");
        View view = new View();
        view.addStudents(s1);
        view.addStudents(s2);
        view.addStudents(s3);
        Table table = new Table();
        table.setView(view);
        table.renderStudentsTable();
    }
}
