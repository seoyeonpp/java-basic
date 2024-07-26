package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("data.value1 = " + data.value1); // 인스턴스를 만들면서 멤버변수를 0 으로 초기화 (int 형이기 때문에)
        System.out.println("data.value2 = " + data.value2);
    }
}
