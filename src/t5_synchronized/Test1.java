package t5_synchronized;

// 일반 공유객체
class MyData {
	int data = 10;
	
	public void plusMothod() {
		int mydata = data;
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		data = mydata + 1;
	}
}

// 공유객체를 사용할 스레드 객체
class UseMyData extends Thread {
	MyData myData = new MyData();
	
	@Override
	public void run() {
		myData.plusMothod();
		System.out.println(getName() + "실행결과 : " + myData.data);
	}
}


public class Test1 {
	public static void main(String[] args) {
		// 공유객체를 각각 생성
		
		// #1 스레드
		Thread th1 = new UseMyData();
		th1.start();
		
		// #2 스레드
		Thread th2 = new UseMyData();
		th2.start();
		
	}
}
