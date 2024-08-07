package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1; // 다운캐스팅
        child1.childMethod(); // 문제없음

        Parent parent2 = new Parent(); // Child 인스턴스가 없음!!!
        Child child2 = (Child) parent2;
        child2.childMethod(); // ClassCastException 발생 -> 런타임 오류 발생 / 업캐스팅은 이런 문제가 전혀 발생하지 않는다!!!
    }
}
