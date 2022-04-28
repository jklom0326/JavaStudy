package Chapter03.Part15;

public interface Buy {
    void buy();

    default void order(){
        System.out.println("Buy order");
    }
}
