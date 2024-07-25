package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        // 붕어빵 틀 = Student 클래스
        // 붕어빵 = student1, student2 (객체 또는 인스턴스라고 한다.) 객체는 서로 독립적인 상태를 가진다.
        Student student1;
        student1 = new Student(); // 객체를 생성하면 자바는 이 객체에 접근할 수 있는 참조값을 반환한다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 99;

        System.out.println("이름: " + student1.name + ", 나이: " + student1.age + ", 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + ", 나이: " + student2.age + ", 성적: " + student2.grade);
    }
}
