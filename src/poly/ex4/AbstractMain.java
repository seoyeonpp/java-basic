package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        // 추상클래스 생성 불가
//        AbstractAnimal abstractAnimal = new AbstractAnimal();

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

    private static void soundAnimal(AbstractAnimal animal) { // 추상적인 Animal을 참조하기 때문
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 끝");
    }

    private static void moveAnimal(AbstractAnimal animal) { // 추상적인 Animal을 참조하기 때문
        System.out.println("동물 움직 시작");
        animal.move();
        System.out.println("동물 움직 끝");
    }

}
