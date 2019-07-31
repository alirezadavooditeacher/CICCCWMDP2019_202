package program1;

public class Page {
	int pageNumber;
	boolean hasImage;
	
	public Page(int pageNumber, boolean hasImage) {
		super();
		this.pageNumber = pageNumber;
		this.hasImage = hasImage;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public boolean isHasImage() {
		return hasImage;
	}

	public void setHasImage(boolean hasImage) {
		this.hasImage = hasImage;
	}
	
	public String toString() {
		Integer pNumberInt = this.pageNumber;
		String pNumberStr = pNumberInt.toString();
		return pNumberStr;
	}
}
