package Chapter05.Part14;

public class MemberHashMapTest {

    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberUm =new Member(1,"엄준식");
        Member memberSon =new Member(2,"손인욱");
        Member memberKim =new Member(3,"김찬호");
        Member memberjung =new Member(4,"정상길");


        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberUm);
        memberHashMap.addMember(memberjung);
        memberHashMap.addMember(memberSon);
        memberHashMap.showAllMember();


    }
}
