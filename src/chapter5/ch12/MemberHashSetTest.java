package chapter5.ch12;

public class MemberHashSetTest {

    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();
        memberHashSet.addMember(new Member(100, "park"));
        memberHashSet.addMember(new Member(200, "kim"));
        memberHashSet.addMember(new Member(300, "cho"));

        //equals 와 hashcode 를 구현해주어야 중복을 허용하지 않음
        memberHashSet.addMember(new Member(300, "hong"));

        memberHashSet.showAllMember();

    }
}
