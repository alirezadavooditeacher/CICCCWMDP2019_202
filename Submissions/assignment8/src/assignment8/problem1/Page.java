package assignment8.problem1;

public class Page {
	private int pageNumber;
	private boolean hasImage;
	
	
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
	
	public Page(int pageNumber, boolean hasImage) {
		this.pageNumber = pageNumber;
		this.hasImage = hasImage;
	}
	public Page() {

	}
	
	
	
	
	
}
