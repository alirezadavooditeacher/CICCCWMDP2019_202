package assignment7.problem4;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

public class GenericList<T> {

	public void addItemToList(List<T> lstGeneric, T generic) {
		lstGeneric.add(generic);
	}

	public void removeItemFromTheList(List<T> lstGeneric, int index) {
		lstGeneric.remove(index);
	}

	public List<T> performOperation(List<T> lstGeneric, String textSearch) {
		return lstGeneric.stream().filter(item -> searchTextInObject(item, textSearch)).collect(Collectors.toList());
	}

	private boolean searchTextInObject(T object, String textSearch) {
		Field[] fields = object.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			try {
				if (field.get(object).toString().equals(textSearch)) {
					return true;
				}
			} catch (Exception e) {
				return false;

			}
		}
		return false;

	}

}
