package access;

public class Speaker {
    // 밖에서 접근을 막아버림
    private int volume;

    // 생성자로 초기 음량 설정
    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if(volume >= 100) {
            System.out.println("최대음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volume dowm 호출");
    }

    void showVolume() {
        System.out.println("현재음량 : " + volume);
    }
}
