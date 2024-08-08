package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // Animal은 dog cat cow의 부모여서 가능
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 메서드 오버라이딩이 우선권을 가져서 각자의 sound()가 호출됨
        System.out.println("동물 소리 테스트 끝");
    }
}
