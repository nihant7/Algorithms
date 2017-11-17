package interviews.preparation;

public class ThreadSender extends Thread {
	String msg;
	Sender sender;
	public ThreadSender(String msg, Sender sender) {
		this.msg = msg;
		this.sender = sender;
	}
	
	public void run() {
		synchronized(sender) {
			sender.send(msg);
		}
	}

}
