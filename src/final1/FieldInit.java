package final1;

public class FieldInit {
    static final int CONST_VALUE = 10; // 관례 상 상수는 대문자로 작성 static final
    final int value = 10; // 값이 변하지 않음. 메모리 낭비 -> static 영역을 사용하면 됨 static final로 상수로 만들면 됨

//    public FieldInit(int value) {
////        this.value = value; // 초기값이 있으면 생성자에서 값 대입 불가
//    }
}
