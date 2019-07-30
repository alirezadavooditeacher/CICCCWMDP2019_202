package program1;

import java.util.ArrayList;
import java.util.Iterator;

public class Book implements Iterable<Page>{
	

	
	String title;
	
	public enum BookCategory {
		Science, History, Food, IT, Engineering, Novel
		};
	BookCategory category;
	ArrayList<Page> pageArray;
	
	
	
	
	public Book(String title, BookCategory category, ArrayList<Page> pageArray) {
		super();
		this.title = title;
		this.category = category;
		this.pageArray = pageArray;
	}



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



	public ArrayList<Page> getPageArray() {
		// TODO Auto-generated method stub
		return this.pageArray;
	}



	@Override
	public Iterator<Page> iterator() {
		// TODO Auto-generated method stub
		PageIterator pi = 
				new PageIterator(this.pageArray);
		return pi;
	};
	

}
