package week03.poly;

public class Car {
    Tire tire;

    public Car(Tire tire) { // 해당생성자는 무조건 tire가 들어와야함!
        this.tire = tire;
    }

    Tire getHankookTire() {
        return new HankookTire("HANKOOK");
    }

    Tire getKiaTire() {
        return new KiaTire("KIA");
    }
}
