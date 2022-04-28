package Chapter02.Part14;

public class Subway {
    int subwaynumber;
    int count;
    int money;

    public Subway(int subwayNumber){
        this.subwaynumber = subwayNumber;
    }

    public void take(int money){
        this.money += money;
        count++;
    }

    public void showSubwayInfo(){
        System.out.println(subwaynumber+"번 지하철의 승객은 "+count+"명 이고, 수입은 "+money+"원 입니다.");
    }

}
