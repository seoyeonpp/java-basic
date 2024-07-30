package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        // 둘다 같은 패키지여서
        Data data = new Data();

        // 다른 패키지여서
        pack.a.User user = new pack.a.User();

    }
}
