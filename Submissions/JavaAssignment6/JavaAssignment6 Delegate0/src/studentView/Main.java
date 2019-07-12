package studentView;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();
        View view = new View();

        view.students.add(new Student("Dennis", "Balmer", 88.00d));
        view.students.add(new Student("Alfred", "Bombe", 40.23d));
        view.students.add(new Student("Lucifer", "Mornigstar", 23.78d));
        view.students.add(new Student("Marah", "Huebschi", 99.99d));


        table.setDelegate(view);
        table.show();

        System.out.println(view.rows());
    }
}
