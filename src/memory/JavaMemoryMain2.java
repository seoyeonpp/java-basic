package memory;

public class JavaMemoryMain2 {
    // 지역변수는 stack 영역에, 객체(인스턴스)는 heap 영역에 저장된다.
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data = new Data(10);
        // method2에 참조값 전달
        method2(data);
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data value :: " + data2.getValue());
        System.out.println("method2 end");
    }
 }
