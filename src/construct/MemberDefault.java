package construct;

public class MemberDefault {
    String name;

    // java는 생성자가 없으면 기본 생성자를 만든다. 눈에 보이지 않음.
    // 생성자가 하나라도 있으면 기본 생성자를 만들지 않음.
    // 기본 생성자는 클래스와 같은 접근 제어자를 가진다. ex) public
    MemberDefault() {
        System.out.println("생성자 호출");
    }
}
