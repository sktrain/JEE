package sk.train;

import javax.inject.Inject;

public class BookService {
	
	@Inject
	@ISBN
	private NumberGenerator numberGenerator;
	
//	@Inject
//	private Murks m;

	public Book createBook(String title, Float price, String description) {
		Book book = new Book(title, price, description);
		book.setNumber(numberGenerator.generateNumber());
		return book;
	}
}
