package appl;

import java.lang.reflect.*;

public class Application {
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
	}

	private static void test1() {
		System.out.println();
		try {
			Class<?> cls = Class.forName("appl.C");
			Field field = cls.getField("s");
			Class<?> type = field.getType();
			System.out.print(type.getSimpleName());
			System.out.println(" " + field.getName());
		}
		catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		catch (NoSuchFieldException e) {
			System.out.println(e);
		}
	}

	private static void test2() {
		System.out.println();
		try {
			Class<?> cls = Class.forName("appl.C");
			Method method = cls.getMethod("f");
			Class<?> returnType = method.getReturnType();
			System.out.print(returnType.getSimpleName() + " ");
			System.out.print(method.getName() + "(");
			Class<?>[] parameterTypes = method.getParameterTypes();
			for (int i = 0; i < parameterTypes.length; i++) {
				if (i > 0)
					System.out.print(", ");
				Class<?> parameterType = parameterTypes[i];
				System.out.print(parameterType.getSimpleName());
			}
			System.out.println(")");
		}
		catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		catch (NoSuchMethodException e) {
			System.out.println(e);
		}
	}

	private static void test3() {
		System.out.println();
		try {
			Class<?> cls = Class.forName("appl.C");
			Method method = cls.getMethod("g", int.class, String.class);
			Class<?> returnType = method.getReturnType();
			System.out.print(returnType.getSimpleName() + " ");
			System.out.print(method.getName() + "(");
			Class<?>[] parameterTypes = method.getParameterTypes();
			for (int i = 0; i < parameterTypes.length; i++) {
				if (i > 0)
					System.out.print(", ");
				Class<?> parameterType = parameterTypes[i];
				System.out.print(parameterType.getSimpleName());
			}
			System.out.println(")");
		}
		catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		catch (NoSuchMethodException e) {
			System.out.println(e);
		}
	}

	private static void test4() {
		System.out.println();
		try {
			Class<?> cls = Class.forName("appl.C");
			Constructor<?> constructor = cls.getConstructor(int.class, String.class);
			System.out.print(constructor.getName() + "(");
			Class<?>[] parameterTypes = constructor.getParameterTypes();
			for (int i = 0; i < parameterTypes.length; i++) {
				if (i > 0)
					System.out.print(", ");
				Class<?> parameterType = parameterTypes[i];
				System.out.print(parameterType.getSimpleName());
			}
			System.out.println(")");
		}
		catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		catch (NoSuchMethodException e) {
			System.out.println(e);
		}
	}
}