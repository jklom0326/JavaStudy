package Chapter02.Part18;
// 싱글톤 패턴
public class Company {
    // 유일한 객체
    private static Company instance = new Company();

    private Company(){

    }

    public static Company getInstance(){
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
