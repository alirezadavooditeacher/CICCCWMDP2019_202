package assignment8.problem6;

import java.util.ArrayList;
import java.util.List;

public class ApplicationDriver {
	public static void main(String[] args) {
		ListManage listManage = new ListManage();
		GenericList genericList = new GenericList();
		genericList.addObserver(listManage);
		List<String> listString = new ArrayList<>();
		genericList.change(listString, "add");
		genericList.change(listString, "add");
	}

}
