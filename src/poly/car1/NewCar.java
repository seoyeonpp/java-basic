package poly.car1;

public class NewCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("NewCar 시동을 켭니다.");
    }

    @Override
    public void offEngine() {
        System.out.println("NewCar 시동을 끕니다.");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("NewCar 엑셀을 밟습니다.");
    }
}
