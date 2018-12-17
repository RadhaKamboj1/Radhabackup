package threaddemo;

public class ThreadClass extends Thread {

	public void run() {
		System.out.println("this is thread id:" + Thread.currentThread().getId());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadClass t = new ThreadClass();
t.start();
ThreadClass t1 = new ThreadClass();
t1.start();
//ThreadClass t2 - new ThreadClass();
//t2.start();
	}

}
