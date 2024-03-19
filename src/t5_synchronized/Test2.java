package t5_synchronized;

// 일반 공유객체
class MyData2 {
	int data = 10;

  // 메소드 사용을 동기화처리(synchronized) : 동기화시키면 해당 메소드가 끝나기 전에는 다른 스레드가 들어올수 없음.
	public synchronized void plusMothod() {
		int mydata = data;
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		data = mydata + 1;
	}
}

// 공유객체를 사용할 스레드 객체
class UseMyData2 extends Thread {
	MyData2 myData;
	
	public UseMyData2(MyData2 myData) {
		this.myData = myData;
	}

	@Override
	public void run() {
		myData.plusMothod();
		System.out.println(getName() + "실행결과 : " + myData.data);
	}
}


public class Test2 {
	public static void main(String[] args) {
		// 공유객체를 각각 생성
		MyData2 myData = new MyData2();
		
		// #1 스레드
		Thread th1 = new UseMyData2(myData);
		th1.start();
		
		// #2 스레드
		Thread th2 = new UseMyData2(myData);
		th2.start();
		
	}
}
