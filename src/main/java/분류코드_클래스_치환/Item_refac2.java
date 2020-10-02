package 분류코드_클래스_치환;

public enum  Item_refac2 {
    접수(10),
    수락(20),
    배달(30),
    수금(40),
    완료(50);

    private final int type;

    Item_refac2(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
