package 분류코드_클래스_치환;

public class ItemType {
    // ItemType는 접수, 수락, 배달, 수금, 완료 이외에는 없을을 보장
    public static final ItemType 접수 = new ItemType(1);
    public static final ItemType 수락 = new ItemType(2);
    public static final ItemType 배달 = new ItemType(3);
    public static final ItemType 수금 = new ItemType(4);
    public static final ItemType 완료 = new ItemType(5);

    private final int type;

    private ItemType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
