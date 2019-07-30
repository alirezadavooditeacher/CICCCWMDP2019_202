package program1;

import java.util.ArrayList;

public class AppDriver {
	
	public static void main(String[] args) {
		
		Page p1 = new Page(1,false);
		Page p2 = new Page(2,true);
		Page p3 = new Page(3,false);
		Page p4 = new Page(4,false);
		Page p5 = new Page(5,true);
		Page p6 = new Page(6,true);
		
		ArrayList<Page> pagesArray= new ArrayList<Page>();
		pagesArray.add(p1);
		pagesArray.add(p2);
		pagesArray.add(p3);
		pagesArray.add(p4);
		pagesArray.add(p5);
		pagesArray.add(p6);
		
		Book aBook = new Book("History of Time", Book.BookCategory.Science, 
				pagesArray);
		
		SearchBook asb = new SearchBook();
		int evenImagePages = asb.search(aBook);
		
		System.out.println("The number of even pages with images is : "
				+ evenImagePages);
		
		
	}

}
