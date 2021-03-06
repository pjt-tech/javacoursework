package chapter5.ch13;

import java.util.Comparator;
import java.util.Objects;

public class Member implements Comparator<Member> {

    //hashSet을 사용할때는 hashSet이 관리할 클래스에 같은지 체크하는 메서드를 정의해줘야함

    private int memberId;
    private String memberName;

    public Member() {
    }

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는" + memberId + "입니다.";
    }

    @Override
    public int compare(Member member1, Member member2) {
        return Integer.compare(member1.getMemberId(), member2.getMemberId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return getMemberId() == member.getMemberId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMemberId());
    }

    /*@Override
    public int compareTo(Member member) {

        return Integer.compare(this.memberId, member.memberId);
    }*/
}
