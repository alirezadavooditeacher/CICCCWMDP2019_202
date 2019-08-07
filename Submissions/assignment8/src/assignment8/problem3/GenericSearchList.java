package assignment8.problem3;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import assignment8.problem1.Page;

public class GenericSearchList {
	public <T> List<Page[]> search(T object) {
		List<Page[]> listarrPage = new ArrayList<>();
		Page[] arrPageResult = new Page[200];
		Page[] arrPage = new Page[200];
		Field field;
		try {
			field = object.getClass().getField("page");
			field.setAccessible(true);
			Page[] page = (Page[]) field.get(object);
			
			int i = 0;
			int j = 0;
			for (Page item : page) {
				if(item != null && item.getPageNumber()%2==0 && item.isHasImage()) {
					arrPageResult[i] = item;
					i++;
				}
				if(item != null) {
					arrPage[j] = item;
					j++;
				}
			}
			
			listarrPage.add(arrPageResult);
			listarrPage.add(arrPage);
			return listarrPage;
		} catch (Exception e) {
			return null;
		}
		
		
	}

}
