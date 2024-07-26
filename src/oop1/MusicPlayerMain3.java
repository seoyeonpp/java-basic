package oop1;

// 절차지향 프로그래밍
public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태
        showStatus(data);

        // 음악 플레이어 끄기
        off(data);
    }

    // 모듈화
    static void on (MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off (MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp (MusicPlayerData data) {
        data.volume++;
        System.out.println("음량: " + data.volume);
    }

    static void volumeDown (MusicPlayerData data) {
        data.volume--;
        System.out.println("음량: " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        if(data.isOn) {
            System.out.println("음악 플레이어 상태: ON" + " / 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 상태: OFF");
        }
    }
}
