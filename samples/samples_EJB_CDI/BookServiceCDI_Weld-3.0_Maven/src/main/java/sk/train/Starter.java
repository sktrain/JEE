package sk.train;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import sk.train.sample.TestClass;

public class Starter {
	public static void main(String[] args) {
		
//		//proprietaere Variante
//		Weld weld = new Weld();
//		WeldContainer container = weld.initialize();
//		//veraltet: funktioniert aber noch
//		//BookService bookService = container.instance().select(BookService.class).get();
//		BookService bookService = container.select(BookService.class).get();
//		Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
//		System.out.println(book);
//		weld.shutdown();
		
		//oder aber mit Standard-Variante (CDI 2.0)
		// start the container, retrieve a bean and do work with it
		try(SeContainer secontainer = SeContainerInitializer.newInstance().initialize()) {
			BookService myBean = secontainer.select(BookService.class).get();
			Book book1 = myBean.createBook("H2G2", 12.5f, "Geeky scifi Book");
			System.out.println(book1);
			
//			TestClass ts = secontainer.select(TestClass.class).get();
//			System.out.println(ts);
			

		}
			// shuts down automatically after the try with resources block.
	}
}
