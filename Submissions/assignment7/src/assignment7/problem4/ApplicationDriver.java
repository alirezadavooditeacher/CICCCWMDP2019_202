package assignment7.problem4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import assignment7.problem1.model.BookDto;

public class ApplicationDriver {

	public static void main(String[] args) {
		List<BookDto> lstBook = new ArrayList<BookDto>();
		lstBook.add(new BookDto("Dac nhan tam", "doi song", 1500));
		lstBook.add(new BookDto("Dac nhan tam1", "doi song1", 1600));
		GenericList<BookDto> genericList = new GenericList<BookDto>();
		
		// add item to the list
		System.out.println("----------add----------");
		genericList.addItemToList(lstBook, new BookDto("Dac nhan tam1", "doi song1", 1600));
		for (BookDto bookDto : lstBook) {
			System.out.println(bookDto.getName());
		}
		// remove item to list
		System.out.println("----------remove----------");
		genericList.removeItemFromTheList(lstBook, 1);
		for (BookDto bookDto : lstBook) {
			System.out.println(bookDto.getName());
		}
		
		// remove item to list
				System.out.println("----------search----------");
				List<BookDto> listSearch = genericList.performOperation(lstBook, "Dac nhan tam");
				for (BookDto bookDto : listSearch) {
					System.out.println(bookDto.getName());
				}
				

	}

}
