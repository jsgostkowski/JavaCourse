package example.four.uml;

public class Dog extends Animal{
    private boolean isAggressive;

    public Dog(String name, int age, String sex, boolean isAggressive) {
        super(name, age, sex);
        this.isAggressive = isAggressive;
    }

    public boolean isAggressive() {
        return isAggressive;
    }
    public void setAggressive(boolean aggressive) {
        isAggressive = aggressive;
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getSex() + " " + isAggressive;
    }


}
