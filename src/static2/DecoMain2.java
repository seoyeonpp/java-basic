package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); // static 메서드는 클래스 이름으로 객체 생성없이 접근 가능
        System.out.println("before : " + s);
        System.out.println("after : " + deco);

    }
}
