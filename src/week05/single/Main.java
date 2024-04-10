package week05.single;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()); // 출력:thread1
        Runnable task = () -> { // 람다식
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };

        System.out.println(Thread.currentThread().getName()); //출력:main (현재 운영중인 쓰레드 이름 출력)
        Thread thread1 = new Thread(task);
        thread1.setName("thread1");

        thread1.start();
    }
}