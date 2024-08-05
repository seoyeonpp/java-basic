package static2;

import static static2.DecoData.*; //-> import static 위에처럼 import하면 된다리

public class DecoDataMain {
    // main 메서드는 정적 메서드 -> 정적 메서드에서는 정적 메서드만 호출 가능
    public static void main(String[] args) {
        System.out.println("1. 정적호출");
        // 여러번 호출 할 경우... 클래스명을 적어주는게 불편 -> import static
//        DecoData.staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        staticCall(data1); // 참조값을 보내면 찾아가서 호출 가능

        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall(); // 이렇게 쓰면 인스턴스 메서드로 오해할 수 있으므로 클래스로 호출하자

        // 클래스를 통한 접근
        staticCall();
    }
}
