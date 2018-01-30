package interviews.preparation;

public class ThreadDemo extends Thread {
	int counter = 0;
	public void run() {
		ThreadDemo t = new ThreadDemo();
		t.add();
	}
	
	public void add() {
		counter++;
		System.out.println(counter);
	}

	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		Num num = new Num();
		Thread t1 = new NumberThread(num);
		Thread t2 = new NumberThread(num);
		Thread t3 = new NumberThread(num);

		t2.start();
		t1.start();
		t3.start();
		
	}

}
