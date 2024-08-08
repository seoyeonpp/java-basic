package poly.diamond;

// 인터페이스의 다중 상속
public class Child implements InterfaceA, InterfaceB{

    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    // 양쪽에 다 있지만 구현은 하나만 해도 됨. 동일한 메서드
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
