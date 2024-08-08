package poly.ex5;


public class InterfaceMain {
    public static void main(String[] args) {
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal(); // 인터페이스는 추상이라 인스턴스 생성 불가

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(cow);

    }

    private static void soundAnimal(InterfaceAnimal animal) { // 추상적인 Animal을 참조하기 때문
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 끝");
    }

    private static void moveAnimal(InterfaceAnimal animal) { // 추상적인 Animal을 참조하기 때문
        System.out.println("동물 움직 시작");
        animal.move();
        System.out.println("동물 움직 끝");
    }
}
