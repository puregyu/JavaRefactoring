package 분류코드_하위클래스_치환;

public class Taxi extends Vihicle {
    public Taxi(int price, int speed, int time) {
        super(price, speed, time);
    }

    public String getName() {
        return "기차";
    }

}
