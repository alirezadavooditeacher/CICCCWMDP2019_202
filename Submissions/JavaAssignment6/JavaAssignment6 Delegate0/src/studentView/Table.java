package studentView;

public class Table {
    private TableProvider delegate;

    public TableProvider getDelegate(){
        return delegate;
    }
    public void setDelegate(TableProvider delegate) {
        this.delegate = delegate;
    }

    public void show () {
        int numberOfRows = delegate.rows();

        drawLine();
        for (int i = 0; i < numberOfRows; i++) {
            String data = delegate.data(i);
            int height = delegate.height(i);
            System.out.println(data);
            drawLine();
        }
    }

    private void drawLine() {
        System.out.println("-------------------------------");
    }
}
