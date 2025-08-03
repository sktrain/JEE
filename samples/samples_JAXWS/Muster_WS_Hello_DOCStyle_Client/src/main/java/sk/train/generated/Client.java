package sk.train.generated;

public class Client {

	public static void main(String[] args) {
		
      HelloWorldService service = new HelloWorldService();
      
      HelloWorldIf stub = service.getHelloWorldPort();
      
      String result = stub.sayHello("otto");
      
      System.out.println(result);
      
      System.out.println(stub.sayDateasString());
      
      System.out.println(stub.sayDate());

	}

}
