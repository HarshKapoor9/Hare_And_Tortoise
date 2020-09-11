
public class Hare extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
			if (i == 60) {
				try {
					System.out.println("Hare sleeps now");
					
					sleep(1000);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}