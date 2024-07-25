package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1,"학생1",15,90);
        Student student2 = new Student();
        initStudent(student2,"학생2",16,99);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student student, String name, int age, int grade) {
        // 메서드 내부에 전달된 참조값을 통해 객체의 값을 변경하거나, 값을 읽어서 사용할 수 있다.
        student.name = name;
        student.grade = grade;
        student.age = age;
    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
