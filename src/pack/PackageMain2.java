package pack;

//import pack.a.User;
//import pack.a.User2;

// * 로 하면 해당 패키지 하위에 모든 클래스를 import 한다

import pack.a.*;

public class PackageMain2 {
    public static void main(String[] args) {
        // 둘다 같은 패키지여서
        Data data = new Data();

        // import 해서 그냥 써도 된다
        User user = new User();
        User2 user2 = new User2();

    }
}
