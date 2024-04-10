package week05.thread;
// 1. 쓰레드 클래스를 이용하는 것(상속받을 수 있음)
public class TestThread extends Thread{
    @Override
    public void run(){
        //실제우리가 쓰레드에서 수행할 작업 적어주기
        System.out.println("쓰레드~~");
    }
}
