package interviews.preparation;

public class Sender {
	
	public void send(String msg) {
		System.out.println("Sending this message : " + msg);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
			e.printStackTrace();
		}
		
		System.out.println("Message " +msg+ " sent");
		
		
	}

}
