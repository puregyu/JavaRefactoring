package 빌더_패턴.builder_pattern;

public class MainT {
    public static void main(String[] args) {
    Member member = new Member.Builder().name("장민규")
                                        .age(31)
                                        .gender("남자")
                                        .address("서울")
                                        .isExpired(false).build();
    }

}
