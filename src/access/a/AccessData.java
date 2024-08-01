package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("public 메서드 호출");
    }

    void defaultMethod() {
        System.out.println("default 메서드 호출");
    }

    private void privateMethod() {
        System.out.println("private 메서드 호출");
    }

    public  void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
    }
}
