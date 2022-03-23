package lab8;



class Timer implements Runnable {

	@Override
	public void run() {
		while (true) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

public class Ex2 {
	public static void main(String[] args) {

		Thread obj = new Thread(new Timer());
		obj.run();
	}
}