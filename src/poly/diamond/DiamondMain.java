package poly.diamond;

public class DiamondMain {

    // 다이아몬드 문제가 발생할래야 발생할수없음.
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        Child child = new Child();
        child.methodA();
        child.methodB();
        child.methodCommon();
    }
}
