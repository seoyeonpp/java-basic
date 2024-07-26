package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 참조할 값을 줘서 null이 아님

        System.out.println("bigData.value1 = " + bigData.count);
        System.out.println("bigData.value2 = " + bigData.data);

        System.out.println("bigData.data.value = " + bigData.data.value); // 0
    }
}
