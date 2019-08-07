package assignment8.problem1;

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
		
		SearchBook searchBook = new SearchBook();
		Page[] searchResult = searchBook.search(book);
		for (Page page2 : searchResult) {
			if(page2!=null) {
				System.out.println(page2.getPageNumber());
				System.out.println(page2.isHasImage());
			}
			
		}
	}

}
