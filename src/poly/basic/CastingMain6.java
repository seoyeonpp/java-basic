package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent(); // Child 인스턴스가 없음!!!
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        // Child 인스턴스인 경우 childMethod() 실행
        if(parent instanceof Child child) { // Java 16부터 변수를 바로 선언할 수 있다. 직접 다운캐스팅하는 코드 생략을 할 수 있다.
            System.out.println("Child 인스턴스가 맞다");
            child.childMethod();
        }
    }
}
