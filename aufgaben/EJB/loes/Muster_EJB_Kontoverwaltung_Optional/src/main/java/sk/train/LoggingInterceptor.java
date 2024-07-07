package sk.train;

import jakarta.interceptor.AroundConstruct;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.InvocationContext;

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
