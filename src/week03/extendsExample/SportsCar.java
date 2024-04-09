package week03.extendsExample;
// 자식 : 부모가 가진것에 대해 확장된 개념(메소드 추가해도 부모한테 영항 x)
public class SportsCar extends Car{
    String engine;
    public void booster() {
        System.out.println("엔진 " + engine + " 부앙~\n");
    }
}
