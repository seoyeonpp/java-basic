package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 20, 90); // 생성자
        // (괄호가 있는 이유는 객체를 생성하면서 동시에 생성자를 호출한다는 의미)
        MemberConstruct member2 = new MemberConstruct("user2", 21, 80); // 생성자

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }
}
