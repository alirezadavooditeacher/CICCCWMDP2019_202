import Models.Book;
import Models.Page;

public class SearchBook {


	public int SearchBook(Book book) {
		int pagesWithImages = 0;
        int pageCount = 0;
        for (Page el: book) {
            if (el.isHasImage() & isEven(pageCount)) {
                pagesWithImages += 1;
            }
            pageCount += 1;
        }

        return pagesWithImages;
    }
	
	public boolean isEven(int number) {
		return number%2==0 ? true : false;
	}
	
	

}