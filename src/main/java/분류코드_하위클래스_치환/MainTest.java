package 분류코드_하위클래스_치환;

public class MainTest {
    public static void main(String[] args) {
        Vihicle taxi = Vihicle.selectVihicle(Vihicle.TYPE_TAXI, 3500, 10, 100);
        Vihicle air = Vihicle.selectVihicle(Vihicle.TYPE_TAXI, 120000, 100, 10);
        Vihicle train = Vihicle.selectVihicle(Vihicle.TYPE_TAXI, 45000, 50, 50);

        System.out.println(taxi.toString());
        System.out.println(air.toString());
        System.out.println(train.toString());
    }
}
