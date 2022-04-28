package Chapter05.Part12;

public class MemberHashSetTest {

    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();
        Member memberUm =new Member(1,"엄준식");
        Member memberSon =new Member(2,"손인욱");
        Member memberKim =new Member(3,"김찬호");
        Member memberjung =new Member(4,"정상길");


        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberUm);
        memberHashSet.addMember(memberjung);
        memberHashSet.addMember(memberSon);
        memberHashSet.showAllMember();

        Member memberpark =new Member(4,"박종우");
        memberHashSet.addMember(memberpark);

        memberHashSet.showAllMember();

    }
}
