package t1_BasicThread;

//스레드 만드는 방법1 : Thread 클래스를 상속 - 강제로 Override
public class T2_MultiTrhead1 extends Thread {
	@Override
	public void run() {
		System.out.println("=================================================");
		System.out.println("1.현재 클래스명 : T2_MultiTrhead1");
		System.out.println("1.현재 실행중인 스레드 이름? " + Thread.currentThread().getName());
		System.out.println("=================================================");
		//for(int i=0; i<1000000000; i++) {} //지연방법 1.
		for(int i=0; i<5; i++) {
			System.out.println("i= " + i);
			try {Thread.sleep(500);	} catch (InterruptedException e) {}
		}
		
		System.out.println("=================================================");
		System.out.println("2.현재 클래스명 : T2_MultiTrhead1");
		System.out.println("2.현재 실행중인 스레드 이름? " + Thread.currentThread().getName());
		System.out.println("2. " + Thread.currentThread().getName() + " 스레드가 종료됩니다."); 
		System.out.println("=================================================");
	}
}
