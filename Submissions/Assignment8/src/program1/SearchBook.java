package program1;

import java.util.ArrayList;
import java.util.Iterator;

import program2.*;

public class SearchBook implements Query<Page>{
	
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

	@Override
	public boolean predicate(Page obj) {
		int pnumber = obj.getPageNumber();
		if(obj.isHasImage() && pnumber%2==0) {
			return true;
			}
		return false;
	}

}
