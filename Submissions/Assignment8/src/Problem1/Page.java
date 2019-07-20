package Problem1;

public class Page {
    private int pageNum;
    private boolean hasImage;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public boolean isHasImage() {
        return hasImage;
    }

    public void setHasImage(boolean hasImage) {
        this.hasImage = hasImage;
    }

    public Page(int pageNum, boolean hasImage) {
        this.pageNum = pageNum;
        this.hasImage = hasImage;
    }
}
