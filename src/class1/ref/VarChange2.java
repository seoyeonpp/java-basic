package class1.ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // 서로 참조 주소가 같다.

        System.out.println("dataA 참조값" + dataA);
        System.out.println("dataB 참조값" + dataB);
        System.out.println("dataA.value: " + dataA.value + ", dataB.value: " + dataB.value);

        dataA.value = 20;
        System.out.println("dataA.value: " + dataA.value + ", dataB.value: " + dataB.value);

        dataB.value = 30;
        System.out.println("dataA.value: " + dataA.value + ", dataB.value: " + dataB.value);
    }
}
