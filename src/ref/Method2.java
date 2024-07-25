package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1",15,90);
        Student student2 = createStudent("학생2",16,99);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade) {
        // 객체의 생성과 초기값 설정을 모두 처리함.
        Student student = new Student(); // 메서드 안에서 인스턴스 생성해서 해당 참조값을 반환
        System.out.println("student =" + student);
        student.name = name;
        student.grade = grade;
        student.age = age;
        return student;
    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
