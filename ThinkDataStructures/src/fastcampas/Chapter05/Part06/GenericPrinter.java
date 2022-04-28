package Chapter05.Part06;

public class GenericPrinter<T> {

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    private T material;


    public String toString() {
        return material.toString();
    }

}
