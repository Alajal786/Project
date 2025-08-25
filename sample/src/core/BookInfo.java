package core;

import java.util.HashMap;
import java.util.Map;

public class BookInfo {

	private HashMap<Integer, Book> bookMap;

	public BookInfo() {
		bookMap = new HashMap<>();
		
	}
	
		public void addBook(Book book)
		{
			bookMap.put(book.getId(), book);
	}

		public Book getBookById(int id) {
			return bookMap.get(id);
			
		}
		public void displayAllBooks() {
			for(Book book: bookMap.values() ) {
				System.out.println(book);
			}
		}
}
