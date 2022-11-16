package appl;

import java.lang.reflect.*;

public class Application {
	public static void main(String[] args) {
		test1();
		test2();
	}

	private static void test1() {
		System.out.println();
		try {
			Class<?> cls = Class.forName("appl.C");
			Object obj = cls.newInstance();
			Field fi = cls.getField("i");
			Object vi = fi.get(obj);
			System.out.println(vi);
			Field fs = cls.getDeclaredField("s");
			fs.setAccessible(true);
			Object vs = fs.get(obj);
			System.out.println(vs);
		}
		catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		catch (InstantiationException e) {
			System.out.println(e);
		}
		catch (IllegalAccessException e) {
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
			Object obj = cls.newInstance();
			Field fi = cls.getField("i");
			fi.set(obj, 5000);
			Field fs = cls.getDeclaredField("s");
			fs.setAccessible(true);
			fs.set(obj, "World");
			System.out.println(obj);
		}
		catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		catch (InstantiationException e) {
			System.out.println(e);
		}
		catch (IllegalAccessException e) {
			System.out.println(e);
		}
		catch (NoSuchFieldException e) {
			System.out.println(e);
		}
	}

	
}