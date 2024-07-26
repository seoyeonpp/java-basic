package oop1;

// 절차지향 프로그래밍
public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        volume++;
        System.out.println("음량: " + volume);
        volume++;
        System.out.println("음량: " + volume);

        // 볼륨 감소
        volume--;
        System.out.println("음량: " + volume);

        // 음악 플레이어 상태
        if(isOn) {
            System.out.println("음악 플레이어 상태: ON" + " / 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 상태: OFF");
        }

        // 음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
