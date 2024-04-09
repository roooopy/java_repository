package week03.instanceofSample;

// 다형성

class Parent { } // 부모
class Child extends Parent { } //자식
class Brother extends Parent { } //자식


public class Main {
    public static void main(String[] args) {
        // 부모클래스의 타입 = 자식클래스의 생성자
      //  Parent pc = new Child();  // 다형성 허용 (자식 -> 부모)

        Parent p = new Parent(); // 부모클래스 자체로 만듦

        System.out.println(p instanceof Object); // p는 object의 인스턴스가 맞는지?(object는 최상단임!) -> 무조건 true 출력
        System.out.println(p instanceof Parent); // true 출력
        System.out.println(p instanceof Child);  // false 출력

        Parent c = new Child();

        System.out.println(c instanceof Object); // true 출력
        System.out.println(c instanceof Parent); // true 출력
        System.out.println(c instanceof Child);  // true 출력

    }
}
