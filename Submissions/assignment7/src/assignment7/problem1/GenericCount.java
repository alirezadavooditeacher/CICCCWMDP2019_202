package assignment7.problem1;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Field;
import java.util.List;

public class GenericCount<T> {
	private List<T> listData;
	
	
	public GenericCount(List<T> listData) {
		this.listData = listData;
	}



	public List<T> getlistData() {
		return listData;
	}



	public void setlistData(List<T> listData) {
		this.listData = listData;
	}


	public <K> int countNumberOfElementsWithSpecificProperty(String keyCount, K valueCount) throws IllegalArgumentException, IllegalAccessException {
		int count = 0;
		
		// for list data can dem 
		for (T data : listData) {
			// lay tat ca cac fiead cua object duoc truyen vao
			Field[] fields = data.getClass().getDeclaredFields();
			//kiem tra voi key field can dem duoc truyen vao
			for (Field field : fields) {
				if(keyCount.equals(field.getName())) {
					field.setAccessible(true);
					
					if(valueCount.equals(field.get(data))) {
						count++;
					}
					
					
				}
			}
			
		}
		return count;
	}

}
