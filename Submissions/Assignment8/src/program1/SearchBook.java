package program1;

import java.util.ArrayList;
import java.util.Iterator;

public class SearchBook {
	
	public int search(Book book) {
//		ArrayList<Page> bPages = 
				book.getPageArray();
		Iterator<Page> it = 
				 book.iterator();
		int evenImagePages = 0;
		while (it.hasNext()) {
			Page pag = it.next();
			if (pag.getPageNumber()%2==0
					&& pag.isHasImage())
				evenImagePages++;
		}
		return evenImagePages;
	}

}
