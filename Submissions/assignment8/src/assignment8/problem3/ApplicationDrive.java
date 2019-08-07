package assignment8.problem3;

import java.util.List;

import assignment8.problem1.Book;
import assignment8.problem1.BookCategory;
import assignment8.problem1.Page;
import assignment8.problem1.SearchBook;

public class ApplicationDrive {
	
	public static void main(String[] args) {
		// set data book
		Page[] arrPage = new Page[200];
		Page page;
		for (int i = 0; i < 20; i++) {
			if(i%2==0) {
				page = new Page(i, true);
			}
			else {
				page = new Page(i, false);
			}
			arrPage[i] = page;
		}
		
		Book book = new Book("clear code",BookCategory.IT, arrPage);
		
		GenericSearchList genericSearchList = new GenericSearchList();
		List<Page[]>searchResult = genericSearchList.search(book);
		System.out.println("-------Search result----------");
		for (Page page2 : searchResult.get(0)) {
			if(page2!=null) {
				System.out.println(page2.getPageNumber() + " / "+page2.isHasImage());
			}
			
		}
		System.out.println("-------data search----------");
		for (Page page2 : searchResult.get(1)) {
			if(page2!=null) {
				System.out.println(page2.getPageNumber() + " / "+page2.isHasImage());
			}
			
		}
	}

}
