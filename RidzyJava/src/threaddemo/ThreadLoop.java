package threaddemo;

public class ThreadLoop extends Thread {

	public void run() {
		for (int i = 0; i < 7; i++) {
			System.out.println("Thread name: " + Thread.currentThread().getName() + "Iteration: " + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLoop t = new ThreadLoop();
		t.start();
		ThreadLoop t1 = new ThreadLoop();
		t1.setName("b2");
		t1.start();

	}

}
