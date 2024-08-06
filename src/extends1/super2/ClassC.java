package extends1.super2;

public class ClassC extends ClassB{
    public ClassC() {
        super(10,20); //부모가 기본 생성자가 없으면 호출해야함
        System.out.println("ClassC 생성자");
    }
}
