package chapter5.ch13;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        return s2.compareTo(s1);
    }
}

public class MemberTreeSetTest {

    public static void main(String[] args) {

        /*MemberTreeSet memberTreeSet = new MemberTreeSet();

        memberTreeSet.addMember(new Member(400, "hong"));
        memberTreeSet.addMember(new Member(100, "park"));
        memberTreeSet.addMember(new Member(200, "kim"));
        memberTreeSet.addMember(new Member(300, "cho"));

        memberTreeSet.showAllMember();*/

        TreeSet<String> set = new TreeSet<>(new MyCompare());
        set.add("Park");
        set.add("Kim");
        set.add("Lee");

        System.out.println(set);

    }
}
