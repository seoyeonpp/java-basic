package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.value1 = " + bigData.count); // 0으로 멤버변수 초기화
        System.out.println("bigData.value2 = " + bigData.data); // null로 멤버변수 초기화

        System.out.println("bigData.data.value = " + bigData.data.value); // NullPointerException 예외 발생
    }
}
