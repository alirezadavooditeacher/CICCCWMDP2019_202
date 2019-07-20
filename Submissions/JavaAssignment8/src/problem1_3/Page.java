package problem1_3;

public class Page {
    private int pageNumber;
    private boolean hasImage;

    public Page(int pageNumber, boolean hasimage) {
        this.pageNumber = pageNumber;
        this.hasImage = hasimage;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public boolean hasImage() {
        return hasImage;
    }

    public void sethasImage(boolean hasimage) {
        this.hasImage = hasimage;
    }
    @Override
    public String toString() {
        return "Page{" +
                "pageNumber=" + pageNumber +
                ", hasImage=" + hasImage +
                '}';
    }
}
