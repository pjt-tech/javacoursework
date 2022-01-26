package chapter5.ch12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> arrayList;

    public MemberHashSet() {
        this.arrayList = new HashSet<>();
    }

    public MemberHashSet(int size) {
        this.arrayList = new HashSet<>(size);
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {

       /* for (Member member : arrayList) {
            if(member.getMemberId() == memberId) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;*/
        //컬렉션을 조회하는 iterator
        Iterator<Member> ir = arrayList.iterator();
        while (ir.hasNext()) {
            Member member = ir.next();
            if(member.getMemberId() == memberId) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {

        for(Member member : arrayList) {
            System.out.println("member = " + member);
        }
        System.out.println();
    }
}
