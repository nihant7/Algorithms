package interviews.preparation;

public class ThreadSenderDemo {

	public static void main(String[] args) {
			Sender sender = new Sender();
			ThreadSender tsd1 = new ThreadSender("Greetings", sender);
			ThreadSender tsd2 = new ThreadSender("Goodbye", sender);
			
			tsd1.start();
			
			tsd2.start();
			
			try {
				tsd1.join();
				tsd2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			

	}

}
