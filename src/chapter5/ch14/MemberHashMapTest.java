package chapter5.ch14;

import chapter5.ch12.Member;

import java.util.HashMap;

public class MemberHashMapTest {

    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();
        memberHashMap.addMember(new Member(100, "park"));
        memberHashMap.addMember(new Member(200, "kim"));
        memberHashMap.addMember(new Member(300, "cho"));

        //equals 와 hashcode 를 구현해주어야 중복을 허용하지 않음
        memberHashMap.addMember(new Member(300, "hong"));

        memberHashMap.showAllMember();

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(100, "park");
        hashMap.put(200, "kim");
        hashMap.put(300, "lee");
        System.out.println("hashMap = " + hashMap);

    }
}
