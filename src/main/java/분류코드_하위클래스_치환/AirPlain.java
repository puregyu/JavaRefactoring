package 분류코드_하위클래스_치환;

public class AirPlain extends Vihicle {
    public AirPlain(int price, int speed, int time) {
        super(price, speed, time);
    }

    public String getName() {
        return "비행기";
    }

}
