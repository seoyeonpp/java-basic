package oop1;

public class MusicPlayer {
    // 캡슐화

    // 멤버변수
    int volume = 0;
    boolean isOn = false;

    void on () {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off () {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp () {
        volume++;
        System.out.println("음량: " + volume);
    }

    void volumeDown () {
        volume--;
        System.out.println("음량: " + volume);
    }

    void showStatus() {
        if(isOn) {
            System.out.println("음악 플레이어 상태: ON" + " / 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 상태: OFF");
        }
    }
}
