package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // 참조형 data를 final로 선언

        // 참조 대상의 값은 변경 가능. data 자신의 값을 변경할 수 없음
        data.value = 10;
        System.out.println("data.value=" + data.value);
        data.value = 20;
        System.out.println("data.value=" + data.value);
    }
}
