package t5_synchronized;

// 일반 공유객체
class MyData3 {
	int data = 10;

  // 메소드 사용을 동기화처리(synchronized) : 동기화시키면 해당 메소드가 끝나기 전에는 다른 스레드가 들어올수 없음.
	public synchronized void plusMothod() {
		int mydata = data;
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		data = mydata + 1;
	}
}

// 공유객체를 사용할 스레드 객체
class UseMyData3 extends Thread {
	MyData3 myData;
	
	public UseMyData3(MyData3 myData) {
		this.myData = myData;
	}

	@Override
	public void run() {
		myData.plusMothod();
		System.out.println(getName() + "실행결과 : " + myData.data);
	}
}


public class Test3 {
	public static void main(String[] args) {
		// 공유객체를 각각 생성
		MyData3 myData = new MyData3();
		
		// #1 스레드
		Thread th1 = new UseMyData3(myData);
		th1.setName("th1");
		th1.start();
		
		// #2 스레드
		Thread th2 = new UseMyData3(myData);
		th2.setName("th2");
		th2.start();
		
	}
}
