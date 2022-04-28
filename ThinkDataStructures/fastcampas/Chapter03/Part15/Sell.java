package Chapter03.Part15;

public interface Sell {

    void sell();

    default void order(){
        System.out.println("sell order");
    }
}
