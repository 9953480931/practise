package thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class MyThreadClass implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i <= 9; i++) {
			System.out.println("current thread is ->" + Thread.currentThread() + "with value->" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

enum Week {
	Sunday(1), monday(2), tuesday(3), wednesday(4);

	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	private Week(int value) {
		setValue(value);
	}
	
}

enum TestEnum {
	one("Amit"), two(2),Three;
	Object value;

	TestEnum() {
		
	}
	TestEnum(Object value) {
		this.value = value;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	public void display() {
		System.out.println("From enum");
	}
}

final class Test {

	private final String text;

	public Test() {
		this.text = "testing final";
	}

	public void display() {
		System.out.println("From Final class");
	}

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return "Test [text=" + text + "]";
	}

}

public class MyThread {

	public String reverse(String s) {
		System.out.println(s.length());
		System.out.println(s);
		if (s.length() == 0)
			return "";
		return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));

	}

	public String reverse2(String str) {
		if (str == null) {
			return null;
		}
		if (str.length() <= 1) {
			return str;
		}
		return reverse2(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) throws InterruptedException {

		MyThread mt = new MyThread();
		System.out.println(mt.reverse("aaa").equals("aaa"));
		System.out.println("function2  " + mt.reverse2("hello"));

		Test test = new Test();
		System.out.println(test.toString());
		
		TestEnum s1 =TestEnum.two;
		System.out.println(s1.ordinal());
		s1.display();
		
		System.out.println("+++"+s1.value);

		for(TestEnum s:TestEnum.values()) {
			System.out.println(s.value);
		}
	}

}
