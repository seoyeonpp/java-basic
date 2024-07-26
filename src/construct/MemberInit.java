package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 추가
    void initMember(String name, int age, int grade) {
        // 멤버 변수와 메서드 매개변수의 이름이 같을 때 this를 사용하여 구분
        // 자기와 가까운 스코프의 변수가 호출되기때문에 this로 구분
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
