package sk.train;

import javax.inject.Inject;

//import sk.train.sample.EmptyIf;

public class BookService {
	
	@Inject
	@ISBN
	private NumberGenerator numberGenerator;
	
//	@Inject
//	private EmptyIf m;

	public Book createBook(String title, Float price, String description) {
		Book book = new Book(title, price, description);
		book.setNumber(numberGenerator.generateNumber());
		return book;
	}
}
