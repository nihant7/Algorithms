package interviews.preparation;

public class A extends Thread {
	 private volatile int c = 0;
	 
	 public synchronized void increment() {
		 c++;
	 }
	 
	public void work() {
		Thread t = new Thread(new Runnable() {
				public void run() {
					for(int i =0 ; i < 10000; i++) {
						increment();
					}
				}
		}); 
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i =0 ; i < 10000; i++) {
					increment();
				}
			}
	}); 
		t.start();
		t2.start();
		
		try {
			t.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			System.out.println(c);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		a.work();
	}

}
