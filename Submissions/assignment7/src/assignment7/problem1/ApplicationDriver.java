package assignment7.problem1;

import java.util.*;

import assignment7.problem1.model.BookDto;
import assignment7.problem1.model.StudentDto;

public class ApplicationDriver {

	public static <T, K> void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		List<BookDto> lstBook = new ArrayList<>();
		lstBook.add(new BookDto("abc", "aaa", 1500));
		lstBook.add(new BookDto("aaa", "bbbb", 1600));
		// student 
		List<StudentDto> lstStudent = new ArrayList<>();
		lstStudent.add(new StudentDto("Nguyen Van A","CNTT", "12"));
		lstStudent.add(new StudentDto("Nguyen Van A","CNTT", "12"));
		
		
		GenericCount<BookDto> genericCount = new GenericCount<BookDto>(lstBook);
		int count = genericCount.countNumberOfElementsWithSpecificProperty("price", 1500f);
		count = genericCount.countNumberOfElementsWithSpecificProperty("name", "abc");
		System.out.println("count =  "+count);
		count = genericCount.countNumberOfElementsWithSpecificProperty("name", "aaa");
		System.out.println("count =  "+count);
		
		// count student
		GenericCount<StudentDto> genericCountStudent = new GenericCount<StudentDto>(lstStudent);
		count = genericCountStudent.countNumberOfElementsWithSpecificProperty("name", "Nguyen Van A");
		System.out.println("count =  "+count + " with name Nguyen Van A");

	}

}
