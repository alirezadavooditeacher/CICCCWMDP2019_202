package Problem2;
public class ApplicationDriver {

    public static void main(String[] args) {
        Table table = new Table();
        View view = new View();
        
        view.students.add(new Student("Nuala", "Burns", 99.54d));
        view.students.add(new Student("Mikolaj", "Hirst", 75.76d));
        view.students.add(new Student("Monty", "Trujillo", 72.3d));
        view.students.add(new Student("Malikah", "Pierce", 76.8d));
        
        
        table.setDelegate(view);
        table.show();
        
        System.out.println(view.rows());
    }
}
