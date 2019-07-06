public class Main {

    public static void main(String[] args) {
        Table table = new Table();
        View v = new View();
        table.setDelegate(v);
        table.render();
    }
}
