package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
//        data1 = 20; // 컴파일 에러

        // final 지역 변수2
        final int data2 = 20; // 선언과 동시에 초기화
//        data2 = 30; // 컴파일 에러
    }

    static void method(final int parameter) { // 인수에도 final 사용 가능
//        parameter = 20; // 컴파일 에러
    }
}
