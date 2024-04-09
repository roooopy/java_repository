package week03.abs;

public abstract class Car {
    double speed; //공통부문
    public double gasPedal(double kmh) { //공통부문
        speed = kmh;
        return speed;
    }
    public double brakePedal() { //공통부문
        speed = 0;
        return speed;
    }
    public abstract void horn(); //공통부문이 아닌 부분만 추상화시켜서 각자 쓰고싶은대로 씀
}
