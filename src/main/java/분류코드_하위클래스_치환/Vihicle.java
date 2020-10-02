package 분류코드_하위클래스_치환;

public abstract class Vihicle {
    public static final int TYPE_TAXI = 0;
    public static final int TYPE_AIRPLAIN = 1;
    public static final int TYPE_TRAIN = 2;

    private final int price;
    private final int speed;
    private final int time;

    protected Vihicle(int price, int speed, int time) {
        this.price = price;
        this.speed = speed;
        this.time = time;
    }

    public abstract String getName();

    public static Vihicle selectVihicle(int type, int price, int speed, int time) {
        switch (type) {
            case TYPE_TAXI :
                return new Taxi(price, speed, time);
            case TYPE_AIRPLAIN :
                return new AirPlain(price, speed, time);
            case TYPE_TRAIN :
                return new Train(price, speed, time);
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "Vihicle{" +
                "price=" + price +
                ", speed=" + speed +
                ", time=" + time +
                '}';
    }
}
