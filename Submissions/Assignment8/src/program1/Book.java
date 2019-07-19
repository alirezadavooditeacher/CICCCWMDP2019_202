package program1;

import java.util.ArrayList;
import java.util.Iterator;

public class Book implements Iterable<Page>{
	

	
	String title;
	String category;
	public enum BookCategory {
		Science, History, Food, IT, Engineering, Novel
		};
		
	ArrayList<Page> pageArray;
	
	
	
	
	public Book(String title, String category, ArrayList<Page> pageArray) {
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



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
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
