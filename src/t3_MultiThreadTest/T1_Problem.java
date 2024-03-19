package t3_MultiThreadTest;

public class T1_Problem {
	public static void main(String[] args) {
		//#1. 영상 프레임 1-5컷트
		int[] screenArray = {1,2,3,4,5};
		
		//#2. 자막
		String[] smiArray = {"하나","둘","셋","넷","다섯"};
		
		//#3. 영상 출력
		for(int i=0; i<screenArray.length; i++) {
			System.out.println("영상 프레임 : " + screenArray[i]);
			try {Thread.sleep(300);} catch (InterruptedException e) {}
		}
		
		// #3. 자막 출력
		for(int i=0; i<smiArray.length; i++) {
			System.out.println("자막 : " + smiArray[i]);
			try {Thread.sleep(300);} catch (InterruptedException e) {}
		}
	}
}
