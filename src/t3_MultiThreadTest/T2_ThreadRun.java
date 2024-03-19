package t3_MultiThreadTest;

class SMIFile extends Thread {
	@Override
	public void run() {
		//#2. 자막
		String[] smiArray = {"하나","둘","셋","넷","다섯"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
			
		// #3. 자막 출력
		for(int i=0; i<smiArray.length; i++) {
			System.out.println("- 자막 : " + smiArray[i]);
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}

class ScreenFile extends Thread {
	@Override
	public void run() {
		//#1. 영상 프레임 1-5컷트
		int[] screenArray = {1,2,3,4,5};
			
		//#3. 영상 출력
		for(int i=0; i<screenArray.length; i++) {
			System.out.print("영상 프레임 : " + screenArray[i]);
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}

public class T2_ThreadRun {
	public static void main(String[] args) {
		// 자막 객체 생성 실행
		Thread smiThread = new SMIFile();
		smiThread.start();
		
		// 영상 객체 생성 실행
		Thread ScreenFileThread = new ScreenFile();
		ScreenFileThread.start();
	}
}
