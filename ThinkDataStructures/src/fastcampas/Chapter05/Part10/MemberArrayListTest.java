package Chapter05.Part10;

public class MemberArrayListTest {

    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();
        Member memberUm =new Member(1,"엄준식");
        Member memberSon =new Member(2,"손인욱");
        Member memberKim =new Member(3,"김찬호");
        Member memberjung =new Member(4,"정상길");


        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberUm);
        memberArrayList.addMember(memberjung);
        memberArrayList.addMember(memberSon);

        memberArrayList.showAllMember();
        memberArrayList.removeMember(memberKim.getMemberId());
        memberArrayList.showAllMember();

    }
}
