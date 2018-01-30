package interviews.preparation;

public class NumberThread extends Thread {
	protected Num num = null;
	
	public NumberThread(Num num) {
		this.num = num;
	}
	
	public void run() {	
	for(int i = 0; i < 10; i++) {
		num.add(i);
		}
	}

}
