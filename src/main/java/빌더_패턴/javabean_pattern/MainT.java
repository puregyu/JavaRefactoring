package 빌더_패턴.javabean_pattern;

public class MainT {
    public static void main(String[] args) {
        Member member = new Member();
        member.setName("장민규");
        member.setAge(31);
        member.setGender("남자");
        member.setAddress("서울");
        member.setExpired(false);

    }
}
