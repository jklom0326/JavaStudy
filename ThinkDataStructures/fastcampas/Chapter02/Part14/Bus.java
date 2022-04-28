package Chapter02.Part14;

public class Bus {

    int busnumber;
    int count;
    int money;

    public Bus(int busNumber){
        this.busnumber = busNumber;
    }

    public void take(int money){
        this.money += money;
        count++;
    }

    public void showBusInfo(){
        System.out.println(busnumber+"번 버스의 승객은 "+count+"명 이고, 수입은 "+money+"원 입니다.");
    }

}
