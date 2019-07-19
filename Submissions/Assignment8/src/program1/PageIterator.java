package program1;

import java.util.ArrayList;
import java.util.Iterator;



public class PageIterator implements Iterator<Page>{
	ArrayList<Page> pArray;
	int indexx;
	
	
	public PageIterator(ArrayList<Page> pArray) {
		super();
		this.pArray = pArray;
		this.indexx = 0;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		
		if(this.indexx<this.pArray.size()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Page next() {
		// TODO Auto-generated method stub
		if(this.hasNext()) {
			Page p = this.pArray.get(indexx);
			this.indexx++;
			return p;
		}
		else {return null;
		}
		}
	
}
