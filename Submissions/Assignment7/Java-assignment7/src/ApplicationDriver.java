import java.util.ArrayList;

public class ApplicationDriver {

	public static <T> void main(String[] args) {
		
//		Problem 1:
//			Write a generic method to count the number of elements in a collection that have a specific
//			property (for example, Students with GPA above average, Books with specific categories). 
//			You need to:
//			• Define and implement a generic class with a generic method called:
//			  countNumberOfElementsWithSpecificProperty
//			• Design and implement a POJO class an element like Book, Student, Building, Account
//			  and define 3 properties for this class.
//			• Create an ApplicationDriver class (with a main method) and test your implementation.
//			• Note: You might need to create classes or interfaces in addition to the three classes
//			  mentioned above.
		
//		ArrayList<SearchObject> students = new ArrayList<SearchObject>();
//		SearchObject s1 = new Student("Ali", 21, 90);
//		SearchObject s2 = new Student("Taka", 32, 80);
//		SearchObject s3 = new Student("Li Gang", 15, 59);
//		SearchObject s4 = new Student("Vlad", 40, 70);
//		SearchObject s5 = new Student("Memo", 21, 82);
//		SearchObject s6 = new Student("Cedric", 22, 50);
//		SearchObject s7 = new Student("Shin",31, 65);
//		SearchObject s8 = new Student("Tatsya", 20, 75);
//		SearchObject s9 = new Student("Shota", 29, 0);
//		
//		students.add(s1);
//		students.add(s2);
//		students.add(s3);
//		students.add(s4);
//		students.add(s5);
//		students.add(s6);
//		students.add(s7);
//		students.add(s8);
//		students.add(s9);
//		
//		int foundNumber = GenericMethods.countNumberOfElementsWithSpecificProperty(students, 60);
//		System.out.println(foundNumber);
		
		
		//Problem2
//		Will the following class compile? If not, why?
//			public final class Algorithm {
//				public static <T> T max(T x, T y) {
//					return x > y ? x : y;
//				}
//			}
//		Answer: No,The operator > is undefined for the argument type(s) T, T
		
		//Problem3
//		Write a generic method to exchange the positions of two different elements in an array.
//		• Follow the same procedure as described in problem one. Just name the generic method
//		exchangeElements
//		int index = 1;
//		String[] cities = {"Tokyo", "Osaka", "Okinawa", "Nara", "Hokkaido"};
//		int arrayLength1 = cities.length;
//		for(String city: cities) {
//			System.out.println(index + ": " +city);
//			index++;
//		}
//		GenericMethods.exchangeElements(cities, arrayLength1);
//		Integer[] numbers = {1, 4, 65, 77, 100};
//		int arrayLength2 = numbers.length;
//		GenericMethods.exchangeElements(numbers, arrayLength2);
		
		//Problem4
//		Write a generic class with the following three methods and properties:
//		• The class has a generic property of type List.
//		• addItemToList: add a generic object to the list
//		• removeItemFromTheList: remove a generic object from the list
//		• performOperation: Performs an operation on the list and returns a list of all items which
//		satisfies a specific search criteria. If no item is found return null.
//		Note: Follow the same steps as defined in problem one.
		
		GenericMethods anyObjectList1 = new GenericMethods();
		anyObjectList1.addItemToList("Hello");
		anyObjectList1.addItemToList("World");
		anyObjectList1.addItemToList("Tokyo");
		ArrayList<T> resultList1 = anyObjectList1.performOperation("Tokyo");
		
		for (T x: resultList1) {
			System.out.println(x);
		}
		
		GenericMethods anyObjectList2 = new GenericMethods();
		anyObjectList2.addItemToList(4);
		anyObjectList2.addItemToList(3);
		anyObjectList2.addItemToList(6);
		anyObjectList2.addItemToList(10);
		anyObjectList2.removeItemFromTheList(3);
		ArrayList<T> resultList2 = anyObjectList2.performOperation(5);
		
		for (T x: resultList2) {
			System.out.println(x);
		}

		
		
	}
	
}
