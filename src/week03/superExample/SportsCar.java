package week03.superExample;

public class SportsCar extends Car{
    String engine;

    String model = "Ferrari"; // 자동차 모델
    String color = "Red"; // 자동차 색상
    double price = 300000000; // 자동차 가격

    public SportsCar(String engine) {
        this.engine = engine;
    }

    public void booster() {
        System.out.println("엔진 " + engine + " 부앙~\n");
    }

    public void setCarInfo(String model, String color, double price) {
        super.model = model; // 부모의 model을 model로 셋팅
        super.color = color; // 부모의 color를 color로 셋팅
        this.price = price; // 나의 price를 price에 셋팅
    }

    @Override
    public double brakePedal() {
        speed = 100;
        System.out.println("스포츠카에 브레이크란 없다");
        return speed;
    }

    @Override
    public void horn() {
        booster();
    }
}
