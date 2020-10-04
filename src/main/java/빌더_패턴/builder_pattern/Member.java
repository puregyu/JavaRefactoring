package 빌더_패턴.builder_pattern;

public class Member {
    private String name;
    private int age;
    private String gender;
    private String address;
    private boolean isExpired;
    public String a;

    public static class Builder {

        private String name;
        private int age;
        private String gender;
        private String address;
        private boolean isExpired;

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }
        public Builder address(String address) {
            this.address = address;
            return this;
        }
        public Builder isExpired(boolean isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public Member build() {
            return new Member(this);
        }
    }

    private Member(Builder builder) {
        name = builder.name;
        age = builder.age;
        gender = builder.gender;
        address = builder.address;
        isExpired = builder.isExpired;
    }
}
