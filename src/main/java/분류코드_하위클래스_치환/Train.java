package 분류코드_하위클래스_치환;

public class Train extends Vihicle {
    public Train(int price, int speed, int time) {
        super(price, speed, time);
    }

    public String getName() {
        return "택시";
    }

}
