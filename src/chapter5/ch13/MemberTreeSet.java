package chapter5.ch13;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet treeSet;

    //comparator를 구현할때는 구현할 대상을 ()안에 넣어준다.
    public MemberTreeSet() {
        this.treeSet = new TreeSet<>(new Member());
    }

    public void addMember(Member member){
        treeSet.add(member);
    }

    public boolean removeMember(int memberId) {

        //컬렉션을 조회하는 iterator
        Iterator<Member> ir = treeSet.iterator();
        while (ir.hasNext()) {
            Member member = ir.next();
            if(member.getMemberId() == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {

        for(Object member : treeSet) {
            System.out.println("member = " + member);
        }
        System.out.println();
    }
}
