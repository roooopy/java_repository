package week03.thisFolder;

public class Car {

    static final String COMPANY = "GENESIS"; // 자동차 회사 : GENESIS
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear = 'P'; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태

    Door door = new Door();
    Handle handle = new Handle();
    Tire tire = new Tire();

    // 3가지의 오버로딩된 Car this() 생성자
    // this 쓰지 않으면, 하나하나 다 명시해줘야 해서 귀찮고 복잡
    // this() 키워드를 사용하면 코드의 중복을 제거
    // 3가지 케이스 모두 제일 마지막 생성자로 회기함
    public Car(String model) {
        this(model, "Blue", 50000000);
    }

    public Car(String model, String color) {
        this(model, color, 100000000);
    }

    public Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

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

    Car returnInstance() {
        return this;
    }
}
