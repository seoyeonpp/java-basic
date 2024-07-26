package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; // this 생략 가능 이름이 다르기 때문에.
        // 근데 this를 항상 붙히는 코드 스타일이 있다. 결과는 똑같다.
    }
}
