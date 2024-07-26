package ref;

public class NullMain2 {
    public static void main(String[] args) {
        // 지역변수가 null일경우에는 파악하기 쉽다.
        Data data = null;
        data.value = 10; // NullPointerException 예외 발생
        System.out.println("data.value = " + data.value); // Cannot assign field "value" because "data" is null
    }
}
