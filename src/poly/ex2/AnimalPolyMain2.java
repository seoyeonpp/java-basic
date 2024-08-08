package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Animal[] arr = {new Dog(), new Cat(), new Cow()};

        for (Animal animal : arr) {
            soundAnimal(animal);
        }

    }

    // 동물이 추가되어도 변하지 않는 부분
    private static void soundAnimal(Animal animal) { // 추상적인 Animal을 참조하기 때문
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 끝");
    }

}
