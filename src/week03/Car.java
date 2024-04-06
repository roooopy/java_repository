package week03;
//  클래스 만들기 위한 4단계
//  1. 만들려고 하는 설계도 선언(클래스 선언)
//  2. 객체가 가지고 있어야할 속성(필드) 정의
//  3. 객체를 생성하는 방식 정의 (생성자)
//  4. 객체가 가지고 있어야 할 행위(메서드)정의
public class Car { // public 으로 생성해놔서 어디서든지 사용가능
    // <필드영역> -> 인스턴스화 해야지 사용할 수 있음!!
    // 1) 고유데이터 영역
    String company; // 자동차 회사
    String model = "Gv80"; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    // 2) 상태 데이터 영역
    double speed;  // 자동차 속도 , km/h
    char gear; // 기어의 상태, P,R,N,D
    boolean lights = true; // 자동차 조명의 상태

    // 객체 데이터 영역
    Tire tire = new Tire(); //car클래스가 인스턴스화 될때, tire라는 클래스에서도 인스턴스화 시켜 변수할당
    Door door;
    Handle handle;

    // <생성자 영역>
    // 생성자 : 처음 객체가 생성될 때 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의
    public Car() {
        // 기본생성자 : 생략가능
    }

    // <메서드 영역>
    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵빵");
    }
    // 자동차의 속도.. 가변길이 메서드
    void carSpeeds(double ... speeds) {
        for (double v : speeds) {
            System.out.println("v = " + v);
        }
    }
}
