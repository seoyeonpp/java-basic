package static1;

public class Data3 {
    // 멤버변수 (필드)
    public String name; // 인스턴스 변수
    public static int count; // 클래스 변수 , 정적 변수, static 변수 (메서드 영역에서 관리됨)

    public Data3(String name) {
        this.name = name;
        count++; // Data3.count 인데 생략가능
    }
}
