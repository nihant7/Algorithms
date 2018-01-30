package interviews.preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
	private static Random random = new Random();
	 static List<Integer> list1 = new ArrayList<Integer>();
	 static List<Integer> list2 = new ArrayList<Integer>();
	 
	 static Object lock1 = new Object();
	 static Object lock2 = new Object();
	public static void stageOne() {
		synchronized(lock2) {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list1.add(random.nextInt(100));
		}
	}
	
	public static void stageTwo() {
		synchronized(lock1) {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list2.add(random.nextInt(100));
		}
	}
	
	public static void process() {
		for(int i = 0 ; i < 1000; i++) {
		stageOne();
		stageTwo();
		}
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}
			
			
		});
		t1.start();
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}
			
			
		});
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis() - start;
		System.out.println(end);
		System.out.println("List 1: " + list1.size());
		System.out.println("List 2: " + list2.size());
	}

}
