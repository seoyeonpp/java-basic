package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접접근
        System.out.println("필드로 직접접근");
        //speaker.volume = 200;
        speaker.showVolume(); // 스피커가 터져버림
    }
}
