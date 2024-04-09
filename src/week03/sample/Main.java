package week03.sample;

// [3-7 지역변수 및 상수]
public class Main {
    public static void main(String[] args){
        Main main = new Main(); // 기본생성자 public Main(){} 생략되어서 바로 사용 가능
        // 메서드 호출 : main.getClass()
        System.out.println("main.getClass() = " + main.getNumber()); // 같은 값이 출력됨. number이 한번 사용되고 초기화 됨을 의미
        System.out.println("main.getClass() = " + main.getNumber());

    }
    // 메서드
    public int getNumber() {
        // 1. 지역변수
        // "지역 변수" <-> 전역변수(static)
        // 해당메서드가 실행될때 마다 독립적인 값 저장하고 관리
        // 메서드 내부에서 정의될 때 생성 -> 이 메서드가 종료될 때 소멸됨
        // 2. 상수 final (불변의 값)
        // 초기값 설정 필요, 수정불가
        int number = 1;
        number += 1;
        return number; // 메서드 종료되면 지역변수 제거됨
    }
}
