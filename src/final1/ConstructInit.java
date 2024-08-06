package final1;

public class ConstructInit {
    final int value;

    // 생성자에서 fianl 변수 초기화 1회만
    public ConstructInit(int value) {
        this.value = value;
    }
}
