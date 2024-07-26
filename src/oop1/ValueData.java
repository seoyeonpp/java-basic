package oop1;

public class ValueData {
    // 응집력있게 데이터와 기능이 하나에 뭉쳐있다.
    // 객체 지향 프로그래밍
    int value;

    // static 키워드를 사용하지 않음. static 이 붙으면 객체를 생성하지 않고도 메서드를 호출할수있다. 자세한건 뒤에서,,
    void add () {
        value++;
        System.out.println("숫자증가 : " + value);
    }
}
