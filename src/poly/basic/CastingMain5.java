package poly.basic;

public class CastingMain5 {
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

        if(parent instanceof Child) { // Child 인스턴스가 맞으면
            System.out.println("Child 인스턴스가 맞다");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
