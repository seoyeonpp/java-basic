package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모변수가 자식 인스턴스 참조
        Parent poly = new Child();
        // 단 자식의 기능은 호출할 수 없다.
        // poly.childMethod();

        // 다운캐스팅 (부모타입 -> 자식타입)
        Child child = (Child) poly;
        child.childMethod();
    }
}
