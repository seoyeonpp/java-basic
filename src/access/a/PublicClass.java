package access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); // 자기 자신의 클래스 생성 가능
        DefaultClass1 defaultClass1 = new DefaultClass1(); // default 접근 제어자이므로 같은 패키지 내에서 생성 가능
        DefaultClass2 defaultClass2 = new DefaultClass2(); // 같은 패키지 내에서 생성 가능
    }
}

class DefaultClass1 {

}

class DefaultClass2 {

}
