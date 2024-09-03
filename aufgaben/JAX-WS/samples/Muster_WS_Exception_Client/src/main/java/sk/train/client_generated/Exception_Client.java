package sk.train.client_generated;


import java.io.IOException;

import sk.train.ExceptionService;
import sk.train.ExceptionServiceService;
import sk.train.IOException_Exception;
import sk.train.KarrerException1;
import sk.train.KarrerException2;


public class Exception_Client {
	
	public static void main(String[] args) {
		
		ExceptionServiceService service = new ExceptionServiceService();
		
		ExceptionService proxy = service.getExceptionServicePort();
		
		System.out.println("Invoking sayInt...");
        for (int i = 0; i < 5; i++) {
			
			try {
				int _sayInt__return = proxy.sayInt(i);
				System.out.println("sayInt.result=" + _sayInt__return);

			} catch (KarrerException1 e) {
				System.out.println("Expected exception: KarrerException1 has occurred.");
				System.out.println(e.toString());
				System.out.println(e.getFaultInfo());
			} catch (KarrerException2 e) {
				System.out.println("Expected exception: KarrerException2 has occurred.");
				System.out.println(e.toString());
				System.out.println(e.getFaultInfo());
			} catch (IOException_Exception e) {
				System.out.println("Expected exception: IOException has occurred.");
				System.out.println(e.toString());
			} catch (RuntimeException e) {
				System.out.println("Expected exception: RuntimeException has occurred.");
				System.out.println(e.toString());
			} 
		}
		System.exit(0);
	}
	

}
