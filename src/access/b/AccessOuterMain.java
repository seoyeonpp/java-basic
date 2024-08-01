package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        // public 호출
        accessData.publicField = 1;
        accessData.publicMethod();

        // default 호출 불가 (같은 패키지 내에서만 가능)
//        accessData.defaultField = 2;
//        accessData.defaultMethod();

        // private 호출 불가
//        accessData.privateField = 3;
//        accessData.privateMethod();

        // innerAccess 호출
        accessData.innerAccess();
    }
}
