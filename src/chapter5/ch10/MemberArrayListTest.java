package chapter5.ch10;

public class MemberArrayListTest {

    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();
        memberArrayList.addMember(new Member(100, "park"));
        memberArrayList.addMember(new Member(200, "kim"));
        memberArrayList.addMember(new Member(300, "cho"));
        memberArrayList.addMember(new Member(400, "kang"));
        memberArrayList.addMember(new Member(500, "lee"));

        memberArrayList.showAllMember();

        memberArrayList.removeMember(100);
        memberArrayList.removeMember(200);

        //순서가 유지됨
        memberArrayList.showAllMember();

    }
}
