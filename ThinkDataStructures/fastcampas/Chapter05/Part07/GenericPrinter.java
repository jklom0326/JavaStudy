package Chapter05.Part07;

public class GenericPrinter<T extends Material> {

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
