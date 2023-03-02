package uml;

public class Sala {
    private String nazwa;
    private final Szkola szkola;

    public Sala(String nazwa, Szkola szkola) {

        if(szkola == null) throw new IllegalArgumentException();

        this.nazwa = nazwa;
        this.szkola = szkola;

        szkola.getSale().add(this);
    }

    public String getNazwa() {
        return nazwa;
    }

    public Szkola getSzkola() {
        return szkola;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "nazwa='" + nazwa + '\'' +
                ", szkola=" + szkola +
                '}';
    }
}
