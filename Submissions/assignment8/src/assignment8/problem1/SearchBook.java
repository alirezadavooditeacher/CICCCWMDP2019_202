package assignment8.problem1;

public class SearchBook {
	public Page[] search(Book book) {
		Page[] arrPage = new Page[200];
		int i = 0;
		for (Page page : book.page) {
			if(page != null && page.getPageNumber()%2==0 && page.isHasImage()) {
				arrPage[i] = page;
				i++;
			}
		}
		return arrPage;
		
	}
}
