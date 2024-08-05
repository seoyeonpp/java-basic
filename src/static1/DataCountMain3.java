package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count :: " + Data3.count); // data1.count가 아닌 Data3.count로 접근

        Data3 data2 = new Data3("B");
        System.out.println("B count :: " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count :: " + Data3.count);

        // 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); // 접근할수있는데 실제로는 인스턴스에 갔다가 static을 보고 클래스 변수를 읽는다.
        // 근데 권장하지않음. 클래스 변수는 클래스를 통해서 접근하는게 좋다. (인스턴스 변수로 착각할 수 있기 때문)

        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
