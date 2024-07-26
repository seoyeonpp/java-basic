package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    // 생성자 오버로딩
    MemberConstruct(String name, int age) {
        this(name,age,50); // 생성자 내부에서 자신의 생성자를 호출할 수 있음. 생성자 코드의 첫줄에만 작성가능
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }

    // 생성자
    // 생성자는 클래스 이름과 동일하게 작성
    // 반환형이 없음
    // 나머지는 메서드랑 동일하다.
    // 생성자를 사용하면 필수값 입력을 보장할 수 있다.
    MemberConstruct(String name,int age, int grade) {
        System.out.println("생성자 호출 name = " + name + " age = " + age + " grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
