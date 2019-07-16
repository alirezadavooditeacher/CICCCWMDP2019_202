package assignment8;

public class Page {
    private int pageNumber;
    private boolean hasImage;

    public Page(int pageNumber, boolean hasImage) {
        this.pageNumber = pageNumber;
        this.hasImage = hasImage;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public boolean getHasImage() {
        return this.hasImage;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setHasImage(boolean hasImage) {
        this.hasImage = hasImage;
    }

}
