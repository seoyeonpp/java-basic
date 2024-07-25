package class1.ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메소드 호출 전 : " + dataA.value);
        System.out.println("메소드 호출 전 참조값 : " + dataA);
        changeReference(dataA);
        System.out.println("메소드 호출 후 : " + dataA.value);

    }

    static void changeReference(Data dataX) {
        System.out.println("메소드 내부 참조값 : " + dataX);
        dataX.value = 20;
    }
}
