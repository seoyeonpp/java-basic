package poly.ex5;

// 인터페이스 상속은 implements 키워드 사용
public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개가 걷는다");
    }
}
