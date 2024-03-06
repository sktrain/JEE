package sk.train;

import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LoggingInterceptor {
	
	@AroundConstruct
	void logConstructor(InvocationContext ic) throws Exception {
		System.out.println("Konstruktor-Aufruf durch Thread: " + Thread.currentThread());
		ic.proceed();
	}
	
	@AroundInvoke
	Object logMethod(InvocationContext ic) throws Exception {
		System.out.println("Methoden-Aufruf: " + ic.getMethod().getName() + " durch Thread: " + Thread.currentThread());
		return ic.proceed();
	}

}
