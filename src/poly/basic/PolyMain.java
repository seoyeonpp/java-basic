package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 부모타입은 자식을 참조할 수 있다. 반대로 자식 타입은 부모를 담을 수 없다!!!
        poly.parentMethod();

//        Child child1 = new Parent(); // 자식타입은 부모를 참조할 수 없다.
//        poly.childMethod(); // 부모타입은 자식의 고유 메서드에 접근할 수 없다. 접근하고 싶으면 캐스팅이 필요하다.
    }
}
