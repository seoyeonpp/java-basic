package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {

//        instanceValue++; // 인스턴스 변수 접근 불가능. 같은 클래스 레벨이 아니기때문에 호출불가
//        instanceMethod(); // 인스턴스 메서드 접근 불가능. 같은 클래스 레벨이 아니기때문에 호출불가
        staticValue++; // 정적 변수 접근. 같은 클래스 레벨이기때문에 호출가능
        staticMethod(); // 정적 메서드 접근. 같은 클래스 레벨이기때문에 호출가능
    }

    // 외부에서 참조값을 넘겨옴. 참조값이 있으면 static 메서드에서 인스턴스 메서드,변수 호출 가능
    public static void staticCall(DecoData data) {
        data.instanceValue++; // 인스턴스 변수 접근
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod();

        staticValue++; // 정적 변수 접근 DecoData.staticValue 인데 생략함
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue : " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue : " + staticValue);
    }

}
