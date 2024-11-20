package sk.train.client;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;
import sk.train.gen.HelloWorldIf;
import sk.train.gen.HelloWorldService;
import sk.train.gen.SayDateasStringResponse;
import sk.train.gen.SayHelloResponse;

public class Client {

	public static void main(String[] args) {
		
		HelloWorldService service = new HelloWorldService();
		
		HelloWorldIf stub = service.getHelloWorldPort();
		
		Response<SayHelloResponse> future = stub.sayHelloAsync("Karl");
		System.out.println(future.getClass()  + " ist vom Typ Future: " + (future instanceof Future));
		try {
			SayHelloResponse s = future.get(20, TimeUnit.SECONDS);
			System.out.println(s.getReturn());
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		if (future.isDone()) {
//			try {
//				String s = future.get().getReturn();
//				System.out.println(future.get().getReturn());
//			} catch (InterruptedException | ExecutionException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		stub.sayHelloAsync("Stephan", new MyHandler());
		
		//ein wenig Zeit geben:
		try {
			Thread.sleep(60_000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main ist terminating");
		
		
	}

	static class MyHandler implements AsyncHandler<SayHelloResponse> {

		public void handleResponse(Response<SayHelloResponse> future) {
			try {
				System.out.println(Thread.currentThread());
				String response = future.get().getReturn();
				System.out.println(response);
			} catch (Exception e) {
				System.err.println(e);
			}
		}
	}

}
