package extends1.super1;


public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); // 자기 자신 필드 this 생략가능
        System.out.println("super value = " + super.value); // 부모 필드

        this.hello(); // this 생략가능
        super.hello(); // 부모 메서드
    }
}
