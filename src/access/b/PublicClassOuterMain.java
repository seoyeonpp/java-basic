package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 접근 불가
//        DefaultClass1 defaultClass1 = new DefaultClass1(); // default 접근 제어자기 때문에 access.a 패키지에서만 접근 가능
    }
}
