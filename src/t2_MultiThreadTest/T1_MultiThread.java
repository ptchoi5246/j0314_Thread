package t2_MultiThreadTest;

public class T1_MultiThread extends Thread {
	int cnt = 0;

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			if(Thread.currentThread().getName().equals("mbc")) {
				System.out.println("cnt : " + cnt);
				cnt++;
			}
			System.out.println(i + "스레드명 : " + Thread.currentThread().getName());
			try { Thread.sleep(500); } catch (InterruptedException e) {}
		}
	}
}

