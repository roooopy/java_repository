package week05.daemon;

public class Main {
    public static void main(String[] args) {
        Runnable demon = () -> {
            for (int i = 0; i < 1000000; i++) {
                System.out.println("demon");
            }
        };

        // 우선순위가 낮다 => 상대적으로 다른 쓰레드에 비해 리소스 적게 할당받음.
        Thread thread = new Thread(demon);
        thread.setDaemon(true);

        thread.start();

        for (int i = 0; i < 100; i++) { //main쓰레드가 데몬쓰레드를 기다려주지 않음!!
            System.out.println("task");
        }
    }
}
