package poly.ex6;

// 상속과 인터페이스 구현 둘다 가능 (extends 가 먼저나와야함)
public class Bird extends AbstractAnimal implements Fly{

    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날다");
    }
}
