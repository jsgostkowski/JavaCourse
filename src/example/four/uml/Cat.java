package example.four.uml;

public class Cat extends Animal{
    private boolean isWild;

    public Cat(String name, int age, String sex, boolean isWild) {
        super(name, age, sex);
        this.isWild = isWild;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getSex() + " "+ isWild;
    }
}
