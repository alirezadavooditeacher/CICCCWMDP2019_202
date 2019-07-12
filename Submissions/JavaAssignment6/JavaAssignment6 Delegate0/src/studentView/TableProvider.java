package studentView;

public interface TableProvider {
    public int rows();
    public String data(int index);
    public int height(int index);
}
