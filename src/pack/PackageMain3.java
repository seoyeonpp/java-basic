package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User user = new User();
        pack.b.User user2 = new pack.b.User(); // pack.b.User로 해야 한다 이름이 같기 때문.
    }
}
