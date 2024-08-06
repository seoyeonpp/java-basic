package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a) {
        super(); // 부모 생성자 호출. 매개변수 없는 부모 생성자는 생략 가능
        System.out.println("ClassB 생성자 a= " + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a= " + a + ", b= " + b);
    }
}
