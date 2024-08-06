package extends1.overriding;

// 서브클래스
public class ElectricCar extends Car {

    // 부모의 move() 메소드를 재정의 (오버라이드 어노테이션 사용)
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
