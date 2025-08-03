package sk.train.client_generated;

import sk.train.generated.ExceptionService;
import sk.train.generated.ExceptionServiceService;
import sk.train.generated.IOException_Exception;
import sk.train.generated.KarrerException1_Exception;
import sk.train.generated.KarrerException2;
import sk.train.generated.SampleMessage;

public class Exception_Client {
	
	public static void main(String[] args) throws SampleMessage {
		
		ExceptionServiceService service = new ExceptionServiceService();
		
		ExceptionService proxy = service.getExceptionServicePort();
		
		System.out.println("Invoking sayInt...");
        for (int i = 0; i < 6; i++) {
			
			try {
				int _sayInt__return = proxy.sayInt(i);
				System.out.println("\n sayInt.result=" + _sayInt__return);

			} catch (KarrerException1_Exception e) {
				System.out.println("\n Expected exception: KarrerException1 has occurred.");
				System.out.println(e.toString());
				System.out.println(e.getFaultInfo());
			} catch (KarrerException2 e) {
				System.out.println("\n Expected exception: KarrerException2 has occurred.");
				System.out.println(e.toString());
				System.out.println(e.getFaultInfo());
			} catch (IOException_Exception e) {
				System.out.println("\n Expected exception: IOException has occurred.");
				System.out.println(e.toString());
			} catch (RuntimeException e) {
				System.out.println("\n Expected exception: RuntimeException has occurred.");
				System.out.println(e.toString());
			} catch (SampleMessage e) {
				System.out.println("\n Expected exception: KarrerException3 alias SampleMessage has occurred.");
				System.out.println(e.toString());
				System.out.println(e.getFaultInfo().getInfo());
			}
		}
        
		System.exit(0);
	}
	

}
