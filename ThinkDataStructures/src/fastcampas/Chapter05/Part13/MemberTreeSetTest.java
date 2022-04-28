package Chapter05.Part13;

import java.util.TreeSet;

public class MemberTreeSetTest {

    public static void main(String[] args) {
//        TreeSet<String> set = new TreeSet<String>();
//
//        set.add("엄준식");
//        set.add("손인욱");
//        set.add("정상길");
//        set.add("김찬호");
//        set.add("박종우");
//
//        System.out.println(set);

        MemberTreeSet memberTreeSet = new MemberTreeSet();
        Member memberUm =new Member(1,"엄준식");
        Member memberSon =new Member(2,"손인욱");
        Member memberKim =new Member(3,"김찬호");
        Member memberjung =new Member(4,"정상길");


        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberUm);
        memberTreeSet.addMember(memberjung);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.showAllMember();


    }
}
