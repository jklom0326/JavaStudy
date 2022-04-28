package Chapter02.part08;

public class Person {

    private int height;
    private int weight;
    private String name;
    private int age;

    public Person(int height, int weight, String name, int age) {

        this.height = height;
        this.weight = weight;
        this.name = name;
        this.age = age;
    }

    public String showInfo() {
        return "키가 " + height + "이고 " + "몸무게가 " + weight + "킬로인 남성이 있습니다. 이름은 " + name + " 이고 나이는 " + age + "세입니다.";
    }
}
