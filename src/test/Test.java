package test;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) {
		final ExecutorService executorService = new ThreadPoolExecutor(50, 200, 120, TimeUnit.MILLISECONDS, new SynchronousQueue<>());
		List<String> list= new ArrayList<>();
		list.add("1");
		list.add("2");
		doSomething(list);
		System.out.println(list);
	}

	private static void doSomething(List<String> list) {
		list.add("3");
	}

}
