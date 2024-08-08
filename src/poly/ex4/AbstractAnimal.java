package poly.ex4;

// 순수 추상클래스
public abstract class AbstractAnimal {
    public abstract void sound(); // 추상메서드는 body 부분을 가지면 안됌

    // 추상메서드가 아니어서 Overriding 해도되고 안해도 됨
    public abstract void move();
}
