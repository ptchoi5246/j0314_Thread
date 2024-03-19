package t1_BasicThread;

public class T1_SingleTrhead {
	public static void main(String[] args) {
		System.out.println("모든 실행클래스는 main 스레드 1개를 가진다.");
		System.out.println("현재 스레드명 : " + Thread.currentThread().getName());
	}
}
