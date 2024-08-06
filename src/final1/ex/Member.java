package final1.ex;

public class Member {

    private final String id; // final
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name) {
        // this.id = id; // 컴파일 오류
        this.name = name;
    }

    public void printData() {
        System.out.println("id=" + id + ", name=" + name);
    }
}
