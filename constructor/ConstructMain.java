package constructor;

public class ConstructMain {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("이글아이",15,90);
        MemberConstruct member2 = new MemberConstruct("이글아삼",17,80);

        MemberConstruct[]member = {member1,member2};
        for (MemberConstruct s : member) {
            System.out.println("이름 : "+s.name+" 나이 : "+s.age+" 성적 :"+s.grade);
            
        }

    }
}
