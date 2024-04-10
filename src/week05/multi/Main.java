package week05.multi;

public class Main {
    public static void main(String[] args){
        // 순차적으로 말고, 동시에 실행하기 위해! -> 일정하게 출력되지 않음 순서보장 x
        // 걸리는 시간과 동작.. 예측 불가능!

        // 1번째
    Runnable task = () -> {
        for (int i = 0; i < 100; i++) {
            System.out.print("$");
        }
    };

    // 2번째
    Runnable task2 = () -> {
        for (int i = 0; i < 100; i++) {
            System.out.print("*");
        }
    };


    Thread thread1 = new Thread(task);
        thread1.setName("thread1");
    Thread thread2 = new Thread(task2);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }
}
