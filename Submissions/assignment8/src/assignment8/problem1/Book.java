package assignment8.problem1;

public class Book {
	private String title;
	private BookCategory category;
	public Page[] page;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BookCategory getCategory() {
		return category;
	}
	public void setCategory(BookCategory category) {
		this.category = category;
	}
	public Book(String title, BookCategory category, Page[] page) {
		this.title = title;
		this.category = category;
		this.page = page;
	}
	public Book() {
		
	}
	
	
	
	

}
