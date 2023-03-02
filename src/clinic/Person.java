package clinic;

public abstract class Person {
    private String name;
    private String surname;
    private String adres;

    public Person(String name, String surname, String adres) {
        this.name = name;
        this.surname = surname;
        this.adres = adres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
