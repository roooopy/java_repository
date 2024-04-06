package week03;

public class Main {
    public static void main(String[] args) {

        /*Car[] carArray = new Car[3];
        Car car1 = new Car();
        car1.changeGear('P');
        carArray[0] = car1;

        Car car2 = new Car();
        car2.changeGear('N');
        carArray[1] = car2;

        Car car3 = new Car();
        car3.changeGear('D');
        carArray[2] = car3;

        for (Car car : carArray) {
            System.out.println("car.gear = " + car.gear);
        }*/
        Car car = new Car(); //객체 생성

        // 초기값 기본값 확인 : 초기값 준 것은 그 값이 들어가고, 아닌것은 default value가 들어감
        /*System.out.println("car.model = " + car.model); // 초기값 "Gv80"이 출력됩니다.
        System.out.println("car.color = " + car.color); // 기본값 null이 출력됩니다.
        System.out.println();

        System.out.println("car.speed = " + car.speed); // 기본값 0.0이 출력됩니다.
        System.out.println("car.gear = " + car.gear);  // 기본값 \u0000(공백)이 출력됩니다.
        System.out.println("car.lights = " + car.lights); // 초기값 true가 출력됩니다.
        System.out.println();

        System.out.println("car.tire = " + car.tire); // 초기값 인스턴스의 주소가 출력됩니다.
        System.out.println("car.door = " + car.door); // 기본값 null이 출력됩니다.
        System.out.println();

        // 필드 사용
        car.color = "blue"; // 필드 color에 "blue" 데이터를 저장합니다.
        car.speed = 100;    // 필드 speed에 100 데이터를 저장합니다.
        car.lights = false; // 필드 lights에 false 데이터를 저장합니다.

        System.out.println("car.color = " + car.color); // 저장된 "blue" 데이터가 출력됩니다.
        System.out.println("car.speed = " + car.speed); // 저장된 100.0 데이터가 출력됩니다.
        System.out.println("car.lights = " + car.lights); // 저장된 false 데이터가 출력됩니다.*/

        /*double speed = car.gasPedal(100, 'D');
        System.out.println("speed = " + speed);

        boolean lights = car.onOffLights();
        System.out.println("lights = " + lights);

        System.out.println();
        // gasPedal 메서드 내부에 호출된 changeGear(type); 메서드의 결과 확인
        // gear의 초기값은 'P'
        System.out.println("car.gear = " + car.gear); // 'D' 출력

        System.out.println();
        // 가변길이 매개변수 확인
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150);*/
    }
}
