package assignment8.problem2;

import java.lang.reflect.Field;

import assignment8.problem1.Page;

public class GenericSearch {

	
	public <T> Page[] search(T object) {
		Page[] arrPage = new Page[200];
		Field field;
		try {
			field = object.getClass().getField("page");
			field.setAccessible(true);
			Page[] page = (Page[]) field.get(object);
			
			int i = 0;
			for (Page item : page) {
				if(item != null && item.getPageNumber()%2==0 && item.isHasImage()) {
					arrPage[i] = item;
					i++;
				}
			}
			return arrPage;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}

}
